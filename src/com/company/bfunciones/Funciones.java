package com.company.bfunciones;

public class Funciones {
    public static void main(String[] args) {

        // METODO si está relacionado con objetos
        // FUNCIÓN en lo demás

        // opción 1: función sin parámetros y sin tipo de retorno
        // bloque de código que se puede repetir
        // se invoca llamando a la función
        showMenu();
        showMenu();

        // opción 2: función sin parámetros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPrice();
        System.out.println(price);
        
        // opción 3: función con parámetros y sin tipo de retorno
        imprimirSaludoBuenosDias("OpenBootcamp");

        // opción 4: función con parámetros y con tipo de retorno
        String nombre = "Daniel";
        String apellido = "Gómez";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int resultadoSuma = suma(50, 200);
        int resultadoSuma1 = suma(500, 200);

    }

    static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    static String obtenerSaludo(String nombre, String apellido) {
        return "Buenas tardes " + nombre + " " + apellido;
    }

    static void imprimirSaludoBuenosDias(String name) {
        System.out.println("Buenas tardes " + name);
    }

    static double getPrice() {
        return 100.99;
    }


    // función opción 1
    // primero si queremos que devuelva algo indicando que es o nada con void
    // para indicar que es una función poner dos paréntesis
    static void showMenu() {
        System.out.println("Bienvenidos al E-commerce de zapatillas:");
        System.out.println("1. Ver zapatillas");
        System.out.println("2. Comprar zapatillas");
        System.out.println("3. Salir");
    }

    // función opción 2
    // al usar un return queremos que devuelva un tipo de datos
    // hay que especificar qué tipo de datos
    static String getMenu() {
        return "Bienvenidos al E-commerce de zapatillas: \n 1. Ver zapatillas...";
    }
}
