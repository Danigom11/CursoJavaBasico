package com.company.d_objetos.herencia;

import com.company.d_objetos.clases.Motor;
import com.company.d_objetos.clases.Vehiculo;

public class Motocicleta extends Vehiculo {
    boolean baul;

    public Motocicleta() {}
    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor, boolean baul) {
        // super: llama a la clase superior
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.baul = baul;
    }
}
