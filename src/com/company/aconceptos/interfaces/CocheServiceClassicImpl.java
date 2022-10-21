package com.company.aconceptos.interfaces;

import com.company.aconceptos.Coche;
import com.company.aconceptos.CocheElectrico;

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
