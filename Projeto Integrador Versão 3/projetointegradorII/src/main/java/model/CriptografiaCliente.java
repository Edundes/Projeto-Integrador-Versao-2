package model;

public class CriptografiaCliente {
    private Cliente cliente;
    private Atendente atendente;
	//private static char[] aux;

	public static String cripto(Cliente cliente, char[] aux) {
		// Cria um laço de repetição que recebe um array de caracteres como argumento
		for (int i = 0; i < aux.length; i++) {
			// Criptografa cada caractere do array de bytes com a Cifra de César
			aux[i] = (char) (aux[i] + 3);
		}
		// Cria uma string do array de caracteres com a mensagem cifrada
		String dadosClienteCifrados = new String(aux);
		
		// Devolve a mensagem criptografada
		return dadosClienteCifrados;
	}
        
        public static String cripto(Atendente atendente, char[] aux) {
		// Cria um laço de repetição que recebe um array de caracteres como argumento
		for (int i = 0; i < aux.length; i++) {
			// Criptografa cada caractere do array de bytes com a Cifra de César
			aux[i] = (char) (aux[i] + 3);
		}
		// Cria uma string do array de caracteres com a mensagem cifrada
		String dadosClienteCifrados = new String(aux);
		
		// Devolve a mensagem criptografada
		return dadosClienteCifrados;
	}
    
    public static String descripto(String dadosClienteCifrados) {
        
        // Transforma a String em uma cadeia de caracteres
        char[] auxiliar = dadosClienteCifrados.toCharArray();

        // Cria um laço para descriptografar a mensagem
        for (int i = 0; i < auxiliar.length; i++) {
            // System.out.println(x[i])
            auxiliar[i] = (char) (auxiliar[i] - 3);
        }

        // Transforma o array de caracteres em uma string
        String dadosClienteDecifrados = new String(auxiliar);
        
        // // Devolve a mensagem descriptografada
        return dadosClienteDecifrados;
    }

}
