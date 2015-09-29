
import java.util.LinkedList;


public class Colas extends LinkedList {

    @Override
    public void addFirst(Object e) {
        super.addFirst(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object removeLast() {
        return super.removeLast(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void encolar(Object e)
    {
        this.addFirst(e);
    }
    public Object desencolar()
    {
        return this.removeLast();
    }
    
    public boolean find (int search)
    {
        Colas aux = new Colas();
        int e = 0;
        boolean busq = false;
        while(this.size()> 0 )
        {
            e = (int) this.desencolar();
            aux.encolar(e);
            if (e == search)
                busq = true;
            
        }
        while(aux.size()>0)
        {
            this.encolar(aux.desencolar());
        }
    
//        for (int i = 0; i < this.size(); i++) {
//            if(this.get(i).equals(search))
//            {
//                busq = true;
//            }
//            
//        }
        return busq;
    }
    
    
    public int indexof (int num)
    {
        Colas aux = new Colas();
        int e = 0;
        int ind = 0;
        int x = -1;
        
        while(this.size()> 0 )
        {
            e = (int) this.desencolar();
            aux.encolar(e);
            ind++;
            if (e == num)
                x = ind;
            
        }
        while(aux.size()>0)
        {
            this.encolar(aux.desencolar());
        }
        
        return x;
        
    }
    
    public Colas split( int posicion ){
     if( posicion > this.size() )
         throw new IllegalArgumentException("Error en el parámetro");
     Colas aux = new Colas();
     Colas aux2 = new Colas();
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
    
    public void merge( Colas C ){
       int s = C.size();
       int elemento;
        for (int i = 1; i <= s ; i++) {
            elemento = (int)C.desencolar();
            this.encolar(elemento);
            C.encolar(elemento);
        }
    }
    
    
    public void inserAt( int posicion , int e){
      if( posicion > this.size() )
         throw new IllegalArgumentException("Error en el parámetro");
      
      Colas aux = new Colas();
      int num;
     int contador=0;
     if (posicion == this.size() ){
         this.encolar(e);
         return;
     }
     
     while( this.size() > 0 ){
        
         if( contador++ == posicion ) 
            aux.encolar( e );
         else{
             num = (int)this.desencolar();
             aux.encolar( num );
         }
         
             
     }
     while( aux.size() > 0){
       this.encolar( aux.desencolar());
      }
      
    }
    
    
    public void removeAt( int posicion){
      if( posicion >= this.size() )
         throw new IllegalArgumentException("Error en el parámetro");
      Colas aux = new Colas();
      int num;
     int contador=0;
//     if (posicion == this.size() ){
//         this.encolar(e);
//         return;
//     }
//     
     while( this.size() > 0 ){
        
         if( contador++ == posicion ) 
            this.desencolar();
         else{
             num = (int)this.desencolar();
             aux.encolar( num );
         }
         
             
     }
     while( aux.size() > 0){
       this.encolar( aux.desencolar());
      } 
    }
    
    public int getMax()
      {
        Colas aux = new Colas();
        int e = 0;
        int num = 0;
        
        
        while(this.size()> 0 )
        {
            e = (int) this.desencolar();
            aux.encolar(e);
            
            
            if (e > num)
                num = e ;
            
        }
        while(aux.size()>0)
        {
            this.encolar(aux.desencolar());
        }
        
        return num;
        
    }   
    
    public void moveToQueue()
    {
        
    }
}
