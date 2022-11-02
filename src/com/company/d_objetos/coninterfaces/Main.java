package com.company.d_objetos.coninterfaces;

import com.company.d_objetos.sininterfaces.Empleado;

public class Main {

    // Atributo del tipo correspondiente
    // Un objeto del tipo empleado
    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySQL();
    //static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDEcel();

    public static void main(String[] args) {

       empleadoCRUD.findAll();
       empleadoCRUD.save(new Empleado());

    }
}
