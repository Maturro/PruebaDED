
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class cola extends LinkedList{
    public void encolar(Object o){
       this.addFirst(o);
    
    }
    public Object desencolar(){
       return this.removeLast();
    }
    
    public void merge( cola C ){
       int s = C.size();
       int elemento;
        for (int i = 1; i <= s ; i++) {
            elemento = (int)C.desencolar();
            this.encolar(elemento);
            C.encolar(elemento);
        }
    }
}
