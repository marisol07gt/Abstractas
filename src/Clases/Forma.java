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
public abstract class Forma {
    protected Color color;

    public Forma(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    
    public abstract double area();
    public abstract double perimetro();

    
    public void mostrarInformacion(String tipoForma) {
        System.out.println("=== " + tipoForma + " ===");
        System.out.println("Color: " + color.toString());
        System.out.println("Area: " + String.format("%.2f", area()));
        System.out.println("Perimetro: " + String.format("%.2f", perimetro()));
        
    }
}