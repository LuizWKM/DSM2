import java.util.Calendar;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luizr
 */
public class IdadePessoa {
      
    Calendar dt = Calendar.getInstance();  
    private int ano;
    private int idade;

    public IdadePessoa() {
        this(0,0);
    }

    public IdadePessoa(int ano, int idade) {
        this.ano = ano;
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void calcularIdade(){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o ano em que você nasceu: ");
        setAno(leia.nextInt());
        idade = dt.get(Calendar.YEAR) - ano;
    }
    
    public void mostrarIdade(){
        System.out.println("Você que nasceu em " + getAno() + " tem: " + getIdade() + " anos");
    }
    
}
