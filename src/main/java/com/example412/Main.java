package com.example412;

public class Main {

    public static void main(String[] args) {

        // Crear un objeto de la clase Persona utilizando el constructor vacio
        Persona persona1 = new Persona(123, "Juan Perez", "mail@mail.com", 123456789);

        // Llamar al metodo hablar de la clase Persona
        String saludo = persona1.hablar("Hola, como estas?");

        // persona1.dormir(8);

        System.out.println(saludo);
    }
}