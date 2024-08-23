/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2, soma, sub, mult, div;
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        System.out.println("Digite o primeiro número: ");
        num1 = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = leia.nextInt();
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        System.out.println("A soma entre " + num1 + " e " + num2 + " eh: " + soma);
        System.out.println("A subtracao entre " + num1 + " e " + num2 + " eh: " + sub);
        System.out.println("A multiplicao entre " + num1 + " e " + num2 + " eh: " + mult);
        System.out.println("A divisao entre " + num1 + " e " + num2 + " eh: " + conv.format(div));
    }
    
}
