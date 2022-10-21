package com.company.aconceptos;

public class SwitchCase {
    public static void main(String[] args) {

        String weather = "sunny";
        // switch sirve para evaluar multiples condiciones
        switch (weather) {
            case "sunny":
                System.out.println("El tiempo es soleado");
                // Es necesario poner el break para que solo se ejecute el código correspondiente
                break;
            case "cloudy":
                System.out.println("El tiempo está nublado");
                break;
            // Buena práctica poner un default para otros casos.
            default:
                System.out.println("No se ha podido identificar el clima");
                break;
        }
    }
}
