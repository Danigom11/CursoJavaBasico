package com.company.a_conceptos;

public class WhileLoop {
    public static void main(String[] args) {

        boolean check = true;
        int count = 0;
        // En los paréntesis se evalúa una condición
        while(count < 10) {
            count++; // condición de salida
            if (count == 6) {
                // salta el código que hay a continuación y vuelve a empezar
                System.out.println("El número es 6");
                continue;
            }
            if (count == 8) {
                System.out.println("El número es 8 y rompe el bucle");
                // Rompe el fluje de ejecución y termina el bucle
                break;
            }

            System.out.println("Hola mundo " + count);
        }
        System.out.println("Fin");
    }
}
