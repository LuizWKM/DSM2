/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio14;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        2) Desenvolva um programa leia o nome
        o valor e a quantidade vendida, de três
        produtos. Calcule o valor total da
        compra. Calcule o valor de cada 
        produto. Mostre o valor de cada
        produto e o valor total
        Exemplo:
        */ 
        String prod1, prod2, prod3;
        double val1, val2, val3, valt1, valt2, valt3, valt;
        int qtdv1, qtdv2, qtdv3;
        Scanner leia = new Scanner (System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        
        System.out.print("Digite o nome do primeiro produto: ");
        prod1 = leia.nextLine();
        System.out.print("Digite o nome do segundo produto: ");
        prod2 = leia.nextLine();
        System.out.print("Digite o nome do terceiro produto: ");
        prod3 = leia.nextLine();
        
        System.out.print("Digite o valor do primeiro produto em  R$");
        val1 = leia.nextDouble();
        System.out.print("Digite o valor do segundo produto em R$");
        val2 = leia.nextDouble();
        System.out.print("Digite o valor do terceiro produto em R$");
        val3 = leia.nextDouble();
        
        System.out.print("Digite a quantidade vendida do primeiro produto: ");
        qtdv1 = leia.nextInt();
        System.out.print("Digite a quantidade vendida do segundo produto: ");
        qtdv2 = leia.nextInt();
        System.out.print("Digite a quantidade vendida do terceiro produto: ");
        qtdv3 = leia.nextInt();
        
        valt1 = val1 * qtdv1;
        valt2 = val2 * qtdv2;
        valt3 = val3 * qtdv3;
        valt = valt1 + valt2 + valt3;
        
        System.out.println("O valor total do primeiro produto R$" + conv.format(valt1));
        System.out.println("O valor total do segundo produto R$" + conv.format(valt2));
        System.out.println("O valor total do terceiro produto R$" + conv.format(valt3));
        System.out.println("O valor total de todas as compras R$" + conv.format(valt));
    }
    
}
