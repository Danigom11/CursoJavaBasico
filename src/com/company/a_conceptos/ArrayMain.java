package com.company.a_conceptos;

public class ArrayMain {
    public static void main(String[] args) {

        String nombre1 = "nombre1";
        String nombre2 = "nombre2";
        String nombre3 = "nombre3";
        String nombre4 = "nombre4";


        // Se puede crear del tipo que sea
        // al poner un 3 entre los corchetes se indica la cantidad que tendrá de datos
        // son estáticos. Tienen un límite de espacios definidos.
        // Si intentamos acceder a un espacio que no existe dará error.

        String[] nombres = new String[4];
        String[] nombres2 = new String[] {nombre1, nombre2, nombre3, nombre4};
        int[] numeros = new int[5];
        Coche[] coches = new Coche[2];

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;
        nombres[3] = nombre4;

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
