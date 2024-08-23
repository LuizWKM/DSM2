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
        Passagens pas = new Passagens();
        
        pas.cadastrarDadosPassageiros();
        pas.cadastrarDadosPassagem();
        pas.mostrarDadosPassageiro();
        pas.mostrarDadosPassagem();
    }
    
}
