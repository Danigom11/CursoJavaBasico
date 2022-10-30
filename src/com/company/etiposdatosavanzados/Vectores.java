package com.company.etiposdatosavanzados;

import java.util.*;

public class Vectores {
    public static void main(String[] args) {
        // Son como arrays pero no hay que darles tamaño inicial ni final
        Vector<Integer> vector = new Vector();
        // Añadir valores al vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("datos del vector: " + vector);

        // Borrar valor de una posición
        vector.remove(2);
        System.out.println("datos del vector: " + vector);

        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);
        vector.add(12);


        // Tamaño es los elementos que le he puesto
        // Capacidad es mínimo 10 y se amplía automáticamente el doble de lo que tenga
        System.out.println("Vector de tamaño: " + vector.size() + " y capacidad: " + vector.capacity());

        // El vector, al ampliar su tamaño, hace un uso mayor de la memoria, ya que se rehace cada vez que se amplía
        // Mientras se produce cada copia para ampliar mantiene al principio ambas lo que multiplica su uso en memoria

        // Acepta dos valores al crearlo
        // primer valor: capacidad inicial.
        // segundo valor: incremento. Si se supera la capacidad inicial aumenta en la cantidad que le digamos
        Vector<Integer> vector2 = new Vector(50, 15);
        // Si sabemos el valor aproximado que tendrá mejor especificarlo para hacer mejor uso de la memoria

        // Comparación de vectores
        vector2.add(1);
        vector2.add(2);

        boolean resultado = vector.equals(vector2);
        System.out.println("¿Son iguales?: " + resultado);

        // Recorrer un vector
        // 1. Sin acceder a la posición
        for (int i : vector){
            System.out.println("Valor actual en vector: " + i);
        }
        // 2. Accediendo a la posición ( con size() y con get para el valor interno)
        for (int i = 0; i < vector.size(); i++) {
            if (i % 2 == 0) {
                vector.remove(i);
                continue;
            }
            System.out.println("Valor del vector con posición: " + vector.get(i) + " en posición: " + i);
        }

        System.out.println(vector.get(1));
        vector.remove(1);
        System.out.println(vector.get(1));
        System.out.println("Vector de tamaño: " + vector.size() + " y capacidad: " + vector.capacity());

        // Hacer que decrezca un vector
        // También hace uso de memoria reducirlo. No hacerlo constantemente
        vector.trimToSize();
        System.out.println("Vector de tamaño: " + vector.size() + " y capacidad: " + vector.capacity());




    }
}
