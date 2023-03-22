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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author oscar
 */
public class Reportes {

    public void Graficar_Tabla_Sig(ArrayList<ArrayList<Object>> Tabla_Sig, ArrayList<ArrayList<Object>> Tabla_Tran) {
        String nombre = "";
        String nombreLista = "";
        String numAceptación = "";

        for (ArrayList<Object> lista : Tabla_Sig) {
            FileWriter fichero = null;
            PrintWriter pw = null;
            try {
                nombreLista = (String) lista.get(0); //Nombre de la lista dentro de Tabla_Sig
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
                boolean aceptado = false;
                for (int i = 1; i < lista.size(); i++) {
                    Object elemento = lista.get(i);
                    if (elemento instanceof ArrayList) { // Si el elemento es una lista, imprime sus elementos uno por uno
                        ArrayList<Object> listaInterna = (ArrayList<Object>) elemento;

                        for (int j = 0; j < listaInterna.size(); j++) {
                            if (j < listaInterna.size() - 1) {
                            }
                            SIGUIENTES sigObject = (SIGUIENTES) listaInterna.get(j);
                            String val = sigObject.valor;
                            int id = ((SIGUIENTES) listaInterna.get(j)).id;
                            String sig = ((SIGUIENTES) listaInterna.get(j)).sig;
                            if (val.equals("#")) {
                                numAceptación = String.valueOf(id);
                                aceptado = true;
                            }

                            pw.println("<tr><td>" + val + "</td><td>" + id + "</td><td>" + sig + "</td></tr>\n");
                        }
                    }
                }
                pw.println("</table>\n" + ">];\n");
                pw.println("}");
                if (aceptado) {
                    Tabla_Transiciones(Tabla_Tran);
                    Aceptacion(Tabla_Sig, Tabla_Tran);
                }
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

    public void Tabla_Transiciones(ArrayList<ArrayList<Object>> Tabla_Tran) {
        String nombre = "";
        String nombreLista = "";
        for (ArrayList<Object> lista : Tabla_Tran) {
            FileWriter fichero = null;
            PrintWriter pw = null;
            try {
                nombreLista = (String) lista.get(0); //Nombre de la lista dentro de Tabla_Sig
                nombre = nombreLista;
                String txt;
                fichero = new FileWriter("src/TRANSICIONES_201603028/" + nombreLista + ".dot");
                pw = new PrintWriter(fichero);
                pw.println("digraph G{");
                pw.println("rankdir=UD");
                pw.println("node[shape=box]");
                pw.println("concentrate=true");
                pw.println("nodo0 [ label =<" + "<table border='0' cellborder='1' color='blue' cellspacing='0'>\n"
                        + "<tr><td>" + "Estado" + "</td><td>" + "Terminales" + "</td></tr>\n");
                for (int i = 1; i < lista.size(); i++) {
                    Object elemento = lista.get(i);
                    if (elemento instanceof ArrayList) { // Si el elemento es una lista, imprime sus elementos uno por uno
                        ArrayList<Object> listaInterna = (ArrayList<Object>) elemento;
                        for (int j = 0; j < listaInterna.size(); j++) {
                            if (j < listaInterna.size() - 1) {
                            }
                            ESTADOS sigObject = (ESTADOS) listaInterna.get(j);
                            String val = sigObject.estado[0] + " {" + sigObject.estado[1] + "}";
                            String pb = "";
                            String[] term = sigObject.termminales;
                            String Nterminal = "";
                            for (String nTer : term) {
                                String[] Nt_Sep = nTer.split("=");
                                String conj = Nt_Sep[1];
                                String S = Nt_Sep[2];
                                Nterminal += Nt_Sep[0] + "={" + conj + "}=" + S + ", ";

                            }
                            pw.println("<tr><td>" + val + "</td><td>" + Nterminal + "</td></tr>\n");
                        }
                    } else { // Si el elemento no es una lista, imprime su valor
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
                String fileInputPath = "src/TRANSICIONES_201603028/" + nombre + ".dot";
                //dirección donde se creara la magen
                String fileOutputPath = "src/TRANSICIONES_201603028/" + nombre + ".jpg";
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

    public void Aceptacion(ArrayList<ArrayList<Object>> Tabla_Sig, ArrayList<ArrayList<Object>> Tabla_Tran) {

        String nombre = "";
        String nombreLista = "";
        boolean retorno = false;
        for (ArrayList<Object> lista : Tabla_Sig) {
            FileWriter fichero = null;
            PrintWriter pw = null;

            nombreLista = (String) lista.get(0); //Nombre de la lista dentro de Tabla_Sig
            nombre = nombreLista;
            String txt;

            for (int i = 1; i < lista.size(); i++) {
                Object elemento = lista.get(i);
                if (elemento instanceof ArrayList) { // Si el elemento es una lista, imprime sus elementos uno por uno
                    ArrayList<Object> listaInterna = (ArrayList<Object>) elemento;
                    for (int j = 0; j < listaInterna.size(); j++) {
                        if (j < listaInterna.size() - 1) {
                        }
                        SIGUIENTES sigObject = (SIGUIENTES) listaInterna.get(j);
                        String val = sigObject.valor;
                        int id = ((SIGUIENTES) listaInterna.get(j)).id;
                        String sig = ((SIGUIENTES) listaInterna.get(j)).sig;
                        if (val.equals("#")) {
                            retorno = true;
                            AFD(Tabla_Tran, Integer.toString(id));
                            break;
                        }
                    }
                    if (retorno) {
                        break;
                    }
                }

            }
        }
    }

    public void AFD(ArrayList<ArrayList<Object>> Tabla_Tran, String aceptado) {
        String nombre = "";
        String nombreLista = "";
        for (ArrayList<Object> lista : Tabla_Tran) {
            FileWriter fichero = null;
            PrintWriter pw = null;
            try {
                nombreLista = (String) lista.get(0); //Nombre de la lista dentro de Tabla_Sig
                nombre = nombreLista;
                String txt;
                fichero = new FileWriter("src/AFD_201603028/" + nombreLista + ".dot");
                pw = new PrintWriter(fichero);
                pw.println("digraph G{");
                pw.println("rankdir=LR");
                pw.println("node[shape=circle]");
                pw.println("concentrate=true");
                for (int i = 1; i < lista.size(); i++) {
                    Object elemento = lista.get(i);
                    if (elemento instanceof ArrayList) { // Si el elemento es una lista, imprime sus elementos uno por uno
                        ArrayList<Object> listaInterna = (ArrayList<Object>) elemento;
                        for (int j = 0; j < listaInterna.size(); j++) {
                            if (j < listaInterna.size() - 1) {
                            }
                            ESTADOS sigObject = (ESTADOS) listaInterna.get(j);
                            String estadoS = sigObject.estado[0];
                            String estadoS1 = sigObject.estado[1];
                            String[] term = sigObject.termminales;
                            String[] aceptacion = estadoS1.split(",");
                            boolean acept = false;
                            for (int z = 0; z < aceptacion.length; z++) { // se itera sobre los elementos del arreglo
                                String valorE = aceptacion[z]; // se obtiene el valor actual del arreglo
                                // se realiza la operación deseada con el valor actual
                                if (aceptado.equals(valorE)) {
                                    acept = true;
                                    
                                }
                            }
                            if (acept) {
                                pw.println("nodo" + estadoS + "[label=\"" + estadoS + "\"][shape=doublecircle];\n");
                            } else {
                                pw.println("nodo" + estadoS + "[label=\"" + estadoS + "\"];\n");
                            }

                            for (String nTer : term) {
                                String[] Nt_Sep = nTer.split("=");
                                String conj = Nt_Sep[1];
                                String S = Nt_Sep[2];
                                pw.println("nodo" + S + "[label=\"" + S + "\"];\n");
                                String val = Nt_Sep[0];
                                Pattern pattern = Pattern.compile("\\((.*?)\\)"); // Expresión regular para buscar el contenido entre paréntesis
                                Matcher matcher = pattern.matcher(val);
                                if (matcher.find()) {
                                    String contenido = matcher.group(1);
                                    pw.println("nodo" + estadoS + "->nodo" + S + "[label=\"" + contenido + "\"];\n");
                                }

                            }
                        }
                    }
                }
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
                String fileInputPath = "src/AFD_201603028/" + nombre + ".dot";
                //dirección donde se creara la magen
                String fileOutputPath = "src/AFD_201603028/" + nombre + ".jpg";
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

}
