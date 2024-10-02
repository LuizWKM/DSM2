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
 * @author luizr
 */
public class Usuario {
    private String nome;
    private String email;
    private String login;
    private String senha;

    Conexao con = new Conexao();
    public Usuario() {
        this("","","","");
    }

    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void cadastrarUsuario(){
        String sql= "Insert into usuarios(,Nome,Email,Login,Senha)values "+
                "('" + this.getNome() + "','" + this.getEmail()+"','"+this.getLogin()+"','"+this.getSenha()+"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");    
    }
    
    public ResultSet consultarUsuario(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select * from usuarios";
        tabela = con.RetornarResultset(sql);
     return tabela;   
    }
    
    public void excluirUsuario(){
        String sql;
        sql= "Delete from usuarios where nome="+ getNome();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    
    public void alterarUsuario(){
        String sql;
        sql="Update usuario set nome='"+ getNome()+"',email='"+getEmail()+"' where codigo="+ getLogin();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
        
    }
}
