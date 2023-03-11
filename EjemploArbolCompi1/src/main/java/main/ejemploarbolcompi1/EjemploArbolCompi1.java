/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main.ejemploarbolcompi1;

import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pc
 */
public class EjemploArbolCompi1 {

    public static void main(String[] args) {
        String prueba ="4+5*8/4+7  ";
        try {
        Analizadores.parser parse;
        parse = new Analizadores.parser( new Analizadores.Lexico(new StringReader( prueba)));
        
            parse.parse();
        } catch (Exception ex) {
            
        }
    }
}
