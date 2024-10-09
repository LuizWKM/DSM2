
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
        Triangulo tri = new Triangulo();
        int i = 0;
        do{
            i = (Integer.parseInt(JOptionPane.showInputDialog("Menu e sua opções abaixo: " + "\n" + "1 - Inserir dados do triângulo em M(metros)" + 
            "\n" + "2 - Calcular área do triângulo" + "\n" + "3 - Mostrar área do triângulo" + "\n" + "0 - Sair")));
        switch(i){
            case 1:
                tri.inserirDadosTriangulo();
                break;
            case 2:
                tri.calcularArea();
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"A área do triângulo é: " + tri.mostrarAreaTriangulo() + "m²");
        }
          } while (i != 0);
     }
}
