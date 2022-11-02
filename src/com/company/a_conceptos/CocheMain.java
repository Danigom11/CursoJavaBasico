package com.company.a_conceptos;

public class CocheMain {
    public static void main(String[] args) {

        String coche = "alfa romeo";
        // Se invoca el método constructor
        Coche cocheObj = new CocheHibrido();
        // Con control P aparecen las propiedades del constructor
        // Instancia. Valores exclusivos de cada objeto en sus atributos
        Coche cocheObj2 = new CocheElectrico("rojo", "honda", "civic", 1430.45, 5.4, "motor");

        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.8;

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo de motor";
        cocheElectrico.color = "Verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "Civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "alfa", "romeo", 1500.45, 4.4, "txz");
        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);
    }
}
