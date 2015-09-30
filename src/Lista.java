/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Admin
 */
public class Lista {
    private Nodo primero =null;
    private int size = -1;
    
    
    public void add( int elemento, int prioridad) {
      Nodo nuevo = new Nodo(new Numero(elemento,prioridad),null);
      
      if( primero == null )
      {  primero = nuevo;  
       
      }
      
      else{
        Nodo aux = primero;
        while( aux.getSiguiente() != null ){
           aux = aux.getSiguiente();
        }
        aux.setSiguiente(nuevo);
      }
        size++;
    
    }
    
    public cola moveToQueue()
    {
        cola c = new cola();
        Nodo aux = primero;
        Numero n ;
        while( aux != null ){
            n = aux.getNumero();
            
            c.encolar(n);
            
            aux = aux.getSiguiente();
        }
        
        return c;
    }
}
