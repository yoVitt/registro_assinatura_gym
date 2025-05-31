/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.registro_assinatura.dto;

/**
 *
 * @author starrk
 */
public class FuncionarioDTO {
    private String nome_fun, cpf_fun, tipo_fun, login_fun, senha_fun;
    private int if_fun;

    public String getNome_fun() {
        return nome_fun;
    }

    public void setNome_fun(String nome_fun) {
        this.nome_fun = nome_fun;
    }

    public String getCpf_fun() {
        return cpf_fun;
    }

    public void setCpf_fun(String cpf_fun) {
        this.cpf_fun = cpf_fun;
    }

    public String getTipo_fun() {
        return tipo_fun;
    }

    public void setTipo_fun(String tipo_fun) {
        this.tipo_fun = tipo_fun;
    }

    public String getLogin_fun() {
        return login_fun;
    }

    public void setLogin_fun(String login_fun) {
        this.login_fun = login_fun;
    }

    public String getSenha_fun() {
        return senha_fun;
    }

    public void setSenha_fun(String senha_fun) {
        this.senha_fun = senha_fun;
    }

    public int getIf_fun() {
        return if_fun;
    }

    public void setIf_fun(int if_fun) {
        this.if_fun = if_fun;
    }
    
}
