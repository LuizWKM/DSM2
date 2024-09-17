
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luizr
 */
public class Consorcio {
    private int numeroTotalPrestacoes;
    private int qtdPrestacoesPagas;
    private double valorPrestacao;
    private double saldodevedor;
    private double totalPago;

    public Consorcio() {
        this(0,0,0.0,0.0,0.0);
    }

    public Consorcio(int numeroTotalPrestacoes, int qtdPrestacoesPagas, double valorPrestacao, double saldodevedor, double totalPago) {
        this.numeroTotalPrestacoes = numeroTotalPrestacoes;
        this.qtdPrestacoesPagas = qtdPrestacoesPagas;
        this.valorPrestacao = valorPrestacao;
        this.saldodevedor = saldodevedor;
        this.totalPago = totalPago;
    }

    public int getNumeroTotalPrestacoes() {
        return numeroTotalPrestacoes;
    }

    public void setNumeroTotalPrestacoes(int numeroTotalPrestacoes) {
        this.numeroTotalPrestacoes = numeroTotalPrestacoes;
    }

    public int getQtdPrestacoesPagas() {
        return qtdPrestacoesPagas;
    }

    public void setQtdPrestacoesPagas(int qtdPrestacoesPagas) {
        this.qtdPrestacoesPagas = qtdPrestacoesPagas;
    }

    public double getValorPrestacao() {
        return valorPrestacao;
    }

    public void setValorPrestacao(double valorPrestacao) {
        this.valorPrestacao = valorPrestacao;
    }

    public double getSaldodevedor() {
        return saldodevedor;
    }

    public void setSaldodevedor(double saldodevedor) {
        this.saldodevedor = saldodevedor;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
    
    public void inserirValoresConsorcio(){
        setNumeroTotalPrestacoes(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de prestações: ")));
        setQtdPrestacoesPagas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de prestações pagas: ")));
        setValorPrestacao(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação R$")));
    }
    
    public double calcularTotalpago(){
        setTotalPago(getValorPrestacao() * getQtdPrestacoesPagas());
        return getTotalPago();
    }
    
    public double calcularSaldoDevedor(){
        setSaldodevedor(getNumeroTotalPrestacoes() * getValorPrestacao() - getTotalPago());
        return getSaldodevedor();
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null,"O total pago é R$" + getTotalPago() +
        "\nO saldo devedor é R$" + getSaldodevedor());
    }
}
