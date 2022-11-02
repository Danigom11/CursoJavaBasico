package com.company.a_conceptos;

public abstract class Coche {

    // Abstract
    // Una clase abstracta es una clase que no se puede instanciar
    // Obliga a los desarrolladores a implementarla a traves de las subclases o clases derivadas.
    // Es compatible con el polimorfismo
    // Pero no se pueden crear objetos de la clase abstracta


    // atributos
    // características que diferencian un coche de otro
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // constructores
    // métodos especiales que permiten crear objetos de l
    // si no añadimos ninguno habrá por defecto uno vacío
    // El método constructor recibe el mismo nombre de la clase
    // Recibe una serie de parámetros que son valores que se envían desde fuera de la clase
    // y que queremos asignar a los objetos de dentro de la clase.
    public Coche(){

    }
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    // comportamiento
    public void acelerar(Integer cantidad) {
        if (cantidad > 0 && cantidad <= 120)
            this.velocidad += cantidad;
    }

    // Botón derecho generate
    // toString pasa a pantalla lo anterior

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
