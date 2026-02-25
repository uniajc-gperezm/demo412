package com.example412;

public class Persona {
    
    // Atributos de la clase Persona
    // Caractetisticas que identifican a una clase Persona
    private int cedula;
    public String nombre;
    public String correo;
    private int telefono;

    // Constructor de la clase Persona
    // Constructor vacio
    Persona() {
        System.out.println("Constructor vacio");
    }

    // Constructor con parametro cedula
    Persona(int cedula) {
        System.out.println("Constructor con parametro cedula");
        this.cedula = cedula;
    }

    // Constructor con parametros cedula, nombre, correo y telefono
    Persona(int cedula, String nombre, String correo, int telefono) {
        System.out.println("Constructor con parametros cedula, nombre, correo y telefono");
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }


    // metodos de la clase Persona

    public String hablar(String saludo) {
        //System.out.println(saludo);
        return saludo + " bien gracias!" ;
    }

    public void dormir(int horas) {
        System.out.println("La persona duerme " + horas + " horas");
    }

    public int caminar(int pasos) {
        //System.out.println("La persona camina " + pasos + " pasos");
        return pasos;
    }

}
