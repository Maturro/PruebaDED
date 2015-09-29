
public class main {
    
   
    public static void main(String[] args) {
         Pilas p = new Pilas();
         Colas c = new Colas();
         p.push(100);
         p.push(200);
         p.push(300);
         p.push(400);
         
         c.encolar(100);
         c.encolar(200);
         c.encolar(300);
         c.encolar(400);
         
          System.out.println("-----------------------------------------");
           p.reverse();
          System.out.println(p);
          System.out.println("-----------------------------------------");
          System.out.println(c.desencolar());
          System.out.println(c.size());
          System.out.println(c);
          System.out.println("----------------------------------------");
          System.out.println(p.pop());
          System.out.println(p.getLast());
          System.out.println(p.size());
          System.out.println(p);
          
          
          System.out.println(c.find(200));
          
          System.out.println(c);
          
          System.out.println(c.indexOf(300));
          
          System.out.println(c.split(1));
          System.out.println(c);
          
          
          c.inserAt(3, 350);
          System.out.println(c);
          
          c.removeAt(2);
          System.out.println(c);
          
          c.inserAt(0, 1350);
          System.out.println(c.getMax());
        
         
        
         
    }
}
