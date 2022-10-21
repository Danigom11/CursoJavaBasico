package com.company.bfunciones;

public class Sobrecarga {
    public static void main(String[] args) {

    }
    // Permite duplicar una funcion siempre y cuando tenga diferente número o tipo de parámetros
    // Funciones con el mismo nombre a la que le añadimos algún parámetro
    static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    static int suma(int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }

    static double suma(double numero1, double numero2, double numero3) {
        return numero1 + numero2 + numero3;
    }
}

