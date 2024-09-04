
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
public class MediaAluno {
    private double nota1;
    private double nota2;
    private double media;

    public MediaAluno() {
        this(0,0,0);
    }

    public MediaAluno(double nota1, double nota2, double media) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    public void calcularMedia(){
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        
        System.out.print("Digite a primeira nota: ");
        setNota1(leia.nextDouble());
        
        System.out.print("Digite a segunda nota: ");
        setNota2(leia.nextDouble());
        
        setMedia((getNota1() + getNota2()) / 2);
      
        System.out.println("A média do aluno é: " + conv.format(getMedia()));
    }
    
    public void verificarAprovacao(){
        if(getMedia() >= 5)
        {
         System.out.println("Aluno Aprovado!");   
        } else{
         System.out.println("Aluno Reprovado!");   
        }
    }
    public void verificarExame(){
        if((getMedia() >= 3) && (getMedia() < 5))
        {
         System.out.println("Aluno está de Exame!");    
        }
        else if ((getMedia() < 3) ||(getMedia() == 0)) 
        {
         System.out.println("Aluno está Reprovado Direto!");   
        } else{
         System.out.println("Aluno Aprovado pelo Conselho!");   
        }    
    }
}
