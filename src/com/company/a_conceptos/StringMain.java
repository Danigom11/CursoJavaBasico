package com.company.a_conceptos;

public class StringMain {
    public static void main(String[] args) {

        // Clase string
        // Cuando se usa una función devuelve un resultado
        // Si lo queremos guardar hay que asignarlo a una variable o a la misma
        /*
        length()
        startsWith()
        endsWith()
        indexOf()
        subString()
        trim() quita los espacios de antes y después
        equals()
        compareTo()
         */
        String mensaje = "  Hola mundo  ";
        System.out.println(mensaje.length());
        String mensajeMay = mensaje.toUpperCase();
        System.out.println(mensajeMay);
        System.out.println(mensajeMay.trim());
        mensajeMay = mensajeMay.trim();

        String otro = "HOLA MUNDO";
        if (mensajeMay.equals(otro)) {
            System.out.println("Verdadero");
        }

    }
}
