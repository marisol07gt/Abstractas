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
public class TrianguloEquilatero extends  Triangulo {
    public TrianguloEquilatero(double base, double altura, double lado1, double lado2, Color color){
        super(base,altura,lado1,lado2,color);
    
        
    }

    @Override
    public double Perimetro() {
        return 3*this.lado1; 
    }

    @Override
    public double area() {
        return (Math.sqrt(3)/4)*this.lado1; 
    }
    
    
 
    
    

    
    
}
