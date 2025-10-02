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
public class TrianguloIsoceles extends  Triangulo{

  

    public TrianguloIsoceles(double base, double altura, double ladosIguales, Color color) {
        super(base, altura, ladosIguales, ladosIguales, color);
    }

    @Override
    public double Perimetro() {
        return this.lado1*2+this.base;
    }

    @Override
    public double area() {
        return (this.getBase() * this.getAltura()) / 2;
    }
}
