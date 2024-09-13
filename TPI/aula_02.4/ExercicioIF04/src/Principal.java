
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
        Temperatura temp = new Temperatura();
        
        double Fahrenheit;
        double Celsius;
        
        System.out.print("Digite a temperatura em Fahrenheit: ");
        Fahrenheit = leia.nextDouble();
        
        System.out.print("Digite a temperatura em Celsius: ");
        Celsius = leia.nextDouble();
        
        temp.calcularTempCelsius(Fahrenheit);
        temp.calcularTempFahrenheit(Celsius);
      
    }
    
}
