package com.company.dobjetos.coninterfaces;

import com.company.dobjetos.sininterfaces.Empleado;

import java.util.List;

public class EmpleadoCRUDMySQL implements EmpleadoCRUD, EmpleadoReader{
    // Hasta que no se cumpla el contrato y se implementen todos los métodos da error
    // Se implementan automáticamente
    // Luego hay que codificar uno a uno lo que queramos que haga
    // Se pueden implementar varias interfaces a la vez y al llamar a ellas separarlas por comas

    @Override
    public void save(Empleado empleado) {

    }

    @Override
    public List<Empleado> findAll() {
        return null;
    }

    @Override
    public void delete(Empleado empleado) {

    }
}
