package com.company.a_conceptos;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {

        // Enviar o recibir datos
        // También se pueden leer archivos y escribir datos en archivos
        // Scanner
        // out es la salida, lo que se muestra
        // println es imprimir en una nueva línea
        System.out.println("Hola");
        // Para introducir datos con in
        // primero crear objeto escaner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();

        System.out.println("El nombre introducido es: " + nombre);
        System.out.println("El número introducido es: " + numero);

    }
}
