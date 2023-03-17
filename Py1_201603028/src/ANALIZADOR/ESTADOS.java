/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ANALIZADOR;

import java.util.Arrays;

/**
 *
 * @author oscar
 */
public class ESTADOS {
    
    public String[] estado;
    public String[] termminales;

    public String[] getEstado() {
        return estado;
    }

    public void setEstado(String[] estado) {
        this.estado = estado;
    }

    public String[] getTermminales() {
        return termminales;
    }

    public void setTermminales(String[] termminales) {
        this.termminales = termminales;
    }

    public ESTADOS(String[] estado, String[] termminales) {
        this.estado = estado;
        this.termminales = termminales;
    }

    @Override
    public String toString() {
        return  "estado=" + Arrays.toString(estado) + Arrays.toString(termminales);
    }
    
    
    
    
    
}
