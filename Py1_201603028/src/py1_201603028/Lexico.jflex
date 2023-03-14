package py1_201603028;
import java_cup.runtime.*;

%%

%class Lexico
%cupsym sym
%cup
%public
%unicode
%line
%column
%ignorecase

%init{

%init}

espacios=[\s]+
ascii=[\!\"\#\$\%\&\'\(\)\*\+\,\-\.\/\:\;\<\=\>\?\@\[\\\]\^\_\`\{\|\}]
especiales=("\\""n"|"\\""\'"|"\\""\"")
letras=[a-zA-z]
minusculas=[a-z]
mayusculas=[A-Z]
enteros=[0-9]
reservada="CONJ"

llave_a="{"
llave_c="}"
punto_coma=";"
punto="."
dos_puntos=":"
mas="+"
pipe="|"
menos="-"
asterisco="*"
interrogante="?"
mayorq=">"
FinB="%%"

//comentarios
comentarioL=\/\/[^\r\n]*
comentarioML=("<""!"[^\!]*"!"">")


c_ERegular=([\"]{ascii}[\"]|[\"]{letras}[\"]|[\"]{enteros}[\"]|[\"][\"])
c_Especial={especiales}

Conj_Rango=({minusculas}(\s)*"~"(\s)*{minusculas}|{mayusculas}(\s)*"~"(\s)*{mayusculas}|{enteros}(\s)*"~"(\s)*{enteros}|{ascii}(\s)*"~"(\s)*{ascii})
Conj_Enum=({letras}((\s)*","(\s)*{letras}+)*|{enteros}(\s)*(","(\s)*{enteros}+)*|{ascii}((\s)*","(\s)*{ascii}+)*)
conj=({Conj_Enum}|{Conj_Rango})

E_Prueba="\"" [^\"]* "\""

id={letras}({letras}|"_"|{enteros})*
id_ERegular="{"[a-zA-z0-9_]+"}"


%{
%}

%%

{espacios} {}
{comentarioL} {}
{comentarioML} {}
{FinB} {}

{reservada} {return new Symbol(sym.reservada,yycolumn,yyline,yytext());}
{dos_puntos} {return new Symbol(sym.dos_puntos,yycolumn,yyline,yytext());}
{punto} {return new Symbol(sym.punto,yycolumn,yyline,yytext());}
{mas} {return new Symbol(sym.mas,yycolumn,yyline,yytext());}
{asterisco} {return new Symbol(sym.asterisco,yycolumn,yyline,yytext());}
{pipe} {return new Symbol(sym.pipe,yycolumn,yyline,yytext());}
{interrogante} {return new Symbol(sym.interrogante,yycolumn,yyline,yytext());}
{llave_a} {return new Symbol(sym.llave_a,yycolumn,yyline,yytext());}
{id_ERegular} {return new Symbol(sym.id_ERegular,yycolumn,yyline,yytext());}
{id} {return new Symbol(sym.id,yycolumn,yyline,yytext());}
{c_ERegular} {return new Symbol(sym.c_ERegular,yycolumn,yyline,yytext());}
{c_Especial} {return new Symbol(sym.c_Especial,yycolumn,yyline,yytext());}
{punto_coma} {return new Symbol(sym.punto_coma,yycolumn,yyline,yytext());}
{menos} {return new Symbol(sym.menos,yycolumn,yyline,yytext());}
{mayorq} {return new Symbol(sym.mayorq,yycolumn,yyline,yytext());}
{llave_c} {return new Symbol(sym.llave_c,yycolumn,yyline,yytext());}
{conj} {return new Symbol(sym.conj,yycolumn,yyline,yytext());}
{E_Prueba} {return new Symbol(sym.E_Prueba,yycolumn,yyline,yytext());}
. {System.err.println("Error lexico: "+yytext()+" Linea: "+(yyline)+" columna: "+(yycolumn));}