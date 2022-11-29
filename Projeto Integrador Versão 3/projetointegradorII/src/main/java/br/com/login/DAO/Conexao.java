/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.DAO;

import java.sql.*;

/**
 *
 * @author Eduardo
 */
public class Conexao {
    
    public Connection getConnection() throws SQLException{
    Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/aplicacao", 
            "postgres", "Piczeac@28");
    return conexao;
    }
    
}
