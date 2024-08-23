/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio12;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author fatec-dsm2
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        4) Crie um algoritmo para efetuar o cálculo 
        do valor de uma parcela em atraso. Leia o 
        valor da prestação e a taxa de juros
        Leia o valor da parcela e a taxa de juros
        */
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        double vlp, txj, vla;
        int tempo;
        System.out.print("Digite o valor da prestação R$");
        vlp = leia.nextDouble();
        System.out.print("Digite a taxa de juros: ");
        txj = leia.nextDouble();
        System.out.print("Digite o tempo em meses: ");
        tempo = leia.nextInt();
        vla = vlp + (vlp * (txj/100) * tempo);
        System.out.println("Está devendo R$" + conv.format(vla));
    }
    
}
