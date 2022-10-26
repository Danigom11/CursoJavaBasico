package com.company.dobjetos.sininterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDV1 {

    //
    /*
     * CRUD
     * Create
     * Retrieve/Read
     * Update
     * Delete
     */
    // interfaz: es un contrato que define una serie de métodos que dicen que hay que hacer pero no los implementa

    // Estructura de datos
    private List<Empleado> empleados = new ArrayList<>();

    // Operaciones con los datos
    // CREATE - guardar empleado
    public void guardar(Empleado empleado) {
        empleados.add(empleado);
    }

    public List<Empleado> findAll() {
        return empleados;
    }


}
