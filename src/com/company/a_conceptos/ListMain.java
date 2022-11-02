package com.company.a_conceptos;

import java.util.ArrayList;
import java.util.List;
// Elegir siempre el paquete java.util
public class ListMain {
    public static void main(String[] args) {

        // List es una interfaz y hay que implementarla
        List<String> nombres = new ArrayList<>();

        // No tiene una estructura fija como los arrays
        // Permite trabajar con muchos datos de forma dinámica
        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Lista de objetos
        List<CocheLista> coches = new ArrayList<>();

        coches.add( new CocheLista("honda civic"));
        coches.add( new CocheLista("alfa romeo"));
        coches.add( new CocheLista("skoda"));

        System.out.println(coches);

        for (CocheLista coche : coches) {
            System.out.println(coche);
        }
    }
}


