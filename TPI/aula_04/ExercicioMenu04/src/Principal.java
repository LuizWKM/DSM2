
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
        Consorcio cons = new Consorcio();
        int op;
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das opções abaixo: \n"+
        "1 - Inserir valores consorcio\n" +
        "2 - Calcular total pago\n" +
        "3 - Calcular saldo devedor\n" +
        "4 - Mostar valores\n" +
        "0 - Sair"));
        
        switch(op){
            case 1:
                cons.inserirValoresConsorcio(); 
                break;
            case 2:
                cons.calcularTotalpago();
                break;
            case 3:
                cons.calcularSaldoDevedor();
                break;
            case 4:
                cons.mostrarValores();
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Finalizando...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
          }
        }while(op!=0);     
      }
    }
    

