package com.company.e_tiposdatosavanzados;

public class Strings {

    public static void main(String[] args) {
        String cadena = "Mensaje de texto";
        System.out.println("La cadena de texto es: " + cadena);

        int cadenaLen = cadena.length();
        System.out.println("La longitud de la cadena es de: " + cadenaLen);

        String cadenaMin = cadena.toLowerCase();
        System.out.println("La cadena en minúsculas: " + cadenaMin);

        String cadenaMax = cadena.toUpperCase();
        System.out.println("La cadena en mayúsculas: " + cadenaMax);

        // Empieza por
        boolean resultadoEmpiezaPor = cadena.startsWith("men");
        if (resultadoEmpiezaPor) {
            System.out.println("La cadena empieza por lo que estoy buscando");
        } else {
            System.out.println("La cadena no empieza por lo que quiero");
        }

        // Termina en
        boolean resultadoTerminaPor = cadena.endsWith("o");
        if (resultadoTerminaPor) {
            System.out.println("La cadena termina por lo que estoy buscando");
        } else {
            System.out.println("La cadena no termina por lo que quiero");
        }

        // Caracter en
        char letra = cadena.charAt(4);
        System.out.println("Caracter es: " + letra);

        // Imprimir caracteres uno por uno
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("Carácter actual: " + cadena.charAt(i));
        }

        // Caracteres al revés
        for (int i = cadena.length()-1; i >= 0; i--) {
            System.out.println("Cadena al revés: " + cadena.charAt(i));
        }
    }
}
