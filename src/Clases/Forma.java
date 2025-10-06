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
public abstract class Forma { //Se agregó 'abstract' a la clase,Evitar que se creen instancias de Forma directamente
    protected Color color;

    public Forma(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    // Métodos abstractos (sin implementación)
    public abstract double area(); //Obligar a cada forma a calcular su área específica
    public abstract double perimetro(); //Obligar a cada forma a calcular su perímetro específico

    // Método concreto (con implementación real)
    public void mostrarInformacion(String tipoForma) {
        System.out.println("=== " + tipoForma + " ===");
        System.out.println("Color: " + color.toString());
        System.out.println("Area: " + String.format("%.2f", area()));
        System.out.println("Perimetro: " + String.format("%.2f", perimetro()));
        
    }
}