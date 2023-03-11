/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.ejemploarbolcompi1;

/**
 *
 * @author Pc
 */
public class Nodo {
        public Nodo hizq;
        public Nodo hder;
        public String valor;
        public int id;

    public Nodo(Nodo hizq, Nodo hder, String valor, int id) {
        this.hizq = hizq;
        this.hder = hder;
        this.valor = valor;
        this.id = id;
    }

    public Nodo getHizq() {
        return hizq;
    }

    public void setHizq(Nodo hizq) {
        this.hizq = hizq;
    }

    public Nodo getHder() {
        return hder;
    }

    public void setHder(Nodo hder) {
        this.hder = hder;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        
    public String getCodigoInterno(){
            String etiqueta;
            if (hizq ==null && hder ==null) {
                    etiqueta ="nodo"+id+" [ label =\"" + valor+"\"]; \n";
            }else {
                    etiqueta ="nodo"+id+" [ label =\"" + valor+"\"]; \n";
            }
            if (hizq != null) {
            etiqueta = etiqueta + hizq.getCodigoInterno()
                    + "nodo" + id + "->nodo" + hizq.id + "\n";
        }
            if (hder != null) {
                etiqueta = etiqueta + hder.getCodigoInterno()
                        + "nodo" + id + "->nodo" + hder.id + "\n";
            }
            return etiqueta;
            }
        
}
