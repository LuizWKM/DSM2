
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Caixa {
    private double saldo;
    private double valor;

    public Caixa() {
    this(0.0,0.0);
    }

    public Caixa(double saldo, double valor) {
        this.saldo = saldo;
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
    public void depositar(){
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito R$")));
        setSaldo(getSaldo() + getValor());
    }
    
    public void sacar(){
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque R$")));
        setSaldo(getSaldo() - getValor());
    }
    
    public double mostrarSaldo(){
        return getSaldo();
    }
}
