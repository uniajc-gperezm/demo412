package com.example412;

import java.time.LocalDate;
import java.time.Period;

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
    private LocalDate fechaNacimiento;
    private String paisNacimiento;
    private Character genero;

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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
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

    public int calcularEdad() {
        if (fechaNacimiento == null) {
            return 0; // Si no se ha establecido la fecha de nacimiento, se devuelve 0
        }

        LocalDate fechaActual = LocalDate.now(); // Obtener la fecha actual

        // Forma uno
        // int anios = fechaActual.getYear() - fechaNacimiento.getYear(); // Calcular la edad restando el año de nacimiento al año actual


        // Forma dos
        int anios = Period.between(this.fechaNacimiento, fechaActual).getYears(); // Calcular el periodo entre la fecha de nacimiento y la fecha actual


        return anios; // Devolver la edad calculada
    }

    public String toString() {
        return "Persona{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono=" + telefono +
                ", fechaNacimiento=" + fechaNacimiento +
                ", paisNacimiento='" + paisNacimiento + '\'' +
                ", genero=" + genero +
                ", edad=" + calcularEdad() +
                '}';
    }

}
