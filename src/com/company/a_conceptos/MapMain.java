package com.company.a_conceptos;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        // Maps. Es una interfaz
        // Pares de clave valor
        // Primer string para la clave segundo para el valor que puede ser un objeto
        Map<String, String> personas = new HashMap<>();

        personas.put("03111111J", "Nombre Apellido 1");
        personas.put("03111112J", "Nombre Apellido 2");
        personas.put("03111113J", "Nombre Apellido 3");

        System.out.println(personas);

        // Para imprimir la clave
        for(String key : personas.keySet()) {
            System.out.println(key);
        }
        // Para imprimir el valor
        for(String value : personas.values()) {
            System.out.println(value);
        }
        // Para imprimir la clave y el valor.
        for(Map.Entry<String, String> pair : personas.entrySet()) {
            System.out.println(pair.getKey() + " / " + pair.getValue());
        }
    }
}
