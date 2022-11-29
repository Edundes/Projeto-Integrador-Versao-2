/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexao {
    /** Usada para a conexao com o banco de dados */
    private Connection con = null;    
    public Connection getCon() {
        return con;
    }
    public void setCon(Connection con) {
        this.con = con;
    }   
    public void conectar() throws SQLException {
        try {
            // Pasando o nome do Driver do PostgreSQL
            Class.forName("org.postgresql.Driver");            
            // Obtendo a conexao com o banco de dados
            setCon(DriverManager.getConnection("jdbc:postgresql://localhost:5432/pequicredito",
                                               "postgres", "2001"));                     
        //Retorna um erro caso nao encontre o driver, ou alguma informacao sobre a conexão estiver errada
        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar o driver");
            cnfe.printStackTrace();
        //Retorna um erro caso exista erro de query SQL
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, sqlex.getMessage());
            sqlex.printStackTrace();
        }
    }
    /** Esse metodo quando invocado, realiza a desconexao com o banco */
    public void desconectar() {

        try {
            getCon().close();
            //System.out.println("DESCONECTOU :)");            
        /** Retorna um erro caso nao consiga desconectar */    
        } catch (SQLException onConClose) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar o banco");
            onConClose.printStackTrace();
        }
    }
}