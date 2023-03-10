package py1_201603028;

import java.io.File;


public class Py1_201603028 {

    public static void main(String[] args) {
        generarCompilador();
    }
    private static void generarCompilador() 
    {
        try {
            String ruta = "src/py1_201603028/";
            String opcFlex[] = {ruta + "Lexico.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            
            
            String opcCUP[] = {"-destdir", ruta, "-parser", "parser", ruta + "Sintactico.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}

