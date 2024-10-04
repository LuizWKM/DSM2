/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author luizr
 */
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String login;
    private String senha;

    Conexao con = new Conexao();
    public Usuario() {
        this(0,"","","","");
    }

    public Usuario(int id,String nome, String email, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
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
    
    public void cadastrarUsuario() {
    try {
        // Realiza o comando de inserção
        String sql = "INSERT INTO usuarios (Nome, Email, Login, Senha) VALUES " +
                     "('" + this.getNome() + "','" + this.getEmail() + "','" + this.getLogin() + "','" + this.getSenha() + "')";
        
        con.executeSQL(sql);  // Executa o INSERT

        // Consulta para obter o ID gerado pela inserção
        sql = "SELECT LAST_INSERT_ID() AS id";
        ResultSet rs = con.RetornarResultset(sql);  // Executa o SELECT

        if (rs != null && rs.next()) {  // Verifica se há resultado
            int id = rs.getInt("id");   // Obtém o ID gerado
            setId(id);                  // Define o ID no objeto
            JOptionPane.showMessageDialog(null, "Registrado com sucesso! ID: " + getId());
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar o ID.");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário: " + e.getMessage());
    }
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
        sql= "Delete from usuarios where id="+ getId();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    
    public void alterarUsuario(){
        String sql;
        sql="Update usuarios set nome='"+ getNome()+"',email='"+getEmail()+"',login='" + getLogin() + "',senha='" + getSenha() + "' where id="+ getId();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
        
    }
}
