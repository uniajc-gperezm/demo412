package com.example412;

public class Estudiante extends Persona {

    public String estudiarMateria;

    Estudiante() {
        super(); // Llamada al constructor de la clase padre Persona
        System.out.println("Constructor vacio de la clase Estudiante");
    }

    public void entregarTarea(String materia) {
        System.out.println("El estudiante entrega la tarea de la materia " + materia);
    }
    
    private int revisarNota(String materia) {
        System.out.println("El estudiante revisa su nota en la materia " + materia);
        
        // La deberia traer de la base de datos, pero por ahora se devuelve un valor fijo
        return 5;
    }
}
