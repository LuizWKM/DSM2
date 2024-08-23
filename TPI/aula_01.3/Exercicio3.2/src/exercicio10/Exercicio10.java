/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        2) Faça um algoritmo em Java, que receba 
           um número inteiro.
           Calcule e mostre este número elevado 
           ao quadrado
        */
        Scanner leia = new Scanner(System.in);
        int n1;
        double quad;
        System.out.print("Digite um número: ");
        n1 = leia.nextInt();
        quad = Math.pow(n1,2);
        System.out.println("O quadrado do número "+ n1 +" é: " + (int) quad );
        
    }
    
}
