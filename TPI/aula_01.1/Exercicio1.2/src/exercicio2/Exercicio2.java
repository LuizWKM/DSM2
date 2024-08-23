/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nota1, nota2, nota3, nota4, nota5, nota6, media1, media2, soma;
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        
        System.out.println("Digite a primeira nota: ");
        nota1 = leia.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = leia.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        nota3 = leia.nextDouble();
        
        media1 = (nota1 + nota2 + nota3)/3;
        
        System.out.println("Digite a quarta nota: ");
        nota4 = leia.nextDouble();
        
        System.out.println("Digite a quinta nota: ");
        nota5 = leia.nextDouble();
        
        System.out.println("Digite a sexta nota: ");
        nota6 = leia.nextDouble();
        
        media2 = (nota4 + nota5+ nota6)/3;
        
        soma = media1 + media2;
        System.out.println("A média 1 foi: " + conv.format(media1));
        System.out.println("A média 2 foi: " + conv.format(media2));
        System.out.println("A soma das duas médias foi: " + conv.format(soma));
    }
    
}
