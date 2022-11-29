/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Eduardo
 */
public class Atendente {
    
    private int id;
    private String usuario;
    private String senha;
    private String nomeDoAtendente;

    public Atendente(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public void cadastrar (int id, String nomeDoAtendente, String usuario, String senha){
        this.id = id;
        this.nomeDoAtendente = nomeDoAtendente;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeDoAtendente() {
        return nomeDoAtendente;
    }

    public void setNomeDoAtendente(String nomeDoAtendente) {
        this.nomeDoAtendente = nomeDoAtendente;
    }
    
}
