/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formas;

import Clases.Circulo;
import Clases.Cuadrado;
import Clases.Rectangulo;
import java.awt.Color;

/**
 *
 * @author M. Tovar
 */
public class Formas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        

        Color rojo = new Color(255, 0, 0);
        Color verde = new Color(0, 255, 0);
        Color azul = new Color(0, 0, 255);

       
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0, rojo);
        Circulo circulo = new Circulo(2.0, verde);
        Cuadrado cuadrado = new Cuadrado(4.0, azul);

        
        System.out.println("Rectangulo:");
        System.out.println("Color: " + rectangulo.getColor());
        System.out.println("Area: " + rectangulo.area());
        System.out.println("Perimetro: " + rectangulo.perimetro());

        System.out.println("Circulo:");
        System.out.println("Color: " + circulo.getColor());
        System.out.println("Area: " + circulo.area());
        System.out.println("Perimetro: " + circulo.perimetro());

        System.out.println("Cuadrado:");
        System.out.println("Color: " + cuadrado.getColor());
        System.out.println(" Area: " + cuadrado.area());
        System.out.println("Perimetro: " + cuadrado.perimetro());
    }
}
