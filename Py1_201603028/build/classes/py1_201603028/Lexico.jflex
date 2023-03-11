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


ESPACIOS = [\t\r\n\f]+
ASCII = [\!\"\#\$\%\&\'\(\)\*\+\,\-\.\/\:\;\<\=\>\?\@\[\\\]\^\_\`\{\|\}]
ESPECIALES = ("\\""n"|"\\""\'"|"\\""\"")
LETRAS = [a-zA-z]
ENTEROS = [0-9]

LLAVEA = "{"
LLAVEC = "}"
PUNTOCOMA = ";"
PUNTO = "."
MAS = "+"
PIPE = "|"
MENOS = "-"
ASTERISCO = "*"
INTERROGANTE = "?"
MAYORQ = ">"

//comentarios
COMENTARIOL="//"(.)*[\r\n]
COMENTARIOML=("<""!"[^\!]*"!"">")

CEREGULAR=([\"]{ASCII}[\"]|[\"]{LETRAS}[\"]|[\"]{ENTEROS}[\"]|[\"][\"])
CESPECIAL={ESPECIALES}

ID = {LETRAS}({LETRAS}|"_"|{ENTEROS})*
IDEREGULAR = "{"[a-zA-z0-9_]+"}"

%{
%}

%%

{ESPACIOS} {}
{COMENTARIOL} {}
{COMENTARIOML} {}

{PUNTO} {return new Symbol(sym.PUNTO,yycolumn,yyline,yytext());}
{MAS} {return new Symbol(sym.MAS,yycolumn,yyline,yytext());}
{ASTERISCO} {return new Symbol(sym.ASTERISCO,yycolumn,yyline,yytext());}
{PIPE} {return new Symbol(sym.PIPE,yycolumn,yyline,yytext());}
{INTERROGANTE} {return new Symbol(sym.INTERROGANTE,yycolumn,yyline,yytext());}
{LLAVEA} {return new Symbol(sym.LLAVEA,yycolumn,yyline,yytext());}
{IDEREGULAR} {return new Symbol(sym.IDEREGULAR,yycolumn,yyline,yytext());}
{ID} {return new Symbol(sym.ID,yycolumn,yyline,yytext());}
{CEREGULAR} {return new Symbol(sym.CEREGULAR,yycolumn,yyline,yytext());}
{CESPECIAL} {return new Symbol(sym.CESPECIAL,yycolumn,yyline,yytext());}
{PUNTOCOMA} {return new Symbol(sym.PUNTOCOMA,yycolumn,yyline,yytext());}
{MENOS} {return new Symbol(sym.MENOS,yycolumn,yyline,yytext());}
{MAYORQ} {return new Symbol(sym.MAYORQ,yycolumn,yyline,yytext());}
{LLAVEC} {return new Symbol(sym.LLAVEC,yycolumn,yyline,yytext());}
 
<YYINITIAL> <EOF> {return new Symbol(sym.EOF,yycolumn,yyline,yytext());}

. {
System.err.println("Error lexico: "+yytext()+" Linea: "+(yyline)+" columna: "+(yycolumn));
}
