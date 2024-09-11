
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
    
    do{
    op = Integer.parseInt(JOptionPane.showInputDialog("Digite\n" +
            "1- Calcular área quadrado\n" +
            "2- Calcula perimetro quadrado\n" +
            "3- Mostrar valores\n" +
            "0- Sair"));
    
    
    switch(op){
        case 1:
            qua.calcularArea(op);
            break;
        case 2:
            qua.(op);
    }
    while(op != 0);
    }
}
    
