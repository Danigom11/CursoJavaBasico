package com.company.d_objetos.coninterfaces;

import com.company.d_objetos.sininterfaces.Empleado;

import java.util.List;

// Solo declara métodos, no los implementa
// Actúa como un contrato.
// Dice lo que hay que hacer pero no lo hace

public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);
}
