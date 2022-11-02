package com.company.gentradasalida;

import java.io.*;

public class EntradasInputStream {
    public static void main(String[] args) {
        // Entrada.
        // Datos que entran en el programa de múltiples fuentes

        // Salida.
        // Los datos que se muestran o se generan

        // Entradas.
        // stream es que constantemente se están recibiendo datos
        // muchas posibles opciones
        // para coger datos de un fichero
        // como la clase fileinputStream arroja throws hay que hacer try catch
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\danig\\OneDrive\\Documentos\\ArchivoPrueba.txt");
            // BufferedInputStream
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            // este stream devuelve una secuencia de bytes. un array de byte.
            try {
                // 1. Metodo para leer un fichero pequeño en memoria::
                //readAllBytes carga en memoria el fichero. Para ficheros pequeños
//                byte[] datosByte = fichero.readAllBytes();
//                for (byte dato : datosByte) {
//                    System.out.print((char) dato);
//                }

                // 2. Método para leer un fichero grande:
//                int datoInt = fichero.read();
//                while (datoInt != -1) {
//                    // EOF end of file
//                    System.out.print((char) datoInt);
//                    datoInt = fichero.read();
//                }

                // 3. Método para leer de cinco en cinco:
//                byte datosPartidoByte[] = new byte[5];
//                int datosPartidosInt = fichero.read(datosPartidoByte);
//                while (datosPartidosInt != -1) {
//                    // EOF end of file
//                    System.out.print((char)datosPartidosInt);
//                    datosPartidosInt = fichero.read(datosPartidoByte);
//                }

                // BufferInputStream
                // Crea un archivo en memoria y lee de él. Una parte está en memoria y cuando se consume se libera para nuestro uso
                int dato = ficheroBuffer.read();
                while (dato != -1) {
                    System.out.print((char) dato);
                    dato = ficheroBuffer.read();
                }



            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero da error: " + e.getMessage());
        }
    }
}
