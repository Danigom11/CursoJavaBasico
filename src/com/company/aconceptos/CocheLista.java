package com.company.aconceptos;

public class CocheLista {

    String name = "Nombre de coche";

    public CocheLista(){}
    public CocheLista(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "CocheLista{" +
                "name='" + name + '\'' +
                '}';
    }
}
