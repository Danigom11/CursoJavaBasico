package com.company.a_conceptos.interfaces;

import com.company.a_conceptos.Coche;
import com.company.a_conceptos.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche clásico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruir coche clásico");

    }
}
