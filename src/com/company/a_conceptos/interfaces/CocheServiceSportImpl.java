package com.company.a_conceptos.interfaces;

import com.company.a_conceptos.Coche;
import com.company.a_conceptos.CocheElectrico;

public class CocheServiceSportImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruir coche de carreras");
    }
}
