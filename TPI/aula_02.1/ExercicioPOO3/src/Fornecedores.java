
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
public class Fornecedores {
    private String nomeFornecedor;
    private String nomeProduto;
    private String descricaoProduto;

    public Fornecedores() {
        this("","","");
    
    }

    public Fornecedores(String nomeFornecedor, String nomeProduto, String descricaoProduto) {
        this.nomeFornecedor = nomeFornecedor;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
    public void cadastrarFornecedor (){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o nome do fornecedor: ");
        setNomeFornecedor(leia.nextLine());
        
        System.out.print("Digite o nome do produto: ");
        setNomeProduto(leia.nextLine());
        
        System.out.print("Digite a descrição do produto: ");
        setDescricaoProduto(leia.nextLine());
    }
    public void listarFornecedor(){
        System.out.println("Nome do fornecedor: " + getNomeFornecedor() +
                "\nNome do produto: " + getNomeProduto() + 
                "\nDescrição do produto: " + getDescricaoProduto());
    }
}
