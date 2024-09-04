
import java.text.DecimalFormat;
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
public class OlimpiadaMatematica {
    private String nome;
    private String endereco;
    private double media; 
    private double notamenor;
    private double notamaior;

    public OlimpiadaMatematica() {
        this("","",0,0,0);
    }

    public OlimpiadaMatematica(String nome, String endereco, double media, double notamenor, double notamaior) {
        this.nome = nome;
        this.endereco = endereco;
        this.media = media;
        this.notamenor = notamenor;
        this.notamaior = notamaior;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getNotamenor() {
        return notamenor;
    }

    public void setNotamenor(double notamenor) {
        this.notamenor = notamenor;
    }

    public double getNotamaior() {
        return notamaior;
    }

    public void setNotamaior(double notamaior) {
        this.notamaior = notamaior;
    }
    
    public void calcularMedia(){
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        setNome(leia.nextLine());
        
        System.out.print("Digite o endereço do aluno: ");
        setEndereco(leia.nextLine());
        
        System.out.print("Digite a menor nota: ");
        setNotamenor(leia.nextDouble());
        
        System.out.print("Digite a maior nota: ");
        setNotamaior(leia.nextDouble());
        
        setMedia((getNotamenor() + getNotamaior()) / 2);
    }
    
    public void verificarMedia(){
        DecimalFormat conv = new DecimalFormat("0.00");
        System.out.println("Sua média foi: " + conv.format(getMedia()));
        if(getMedia() > 9){
           System.out.println("Aluno inscrito " + getNome() + ".");
        } else {
           System.out.println("Média insuficiente");
        }
    }
}
