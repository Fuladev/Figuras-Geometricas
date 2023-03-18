package com.diegofula.figuras_geometricas;

public class TrianguloRectangulo {
    
    private int base;
    private int height;

    public TrianguloRectangulo(int base, int height) {
        this.base = base;
        this.height = height;
    }

        
    public double calculateArea(){
        return base * height / 2;
    }
    
    public double calculatePerimeter(){
        return base + height + calculateHypo();
    }
    
    private double calculateHypo(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
    
    public void typeTriangle(){
        if (base == height && base == calculateHypo() && height == calculateHypo()) {
            System.out.println("Es un triangulo Equilatero");
        } else if (base != height && base != calculateHypo() && height != calculateHypo() ) {
            System.out.println("Es un triangulo Escaleno");
        }else{
            System.out.println("Es un tringulo Isosceles");
        }
    }
    
}
