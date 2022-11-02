package com.company.e_tiposdatosavanzados;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        // Mapas o array asociativo
        // Es un diccionario donde tengo una clave y un único valor (que podría ser una lista)
        // HashMap no se puede duplicar la clave
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        // para sobreescribir el valor de una clave y si no existe añádelo
        mapa.put("clave3", 50);
        // para reemplazar mejor usar replace
        // si no existe la clave no hace nada
        mapa.replace("clave1", 80);
        mapa.replace("clave7", 80);
        // borrar clave
        mapa.remove("clave2");

        // recorrer valores de un mapa
        for (Map.Entry elemento : mapa.entrySet()) {
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Valor del elemento: " + elemento.getValue());
        }
        System.out.println(mapa);
        // Para acceder al valor de una clave
        System.out.println(mapa.get("clave1"));
    }
}
