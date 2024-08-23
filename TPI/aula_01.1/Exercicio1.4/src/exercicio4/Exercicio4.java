/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salariom, salariof, qtdsal;
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00"); 
        System.out.print("Digite o salário mínimo R$");
        salariom = leia.nextDouble();
        System.out.print("\nDigite o salário R$");
        salariof = leia.nextDouble();
        qtdsal = salariof / salariom;
        System.out.println("O funcionário tem " + conv.format(qtdsal) + " salários mínimos");
    }
    
}
