package com.company.cestructurascontrol.condicionales;

public class IfElseIf {
    public static void main(String[] args) {

        String dia = "Martes";

        boolean resultadoCompaaraNum = 5 == 5;
        // equals es solo para strings y está recomendado usarlo en vez de ==
        boolean resultado = dia.equals("Martes");

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana!");
        } else if (dia.equals("Martes")) {
            System.out.println("Martes, ya queda menos!");
        } else if (dia.equals("Miércoles")) {
            System.out.println("Miércoles, ya queda menos!");
        } else if (dia.equals("Jueves")) {
            System.out.println("Jueves, ya queda menos!");
        } else if (dia.equals("Viernes")) {
            System.out.println("Viernes");
        } else if (dia.equals("Sábado")) {
            System.out.println("Sábado");
        } else if (dia.equals("Domingo")) {
            System.out.println("Domingo");
        } else {
            System.out.println("No se ha encontrado!");
        }
    }
}
