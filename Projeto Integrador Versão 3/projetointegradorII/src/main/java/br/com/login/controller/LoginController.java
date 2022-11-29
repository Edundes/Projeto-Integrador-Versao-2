/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.controller;

import br.com.login.DAO.Conexao;
import br.com.login.DAO.LoginDAO;
import view.CadastroView;
import view.LoginView;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 * 
 */
public class LoginController {
    //Junta a informação que o usuário coloca na view com o banco de dados
    public void cadastroUsuario(CadastroView view) {
        try {
        Connection conexao = new Conexao().getConnection();
        LoginDAO cadastro = new LoginDAO();
        if (view.getCampoCadastroSenha().getText().equals(view.getCampoConfirmacaoSenha().getText())) {
        cadastro.cadastrarUsuario(Integer.parseInt(view.getCampoIdAtendente().getText()), 
        view.getCampoNomeAtendente().getText(), view.getCampoUsuario().getText(), 
        view.getCampoCadastroSenha().getText());
        JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!", 
                "Pequi Crédito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
            "Os campos Senha e Confirmar Senha estão com valores diferentes!", 
            "Pequi Crédito", JOptionPane.ERROR_MESSAGE);
        }
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void loginUsuario(LoginView view){
        try {
        Connection conexao = new Conexao().getConnection();
        LoginDAO login = new LoginDAO();
            if (view.getCampoUsuario().getText().matches("") ||
                    view.getCampoSenha().getText().matches("")) {
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", 
                        "Pequi Crédito", JOptionPane.ERROR_MESSAGE);
            } else {
                login.logar(view.getCampoUsuario().getText(), view.getCampoSenha().getText());
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
