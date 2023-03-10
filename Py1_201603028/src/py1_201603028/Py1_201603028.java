package py1_201603028;

import java.io.File;


public class Py1_201603028 {

    
    public static void main(String[] args) {
        // TODO code application logic here
       String ruta = "F:/Documentos/USAC/[Compi1]-Oragnización_de_leguakes_y_compiladores_1/[Compi1]_Proyectos/[OLC1]Proyecto1_201603028/Py1_201603028/src/py1_201603028/Lexico.flex";
        generarLexico(ruta);
    }
    public static void generarLexico(String ruta){
        File archivo= new File(ruta);
        //JFlex.Main.generate(archivo);
        
    }
    
}
