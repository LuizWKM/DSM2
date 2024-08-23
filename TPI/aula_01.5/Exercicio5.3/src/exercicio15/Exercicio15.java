/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio15;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        3) Calcular e apresentar o valor do
        volume de um cilindro, utilizando a
        fórmula:
        */
        double raio, alt, vol;
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        System.out.print("Digite o raio do cilindro em cm: ");
        raio = leia.nextDouble();
        System.out.print("Digite a altura do cilindro em cm: ");
        alt = leia.nextDouble();
        vol = 3.14159  * (raio * raio) * alt;
        System.out.println("O volume do cilindro é: " + conv.format(vol) + "cm³");
        
        
    }
    
}
