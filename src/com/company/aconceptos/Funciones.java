package com.company.aconceptos;

public class Funciones {
    public static void main(String[] args) {

        // sentencias que se pueden usar desde cualquier parte de nuestro código
        holaMundoPublica();
        holaMundoPublica();
        holaMundo("Dani");
        String hola = devolverHola();
        System.out.println(hola);
        funcionSobrecargada("Dani", 42);
    }

    // Return
    private static String devolverHola() {
        return "Hola";
    }
    private static void holaMundo(String name) {
        System.out.println("Hola " + name);
    }
    // Static significa que pertenece a la clase
    // se le puede invocar sin necesidad de crear un objeto
    // pero solo dentro de la clase. No fuera

    // Public o private. Si se puede invocar desde fuera de la clase o no.

    static void holaMundoPublica() {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }
    private static void holaMundoPrivada() {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }

    // Protected solo las clases hijas pueden acceder.
    // Están bajo el mismo paquete. .com
    // si creamos uno nuevo no se puede acceder
    // orientado a objetos para las clases hijas
    protected static void holaMundoProtegida() {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }

    // void es que no devuelve nada
    // si queremos que devuelva algo poner int, double, string...
    private static int sum(int num1, int num2){
        return num1 + num2;
    }

    // sobrecarga de funciones
    // funcion con el mismo nombre
    // siempre que se cambien los argumentos
    public static void funcionSobrecargada(){
        System.out.println("Hola mundo");
    }
    public static void funcionSobrecargada(String name){
        System.out.println("Hola " + name);
    }
    public static void funcionSobrecargada(String name, Integer edad){
        System.out.println("Hola " + name + " Edad " + edad);
    }

}
