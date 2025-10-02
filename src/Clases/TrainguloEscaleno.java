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
public class TrainguloEscaleno extends Triangulo {

    public TrainguloEscaleno(double lado1, double lado2, double altura, double base, Color color) {
        super(lado1, lado2, altura, base, color);
    }

    @Override
    public double Perimetro() {
        return this.lado1+this.lado2+this.base; 
    }

    @Override
    public double area() {
        return  (this.base*this.altura)/2;
    }
    
    
}
