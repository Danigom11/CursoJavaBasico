package com.company.gentradasalida;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;

public class Salidas {
    public static void main(String[] args) throws FileNotFoundException {
        // PrintStream
        // Crea un archivo y le añade el texto hola
        PrintStream info = new PrintStream("copia.txt");
        info.println("Hola");

        // Copiar un fichero
        // La más cómoda forma de hacerlo es con InputStream
        try {
            InputStream in = new FileInputStream("copia.txt");
            byte[] datos = in.readAllBytes();
            // Es recomendable cerrar el archivo después de trabajar con él
            in.close();
            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
            in.close();
        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
