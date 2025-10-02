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
public class Triangulo extends Forma {

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public Color getColor() {
        return color;
    }
    double lado1, lado2,altura,base;
    

    public Triangulo(double lado1, double lado2, double altura, double base, Color color) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
        this.base = base;
        
    }
    public double area(){
        return base*altura/2;
        
    }
    public double Perimetro(){
        return base+lado1+lado2;
       
    }
    
    
    
    
    
    
}
