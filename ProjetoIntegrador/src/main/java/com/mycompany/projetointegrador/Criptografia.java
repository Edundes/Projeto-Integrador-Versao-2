package com.mycompany.projetointegrador;



public class Criptografia {

        
	//private static char[] aux;
	public String cripto(char[] aux) {
		// Cria um laço de repetição que recebe um array de caracteres como argumento
		for (int i = 0; i < aux.length; i++) {
			// Criptografa cada caractere do array de bytes com a Cifra de César
			aux[i] = (char) (aux[i] + 3);
		}
		// Cria uma string do array de caracteres com a mensagem cifrada
		String dadosCifrados = new String(aux);
		
		// Devolve a mensagem criptografada
		return dadosCifrados;
	}
    
    public static String descripto(String dadosCifrados) {
        
        // Transforma a String em uma cadeia de caracteres
        char[] auxiliar = dadosCifrados.toCharArray();

        // Cria um laço para descriptografar a mensagem
        for (int i = 0; i < auxiliar.length; i++) {
            // System.out.println(x[i])
            auxiliar[i] = (char) (auxiliar[i] - 3);
        }

        // Transforma o array de caracteres em uma string
        String dadosDecifrados = new String(auxiliar);
        
        // // Devolve a mensagem descriptografada
        return dadosDecifrados;
    }

}