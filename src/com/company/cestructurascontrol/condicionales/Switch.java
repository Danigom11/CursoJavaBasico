package com.company.cestructurascontrol.condicionales;

public class Switch {
    public static void main(String[] args) {
        String dia = "Lunes";

        switch (dia) {
            case "Lunes":
                System.out.println(dia);
                // Detiene el código en este punto
                break;
            case "Martes":
                System.out.println(dia);
                break;
            case "Miércoles":
                System.out.println(dia);
                break;
            case "Jueves":
                System.out.println(dia);
                // Detiene el código en este punto
                break;
            case "Viernes":
                System.out.println(dia);
                break;
            case "Sábado":
                System.out.println(dia);
                break;
            case "Domingo":
                System.out.println(dia);
                break;
            default:
                System.out.println("No es un día válido");
                break;
        }
    }
}
