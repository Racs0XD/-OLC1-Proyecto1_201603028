package ANALIZADOR;

import java.util.ArrayList;
import java.util.List;

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

    public static ArrayList<String> lista = new ArrayList<String>();
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
    public String getCodigo() {
        String etiqueta;
        etiqueta = valor + "|" + id_hojas + "|";
        if (id_hojas != 0) {
            System.out.println(etiqueta);
            lista.add(etiqueta);
        }
        if (valor.equals(".")) {
            Nodo hijoIzquierdo = hizquierdo;
            Nodo hijoDerecho = derecho;
            // Obtener los valores de los nodos hijo
            String valorHijoIzquierdo = hijoIzquierdo.ultimo;
            String valorHijoDerecho = hijoDerecho.primero;
            System.out.println(valorHijoIzquierdo + "|" + valorHijoDerecho);

        } else if (valor.equals("*")) {
            Nodo hijoDerecho = derecho;
            // Obtener los valores del nodo hijo
            String valorHijoIzquierdo = hijoDerecho.primero;
            String valorHijoDerecho = hijoDerecho.primero;
            System.out.println(valorHijoIzquierdo + "|" + valorHijoDerecho);
        }

        if (hizquierdo != null) {
            etiqueta = etiqueta + hizquierdo.getCodigo();
        }
        if (derecho != null) {
            etiqueta = etiqueta + derecho.getCodigo();
        }

        return etiqueta;
    }

    public ArrayList<String> clearL() {
        lista.clear();
        return null;
    }

    public ArrayList<String> getL() {        
        return lista;
    }

  

    /*
    public String getCodigo() {
        String etiqueta;
        etiqueta = valor + "|" + id_hojas + "|";
        if (id_hojas != 0) {
            System.out.println(etiqueta);
            lista.add(etiqueta);
        }
        if (valor.equals(".")) {
            Nodo hijoIzquierdo = hizquierdo;
            Nodo hijoDerecho = derecho;
            // Obtener los valores de los nodos hijo
            String valorHijoIzquierdo = hijoIzquierdo.ultimo;
            String valorHijoDerecho = hijoDerecho.primero;
            System.out.println(valorHijoIzquierdo + "|" + valorHijoDerecho);
        } else if (valor.equals("*")) {
            Nodo hijoDerecho = derecho;
            // Obtener los valores del nodo hijo
            String valorHijoIzquierdo = hijoDerecho.primero;
            String valorHijoDerecho = hijoDerecho.primero;
            System.out.println(valorHijoIzquierdo + "|" + valorHijoDerecho);
        } 

        if (hizquierdo != null) {
            etiqueta = etiqueta + hizquierdo.getCodigo();
        }
        if (derecho != null) {
            etiqueta = etiqueta + derecho.getCodigo();
        }

        return etiqueta;
    }

    public ArrayList<String> clearL() {
        lista.clear();
        return null;
    }

    public ArrayList<String> getL() {
        return lista;
    }
     */
}
