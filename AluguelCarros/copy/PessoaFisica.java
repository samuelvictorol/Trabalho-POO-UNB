package AluguelCarros.copy;

import javax.swing.JOptionPane;

public class PessoaFisica extends Locatarios {
	//Atributos
	protected String estadoCivil;
	protected String CPF;
	protected int idade;
		//Métodos
		public PessoaFisica(String nomeLocatario, String cpf, String email, String endereco, String telefone, int idade ,String estadoCivil) {
			super();
			this.nomeLocatario = nomeLocatario;
			this.CPF = cpf;
			this.email = email;
			this.endereco = endereco;
			this.telefone = telefone;
			this.idade = idade;
			this.estadoCivil = estadoCivil;
		}
		
		public PessoaFisica() {
			super();
		}
			
		public String getEstadoCivil() {
			return estadoCivil;
		}
		
		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}
		
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getCpf() {
			return this.CPF;
		}
		public void setCpf(String cpf) {
			this.CPF = cpf;
		}
		
		public void info(){
			JOptionPane.showMessageDialog(null, super.infoString() + "\nTipo: Pessoa Física\nEstado Civil: " + this.estadoCivil + "\nCPF: " + this.CPF + "\nIdade: " + this.idade);
		}
}