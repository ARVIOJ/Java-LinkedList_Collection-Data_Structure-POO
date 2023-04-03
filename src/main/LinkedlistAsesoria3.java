package main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistAsesoria3 {

    public static void main(String[] args) {
        

        LinkedList<Trabajador> Trabajadores = new LinkedList<>();

        LinkedList<Trabajador> Descansa = new LinkedList<>();

        LinkedList<Trabajador> Trabaja = new LinkedList<>();

        LinkedList<Trabajador> ADS = new LinkedList<>();

        ListIterator<Trabajador> iterador;
        Trabajador auxTrabajador;

        Trabajadores.add(new Trabajador("Ariel", "Bodeguero", "Matutino", 360));
        Trabajadores.add(new Trabajador("Cecilia", "ADS", "Vespertino", 60));
        Trabajadores.add(new Trabajador("Denni", "ADS", "Matutino", 360));
        Trabajadores.add(new Trabajador("Imelda", "Gerente", "Matutino", 3600));
        Trabajadores.add(new Trabajador("Lizet", "Cajero", "Matutino", 720));
        Trabajadores.add(new Trabajador("Cristian", "ADS", "Vespertino", 10));
        Trabajadores.add(new Trabajador("Miguel", "ADS", "Matutino", 50));
        Trabajadores.add(new Trabajador("Imanol", "ADS", "Vespertino", 380));
        Trabajadores.add(new Trabajador("Carlos", "ADS", "Matutino", 105));
        Trabajadores.add(new Trabajador("Maya", "ADS", "Matutino", 200));
        Trabajadores.add(new Trabajador("America", "ADS", "Matutino", 356));
        Trabajadores.add(new Trabajador("Brandon", "Cajero", "Vespertino", 600));
        Trabajadores.add(new Trabajador("Brayan", "ADS", "Matutino", 400));
        Trabajadores.add(new Trabajador("Antonio", "Bodeguero", "Vespertino", 500));
        Trabajadores.add(new Trabajador("Dannira", "ADS", "Matutino", 2));
        Trabajadores.add(new Trabajador("Aldair", "ADS", "Matutino", 359));
        Trabajadores.add(new Trabajador("Jocelin", "ADS", "Vespertino", 500));

        System.out.printf("%nLista de trabajadores%n");
        System.out.println(Trabajadores);

        
        while (!Trabajadores.isEmpty()) {
            auxTrabajador = Trabajadores.removeFirst();
            if (auxTrabajador.getDiasTrabajo() >= 360) {
                Descansa.add(auxTrabajador);
        } else {
                Trabaja.add(auxTrabajador);
            }
        }

        System.out.printf("%nEstos trabajadores tienen derecho a vacaciones:%n");
        System.out.println(Descansa);
        System.out.println("Numero de trabajadores: " + Descansa.size());

        System.out.println("el primer trabajador en descansar es: " + Descansa.getFirst());
        System.out.println("el ultimo trabajador en descansar es: " + Descansa.getLast());

        System.out.printf("%nEstos trabajadores aun no tienen derecho a vacaciones:%n");
        System.out.println(Trabaja);
        System.out.println("Numero de trabajadores: " + Trabaja.size());

        Trabajadores.addAll(Descansa);
        Trabajadores.addAll(Trabaja);

        iterador = Trabajadores.listIterator();

        while (iterador.hasNext()) {
            auxTrabajador = iterador.next();
            if ((auxTrabajador.getPuesto()).equals("ADS")) {
                ADS.add(auxTrabajador);
                iterador.remove();
            }
        }

        System.out.printf("%nVendedores: %n");
        System.out.println(ADS);

        Trabajadores.addAll(ADS);

        Trabajadores.addFirst(new Trabajador("Israel", "Gerente", "Vespertino", 500));
        Trabajadores.addLast(new Trabajador("Solis", "SubGerente", "Vespertino", 500));

        System.out.printf("%nLista de trabajadores actualizada%n");
        System.out.println(Trabajadores);

        //Devuelve un iterador sobre los elementos de este deque en orden secuencial inverso. uso de descendingIterator()
        System.out.printf("%nLista de trabajadores en orden secuencial inverso%n");
        Iterator AuxTrabajadores = Trabajadores.descendingIterator();
        // imprimir la lista en orden descendente
        while (AuxTrabajadores.hasNext()) {
            System.out.println(AuxTrabajadores.next());
        }
   
 
        System.out.printf("%nLo sentimos la tienda cerrara, toma una coca-cola como finiquito :D %n");
        Trabajadores.clear();
        System.out.println(Trabajadores);
        System.out.println("Numero de trabajadores: " + Trabajadores.size());
        
        
        
    }

}
