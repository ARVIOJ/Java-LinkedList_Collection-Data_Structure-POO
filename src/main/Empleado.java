package main;

import java.util.Comparator;

public class Empleado implements Comparable<Empleado> {

    private String nombre;
    private String puesto;
    private String turno;
    private int diasTrabajo;
    private Double sueldo; 

    public Empleado(String nombre, String puesto, String turno, int diasTrabajo, Double sueldo) {

        this.nombre = nombre;
        this.puesto = puesto;
        this.turno = turno;
        this.diasTrabajo = diasTrabajo;
        this.sueldo = sueldo;

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

    public Double getSueldo() {
        return sueldo;
    }
   
    @Override
    public String toString() {
        return nombre + " con un puesto de " + puesto + " del turno " + turno + " con " + diasTrabajo + " dias de trabajo" + " y gana $"+ sueldo + "\n";
    }

  @Override
    public int compareTo(Empleado Em) {
        return this.getSueldo().compareTo(Em.getSueldo());
    }

}
