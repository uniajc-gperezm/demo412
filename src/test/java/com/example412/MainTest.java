package com.example412;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMainPrintsHelloWorld() {
        // Capturar la salida estándar
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            // Ejecutar el método main
            Main.main(new String[]{});

            // Restaurar la salida estándar
            System.setOut(originalOut);

            // Verificar que la salida sea "Hello world!"
            String output = outputStream.toString().trim();
            assertEquals("Hello world!", output, "La salida debe ser 'Hello world!'");
        } finally {
            // Asegurar que se restaure la salida estándar
            System.setOut(originalOut);
        }
    }
}
