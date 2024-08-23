/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import java.util.Scanner;

/**
 *
 * @author luizr
 */
public class Exercicio7 {

    /**
     * @param args the command line argumentswicked
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        3) Leia: a descrição do produto (nome), 
        a quantidade comprada e o preço 
        unitário.
        */
        String nomeprod;
        int qtdcomp;
        double preco, total;
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite a descricao do produto(nome): ");
        nomeprod = leia.nextLine();
        System.out.println("Digite a quantidade comprada: ");
        qtdcomp = leia.nextInt();
        System.out.print("Digite o preço unitário R$");
        preco = leia.nextDouble();
        total = preco * qtdcomp;
        System.out.println("O valor total da compra do produto " + nomeprod + "foi R$" + total);
    }
    
}
