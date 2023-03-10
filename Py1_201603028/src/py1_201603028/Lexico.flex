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

comentarioL="//"(.)*[\r\n] { /* ignorar comentario */}
comentarioML="<!"(.|\n)*"!>" { /* ignorar comentario */}

ER_conjunto=([\"]{ascii}[\"]|[\"]{letras}[\"]|[\"]{enteros}[\"]|[\"][\"]|)

