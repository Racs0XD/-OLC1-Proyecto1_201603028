package ANALIZADOR;

import java.util.ArrayList;
import ANALIZADOR.*;
import java.util.Collections;
import java.util.Comparator;

public class Nodo {

    public Nodo hizquierdo;
    public Nodo derecho;
    public String valor;
    public int id_grafica;
    public int id_hojas;
    public String anulable;
    public String primero;
    public String ultimo;

    public Nodo getHizquierdo() {
        return hizquierdo;
    }

    public void setHizquierdo(Nodo hizquierdo) {
        this.hizquierdo = hizquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getId_grafica() {
        return id_grafica;
    }

    public void setId_grafica(int id_grafica) {
        this.id_grafica = id_grafica;
    }

    public int getId_hojas() {
        return id_hojas;
    }

    public void setId_hojas(int id_hojas) {
        this.id_hojas = id_hojas;
    }

    public String getAnulable() {
        return anulable;
    }

    public void setAnulable(String anulable) {
        this.anulable = anulable;
    }

    public String getPrimero() {
        return primero;
    }

    public void setPrimero(String primero) {
        this.primero = primero;
    }

    public String getUltimo() {
        return ultimo;
    }

    public void setUltimo(String ultimo) {
        this.ultimo = ultimo;
    }

    public Nodo(Nodo hizquierdo, Nodo derecho, String valor, int id_grafica, int id_hojas, String anulable, String primero, String ultimo) {
        this.hizquierdo = hizquierdo;
        this.derecho = derecho;
        this.valor = valor;
        this.id_grafica = id_grafica;
        this.id_hojas = id_hojas;
        this.anulable = anulable;
        this.primero = primero;
        this.ultimo = ultimo;
    }

//===================================================================================================================
//=======================================   VALORES PARA ARBOL   ====================================================
//===================================================================================================================
    public String getCodigoInterno() {
        String etiqueta;
        if (hizquierdo == null && derecho == null) {
            etiqueta = "nodo" + id_grafica + " [ label =< \n"
                    + "<table border='0' cellborder='1' color='blue' cellspacing='0'>\n"
                    + "<tr><td>" + anulable + "</td></tr>\n"
                    + "<tr><td>" + primero + "</td><td>" + valor + "</td><td>" + ultimo + "</td></tr>\n"
                    + "<tr><td>" + id_hojas + "</td></tr>\n"
                    + "</table>\n"
                    + ">];\n";
        } else {
            etiqueta = "nodo" + id_grafica + " [ label =< \n"
                    + "<table border='0' cellborder='1' color='blue' cellspacing='0'>\n"
                    + "<tr><td>" + anulable + "</td></tr>\n"
                    + "<tr><td>" + primero + "</td><td>" + valor + "</td><td>" + ultimo + "</td></tr>\n"
                    + "<tr><td>" + id_hojas + "</td></tr>\n"
                    + "</table>\n"
                    + ">];\n";
        }
        if (hizquierdo != null) {
            etiqueta = etiqueta + hizquierdo.getCodigoInterno()
                    + "nodo" + id_grafica + "->nodo" + hizquierdo.id_grafica + "\n";
        }
        if (derecho != null) {
            etiqueta = etiqueta + derecho.getCodigoInterno()
                    + "nodo" + id_grafica + "->nodo" + derecho.id_grafica + "\n";
        }
        return etiqueta;
    }

//===================================================================================================================
//=================================   OBTENCIÓN DE SIGUIENTES   =====================================================
//===================================================================================================================
    public static ArrayList<SIGUIENTES> HOJAS = new ArrayList<SIGUIENTES>();

    public String getCodigo() {
        String etiqueta;
        etiqueta = valor + "|" + id_hojas + "|";
        SIGUIENTES val = new SIGUIENTES(valor, id_hojas, "");
        boolean encontrado = false; // variable para indicar si se ha encontrado el ID en la lista

        if (valor.equals(".")) {
            Nodo hijoIzquierdo = hizquierdo;
            Nodo hijoDerecho = derecho;
            // Obtener los valores de los nodos hijo
            String valorHijoIzquierdo = hijoIzquierdo.ultimo;
            String valorHijoDerecho = hijoDerecho.primero;
            //System.out.println(valorHijoIzquierdo + "|" + valorHijoDerecho);
            // Obtener los números separados de valorHijoIzquierdo
            String[] numeros = valorHijoIzquierdo.split(",");

            // Iterar sobre cada número y buscar si existe en la lista
            for (String numero : numeros) {
                int idBuscado = Integer.parseInt(numero.trim()); // convertir a entero
                encontrado = false;
                for (SIGUIENTES siguiente : HOJAS) {
                    if (siguiente.id == idBuscado) {
                        siguiente.sig += (siguiente.sig.isEmpty() ? "" : ",") + valorHijoDerecho; // agregar valorHijoDerecho a la propiedad sig
                        encontrado = true;
                        break; // salir del loop si se ha encontrado el ID
                    }
                }
                if (!encontrado) {
                    SIGUIENTES nuevo = new SIGUIENTES(valor, idBuscado, valorHijoDerecho);
                    HOJAS.add(nuevo);
                }
            }

        } else if (valor.equals("*")) {
            Nodo hijoDerecho = derecho;
            // Obtener los valores del nodo hijo
            String valorHijoIzquierdo = hijoDerecho.primero;
            String valorHijoDerecho = hijoDerecho.primero;
            // System.out.println(valorHijoIzquierdo + "|" + valorHijoDerecho);
            // Obtener los números separados de valorHijoIzquierdo
            String[] numeros = valorHijoIzquierdo.split(",");

            // Iterar sobre cada número y buscar si existe en la lista
            for (String numero : numeros) {
                int idBuscado = Integer.parseInt(numero.trim()); // convertir a entero
                encontrado = false;
                for (SIGUIENTES siguiente : HOJAS) {
                    if (siguiente.id == idBuscado) {
                        siguiente.sig += (siguiente.sig.isEmpty() ? "" : ",") + valorHijoDerecho; // agregar valorHijoDerecho a la propiedad sig
                        encontrado = true;
                        break; // salir del loop si se ha encontrado el ID
                    }
                }
                if (!encontrado) {
                    SIGUIENTES nuevo = new SIGUIENTES("", idBuscado, "");
                    HOJAS.add(nuevo);
                    nuevo.sig += valorHijoDerecho.trim();
                }
            }
        } else if (valor.equals("*") || valor.equals("+") || valor.equals("?")) {
            Nodo hijoDerecho = derecho;
            // Obtener los valores del nodo hijo
            String valorHijoIzquierdo = hijoDerecho.primero;
            String valorHijoDerecho = hijoDerecho.ultimo;
            // System.out.println(valorHijoIzquierdo + "|" + valorHijoDerecho);
            // Obtener los números separados de valorHijoIzquierdo
            String[] numeros = valorHijoIzquierdo.split(",");

            // Iterar sobre cada número y buscar si existe en la lista
            for (String numero : numeros) {
                int idBuscado = Integer.parseInt(numero.trim()); // convertir a entero
                encontrado = false;
                for (SIGUIENTES siguiente : HOJAS) {
                    if (siguiente.id == idBuscado) {
                        siguiente.sig += (siguiente.sig.isEmpty() ? "" : ",") + valorHijoDerecho.trim(); // agregar valorHijoDerecho a la propiedad sig
                        encontrado = true;
                        break; // salir del loop si se ha encontrado el ID
                    }
                }
                if (!encontrado) {
                    SIGUIENTES nuevo = new SIGUIENTES("", idBuscado, "");
                    HOJAS.add(nuevo);
                    nuevo.sig += valorHijoDerecho.trim();
                }
            }
        }

        if (hizquierdo != null) {
            etiqueta = etiqueta + hizquierdo.getCodigo();
        }
        if (derecho != null) {
            etiqueta = etiqueta + derecho.getCodigo();
        }
        if (id_hojas != 0) {
            boolean objetoExiste = false;
            for (SIGUIENTES hoja : HOJAS) {
                if (hoja.getId() == id_hojas) {
                    hoja.setValor(valor); // modificar el atributo valor del objeto
                    String str = hoja.getSig();
                    String[] strArray = str.split(",");
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    for (String s : strArray) {
                        if (!s.trim().isEmpty()) {
                            try {
                                list.add(Integer.parseInt(s.trim()));
                            } catch (NumberFormatException e) {
                                // No hacer nada si no es un número válido
                            }
                        }
                    }
                    Collections.sort(list);
                    String sortedStr = list.toString().replaceAll("[\\[\\]\\s]", "");
                    hoja.setSig(sortedStr);
                    if (hoja.getSig().endsWith(",")) {
                        hoja.setSig(hoja.getSig().substring(0, hoja.getSig().length() - 1));
                    }
                    objetoExiste = true;
                    break;
                }
            }
            if (!objetoExiste) {
                SIGUIENTES nuevoObjeto = new SIGUIENTES(valor, id_hojas, "--");
                HOJAS.add(nuevoObjeto); // agregar un nuevo objeto a la lista
                Collections.sort(HOJAS, new Comparator<SIGUIENTES>() {
                    @Override
                    public int compare(SIGUIENTES hoja1, SIGUIENTES hoja2) {
                        return Integer.compare(hoja1.getId(), hoja2.getId());
                    }
                });
            }
        }

        return etiqueta;
    }

    public ArrayList<String> clearL() {
        HOJAS.clear();
        return null;
    }

    public ArrayList<SIGUIENTES> getL() {
        return HOJAS;
    }

}
