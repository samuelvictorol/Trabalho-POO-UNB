package AluguelCarros;

import javax.swing.JOptionPane;

public class PessoaFisica extends Locatarios {
	//Atributos
	protected String estadoCivil;
	protected String CPF;
	protected int idade;
		//Métodos
		public PessoaFisica(String nomeLocatario, String endereco, String email, String Telefone, String estadoCivil) {
			super();
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