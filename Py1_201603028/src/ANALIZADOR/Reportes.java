/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ANALIZADOR;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class Reportes {
  
    public void Graficar_Tabla_Sig(ArrayList<ArrayList<Object>> Tabla_Sig) {
        String nombre = "";

        for (ArrayList<Object> lista : Tabla_Sig) {
            System.out.println(lista.get(0)); // Imprime el nombre de la lista

            FileWriter fichero = null;
            PrintWriter pw = null;
            try {
                String nombreLista = (String) lista.get(0); //Nombre de la lista dentro de Tabla_Sig
                nombre = nombreLista;
                String txt;
                fichero = new FileWriter("src/SIGUIENTES_201603028/" + nombreLista + ".dot");
                pw = new PrintWriter(fichero);
                pw.println("digraph G{");
                pw.println("rankdir=UD");
                pw.println("node[shape=box]");
                pw.println("concentrate=true");
                pw.println("nodo0 [ label =<" + "<table border='0' cellborder='1' color='blue' cellspacing='0'>\n"
                        + "<tr><td colspan=\"2\">" + "Hoja" + "</td><td>" + "Siguientes" + "</td></tr>\n");
                for (int i = 1; i < lista.size(); i++) {
                    Object elemento = lista.get(i);
                    if (elemento instanceof ArrayList) { // Si el elemento es una lista, imprime sus elementos uno por uno
                        System.out.print("[");
                        ArrayList<Object> listaInterna = (ArrayList<Object>) elemento;
                        for (int j = 0; j < listaInterna.size(); j++) {
                            System.out.print(listaInterna.get(j));
                            if (j < listaInterna.size() - 1) {                                
                                System.out.print("\n ");
                            }
                            SIGUIENTES sigObject = (SIGUIENTES) listaInterna.get(j);
                                String val = sigObject.valor;
                                int id = ((SIGUIENTES) listaInterna.get(j)).id;
                                String sig = ((SIGUIENTES) listaInterna.get(j)).sig;

                                pw.println("<tr><td>" + val + "</td><td>" + id + "</td><td>" + sig + "</td></tr>\n");
                        }
                        System.out.println("]");
                    } else { // Si el elemento no es una lista, imprime su valor
                        System.out.println(elemento);
                    }
                }
                pw.println("</table>\n" + ">];\n");
                pw.println("}");
            } catch (Exception e) {
                System.out.println("error, no se realizo el archivo" + e);
            } finally {
                try {
                    if (null != fichero) {
                        fichero.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

            //para compilar el archivo dot y obtener la imagen
            try {
                //dirección doonde se ecnuentra el compilador de graphviz
                String dotPath = "C:\\Program Files\\Graphviz\\bin\\dot.exe";
                //dirección del archivo dot
                String fileInputPath = "src/SIGUIENTES_201603028/" + nombre + ".dot";
                //dirección donde se creara la magen
                String fileOutputPath = "src/SIGUIENTES_201603028/" + nombre + ".jpg";
                //tipo de conversón
                String tParam = "-Tjpg";
                String tOParam = "-o";

                String[] cmd = new String[5];
                cmd[0] = dotPath;
                cmd[1] = tParam;
                cmd[2] = fileInputPath;
                cmd[3] = tOParam;
                cmd[4] = fileOutputPath;

                Runtime rt = Runtime.getRuntime();

                rt.exec(cmd);

            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
            }
        }
    }

    /*
    public void Graficar_Tabla_Sig(ArrayList<ArrayList<Object>> Tabla_Sig) {

        for (ArrayList<Object> lista : Tabla_Sig) {
            System.out.println(lista.get(0)); // Imprime el nombre de la lista
            String nombreLista = (String) lista.get(0); //Nombre de la lista dentro de Tabla_Sig
            String archivo = "src/SIGUIENTES_201603028/" + nombreLista + ".dot"; //Nombre que tendrá el archivo dot
            String imagen = "src/SIGUIENTES_201603028/" + nombreLista + ".jpg"; //Nombre que tendrá la imagen generada
            String txt = "digraph " + nombreLista + " {\n"; // Estructura que tendrá el archivo y nombre
            txt += "rankdir=UD\n"; //Orden de la creación de nodos
            txt += "node[shape=box]\n"; //Forma que tendrán los nodos
            txt += "concentrate=true\n";
            txt += "nodo0 [label=\"";
            txt += "<table border='0' cellborder='1' color='blue' cellspacing='0'>\n"
                    + "<tr><td>" + "Hoja" + "</td><td>" + "Siguientes" + "</td></tr>\n";
            for (int i = 1; i < lista.size(); i++) {
                Object elemento = lista.get(i);
                if (elemento instanceof ArrayList) { // Si el elemento es una lista, imprime sus elementos uno por uno
                    System.out.print("[");
                    ArrayList<Object> listaInterna = (ArrayList<Object>) elemento;
                    for (int j = 0; j < listaInterna.size(); j++) {
                        System.out.print(listaInterna.get(j));
                        if (j < listaInterna.size() - 1) {
                            SIGUIENTES sigObject = (SIGUIENTES) listaInterna.get(j);
                            String val = sigObject.valor;
                            int id = ((SIGUIENTES) listaInterna.get(j)).id;
                            String sig = ((SIGUIENTES) listaInterna.get(j)).sig;
                            
                            txt += "<tr><td>" + val + "</td><td>" + id + "</td><td>" + sig + "</td></tr>\n"
                                    + "</table>\n"
                                    + ">];\n";
                            System.out.print("\n ");
                        }
                    }
                    System.out.println("]");
                } else { // Si el elemento no es una lista, imprime su valor
                    System.out.println(elemento);
                }
            }
            txt += "\"]; \n}"; //cierre de la lista en la figura
            CrearDot(archivo);
            EscrituraDot(txt, archivo);
            GenerarGraph(imagen, archivo);
        }
    }
     */
}
