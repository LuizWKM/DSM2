
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
public class Clientes {
     private String nome;
     private String ende;
     private String rg;

    public Clientes() {
        this("","","");
    }

    public Clientes(String nome, String ende, String rg) {
        this.nome = nome;
        this.ende = ende;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnde() {
        return ende;
    }

    public void setEnde(String ende) {
        this.ende = ende;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
     
    public void cadastrarCliente(){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        setNome(leia.nextLine());
        
        System.out.print("Digite o endereço do cliente: ");
        setEnde(leia.nextLine());
        
        System.out.print("Digite o RG do cliente: ");
        setRg(leia.nextLine());
    }
    
    public void listarCliente(){
       System.out.println("\nNome do cliente: " + getNome() + "\n" +
       "Endereço do cliente: " + getEnde() + "\n" +        
       "RG do cliente: " + getRg());
    }
     
}
