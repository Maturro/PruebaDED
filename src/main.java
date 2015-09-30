public class main {
    public static void main(String[] args) {
        pila p = new pila();
        p.push(10);
        p.push(20);
        p.push(30);
        p.push(40);
        p.push(50);
        
        System.out.println("pila..................");
        System.out.println(p.pop());
        System.out.println(p.size());
        //System.out.println(p.pop());
        
        System.out.println(p);
        
        cola c = new cola();
        c.encolar(100);
        c.encolar(200);
        c.encolar(300);
        c.encolar(400);
        
        System.out.println("colas.................");
        System.out.println(c.desencolar());
        System.out.println(c.size());
        System.out.println(c);
        System.out.println("----------------merge---------------");
        cola c2 = new cola();
        c2.encolar(35);
        c2.encolar(45);
        c2.encolar(55);
        c.merge(c2);
        System.out.println("cola 1 : " + c);
        System.out.println("cola 2 : " + c2);
        p.reverse();
        System.out.println(p);
        System.out.println("-----------------------find--------------");
        System.out.println("Existe 30 ??" + p.find(30));
        System.out.println("Existe 45 ??" + p.find(45));
        System.out.println(p);
        System.out.println("--------------------indexOf-----------------");
        System.out.println("Posición de 30 ? " + p.indexOf(30));
        System.out.println("Posición de 45 ? " + p.indexOf(45));
        System.out.println(p);
        System.out.println("---------------------split------------------");
        System.out.println("Split a partir de la posicion 2 " + p.split(2));
        System.out.println(p);
        System.out.println("----------------------insertAt-----------------");
        p.insertAt(2, 100);
        p.insertAt(3, 400);
        
        System.out.println(p);
        
        System.out.println("--------------------removeAt-------------------");
        p.removeAt(3);
        System.out.println(p);
        
        System.out.println("------------------------getMax------------------");
        System.out.println("Maximo de la pila :" + p.getMax());
        System.out.println(p);
        
        System.out.println("----------------reverse 2---------------");
        p.reverse2();
        System.out.println(p);
        
        
        Lista L = new Lista();
        L.add(10, 1);
        L.add(20, 2);
        L.add(30, 1);
        L.add(40, 3);
        L.add(50, 1);
        
        
        
        
        System.out.println(L.moveToQueue());
                
        
        
        
    }
}
