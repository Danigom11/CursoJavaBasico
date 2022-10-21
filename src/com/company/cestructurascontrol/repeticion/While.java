package com.company.cestructurascontrol.repeticion;

public class While {
    public static void main(String[] args) {

        int contador = 0;
        while (contador < 10) {
            contador++;
            if (contador == 5){
                // Rompe el bucle
                break;
                // continue es que el código se sigue ejecutando
                // se suele usar cuando hay valores que no se quieren usar como los impares por ejemplo...

                // Si se crea una variable dentro de una estructura de control solo existe dentro
            }
            System.out.println("Valor de contador: " + contador);
        }
    }
}
