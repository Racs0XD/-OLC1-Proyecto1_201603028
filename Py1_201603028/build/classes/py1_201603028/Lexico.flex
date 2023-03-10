package py1_201603028;
import static py1_201603028.Tokens.*;
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

espacios = [\t\r\n\f]+
ascii = [\!\"\#\$\%\&\'\(\)\*\+\,\-\.\/\:\;\<\=\>\?\@\[\\\]\^\_\`\{\|\}]
especiales = ("\\""n"|"\\""\'"|"\\""\"")
letras = [a-zA-z]
enteros = [0-9]

llave_a="{"
llave_c="}"
punto_coma=";"
dos_puntos=":"
punto="."
mas="+"
pipe="|"
menos="-"
asterisco="*"
interrogante="?"
mayorq=">"

//comentarios
comentarioL="//"(.)*[\r\n]
comentarioML="<!"(.|\n)*"!>" 

c_ERegular=([\"]{ascii}[\"]|[\"]{letras}[\"]|[\"]{enteros}[\"]|[\"][\"]|)
c_Especial={especiales}

id = {letras}({letras}|"_"|{enteros})*
id_ERegular = "{"[a-zA-z0-9_]+"}"

%{
%}

%%

{espacios}{}
{comentarioL}{}
{comentarioML}{}

{punto}{return new Symbol(sym.punto,yycolumn,yyline,yytext());}
{mas}{return new Symbol(sym.mas,yycolumn,yyline,yytext());}
{asterisco}{return new Symbol(sym.asterisco,yycolumn,yyline,yytext());}
{pipe}{return new Symbol(sym.pipe,yycolumn,yyline,yytext());}
{interrogante}{return new Symbol(sym.interrogante,yycolumn,yyline,yytext());}
{llave_a}{return new Symbol(sym.llave_a,yycolumn,yyline,yytext());}
{id_ERegular}{return new Symbol(sym.id_ERegular,yycolumn,yyline,yytext());}
{id}{return new Symbol(sym.id,yycolumn,yyline,yytext());}
{c_ERegular}{return new Symbol(sym.c_ERegular,yycolumn,yyline,yytext());}
{c_Especial}{return new Symbol(sym.c_Especial,yycolumn,yyline,yytext());}
{punto_coma}{return new Symbol(sym.punto_coma,yycolumn,yyline,yytext());}
{dos_puntos}{return new Symbol(sym.dos_puntos,yycolumn,yyline,yytext());}
{menos}{return new Symbol(sym.menos,yycolumn,yyline,yytext());}
{mayorq}{return new Symbol(sym.mayorq,yycolumn,yyline,yytext());}
{llave_c}{return new Symbol(sym.llave_c,yycolumn,yyline,yytext());}
 
.{System.err.println("Error lexico: "+yytext()+" Linea: "+(yylinea)+" columna: "+(yycolumn));
}