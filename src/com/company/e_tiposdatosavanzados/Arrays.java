package com.company.e_tiposdatosavanzados;

public class Arrays {

    public static void main(String[] args) {
        // Arrays múltiples valores con el mismo tipo
        // Dos maneras de declararlo
        // 1. Indicando el número máximo de elementos que tendrá
        // Si no le metemos datos tendrá el cero por defecto o según el tipo de dato que tenga
        int arrayUno[] = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

        for (int i : arrayUno) {
            System.out.println("Array uno: " + i);
        }

        // 2. Indicamos directamente los datos que contendrá
        int arrayDos[] = {1, 2, 3, 4, 5};

        arrayDos[0] = 1;
        arrayDos[1] = 2;
        arrayDos[2] = 3;
        arrayDos[3] = 4;
        arrayDos[4] = 5;

        for (int i : arrayDos) {
            System.out.println("Array dos: " + i);
        }

        String nombres[] = {
                "Dani",
                "Juan",
                "Francisco"
        };
        System.out.println("Longitud array de nombres: " + nombres.length);
        // Recorrer un array con for each
        for (String i : nombres) {
            System.out.println("Con for each: Array de nombres: " + i);
        }
        // Recorrer un array con for
        // con esta obtenemos el índice de cada posición y en ocasiones puede ser necesario
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Con for: Array de nombres: " + "Posición: " + i + " = " + nombres[i]);
        }

        // Una forma para sacar el último nombre
        String ultimoNombre = "";
        for (int i = 0; i < nombres.length; i++) {
            ultimoNombre = nombres[i];
        }
        System.out.println("Último nombre: " + ultimoNombre);

        // Recorrer un array con while (Mejor no usar)
        int contador = 0;
        while (contador < nombres.length) {
            System.out.println("Con while: Nombre actual: " + nombres[contador] + " en posición: " + contador);
            contador++;
        }

        // DIMENSIONES EN LOS ARRAYS
        // Es como una hoja de cálculo que tiene filas y columnas
        // Primer elemento filas, segundo columnas
        // Inicializarlo si no conocemos los valores inicialmente
        int arrayDimensiones [][] = new int[2][4];
        arrayDimensiones[0][0] = 1;
        arrayDimensiones[0][1] = 2;
        arrayDimensiones[0][2] = 3;
        arrayDimensiones[0][3] = 4;

        arrayDimensiones[1][0] = 10;
        arrayDimensiones[1][1] = 20;
        arrayDimensiones[1][2] = 30;
        arrayDimensiones[1][3] = 40;
        /*
        2. Inicializarlo de una vez si conocemos previamente los valores
        int arrayDimensiones[][] = {
            {1,2,3,4},
            {10,20,30,40}
        };
         */

        // para recorrerlo hay que anidar for
        for (int i = 0; i < arrayDimensiones.length; i++) {
            System.out.println("Valor de i en la columna: " + i);
            for (int j = 0; j < arrayDimensiones[i].length; j++) {
                System.out.println("Estoy en i: " + i + " j: " + j);
                System.out.println("El valor almacenado es: " + arrayDimensiones[i][j]);
            }
        }
        // se pueden usar par implementar una hoja de cálculo
        // los arrays tridimensionales son igual con un nivel más

        String nombres2[] = {"Pepe", "Juan"};
        // Puedo mutar los valores del array, pero no hacer que crezca o decrezca
        nombres2[0] = "Daniel";
        nombres2[1] = "Paco";

        // No dar demasiado espacio a un array por que ocupa memoria
        for (String nombre : nombres2) {
            System.out.println(nombre);
        }





    }
}
