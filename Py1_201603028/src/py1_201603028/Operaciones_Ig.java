package py1_201603028;


public class Operaciones_Ig {
    
    static void generarCompilador() 
    {
        try {
            String ruta = "src/ANALIZADOR/";
            String oFlex[] = {ruta + "Lexico.jflex", "-d", ruta};
            jflex.Main.generate(oFlex);            
            
            String oCUP[] = {"-destdir", ruta, "-parser", "parser", ruta + "Sintactico.cup"};
            java_cup.Main.main(oCUP);
        } catch (Exception e) {
        }
    }     

}
