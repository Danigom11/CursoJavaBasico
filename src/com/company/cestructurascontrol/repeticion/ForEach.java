package com.company.cestructurascontrol.repeticion;

public class ForEach {
    public static void main(String[] args) {

        String[] nombres = {
                "Pepe",
                "Juan",
                "Maria",
                "Lucas"
        };

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        int[] numeros = {1,2,3,4,5,6,7,8,9};
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println(suma);
    }
}
