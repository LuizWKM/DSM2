/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nota1, nota2, media;
        String nome;
        
        //Scanner é utilizado para ler os valores digitados
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = leia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = leia.nextDouble();
        System.out.println("Digite o nome do aluno: ");
        nome = leia.next();
        media = (nota1 + nota2) / 2;
        
        //Arrendondar valores
        DecimalFormat conv = new DecimalFormat("0.00");
        System.out.println("O aluno, " + nome + ", teve uma média de: " + conv.format(media));
    }
    
}
