package com.company.ferrores;

import java.io.IOException;
import java.util.Scanner;

public class Errores {
    public static void main(String[] args) {
        // Error es un comportamiento no deseado
        // 1. Error en tiempo de ejecución
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        int resultado = numeroA / numeroB;
        System.out.println("Resultado es: " + resultado);
        // Si pongo un número y el segundo un cero no es posible dividir por cero
        // sale error en tiempo de ejecución por no prever esta situación

        // 2. Error de compilación
        // Por ejemplo que falte un punto y coma.
        // Es un error sintáctico. No cumplo con las normas de sintaxis

        // 3. Error lógico.
        // Es un error humano.
        // La lógica que hemos usado para el programa es incorrecta
        // Podría ser poner un mayor que en vez que un menor que
        // Funciona perfectamente pero mal.
        // Es el peor tipo de error, ya que es el más dificil de identificar.

        // Avisos
        // Son las señales amarillas
        // Cada una indica cuál es el error
        // Se pueden ignorar
        // @SuppressWarnings("rawtypes")
        // Es mejor solucionarlos y no ignorarlos
        // Se pueden convertir en errores más adelante

        // Soluciones
        // Usar try catch y a veces finaly
        System.out.println("Introduce dos numeros: ");

        int numeroC = scanner.nextInt();
        int numeroD = scanner.nextInt();

        try {
            int resultadoB = numeroC / numeroD;
            System.out.println("Resultado es: " + resultadoB);
        } catch (ArithmeticException e) {
            System.out.println("Excepcion aritmética es: " + e.getClass());
        } catch (Exception e) {
            System.out.println("La excepción no es aritmética");
        } finally {
            // El código que hay aquí se ejecuta siempre
            // Es mejor arreglar el código que no solucionarlo usando un finally
            System.out.println("finally");
        }
        try {
            divide(4, 0);
        } catch (Exception e) {
            // Se ejecuta lo que hay aquí dentro
            System.out.println("Error aritmético capturado desde throws y try catch");
        }
    }

    // Excepciones trow (genera una excepción) throws (es para indicar que una función devuelve excepciones)
    public static int divide(int A, int B) throws ArithmeticException, IOException {
        int resultado = 0;
        try {
            return A / B;
        }  catch (ArithmeticException e) {
            throw new IOException();
        }
    }
}
