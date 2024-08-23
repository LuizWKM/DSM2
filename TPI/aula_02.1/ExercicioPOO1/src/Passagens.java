
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
public class Passagens {
    private String nomePassageiro;
    private String telefone;
    private String rg;
    private String localViagem;
    private String data;
    private String horario;
    private String numpoltrona;

    Scanner leia = new Scanner(System.in);
    public Passagens() {
        this ("","","","","","","");
    }

    public Passagens(String nomePassageiro, String telefone, String rg, String localViagem, String data, String horario, String numpoltrona) {
        this.nomePassageiro = nomePassageiro;
        this.telefone = telefone;
        this.rg = rg;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numpoltrona = numpoltrona;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumpoltrona() {
        return numpoltrona;
    }

    public void setNumpoltrona(String numpoltrona) {
        this.numpoltrona = numpoltrona;
    }
    
    public void cadastrarDadosPassageiros()
    {
        System.out.print("Digite o nome do passageiro: ");
        setNomePassageiro(leia.nextLine());
        
        System.out.print("Digite o telefone do passageiro: ");
        setTelefone(leia.nextLine());
        
        System.out.print("Digite o RG do passageiro: ");
        setRg(leia.nextLine());
    }
    
    public void cadastrarDadosPassagem()
    {
        System.out.print("Digite o local da viagem: ");
        setLocalViagem(leia.nextLine());
        
        System.out.print("Digite a data da viagem: ");
        setData(leia.nextLine());
        
        System.out.print("Digite o horário da viagem: ");
        setHorario(leia.nextLine());
        
        System.out.print("Digite o número da poltrona: ");
        setNumpoltrona(leia.nextLine());
    }
    
    public void mostrarDadosPassageiro()
    {
        System.out.println("\nNome do passageiro: " + getNomePassageiro() + 
        "\nTelefone do passageiro: " + getTelefone() +
        "\nRG do passageiro: " + getRg());
    }
    
    public void mostrarDadosPassagem()
    {
        System.out.println("Local da viagem: " + getLocalViagem() +
        "\nData da viagem: " + getData() +
        "\nHorário da viagem: " + getHorario() +
        "\nNúmero da poltrona: " + getNumpoltrona());
    }
}

