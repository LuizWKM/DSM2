/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio13;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        1) Faça um algoritmo para calcular 
        a área de uma circuferência.
        */
        double r, area;
        Scanner leia = new Scanner (System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        System.out.print("Digite o raio em cm da circunferência: ");
        r = leia.nextDouble();
        area = (3.14 * (r*r));
        System.out.println("A área da circunferência de " + r + " cm é: " + conv.format(area) + " cm²");
        
    }
    
}
