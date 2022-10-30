package com.company.etiposdatosavanzados;

import java.math.BigDecimal;

public class BigsDatas {
    public static void main(String[] args) {
        System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f);
        // El resultado termina en uno. Está mal
        // A nivel financiero no confiar en float o double
        // Para blockchain, finanzas...
        // Lo que requiera alta precisión usar bigdecimal
        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(10f);
        BigDecimal resultado = new BigDecimal(String.valueOf(valorA.multiply(valorB)));
        System.out.println(resultado);
        valorA.add(valorB);
        valorA.add(valorB);

    }
}
