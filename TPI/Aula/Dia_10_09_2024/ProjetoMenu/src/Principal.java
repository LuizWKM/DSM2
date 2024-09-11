
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
       //instanciar o objeto da classe Caixa
        Caixa cx = new Caixa();
        int op;
        //COMANDO DO-WHILE COMANDO DE REPETIÇÃO PARA O MENU
        do{
            //JOPTIONPANE.SHOWINPUTDIALOG = CAIXA PARA ENTRADA DE VALORES
           op = Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1-Depositar" +
           "\n 2-Sacar \n 3-Consultar Saldo \n 0-Sair"
            ));
           /*COMANDO DE CONDIÇÃO SWITCH-CASE PARA VERIFICAR QUAL
           OPÇÃO SELECIONADA*/
           switch(op)
           {
               case 1:
                   cx.depositar();
                   break;
               case 2:
                   cx.sacar();
                   break;
               case 3:
                   /*JOPTIONPANE SHOW MESSAGE DIALOG = CAIXA DE 
                   MENSAGEM PARA MOSTRAR OS VALORES*/
                   JOptionPane.showMessageDialog(null,
                           "Saldo Atual R$" + cx.mostrarSaldo());
                   break;
               case 0:
                   JOptionPane.showMessageDialog(null,"Finalizando...");
                   break;
               default:
                   JOptionPane.showMessageDialog(null,"Opção inválida.");
                   break;
           }
        }
        while(op != 0);
 }
}
