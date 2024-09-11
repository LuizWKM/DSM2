
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luizr
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        Combustivel comb = new Combustivel();
        double km, valorComb;
        
        System.out.print("Digite o km: ");
        km = leia.nextDouble();
        comb.calcularLitros(km);
        
        System.out.print("Digite o valor do combustivel R$");
        valorComb = leia.nextDouble();
  
 
        System.out.println("Você andou " + km + " quilômetros e gastou R$" + conv.format(comb.calcularTotalGasto(valorComb)) + " em litros");
        
    }
    
}
