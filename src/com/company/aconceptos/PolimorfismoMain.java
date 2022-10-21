package com.company.aconceptos;

public class PolimorfismoMain {
    public static void main(String[] args) {


        //Coche coche1 = new Coche();

        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        // Polimorfismo son múltiples formas
        // Cuando no se usa se trabaja con la clase concreta, la hija
        // Cuando se usa se trabaja con la clase principal o base

        Coche coche4 = new CocheElectrico();

        Coche coche5 = new CocheHibrido();

        // Para saber de clase concreta es un objeto
        // instanceof es para verificarlo

        if (coche4 instanceof Coche){
            System.out.println("Coche");
        }

        if (coche4 instanceof CocheElectrico){
            System.out.println("Coche eléctrico");
        }
        if (coche4 instanceof CocheHibrido){
            System.out.println("Coche eléctrico");
        }

    }
}
