/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    con.conecta();  // Abre a conexão com o banco
    try {
        String sql = "INSERT INTO usuarios (nome, email, login, senha) VALUES (?, ?, ?, ?)";
        
        PreparedStatement stmt = con.conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        // Passa os valores para o PreparedStatement
        stmt.setString(1, this.getNome());
        stmt.setString(2, this.getEmail());
        stmt.setString(3, this.getLogin());
        stmt.setString(4, this.getSenha());
        
        stmt.executeUpdate();
        
        // Recupera o ID gerado automaticamente
        ResultSet generatedKeys = stmt.getGeneratedKeys();
        if (generatedKeys.next()) {
            int idGerado = generatedKeys.getInt(1);
            JOptionPane.showMessageDialog(null, "Registrado com sucesso! ID: " + idGerado);
            setId(idGerado);
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao obter o ID gerado.");
        }
        
        stmt.close();  // Fecha o PreparedStatement
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
    }
    con.desconecta();  // Fecha a conexão com o banco
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