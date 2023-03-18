package com.diegofula.figuras_geometricas;

public class Cuadrado {
    private int side;

    public Cuadrado(int side) {
        this.side = side;
    }
    
    public double calculateArea(){
        return Math.pow(side, 2);
    }
    
    public double calculatePerimeter(){
        return (4 * side);
    }
}
