
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
public class Multiplicacao {
    private int valor;
    private int resultado;

    public Multiplicacao() {
        this(0,0);
    }

    public Multiplicacao(int valor, int resultado) {
        this.valor = valor;
        this.resultado = resultado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void multiplicacao4(){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número para ser multiplicado por 4: ");
        setValor(leia.nextInt());
        resultado = valor * 4;
    }
    
    public void MostrarMultiplicacao(){
       System.out.println("O valor de " + getValor() + " multiplicado por 4 é: " + getResultado());
    }
}
