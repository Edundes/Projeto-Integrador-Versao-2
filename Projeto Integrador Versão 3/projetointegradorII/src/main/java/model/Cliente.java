package model;

import javax.swing.JOptionPane;

public class Cliente {

    private String nomeCliente;
    private String cpf;
    private Endereco endereco;
    private Renda renda;
    private String email;
    private String telefone;

    public Cliente(String nomeCliente, String cpf, Endereco endereco, Renda renda, String email, String telefone) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.endereco = endereco;
        this.renda = renda;
        this.email = email;
        this.telefone = telefone;
    }   

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Renda getRenda() {
        return renda;
    }

    public void setRenda(Renda renda) {
        this.renda = renda;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

//    public String retornaDados() {
//        return String.format("Nome do cliente: %s\nCPF: %s\nEndereço: %s", nomeCliente, cpf, endereco);
//        // return String.format("Nome do cliente: %s\nCPF: %s\n", nomeCliente, cpf);
//    }
    
    public void mostrarDados() {
        String texto = "";
        texto = "Nome: " + getNomeCliente();
        texto += "\nCPF: " + getCpf();
        texto += "\nEndereço: " + getEndereco();
        texto += "\nRenda: " + getRenda();
        texto += "\nE-mail: " + getEmail();
        texto += "\nTelefone: " + getTelefone();
        JOptionPane.showMessageDialog(null, texto);
    }

    public static char[] toCharArray(Cliente cliente) {
        char[] aux = Cliente.toCharArray(cliente);
        return aux;
    }

}
