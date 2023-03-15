/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ANALIZADOR;

/**
 *
 * @author oscar
 */
public class SIGUIENTES {
    public String valor;
    public int id;
    public String sig;

    
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

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig;
    }
    
    public SIGUIENTES(String valor, int id, String sig) {
        this.valor = valor;
        this.id = id;
        this.sig = sig;
    }

    
}
