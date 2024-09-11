
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
public class Quadrado {
    private double numero;
    private double resultado;
    DecimalFormat conv = new DecimalFormat("0.00");

    public Quadrado() {
        this(0,0);
    }

    public Quadrado(double numero, double resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void calcularquadrado(){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número para ser calculado o seu quadrado: ");
        setNumero(leia.nextDouble());
       resultado = Math.pow(numero, 2);
    }
    
    public void mostrarQuadrado(){
        System.out.println("O quadrado do número " + getNumero() + " é: " + conv.format(getResultado()));
    }
}
