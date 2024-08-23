/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11;
import java.util.Scanner;
/**
 *
 * @author fatec-dsm2
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        3) Uma loja de móveis paga a seu vendedor 
        um fixo de R$1000 por mês, mais um bônus 
        de R$50 por móvel vendido. 
        Faça um algoritmo que leia a quantidade 
        de móveis vendidos por um vendedor 
        calcule o salário total do funcionário.
        Mostre a quantidade que foi vendida e o
        salário do funcionário.
        */
        Scanner leia = new Scanner(System.in);
        int qtdmv;
        double salt;
        System.out.print("Digite a quantidade de móveis vendidos: ");
        qtdmv = leia.nextInt();
        salt = (qtdmv * 50) + 1000;
        System.out.println("A quantidade de móveis vendidas foi: " + qtdmv + " e o salário do funcionário é R$" + salt);
    }
    
}
