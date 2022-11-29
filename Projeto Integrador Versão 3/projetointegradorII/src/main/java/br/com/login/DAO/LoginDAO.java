package br.com.login.DAO;

import java.sql.*;
import javax.swing.JOptionPane;
import view.telaMenu;

public class LoginDAO {
    
    public void cadastrarUsuario(int id, String nomeDoAtendente, String usuario, String senha) {
        try {
        Connection conexao = new Conexao().getConnection();
        String sql = "INSERT INTO login VALUES ('"+id+"','"+nomeDoAtendente+"','"+usuario+"','"+senha+"')";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.execute();
        conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    
    public void logar(String usuario, String senha) {
        try {
            Connection conexao = new Conexao().getConnection();
        String sql = "SELECT usuario, senha FROM login WHERE usuario = '"+usuario+"' AND senha = '"+senha+"'";
        PreparedStatement statement = conexao.prepareStatement(sql);
        ResultSet resultado = statement.executeQuery();
        if (resultado.next()) {
            JOptionPane.showMessageDialog(null, 
                    "Login efetuado com sucesso","Pequi Crédito", JOptionPane.INFORMATION_MESSAGE);
            telaMenu telaMenu = new telaMenu();
            telaMenu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!", 
                    "Pequi Crédito", JOptionPane.WARNING_MESSAGE);
        conexao.close();
        }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }
}

