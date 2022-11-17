/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetointegrador;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Atendente {
	
	private String matricula;
        private String senha;
	
	public Atendente(String matricula, String senha) {
		super();
		this.matricula = matricula;
                this.senha = senha;
	}
        
        public Atendente(){
            
        }

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getSenha(){
            return senha;
        }
        
        public void setSenha(String senha){
            this.senha = senha;
        }
        
        public void mostrarDados(){
        String texto = "";
        texto = "Usuário: " + getMatricula();
        texto += " Senha: " + getSenha();
        JOptionPane.showMessageDialog(null, texto);
        }
        
}
