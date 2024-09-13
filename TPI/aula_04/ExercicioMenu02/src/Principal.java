
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
    Quadrado qua = new Quadrado();
    int op;
    double ladoA;
    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado em m do quadrado: "));
    
    do{
    op = Integer.parseInt(JOptionPane.showInputDialog("Digite\n" +
            "1- Calcular área quadrado\n" +
            "2- Calcula perimetro quadrado\n" +
            "3- Mostrar valores\n" +
            "0- Sair"));
    
    
    switch(op){
        case 1:
            qua.calcularArea(ladoA);
            break;
        case 2:
            qua.calcularPerimetro(ladoA);
            break;
        case 3: 
            qua.mostrarValores();
            break;
        case 0:
            JOptionPane.showMessageDialog(null, "Finalizando...");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Opção inválida.");
   } 
  }while(op != 0);
 }
}
    
