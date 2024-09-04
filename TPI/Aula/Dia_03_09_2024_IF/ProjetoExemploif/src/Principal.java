/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // INSTANCIAR A CLASSE MEDIA ALUNO, CRIANDO O OBJETO MED
        MediaAluno med = new MediaAluno();
        // CRIANDO O MÉTODOS DA CLASSE MEDIA ALUNO
        med.calcularMedia();
        med.verificarAprovacao();
        med.verificarExame();
    }
    
}
