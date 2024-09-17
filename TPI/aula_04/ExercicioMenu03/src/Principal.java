
import javax.swing.JOptionPane;

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
        // TODO code application logic here
        Eleitores eleit = new Eleitores();
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções abaixo:" +
            "\n" + "1 - Inserir quantidade de votos" + 
            "\n" + "2 - Calcular total de eleitores" +
            "\n" + "3 - Calcular percentual de votos" +
            "\n" + "4 - Mostrar percentual de votos" +
            "\n" + "0 - Sair"));
            
            switch(op){
                case 1:
                    eleit.inserirQtdVotos();
                    break;
                case 2:
                    eleit.calcularTotalEleitores();
                    break;
                case 3:
                    eleit.calcularPercentualVotos();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null ,"Percentual de votos brancos: " +
                    eleit.getPercBrancos() + "%\n" +
                    "Percentual votos nulos: " + eleit.getPercNulo() + "%\n" +
                    "Percentual votos válidos: " + eleit.getPercValidos() + "%");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        } while(op != 0);
    }
    
}
