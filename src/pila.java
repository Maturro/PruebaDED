import java.util.LinkedList;

public class pila extends LinkedList{

    @Override
    public Object pop() {
       return this.removeFirst();
    }

    @Override
    public void push(Object e) {
        this.addFirst(e);
    }
    
    public void reverse(){
      cola c = new cola();
      
      while (this.size() > 0 ){
              c.encolar(this.pop());
      }
       while( c.size() > 0 ){
          this.push(c.desencolar());
       } 
    }
    
    
    
    public boolean find( int elemento){
      pila aux = new pila();
      int e;
      boolean existe=false;
      while( this.size() > 0 && !existe ){
         e = (int)this.pop();
         aux.push(e);
          if( e == elemento){
            existe = true;
          }
      }
      
         while( aux.size() > 0 ){
           this.push( aux.pop());
         }
         return existe;
      
    }
    public int indexOf( int elemento ){
      pila aux = new pila();
      int e;
      int pos=-1;
      boolean existe=false;
      while( this.size() > 0 && !existe ){
         e = (int)this.pop();
         aux.push(e);
         pos++;
          if( e == elemento){
            existe = true;
            
          }
      }
       while( aux.size() > 0 ){
           this.push( aux.pop());
         }
       if( existe ) 
         return pos;
       else 
         return -1;
    }
    
    public pila split( int posicion ){
     if( posicion > this.size() )
         throw new IllegalArgumentException("Error en el parámetro");
     pila aux = new pila();
     pila aux2 = new pila();
     int e;
     int contador=-1;
     while( this.size() > 0 ){
        e = (int)this.pop();
         if( ++contador < posicion ) 
            aux.push( e );
         else{
            aux.push( e );
            aux2.push( e );
         }
             
     }
      while( aux.size() > 0){
       this.push( aux.pop());
      }
     return aux2;
     
     
    }
    public void insertAt( int posicion, int elemento ){
      if( posicion > this.size() )
         throw new IllegalArgumentException("Error en el parámetro");
      
      int contador=-1;
      pila aux= new pila();
      while( this.size() > 0 && ++contador < posicion){
        aux.push(this.pop());
      }
       this.push(elemento);
       while( aux.size() > 0 ){
          this.push( aux.pop());
       }
               
       
    }
    
    public void removeAt( int posicion ){
       if( posicion > this.size() )
         throw new IllegalArgumentException("Error en el parámetro");
      
      int contador=-1;
      pila aux= new pila();
      int e;
      while( this.size() > 0 && ++contador <= posicion){
          if( contador == posicion )
          { 
              this.pop();
          }
          else{
              aux.push(this.pop());
          }
      }
       
       while( aux.size() > 0 ){
          this.push( aux.pop());
       }
    
    }
  
    public int getMax(){
      pila aux = new pila();
      int maximo = (int)this.getFirst();
      int e;
        while( this.size() > 0 ){
            e = (int)this.pop();
            if( e > maximo  ){
                maximo = e;
                aux.push(e);
            }
            else{
               aux.push(e);
            }
        }
        while( aux.size() > 0 ){
            this.push( aux.pop());
        }
       
        return maximo;
    }
    
    public void reverse2(){
      pila aux = new pila();
      pila aux2 = new pila();
      
      while (this.size() > 0 ){
              aux.push(this.pop());
      }
       while( aux.size() > 0 ){
          aux2.push(aux.pop());
       }
       while( aux2.size() > 0 ){
          this.push(aux2.pop());
       }
    }
    
    
   
    
}
