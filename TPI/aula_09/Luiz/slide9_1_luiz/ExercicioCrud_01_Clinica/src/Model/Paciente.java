/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Paciente {
    private int cod_Paci;
    private String nome_Paci;
    private String endereco;
    private String complemento;
    private String rg;
    private String cpf;
    private String data_Nasc;

    Conexao con = new Conexao();
    
    public Paciente() {
        this(0,"","","","","","");
    }

    public Paciente(int cod_Paci, String nome_Paci, String endereco, String complemento, String rg, String cpf, String data_Nasc) {
        this.cod_Paci = cod_Paci;
        this.nome_Paci = nome_Paci;
        this.endereco = endereco;
        this.complemento = complemento;
        this.rg = rg;
        this.cpf = cpf;
        this.data_Nasc = data_Nasc;
    }

    public int getCod_Paci() {
        return cod_Paci;
    }

    public void setCod_Paci(int cod_Paci) {
        this.cod_Paci = cod_Paci;
    }

    public String getNome_Paci() {
        return nome_Paci;
    }

    public void setNome_Paci(String nome_Paci) {
        this.nome_Paci = nome_Paci;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_Nasc() {
        return data_Nasc;
    }

    public void setData_Nasc(String data_Nasc) {
        this.data_Nasc = data_Nasc;
    }

    public void cadastrarPaciente(){           
      String sql= "Insert into pacientes(cod_paci,nome_paci, endereco, complemento, rg, cpf, data_nasc)values "+
                "(" + this.getCod_Paci() + ",'" + this.getNome_Paci()+"','"+this.getEndereco()+"','"+this.getComplemento()+"','"+ this.getRg()+ "', '" 
              + this.getCpf() + "', '" + this.getData_Nasc() + "' )";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");     
    }
  
    public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select * from pacientes";
        tabela = con.RetornarResultset(sql);
     return tabela;   
    }
     
    public void excluir(){
        String sql;
        sql= "Delete from pacientes where cod_paci="+ getCod_Paci();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
      
    public void alterar(){
        String sql;
        sql="Update pacientes set nome_paci='"+ this.getNome_Paci()+"',endereco='"+ this.getEndereco()
                + "', complemento='" + this.getComplemento() + "', rg='" + this.getRg()  
                + "', cpf ='" + this.getCpf() + "',data_nasc='" + this.getData_Nasc() 
                + "' where cod_paci="+ this.getCod_Paci();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
        
    }
    
    public ResultSet consultarCampoEspecifico(){
        ResultSet tabela;
        tabela = null;
    
        try{
          String sql="Select * from pacientes where nome_paci like '"+ getNome_Paci()+"%'";
          tabela= con.RetornarResultset(sql);                  
       
           }
           catch(Exception sqle){
                JOptionPane.showMessageDialog(null,"Atenção..."+sqle.getMessage());
           }
        return tabela;    
    }
    
}
