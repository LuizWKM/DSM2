/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        1) Faça um algoritmo em Java que 
        receba dois números inteiros, 
        calcule e mostre o dobro do primeiro e 
        o triplo do segundo
        */
        int n1, n2;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = leia.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = leia.nextInt();
        System.out.println("\nO dobro do número " + n1 +" é: " + n1 * 2);
        System.out.println("O triplo do número "+ n2 +" é: " + n2 * 3);
    }
    
}
