
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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Eleitores eleit = new Eleitores();
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1 - Inserir quantidade votos\n" +
                    "2 - Calcular Total Eleitores\n3 - Calcular Percentual Votos\n4 - Mostrar Percentual Votos\n0 - Sair"));
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
                JOptionPane.showMessageDialog(null,eleit.mostrarPercentual());
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Finalizando...");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida.");
                break;
        }
        }while(op != 0);
        
        
    }
    
}
