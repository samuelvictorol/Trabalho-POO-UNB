package AluguelCarros;

public class Endereco {
    //Atributos
    private String rua, complemento, bairro, cidade, estado;
    private int numero, cep;

    public Endereco() {
    }
    
    public Endereco(String rua, String complemento, String bairro, String cidade, String estado, int numero, int cep) {
    	this.rua = rua;
    	this.complemento = complemento;
    	this.bairro = bairro;
    	this.cidade = cidade;
    	this.estado = estado;
    	this.numero = numero;
    	this.cep = cep;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public String getComplemento() {
    	return complemento;
    }
    public void setComplemento(String complemento) {
    	this.complemento = complemento;
    }
    
    public String getBairro() {
    	return bairro;
    }
    public void setBairro(String bairro) {
    	this.bairro = bairro;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

}
