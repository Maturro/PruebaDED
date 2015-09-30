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
        cola c2 = new cola();
        cola c3 = new cola();
        cola c4 = new cola();
        int elemento ; 
        int prori = 0;
        
        Nodo aux = primero;
        Numero n ;
        while( aux != null ){
            n = aux.getNumero();
          
            if (n.getPrioridad() == 1)
            {
                c.encolar(n.getN());
                c2.encolar(n.getPrioridad());
            }
            
            while( c.size() > 0 ){
            
            
            }
            
            aux = aux.getSiguiente();
      }
            
            
            
            
            
            
//            if (n.getPrioridad() >1)
//            {
//                while (n.getPrioridad() <= 2)
//                {
//                    
//                    if ((int)c2.desencolar() == n.getPrioridad())
//                        prori = n.getPrioridad();
//                    else
//                    {
//                    elemento = (int)c2.desencolar();
//                    
//                        
//                    prori = elemento;
//
//                        c4.encolar(elemento);
//                        elemento = (int)c.desencolar();
//                        c3.encolar(elemento);
//                    }
//                }
//                
//                c.encolar(n.getN());
//                c2.encolar(n.getPrioridad());
//                
//                for (int i = 0 ; i <= c3.size() ; i++) {
//                    
//                    elemento = (int)c3.desencolar();
//                    c.encolar(elemento);
//                    elemento = (int)c4.desencolar();
//                    c2.encolar(elemento);
//                }
//                
//            }
//            
//            
//            aux = aux.getSiguiente();
//        }
        
        return c;
    }
}
