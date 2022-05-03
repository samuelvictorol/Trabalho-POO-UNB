package AluguelCarros.copy;

abstract class Locatarios {
	//Classe Abstrata
	//Atributos
	protected String nomeLocatario, id, endereco, email, telefone;
	//PessoaFisica pf;
	//PessoaJuridica pj;
	
	public Locatarios() {
		
	}
	//Metodos
	public void setNomeLocatario(String nomeLocatario) {
		this.nomeLocatario = nomeLocatario;
	}

	public String getNomeLocatario() {
		return this.nomeLocatario;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getID() {
		return this.id;
	}

	public void setID(String strID) {
		this.id = strID;
	}

	public String infoString() {
		return ("Nome/Razão Social: " + this.nomeLocatario  + "\nEndereco:  " + this.endereco + "\nEmail: " + this.email + "\nTelefone: " + this.telefone);
	}
	
}
