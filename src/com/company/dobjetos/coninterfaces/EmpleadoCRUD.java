package com.company.dobjetos.coninterfaces;

import com.company.dobjetos.sininterfaces.Empleado;

import java.util.List;

// Solo declara métodos, no los implementa
// Actúa como un contrato.
// Dice lo que hay que hacer pero no lo hace

public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);
}
