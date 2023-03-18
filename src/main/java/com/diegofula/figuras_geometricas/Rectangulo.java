package com.diegofula.figuras_geometricas;

public class Rectangulo {
    private int base;
    private int height;

    public Rectangulo(int base, int height) {
        this.base = base;
        this.height = height;
    }
    
    public double calculateArea(){
        return base * height;
    }
    
    public double calculatePerimeter(){
        return (2 * base) + (2 * height);
    }
}
