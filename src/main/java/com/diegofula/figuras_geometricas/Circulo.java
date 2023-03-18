package com.diegofula.figuras_geometricas;

public class Circulo {
    
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }
    
    public double calculateArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double calculatePerimeter(){
        return 2 * Math.PI * radio;
    }
    
}
