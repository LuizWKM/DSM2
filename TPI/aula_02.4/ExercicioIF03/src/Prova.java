
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
public class Prova {
    private String nome;
    private double pontos;
    private String nivel;

    public Prova() {
        this("",0,"");
    }

    public Prova(String nome, double pontos, String nivel) {
        this.nome = nome;
        this.pontos = pontos;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public void nivelProva(){
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        setNome(leia.nextLine());
        
        System.out.print("Digite a pontuação do aluno: ");
        setPontos(leia.nextDouble());
        
        if(getPontos() <= 100){
        setNivel("Nível 1");
        } else if ((getPontos() > 100) && (getPontos() < 200)){
        setNivel("Nível 2");
        } else{
        setNivel("Nível 3");
        }
    }
    
    public void listarResultado(){
        System.out.println("\nNome do aluno: " + getNome() +
        "\nPontos do aluno: " + getPontos() +       
        "\nNível do aluno: " + getNivel());
    }
}
