package AluguelCarros;

abstract class Locatarios {
	//Classe Abstrata
	//Atributos
	protected String nomeLocatario, id, endereco, email, telefone;
	//PessoaFisica pf;
	//PessoaJuridica pj;
	
	public Locatarios() {
		
	}
	//Metodos
	public void cadastrarPF() {
		
	}

	public void cadastrarPJ() {
	/*	try {
			setNomeLocatario(JOptionPane.showInputDialog("Insira os dados a seguir:\nRazao Social: "));
			setID(JOptionPane.showInputDialog("CNPJ: "));
			setEndereco(JOptionPane.showInputDialog("Endereco: "));
			setEmail(JOptionPane.showInputDialog("E-mail"));
			setTelefone(JOptionPane.showInputDialog("Telefone: "));		
			String strQtdFuncionarios = JOptionPane.showInputDialog(null, "Quantos Funcionarios serao cadastrados ?",
													  "1 - 5 Funcionarios");
			int qtdFuncionarios = Integer.parseInt(strQtdFuncionarios);
			if(qtdFuncionarios >= 1 && qtdFuncionarios <= 5) {
				this.pj = new PessoaJuridica(this.nomeLocatario, this.id, "Pessoa Juridica", this.endereco, this.email, this.telefone, qtdFuncionarios);
				this.pj.cadastrarFuncionario();				
			}else {
				JOptionPane.showMessageDialog(null, "Numero Invalido\n->Digite um valor entre 1 - 5");
			}
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor digitado invalido");
		}*/
	}

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
		return ("Nome: " + this.nomeLocatario  + "\nEndereco:  " + this.endereco + "\nEmail: " + this.email + "Telefone: " + this.telefone);
	}
	
}
