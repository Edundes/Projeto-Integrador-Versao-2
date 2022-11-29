package model;
public class Endereco {
	
	private String rua;
	private String numero;
	private String quadra;
	private String lote;
	private String cidade;
	private String estado;
        private String cep;
	//private char[] aux;
	
	public Endereco(String rua, String numero, String quadra, String lote, String cep, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.quadra = quadra;
		this.lote = lote;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;		
	}
        
        public Endereco() {
            
        }

	// transforma o endereço em um array de caracteres que será criptografado
	public static char[] toCharArray(Endereco endereco) {
		char [] aux = Endereco.toCharArray(endereco);
        return aux;
    }
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getQuadra() {
		return quadra;
	}
	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco: "
                        + "\nRua: " + rua + 
                        "\nNúmero: " + numero + 
                        "\nQuadra: " + quadra +
                        "\nLote: " + lote + 
                        "\nCep: " + cep + 
                        "\nCidade: " + cidade + 
                        "\nEstado: " + estado;
	}
} 