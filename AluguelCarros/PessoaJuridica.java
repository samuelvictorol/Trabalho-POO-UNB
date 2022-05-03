package AluguelCarros;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class PessoaJuridica extends Locatarios {
	//Atributos
	protected String CNPJ;
	protected int idade;
	ArrayList<PessoaFisica> funcionarios = new ArrayList<PessoaFisica>();
	//Métodos
		public PessoaJuridica() {
			super();
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public String getCnpj() {
			return this.CNPJ;
		}
		public void setCnpj(String cnpj) {
			this.CNPJ = cnpj;
		}
		public void mostrarFuncionarios() {
			for(PessoaFisica funcionario : funcionarios) {
				funcionario.info();
			}
		}
		
		public void setFuncionario(ArrayList<PessoaFisica> funcionarios) {
			this.funcionarios = funcionarios;
		}
		
		public void info(){
			JOptionPane.showMessageDialog(null, super.infoString() + "\nTipo: Pessoa Juridica\nQuantidade Funcionarios: " +
																	  + this.funcionarios.size() + "\nCNPJ: " + this.CNPJ + "\n\nOK para mostrar funcionarios");
			mostrarFuncionarios();
		}

}