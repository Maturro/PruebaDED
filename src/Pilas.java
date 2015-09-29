
import java.util.LinkedList;


public class Pilas extends LinkedList {

    @Override
    public Object pop() {
        return this.removeFirst();
    }

    @Override
    public void push(Object e) {
        this.addFirst(e);
    }
    
    public void reverse(){
        Colas c = new Colas();
        while(this.size()> 0)
        {
            c.encolar(this.pop());
           
        }
        while(c.size()>0)
        {
            this.push(c.desencolar());
        }
    }
    
    public boolean find (int search)
    {
        Pilas aux = new Pilas();
        int e = 0;
        boolean busq = false;
        while(this.size()> 0 && !busq )
        {
            e = (int) this.pop();
            aux.push(e);
            if (e == search)
                busq = true;
            
        }
        while(aux.size()>0)
        {
            this.push(aux.pop());
        }
    
        return busq;
    }
    
    public int indexof (int num)
    {
        Pilas aux = new Pilas();
        int e = 0;
        int ind = 0;
        int x = -1;
        
        while(this.size()> 0 )
        {
            e = (int) this.pop();
            aux.push(e);
            ind++;
            if (e == num)
                x = ind;
            
        }
        while(aux.size()>0)
        {
            this.push(aux.pop());
        }
        
        return x;
        
    }
    public Pilas split( int posicion ){
     if( posicion > this.size() )
         throw new IllegalArgumentException("Error en el parámetro");
     Pilas aux = new Pilas();
     Pilas aux2 = new Pilas();
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
}
