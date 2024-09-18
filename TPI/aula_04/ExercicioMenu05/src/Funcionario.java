
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
public class Funcionario {
    private String nomeFuncionario;
    private String telefoneFuncionario;
    private String enderecoFuncionario;
    private double salariohora;
    private double salariofinal;

    public Funcionario() {
        this("","","",0.0,0.0);
    }

    public Funcionario(String nomeFuncionario, String telefoneFuncionario, String enderecoFuncionario, double salariohora, double salariofinal) {
        this.nomeFuncionario = nomeFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.enderecoFuncionario = enderecoFuncionario;
        this.salariohora = salariohora;
        this.salariofinal = salariofinal;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    public double getSalariohora() {
        return salariohora;
    }

    public void setSalariohora(double salariohora) {
        this.salariohora = salariohora;
    }

    public double getSalariofinal() {
        return salariofinal;
    }

    public void setSalariofinal(double salariofinal) {
        this.salariofinal = salariofinal;
    }
    
    public void cadastrarFuncionario(){
        setNomeFuncionario(JOptionPane.showInputDialog("Digite o nome do funcionário: "));
        setTelefoneFuncionario(JOptionPane.showInputDialog("Digite o telefone do funcionário: "));
        setEnderecoFuncionario(JOptionPane.showInputDialog("Digite o endereço do funcionário: "));
        setSalariohora(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário que o funcionário ganha por hora R$")));
    }
    
    public double calcularSalarioFinal(int hrTrab){
        setSalariofinal(hrTrab * getSalariohora());
        return getSalariofinal();
    }
    
    public void listarFuncionario(){
        JOptionPane.showMessageDialog(null, "Nome do funcionário: " + getNomeFuncionario() +
        "\nTelefone do funcionário: " + getTelefoneFuncionario() +
        "\nEndereço do funcionário: " + getEnderecoFuncionario() +
        "\nSalário hora R$" + getSalariohora() +
        "\nSalário final R$" + getSalariofinal());
 }
}
