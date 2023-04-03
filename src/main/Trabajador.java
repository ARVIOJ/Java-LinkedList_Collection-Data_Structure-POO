package main;

import java.util.Comparator;

public class Trabajador{ //implements Comparable<Trabajador> 

    private String nombre;
    private String puesto;
    private String turno;
    private int diasTrabajo;

    public Trabajador(String nombre, String puesto, String turno, int diasTrabajo) {

        this.nombre = nombre;
        this.puesto = puesto;
        this.turno = turno;
        this.diasTrabajo = diasTrabajo;

    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getTurno() {
        return turno;
    }

    public int getDiasTrabajo() {
        return diasTrabajo;
    }

 
    @Override
    public String toString() {
        return nombre + " con un puesto de " + puesto + " del turno " + turno + " con " + diasTrabajo + " dias de trabajo\n";
    }
    
//    @Override
//    public int compareTo(Trabajador a) {
//        return this.getTurno().compareTo(a.getTurno());
//   
//    }
    
}
