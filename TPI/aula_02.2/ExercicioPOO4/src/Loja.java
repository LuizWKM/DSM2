
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
public class Loja {
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private double qtdItensComp;
    private double valorTotalCompra; 

    public Loja() {
        this("","",0,0,0);
    }

    public Loja(String razaoSocial, String cpfCliente, double valorCompra, double qtdItensComp, double valorTotalCompra) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qtdItensComp = qtdItensComp;
        this.valorTotalCompra = valorTotalCompra;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
    
    public void inserirDadosLoja(){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a razão social da loja: ");
        setRazaoSocial(leia.nextLine());
        
        System.out.print("Digite o cpf do cliente: ");
        setCpfCliente(leia.nextLine());
        
        System.out.print("Digite o valor da compra R$");
        setValorCompra(leia.nextDouble());
        
        System.out.print("Digite a quantidade de itens comprados: ");
        setQtdItensComp(leia.nextDouble());
    }
   
    public double calcularCompraLoja(){
        setValorTotalCompra(valorCompra * qtdItensComp);
        return getValorTotalCompra();
    }
    
    public String mostrarDadosLoja(){
        return "\nA razão social da loja: " + getRazaoSocial() + "\nO cpf do cliente é: " + getCpfCliente() + 
                "\nO valor total da compra é R$" + getValorTotalCompra();
    }

}
