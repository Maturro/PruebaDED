/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listas;

/**
 *
 * @author Admin
 */
public class Nodo {
    private Numero numero;
    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(Numero numero, Nodo siguiente) {
        this.numero = numero;
        this.siguiente = siguiente;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
