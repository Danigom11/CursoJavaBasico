package com.company.cestructurascontrol.repeticion;

public class For {
    public static void main(String[] args) {

        // estructura que permite la repetición
        for(int i = 0; i < 10; i++) {
            System.out.println("El valor de i es: " + i);
        }

        String[] nombres = {
                "Pepe",
                "Juan",
                "Maria",
                "Lucas"
        };
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        int[] numeros = {1,2,3,4,5,6,7,8,9};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma  += numeros[i];
        }
        System.out.println("La suma del array es: " + suma);



    }
}
