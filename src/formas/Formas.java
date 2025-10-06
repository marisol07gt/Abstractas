/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formas;

import Clases.Circulo;
import Clases.Cuadrado;
import Clases.Forma;
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

        // Crear formas
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0, rojo);
        Circulo circulo = new Circulo(2.0, verde);
        Cuadrado cuadrado = new Cuadrado(4.0, azul);

        
        System.out.println("INFORMACION FORMAS:");
       
        
        rectangulo.mostrarInformacion("Rectangulo");
        circulo.mostrarInformacion("Circulo");
        cuadrado.mostrarInformacion("Cuadrado");
    }
}