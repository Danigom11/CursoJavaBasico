package com.company.a_conceptos.interfaces;

import com.company.a_conceptos.Coche;

public class InterfacesMain {
    public static void main(String[] args) {

        // Se crean instancias a partir de la clase principal
        // Es también polimorfismo sobre una interfaz

        CocheService service = new CocheServiceSportImpl();

        // Se usan las instancias.
        Coche coche = service.crearCocheDemo();

        // Se usan habitualmente cuando se crean bases de datos o para acceder a ellas.
        // Ir haciendo implementaciones dependiendo de la tecnología que se quiera usar.

    }
}
