/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegofula.figuras_geometricas;

/**
 *
 * @author RyZen 5 Pro
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FigurasGeometricasForm extends JFrame {
    private JLabel lblTitle, lblCirculo, lblRectangulo, lblTriangulo,lblCuadrado,lblResultado1, lblResultado2,lblResultado3,lblResultado4 ;
    private JTextField txtRadio, txtBaseR, txtAlturaR,txtBaseT, txtAlturaT, txtLado;
    private JButton btnCalcular1,btnCalcular2,btnCalcular3,btnCalcular4;
    
    public FigurasGeometricasForm(){
        setTitle("Figuras geometricas");
        setSize(470, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        lblTitle = new JLabel("FIGURAS GEOMETRICAS");
        lblTitle.setBounds(20, 20, 350, 25);
        add(lblTitle);
        
        lblCirculo = new JLabel("Circulo (radio)");
        lblCirculo.setBounds(20, 60, 200, 25);
        add(lblCirculo);
        
        txtRadio = new JTextField();
        txtRadio.setBounds(180, 60, 60, 25);
        add(txtRadio);
        
        btnCalcular1 = new JButton("Calcular");
        btnCalcular1.setBounds(340, 60, 100, 25);
        add(btnCalcular1);
        
        lblResultado1 = new JLabel("");
        lblResultado1.setBounds(20, 90, 300, 25);
        add(lblResultado1);
        
        lblRectangulo = new JLabel("Rectangulo (base x altura)");
        lblRectangulo.setBounds(20, 120, 200, 25);
        add(lblRectangulo);
        
        txtBaseR = new JTextField();
        txtBaseR.setBounds(180, 120, 60, 25);
        add(txtBaseR);
        
        txtAlturaR = new JTextField();
        txtAlturaR.setBounds(260, 120, 60, 25);
        add(txtAlturaR);
        
        btnCalcular2 = new JButton("Calcular");
        btnCalcular2.setBounds(340, 120, 100, 25);
        add(btnCalcular2);
        
        lblResultado2 = new JLabel("");
        lblResultado2.setBounds(20, 150, 300, 25);
        add(lblResultado2);
        
        lblTriangulo = new JLabel("Triangulo (base x altura)");
        lblTriangulo.setBounds(20, 180, 200, 25);
        add(lblTriangulo);
        
        txtBaseT = new JTextField();
        txtBaseT.setBounds(180, 180, 60, 25);
        add(txtBaseT);
        
        txtAlturaT = new JTextField();
        txtAlturaT.setBounds(260, 180, 60, 25);
        add(txtAlturaT);
        
        btnCalcular3 = new JButton("Calcular");
        btnCalcular3.setBounds(340, 180, 100, 25);
        add(btnCalcular3);
        
        lblResultado3 = new JLabel("");
        lblResultado3.setBounds(20, 210, 300, 25);
        add(lblResultado3);
        
        lblCuadrado = new JLabel("Cuadrado (lado)");
        lblCuadrado.setBounds(20, 240, 200, 25);
        add(lblCuadrado);
        
        txtLado = new JTextField();
        txtLado.setBounds(180, 240, 60, 25);
        add(txtLado);
        
        btnCalcular4 = new JButton("Calcular");
        btnCalcular4.setBounds(340, 240, 100, 25);
        add(btnCalcular4);
        
        lblResultado4 = new JLabel("");
        lblResultado4.setBounds(20, 270, 300, 25);
        add(lblResultado4);
        
        btnCalcular1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int radio = Integer.parseInt(txtRadio.getText());
                Circulo figure = new Circulo(radio);
                
                double area = figure.calculateArea();
                double peri = figure.calculatePerimeter();
                
                lblResultado1.setText("Area: " + area + " Perimetro: " + peri );
            }
        });
        
        btnCalcular2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int base = Integer.parseInt(txtBaseR.getText());
                int altura = Integer.parseInt(txtAlturaR.getText());
                
                Rectangulo figure = new Rectangulo(base,altura);
                
                double area = figure.calculateArea();
                double peri = figure.calculatePerimeter();
                
                lblResultado2.setText("Area: " + area + " Perimetro: " + peri );
            }
        });
        
        btnCalcular3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int base = Integer.parseInt(txtBaseT.getText());
                int altura = Integer.parseInt(txtAlturaT.getText());
                
                TrianguloRectangulo figure = new TrianguloRectangulo(base,altura);
                
                double area = figure.calculateArea();
                double peri = figure.calculatePerimeter();
                
                lblResultado3.setText("Area: " + area + " Perimetro: " + peri );
            }
        });
        
        btnCalcular4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int lado = Integer.parseInt(txtLado.getText());
                Cuadrado figure = new Cuadrado(lado);
                
                double area = figure.calculateArea();
                double peri = figure.calculatePerimeter();
                
                lblResultado4.setText("Area: " + area + " Perimetro: " + peri );
            }
        });
        
    }
    
}



