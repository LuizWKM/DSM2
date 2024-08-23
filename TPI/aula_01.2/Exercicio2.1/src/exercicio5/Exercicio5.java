/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        1) Escreva um algoritmo para ler o 
        salário mensal atual de um funcionário 
        e o percentual de reajuste.
        */
        double salm, pr, novosal;
        DecimalFormat conv = new DecimalFormat("0.00");
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o salário atual do funcionário R$");
        salm = leia.nextDouble();
        System.out.println("Digite o percetual de reajuste: ");
        pr = leia.nextDouble();
        novosal = salm + (salm * pr) / 100;
        System.out.println("O salário com o aumento é R$" + conv.format(novosal));
    }
    
}
