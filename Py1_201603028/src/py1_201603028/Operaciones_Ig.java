package py1_201603028;

public class Operaciones_Ig {
    
    static void generarCompilador() 
    {
        try {
            String ruta = "src/py1_201603028/";
            String oFlex[] = {ruta + "Lexico.jflex", "-d", ruta};
            jflex.Main.generate(oFlex);            
            
            String oCUP[] = {"-destdir", ruta, "-parser", "parser", ruta + "Sintactico.cup"};
            java_cup.Main.main(oCUP);
        } catch (Exception e) {
        }
    }
    
    /*File archivo = new File("archivo.txt");
        PrintWriter escritura;
        try {
            escritura = new PrintWriter(archivo);
            escritura.print(txt_entradas.getText());
            escritura.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IG_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Reader lectura = new BufferedReader(new FileReader("archivo.txt"));
            Lexico lexer = new Lexico(lectura);
            String resultado = "";
            while (true) {                
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIN";
                    txt_consola.setText(resultado);
                    return;
                }
                switch (tokens) {
                    case ERROR:
                        resultado += "Simbolo no definido\n ";
                        break;
                    case Reservadas: case Igual: case Suma: case Resta: case Multiplicacion: case Division: case Identificador: case Numero:
                        resultado += lexer.lexema + ": Es "+tokens+"\n";
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IG_Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IG_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }*/

}
