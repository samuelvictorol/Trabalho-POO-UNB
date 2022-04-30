/*package AluguelCarros;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Locadora {
	protected int MAX_LOC;
	private String nomeLocadora;
	public int qtdLocatarios;
	public boolean confereLocatario;
	private Arraylist<PessoaFisica> pessoaFisica = new Arraylist<PessoaFisica>();
	private Arraylist<PessoaJuridica> pessoaJuridica = new Arraylist<PessoaJuridica>();
	private Frota frota;
	
	
	
	public Locadora(String nomeLocadora) {
		this.nomeLocadora = nomeLocadora;
	}
	
	public Boolean getConfereLocatario() {
		return this.confereLocatario;
	}
	
	public String getNomeLocadora() {
		return this.nomeLocadora;
	}
	
	public int getQtdLocatarios() {
		return this.qtdLocatarios;
	}
	
	public void buscarPF(String idnomePF) {
		for(PessoaFisica p : pessoaFisica){
		    if(idnomePF.equals(p.Nome) || idnomePF.equals(p.CPF)){
				JOptionPane.showMessageDialog(null, "Pessoa encontrada no sistema!");
				p.info();
				return;

		    	
		    }
		}
		      JOptionPane.showMessageDialog(null, "Esta pessoa não está cadastrada no sistema!");
			
	
	}
	
	public void buscarPJ(String idnomePJ) {
		for(PessoaJuridica j : pessoaJuridica){
		    if(idnomePJ.equals(j.Nome) || idnomePJ.equals(j.CNPJ)){
				JOptionPane.showMessageDialog(null, "Empresa encontrada no sistema!");
				j.info();
				return;

		    	
		    }
		}
		JOptionPane.showMessageDialog(null, "Esta empresa não está cadastrada no sistema!");
	}
	
	public void excluirPF(String idnomePF) {
		for(PessoaFisica p : pessoaFisica) {
			if(idnomePF.equals(p.Nome) || idnomePF.equals(p.CPF)) {
				pessoaFisica.remove(p);
				JOptionPane.showMessageDialog(null, "Pessoa excluída com sucesso!");
				return;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Não foi possível excluir esta pessoa!");
	}
	
	public void excluirPJ(String idnomePJ) {
		for(PessoaJuridica j : pessoaJuridica) {
			if(idnomePJ.equals(j.Nome) || idnomePJ.equals(j.CNPJ)) {
				pessoaJuridica.remove(j);
				JOptionPane.showMessageDialog(null, "Empresa excluída com sucesso!");
				return;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Não foi possível excluir esta empresa!");
	}
	
	public void cadastrarPF(String Nome, String CPF, String Email, int Idade, String Endereco, String Telefone, String Estado_civil) {
		PessoaFisica p = new PessoaFisica;
		
		p.setNome(Nome);
		p.setCPF(CPF);
		p.setEmail(Email);
		p.setIdade(Idade);
		p.setEndereco(Endereco);
		p.setTelefone(Telefone);
		p.setEstado_civil(Estado_civil);
		
		pessoaFisica.add(p);
	}
	
	public void cadastrarPJ(String Nome, String CNPJ, String Email, String Endereco, String Telefone) {
		PessoaJuridica j = new PessoaJuridica;
		
		j.setNome(Nome);
		j.setCNPJ(CNPJ);
		j.setEmail(Email);
		j.setEndereco(Endereco);
		j.setTelefone(Telefone);
		
		pessoaJuridica.add(j);
	}
	
}*/