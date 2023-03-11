/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py_201603028;

/**
 *
 * @author oscar
 */
public class py_201603028 {
    
public static void main(String[] args) {
        generarCompilador();
    }
    private static void generarCompilador() 
    {
        try {
            String ruta = "src/main/java/py_201603028/";
            String opcFlex[] = {ruta + "Lexico.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);            
            
            String opcCUP[] = {"-destdir", ruta, "-parser", "parser", ruta + "Sintactico.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
        }
    }
}
