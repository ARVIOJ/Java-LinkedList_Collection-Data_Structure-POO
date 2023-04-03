package main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistAsesoria3 {

    public static void main(String[] args) {

        LinkedList<Empleado> Trabajadores = new LinkedList<>();

        LinkedList<Empleado> Descansa = new LinkedList<>();

        LinkedList<Empleado> Trabaja = new LinkedList<>();

        LinkedList<Empleado> ADS = new LinkedList<>();

        //iterar sobre la lista
        ListIterator<Empleado> iterador;

        Empleado AuxEmpleado = null;
        
        //para busqueda
        Empleado empAux = new Empleado("Brandon", "Cajero", "Vespertino", 600, 2000.00);

        
        
        Trabajadores.add(new Empleado("Ariel", "Bodeguero", "Matutino", 360, 1500.00));
        Trabajadores.add(new Empleado("Cecilia", "ADS", "Vespertino", 60, 1060.00));
        Trabajadores.add(new Empleado("Denni", "ADS", "Matutino", 360, 1060.00));
        Trabajadores.add(new Empleado("Imelda", "Gerente", "Matutino", 3600, 3000.00));
        Trabajadores.add(new Empleado("Lizet", "Cajero", "Matutino", 720, 2000.00));
        Trabajadores.add(new Empleado("Cristian", "ADS", "Vespertino", 10, 1060.00));
        Trabajadores.add(new Empleado("Miguel", "ADS", "Matutino", 50, 1060.00));
        Trabajadores.add(new Empleado("Imanol", "ADS", "Vespertino", 380, 1060.00));
        Trabajadores.add(new Empleado("Carlos", "ADS", "Matutino", 105, 1060.00));
        Trabajadores.add(new Empleado("Maya", "ADS", "Matutino", 200, 1060.00));
        Trabajadores.add(new Empleado("America", "ADS", "Matutino", 35, 1060.00));
        Trabajadores.add(new Empleado("Brandon", "Cajero", "Vespertino", 600, 2000.00));
        Trabajadores.add(new Empleado("Brayan", "ADS", "Matutino", 400, 1060.00));
        Trabajadores.add(new Empleado("Antonio", "Bodeguero", "Vespertino", 500, 1500.00));
        Trabajadores.add(new Empleado("Dannira", "ADS", "Matutino", 2, 1060.00));
        Trabajadores.add(new Empleado("Aldair", "ADS", "Matutino", 359, 1060.00));
        Trabajadores.add(new Empleado("Jocelin", "ADS", "Vespertino", 500, 1060.00));
        Trabajadores.add(new Empleado("PRUEBA", "ADS", "Vespertino", 500, 1060.00));
        Trabajadores.add(empAux);
        
        // ↓↓↓↓↓↓↓ Sirve para ordenar los elementos en la lista del mayor al menor con uso de  un comparador ↓↓↓↓↓↓↓
        Collections.sort(Trabajadores, Collections.reverseOrder());
        // ↑↑↑↑↑↑↑ Sirve para ordenar los elementos en la lista del mayor al menor con uso de  un comparador ↑↑↑↑↑↑↑

        System.out.printf("%nLista de trabajadores%n");
        System.out.println(Trabajadores);
        System.out.println("Numero de trabajadores: " + Trabajadores.size());

        //si tiene 360 dias o mas trabajando se puede ir de vacacione si no, Trabaja;
        while (!Trabajadores.isEmpty()) {
            AuxEmpleado = Trabajadores.removeFirst();
            if (AuxEmpleado.getDiasTrabajo() >= 360) {
                Descansa.add(AuxEmpleado);
            } else {
                Trabaja.add(AuxEmpleado);
            }
        }

        System.out.printf("%nEstos trabajadores tienen derecho a vacaciones:%n");
        System.out.println(Descansa);
        System.out.println("Numero de trabajadores: " + Descansa.size() + "\n");

        System.out.println("el primer trabajador en descansar es: " + Descansa.getFirst());
        System.out.println("el ultimo trabajador en descansar es: " + Descansa.getLast());

        System.out.printf("%nEstos trabajadores aun no tienen derecho a vacaciones:%n");
        System.out.println(Trabaja);
        System.out.println("Numero de trabajadores: " + Trabaja.size());

        Trabajadores.addAll(Descansa);
        Trabajadores.addAll(Trabaja);

        //remove por index o por especificacion de dato
        System.out.printf("%nEstos trabajadores renunciaron porque no les toca vacaiones :c :%n");
        System.out.println(Trabajadores.remove(1).getNombre());
        System.out.println("Numero de trabajadores: " + Trabaja.size()+"\n");

        System.out.println(Trabajadores);
        //busqueda
        System.out.println("Este empleado existe ?");
  
        if(Trabajadores.contains(empAux)){
            System.out.println("Este empleado si existe "+AuxEmpleado.getNombre());
        }else{
            System.out.println("Este empleado no existe");
        }
        
        
        iterador = Trabajadores.listIterator();
        while (iterador.hasNext()) {
            AuxEmpleado = iterador.next();
            if ((AuxEmpleado.getPuesto()).equals("ADS")) {
                ADS.add(AuxEmpleado);
                iterador.remove();
            }
        }

        System.out.printf("%nVendedores: %n");
        System.out.println(ADS);

        Trabajadores.addAll(ADS);

        Trabajadores.addFirst(new Empleado("Israel", "Gerente", "Vespertino", 500, 3000.00));
        Trabajadores.addLast(new Empleado("Solis", "SubGerente", "Vespertino", 500, 2500.00));

        System.out.printf("%nLista de trabajadores actualizada%n");

        System.out.println(Trabajadores);

        System.out.printf("%nLo sentimos la tienda cerrara, toma una coca-cola como finiquito :D %n");
        Trabajadores.clear();
        System.out.println(Trabajadores);
        System.out.println("Numero de trabajadores: " + Trabajadores.size());

    }

}
