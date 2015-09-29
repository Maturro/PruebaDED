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
public class Numero {
    private int N;
    private int prioridad;

    public Numero() {
    }

    public Numero(int N, int prioridad) {
        this.N = N;
        this.prioridad = prioridad;
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    
}
