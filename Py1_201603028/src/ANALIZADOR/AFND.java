/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ANALIZADOR;

import java.util.List;

/**
 *
 * @author oscar
 */
public class AFND {

    private Estado estadoInicial;
    private Estado estadoFinal;
    private int contadorEstados;

    public AFND() {
        this.estadoInicial = null;
        this.estadoFinal = null;
        this.contadorEstados = 0;
    }

    public Estado getEstadoInicial() {
        return estadoInicial;
    }

    public Estado getEstadoFinal() {
        return estadoFinal;
    }

    public Estado agregarEstado() {
        Estado estadoNuevo = new Estado(contadorEstados);
        contadorEstados++;
        return estadoNuevo;
    }

    public void agregarTransicion(Estado origen, Estado destino) {
        origen.transiciones.add(destino);
    }

    public void marcarEstadoFinal(Estado estado) {
        estado.esFinal = true;
        estadoFinal = estado;
    }

    public AFND construirAFND(Nodo raiz) {
        AFND afnd = new AFND();
        Estado estadoInicial = afnd.agregarEstado();
        afnd.estadoInicial = estadoInicial;
        Estado estadoFinal = afnd.agregarEstado();
        afnd.marcarEstadoFinal(estadoFinal);

        construirAFNDRecursivo(afnd, raiz, estadoInicial, estadoFinal);

        return afnd;
    }

    private void construirAFNDRecursivo(AFND afnd, Nodo nodo, Estado estadoInicial, Estado estadoFinal) {
        if (nodo.hizquierdo == null && nodo.derecho == null) {
            Estado estadoNuevo = afnd.agregarEstado();
            estadoNuevo.esFinal = true;
            estadoNuevo.valor = nodo.valor;
            afnd.agregarTransicion(estadoInicial, estadoNuevo);
            afnd.agregarTransicion(estadoNuevo, estadoFinal);
        } else if (nodo.valor.equals("*")) {
            Estado estadoNuevo = afnd.agregarEstado();
            construirAFNDRecursivo(afnd, nodo.hizquierdo, estadoInicial, estadoNuevo);
            afnd.agregarTransicion(estadoNuevo, estadoInicial);
            construirAFNDRecursivo(afnd, nodo.hizquierdo, estadoNuevo, estadoFinal);
            afnd.agregarTransicion(estadoNuevo, estadoFinal);
        } else if (nodo.valor.equals("|")) {
            Estado estadoNuevo1 = afnd.agregarEstado();
            Estado estadoNuevo2 = afnd.agregarEstado();
            construirAFNDRecursivo(afnd, nodo.hizquierdo, estadoNuevo1, estadoFinal);
            construirAFNDRecursivo(afnd, nodo.derecho, estadoNuevo2, estadoFinal);
            afnd.agregarTransicion(estadoInicial, estadoNuevo1);
            afnd.agregarTransicion(estadoInicial, estadoNuevo2);
        } else if (nodo.valor.equals(".")) {
            Estado estadoNuevo = afnd.agregarEstado();
            construirAFNDRecursivo(afnd, nodo.hizquierdo, estadoInicial, estadoNuevo);
            construirAFNDRecursivo(afnd, nodo.derecho, estadoNuevo, estadoFinal);
        }
    }

}
