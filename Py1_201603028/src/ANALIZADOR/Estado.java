/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ANALIZADOR;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscar
 */
public class Estado {

    public int id;
    public List<Estado> transiciones;
    public boolean esFinal;
    public String valor;

    public Estado(int id) {
        this.id = id;
        this.transiciones = new ArrayList<>();
        this.esFinal = false;
        this.valor = "";
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
