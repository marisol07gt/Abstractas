/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Color;

/**
 *
 * @author M. Tovar
 */
public class Rectangulo extends Forma {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura, Color color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    
    
    
    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }
}
