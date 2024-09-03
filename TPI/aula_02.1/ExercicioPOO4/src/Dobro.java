
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
public class Dobro {
    private double numero;
    private double calculo;

    public Dobro() {
        this(0,0);
    }

    public Dobro(double numero, double calculo) {
        this.numero = numero;
        this.calculo = calculo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }
    
    public void calcularDobro(){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um numero para ser calculado o seu dobro: ");
        setNumero(leia.nextDouble());
        calculo = numero * 2;
        
        System.out.println("O dobro do número: " + getNumero() + " é: " + getCalculo());
    }
}
