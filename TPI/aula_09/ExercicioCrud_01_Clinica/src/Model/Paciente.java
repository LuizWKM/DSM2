/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
    private String data_nasc;

    public Paciente() {
        this(0,"","","","","","");
    }

    public Paciente(int cod_Paci, String nome_Paci, String endereco, String complemento, String rg, String cpf, String data_nasc) {
        this.cod_Paci = cod_Paci;
        this.nome_Paci = nome_Paci;
        this.endereco = endereco;
        this.complemento = complemento;
        this.rg = rg;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
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

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }
    
    
}
