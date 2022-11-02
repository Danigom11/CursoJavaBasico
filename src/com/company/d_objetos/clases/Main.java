package com.company.d_objetos.clases;

import com.company.d_objetos.herencia.Camion;
import com.company.d_objetos.herencia.Coche;
import com.company.d_objetos.herencia.Motocicleta;

public class Main {

    public static void main(String[] args) {

        // 1. Clases y objetos
        // Una clase es como una plantilla para un objeto
        // El objeto
        // con el constructor vacío
        Vehiculo toyotaPrius = new Vehiculo();

        Motor motorGTI = new Motor("GTI", 190, 459.0, 6);
        // objeto con el constructor con parámetros
        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 0, motorGTI);
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed);

        // 2. Herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";

        System.out.println("fin de programa");

        // 3. Polimorfismo
        // Una forma que se puede comportar de diferentes formas
        // ejemplo: el vehículo creado después puede actuar como moto, coche o camión al acelerar
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        // 4. Abstract: no se pueden instanciar. Solo a través de las clases hijas

        // 5. Static: permite indicar que un atributo o método pertenece a una clase y permite acceder a él sin necesidad de crear un objeto.

        // 6. Programación genérica. Clases que permitan trabajar con diferentes tipos de datos cada vez.


    }
}
