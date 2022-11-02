package com.company.gentradasalida;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradasScanner {
    public static void main(String[] args) {
        // Scanner
        // Introducir algo por teclado
        // Bloquea la ejecución de mi programa hasta que se introduzca lo que se solicite
        // Importante usar try catch por si se introduce algo que no se ha solicitado y da error
        boolean ok = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            try {
                // nextInt para solicitar un número. Se pueden solicitar los que se quieran
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                ok = true;
                System.out.println("Enteros son: " + a + " " + b);
            } catch (InputMismatchException e) {
                System.out.println("Números inválidos");
            }
        } while (!ok);
    }
}
