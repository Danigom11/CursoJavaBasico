package com.company.cestructurascontrol.condicionales;

public class If {
    public static void main(String[] args) {

        int edad = 17;
        boolean esMayor = edad >= 18; // false
        if (esMayor) {
            System.out.println("Es mayor de edad");
        }
        System.out.println("Es menor de edad");

    }
}