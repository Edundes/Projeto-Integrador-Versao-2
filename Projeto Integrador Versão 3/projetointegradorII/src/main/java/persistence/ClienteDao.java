/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.sql.*;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Endereco;
import model.Renda;

public class ClienteDao {
    private Conexao conexao;
    private Cliente cliente; 
    private Endereco endereco;
    private Renda renda;

    public ClienteDao(Cliente cliente, Endereco endereco, Renda renda) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.renda = renda;
    }
      
    public void inserir() {
        try {
            // Criar instância de Conexão
            this.conexao = new Conexao();
            this.conexao.conectar(); // Conectar no BD
            // Instrução SQL - INSERT
            String sql = "INSERT INTO cliente (nomeCliente, cpf, email, telefone) VALUES  (?, ?, ?, ?)";        
            PreparedStatement ps = this.conexao.getCon().prepareStatement(sql);
            // Definição dos Parâmetros
            ps.setString(1, this.cliente.getNomeCliente());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getTelefone());
            ps.execute();
            String sql2 = "INSERT INTO endereco (rua, numero, quadra, lote, cidade, estado, cep) VALUES  (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps2 = this.conexao.getCon().prepareStatement(sql2);
            ps2.setString(1, endereco.getRua());
            ps2.setString(2, endereco.getNumero());
            ps2.setString(3, endereco.getQuadra());
            ps2.setString(4, endereco.getLote());
            ps2.setString(5, endereco.getCidade());
            ps2.setString(6, endereco.getEstado());
            ps2.setString(7, endereco.getCep());
            ps2.execute();
            String sql3 = "INSERT INTO renda (valorrenda) VALUES (?)";
            PreparedStatement ps3 = this.conexao.getCon().prepareStatement(sql3);
            ps3.setDouble(1, renda.getRenda());
            ps3.execute();
             // Executar Insert
            ps.close(); // Fechar PS
            ps2.close();
            ps3.close();
            this.conexao.desconectar(); // Fechar Conexão
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }    
}