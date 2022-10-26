package com.company.dobjetos.herencia;

import com.company.dobjetos.clases.Motor;
import com.company.dobjetos.clases.Vehiculo;

public class Motocicleta extends Vehiculo {
    boolean baul;

    public Motocicleta() {}
    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor, boolean baul) {
        // super: llama a la clase superior
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.baul = baul;
    }
}
