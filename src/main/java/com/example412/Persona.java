package com.example412;

public class Persona {

    // modificadores de acceso: public, private, protected
    // public (+): se puede acceder desde cualquier clase
    // private (-): solo se puede acceder desde la clase donde se declaro el atributo o metodo
    // protected (#): se puede acceder desde la clase donde se declaro el atributo o metodo y
    
    // Atributos de la clase Persona
    // Caractetisticas que identifican a una clase Persona
    private int cedula;
    private String nombre;
    private String correo;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String hablar(String saludo) {
        //System.out.println(saludo);
        return saludo + " bien gracias!" ;
    }

    private void dormir(int horas) {
        System.out.println("La persona duerme " + horas + " horas");
    }

    public int caminar(int pasos) {
        //System.out.println("La persona camina " + pasos + " pasos");
        return pasos;
    }

}
