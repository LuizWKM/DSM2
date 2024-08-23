/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import java.util.Scanner;

/**
 *
 * @author luizr
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        2) FAÇA UM ALGORITMO ,QUE LEIA O NÚMERO
        DE LITROS, ABASTECIDO EM UM VEÍCULO
        */
        // TODO code application logic here
        double lit, valpag; 
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite os litros abastecidos: ");
        lit = leia.nextDouble();
        valpag = lit * 5.89;
        System.out.println("O preco a ser pago eh R$" + valpag);
    }
    
}
