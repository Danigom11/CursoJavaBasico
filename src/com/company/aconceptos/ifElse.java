package com.company.aconceptos;

public class ifElse {
    public static void main(String[] args) {
        // Estructuras de control se usan principalmente con booleanos
        boolean check = 5 < 10;
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;


        // Si se cumple una condición se ejecuta un código si no otro
        if (number1 < number2 && number2 < number3) {
            // Si es solo una linea se suele poner sin llaves
            System.out.println("Verdadero");
            // Si más de una linea con llaves
        } else if (number3 > number4){
            System.out.println("Verdadero 2");
        } else {
            System.out.println("Falso");
        }
        System.out.println("Fin");
        // IMPORTANTE DEPURAR
        // Muy util con las estructuras de control para poder ver por donde va el programa.
        // Se le da a depurar y se ponen puntos de frenado, break points.
        // Se va avanzando por cada línea con step over, la flecha de siguiente
    }
}
