package py1_201603028;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

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
    
    static void AbrirArchivo(){
        
    }

}
