/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

import java.util.Scanner;

/**
 *
 * @author luizr
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        4) A PARTIR DAS MEDIDAS DOS LADOS DE UM
        RETÂNGULO, CALCULE A ÁREA E O PERÍMETRO
        DESTE RETÂNGULO
        */
        double a, b, area, peri;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a altura do retângulo em cm: ");
        a = leia.nextDouble();
        System.out.println("Digite a base do retângulo em cm: ");
        b = leia.nextDouble();
        area = a * b;
        peri = 2*a + 2*b;
        System.out.println("A área do retângulo é: " + area + "cm²");
        System.out.println("O perímetro do retângulo é: " + peri + "cm");
    }
    
}
