
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
public class Eleitores {
    private int numeroTotalEleiotores;
    private int numeroVotosBrancos;
    private int numeroVotosNulos;
    private int numeroVotosValidos;
    private double percBrancos;
    private double percNulo;
    private double percValidos;

    public Eleitores() {
        this(0,0,0,0,0.0,0.0,0.0);
    }

    public Eleitores(int numeroTotalEleiotores, int numeroVotosBrancos, int numeroVotosNulos, int numeroVotosValidos, double percBrancos, double percNulo, double percValidos) {
        this.numeroTotalEleiotores = numeroTotalEleiotores;
        this.numeroVotosBrancos = numeroVotosBrancos;
        this.numeroVotosNulos = numeroVotosNulos;
        this.numeroVotosValidos = numeroVotosValidos;
        this.percBrancos = percBrancos;
        this.percNulo = percNulo;
        this.percValidos = percValidos;
    }

    public int getNumeroTotalEleiotores() {
        return numeroTotalEleiotores;
    }

    public void setNumeroTotalEleiotores(int numeroTotalEleiotores) {
        this.numeroTotalEleiotores = numeroTotalEleiotores;
    }

    public int getNumeroVotosBrancos() {
        return numeroVotosBrancos;
    }

    public void setNumeroVotosBrancos(int numeroVotosBrancos) {
        this.numeroVotosBrancos = numeroVotosBrancos;
    }

    public int getNumeroVotosNulos() {
        return numeroVotosNulos;
    }

    public void setNumeroVotosNulos(int numeroVotosNulos) {
        this.numeroVotosNulos = numeroVotosNulos;
    }

    public int getNumeroVotosValidos() {
        return numeroVotosValidos;
    }

    public void setNumeroVotosValidos(int numeroVotosValidos) {
        this.numeroVotosValidos = numeroVotosValidos;
    }

    public double getPercBrancos() {
        return percBrancos;
    }

    public void setPercBrancos(double percBrancos) {
        this.percBrancos = percBrancos;
    }

    public double getPercNulo() {
        return percNulo;
    }

    public void setPercNulo(double percNulo) {
        this.percNulo = percNulo;
    }

    public double getPercValidos() {
        return percValidos;
    }

    public void setPercValidos(double percValidos) {
        this.percValidos = percValidos;
    }
    
    public void inserirQtdVotos(){
       this.setNumeroVotosBrancos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de votos brancos: ")));
        this.setNumeroVotosNulos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de votos nulos: ")));
        this.setNumeroVotosValidos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de votos válidos: ")));
    }
    
    public void calcularTotalEleitores(){
        this.setNumeroTotalEleiotores(this.getNumeroVotosBrancos() + this.getNumeroVotosNulos() + this.getNumeroVotosValidos());
    }
    
    public void calcularPercentualVotos(){
        this.setPercBrancos((this.getNumeroVotosBrancos() * 100)/this.getNumeroTotalEleiotores());
        this.setPercNulo((this.getNumeroVotosNulos() * 100) / this.getNumeroTotalEleiotores());
        this.setPercValidos((this.getNumeroVotosValidos() * 100) / this.getNumeroTotalEleiotores());
    }
    
    public String mostrarPercentual(){
        return "Percentual de votos brancos: " + this.getPercBrancos() + "%\nPercentual de votos nulos: " + this.getPercNulo() +
                "%\nPercentual de votos válidos: " + this.getPercValidos() + "%";
    }
}
