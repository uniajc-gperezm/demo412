package com.example412;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Crear un objeto de la clase Persona utilizando el constructor vacio
        Persona persona1 = new Persona(123, "Juan Perez", "mail@mail.com", 123456789);

        System.out.println("El nombre de la persona es: " + persona1.getNombre()); // Juan Perez

        persona1.setNombre("Maria Gomez");

        LocalDate fechaNacimiento = LocalDate.of(2000, 03, 07);

        persona1.setFechaNacimiento(fechaNacimiento);
        persona1.setPaisNacimiento("Colombia");
        persona1.setGenero('F');

        System.out.println("El nombre de la persona es: " + persona1.getNombre()); // Maria Gomez

        System.out.println(persona1.toString());

        // Llamar al metodo hablar de la clase Persona
        String saludo = persona1.hablar("Hola, como estas?");

        // persona1.dormir(8);

        System.out.println(saludo);
    }
}