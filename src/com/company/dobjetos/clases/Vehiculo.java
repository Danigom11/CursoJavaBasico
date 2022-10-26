package com.company.dobjetos.clases;

public class Vehiculo {

    // 1. atributos
    // Encapsulación con private. Es para proteger la manera en la que se modifican los atributos.
    // Se protegen para que no se haga un uso incorrecto
    // Public: para poder modificarlo desde donde se quiera
    // Protected: se puede acceder desde donde se quiera
    protected String fabricante;
    protected String modelo;
    // Tipo primitivo en minúscula
    // Tipo envoltorio en mayúscula. Permite null.
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    // puedo crear una clase sola para todos los atributos de un tipo
    // se asocia una clase con otra
    protected Motor motor;

    // 2. constructores
    // son métodos que permiten construir los objetos
    // convecciones: públicos, mismo nombre que clase
    public Vehiculo() {

    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = 0;
        this.motor = motor;
    }

    // se puede hacer un constructor con menos datos que luego se pueden completar
    // por ejemplo si un usuario se registra en una web que pida pocos datos al principio

    public Vehiculo(String fabricante, int year) {
        this.fabricante = fabricante;
        this.year = year;
    }

    public Vehiculo(String fabricante, String modelo) {
        // this asigna el valor del parámetro al atributo creado en esta misma clase
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // 3. métodos (comportamiento)
    public void acelerar(double quantity){
        this.speed += quantity;
    }


}
