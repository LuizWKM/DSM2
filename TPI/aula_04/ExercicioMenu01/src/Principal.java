
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
        CustoPiso cup = new CustoPiso();
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite \n" +
                    "1- Inserir valores do cômodo\n" +
                    "2- Calcular preço por área \n" +
                    "3- Mostrar valores \n" +
                    "0- Sair"));
            switch(op)
            {
                case 1:
                    cup.inserirValores();
                    break;
                    
                case 2:
                    cup.calcularprecoArea();
                    break;
                
                case 3:    
                    cup.mostrarValores();
                    break;
                
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
        while(op != 0);
    }
    
}
