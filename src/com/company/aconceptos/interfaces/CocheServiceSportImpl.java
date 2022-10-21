package com.company.aconceptos.interfaces;

import com.company.aconceptos.Coche;
import com.company.aconceptos.CocheElectrico;

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
