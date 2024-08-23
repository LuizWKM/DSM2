
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
public class Contatos {
    private String nome;
    private String telefone;
    private String endereco;
    private String cidade;

    public Contatos() {
    this ("","","","");
    }

    public Contatos(String nome, String telefone, String endereco, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void cadastrarDados() 
    {
    Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome do cadastrado: ");
        setNome(leia.nextLine());
        
        System.out.println("Digite o telefone do cadastrado: ");
        setTelefone(leia.nextLine());
        
        System.out.println("Digite o endereço do cadastrado: ");
        setEndereco(leia.nextLine());
        
        System.out.println("Digite a cidade do cadastrado: ");
        setCidade(leia.nextLine());
    }
    public void mostrarDados()
    {
        System.out.println("\nDados do contatos\nNome: " + getNome() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Cidade: " + getCidade() + "\n"
                
                );
    }
    
}
