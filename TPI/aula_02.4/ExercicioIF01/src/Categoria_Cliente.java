
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Categoria_Cliente {
    private String nome;
    private double numeroConta;
    private double saldoMedio;

    public Categoria_Cliente() {
    this("",0,0);
    }

    public Categoria_Cliente(String nome, double numeroConta, double saldoMedio) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoMedio = saldoMedio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }
    
    public void verificarSaldo(){
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o nome do cliente: ");
        setNome(leia.nextLine());
        
        System.out.print("Digite o número da conta: ");
        setNumeroConta(leia.nextDouble());
        
        System.out.print("Digite o Saldo médio R$");
        setSaldoMedio(leia.nextDouble());
        
        if(getSaldoMedio() < 1000){
           System.out.println(getNome() + " é " + "Cliente Comum");
        } else if ((getSaldoMedio() >= 1000) &&(getSaldoMedio() < 2500)){
           System.out.println(getNome() + " é " + "Cliente Prata");
        } else {
           System.out.println(getNome() + " é " + "Cliente Ouro");
        }
    }
}
