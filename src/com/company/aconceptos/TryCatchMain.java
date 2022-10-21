package com.company.aconceptos;

public class TryCatchMain {
    public static void main(String[] args) {

        // Importante crear software robusto que no se detenga ante excepciones
        // Si hacemos una operación que crea una excepción podemos capturarlo

        try {
            // Aquí lo que puede dar problemas
            // Por ejemplo el acceso a una base de datos que puede dar problemas
            int result = 5 / 0;
            // Exception es la clase base para todas las excepciones
            // Mejor especificar cuál excepcion
        } catch (ArithmeticException e) {
            // Aquí lo que queremos que haga
            // Si no se pone lo siguiente no reporta el fallo y no lo registramos
            e.printStackTrace();
        } finally {
            // Aquí un código que se ejecuta siempre
            // Es el código que limpia lo echo para que esté bien.
            System.out.println("Cierre de recursos");
        }

        // El programa se detiene antes de la operación anterior y no continua si no se captura
        System.out.println("fin");

    }
}
