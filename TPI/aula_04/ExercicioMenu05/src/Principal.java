
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
        Funcionario func = new Funcionario();
        int op, hrTrab;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções abaixo: \n" +
            "1 - Cadastrar funcionário \n" +
            "2 - Calcular salário \n" +
            "3 - Listar funcionário \n" +
            "4 - Sair"));
            
            switch(op){
                case 1:
                    func.cadastrarFuncionario();
                    break;
                case 2:
                    hrTrab = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora que foi trabalhada: "));
                    JOptionPane.showMessageDialog(null,"Salário final R$" + func.calcularSalarioFinal(hrTrab));
                    break;
                case 3:
                    func.listarFuncionario();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Finalizando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida.");
                    break;
            }
            
        }while(op != 0);
        
    }
    
}
