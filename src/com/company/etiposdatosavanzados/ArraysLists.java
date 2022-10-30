package com.company.etiposdatosavanzados;

import java.util.ArrayList;

public class ArraysLists {
    public static void main(String[] args) {

        // Aumenta 50% cada vez
        // Funciona prácticamente igual que el vector
        // Es una implementación de la clase padre list
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        lista.remove("ElementoB");
        System.out.println("Contenido: " + lista);
        // ¿Cuál usar?
        // Concurrencia
        // Queremos que los programas hagan varias cosas a la vez
        // Si queremos convertir un archivo lo troceamos en partes y los convertimos uno a uno
        // No puedo tener dos hilos de ejecución para modificar un array list. Uno tiene que esperar a que termmmine el otro
        // ArrayList es para programación secuencial
        // Vector es para programación concurrente

        // Recorrerlo
        // Método corto
        for (String nombre : lista) {
            System.out.println(nombre);
        }
        // Método con posición
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // Convertir un arraylist en un array
        // se crea un array asociado al tamaño del arraylist
        String array[] = new String[lista.size()];
        // se recorre el arraylist para asignar sus valores al nuevo array
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Arraylist convertido a un nuevo array: " + i + ": " + array[i]);
        }

        // convertir un array a la vez que lo recorremos
        for (Object arrayObjeto : lista.toArray()) {
            System.out.println("Conversion a array con un objeto: " + arrayObjeto.toString());
        }

    }
}
