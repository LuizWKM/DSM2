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
        //INSTANCIAR O OBJETO USU = é o que você quiser DA CLASSE USUARIO
          Usuario usu = new Usuario();
          //CHAMADA DOS MÉTODOS DA CLASSE USUARIO
          usu.guardarDados();
          usu.mostrarDados();
    }
    
}
