package com.company.a_conceptos;

public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico() {
    }

    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico) {
        // Para no escribir código duplicado existe el método super.
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    // @ anotación que incluye metadatos
    // al compilador le dice que compruebe que realmente existe el método
    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
