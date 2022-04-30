package AluguelCarros;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class Locadora {
	//Classe vai armazenar atributos de uma locadora hipotetica e conter 2 Lists para armazenar objetos do tipo Pessoa Fisicas ou Pessoas Juridicas
	//Atributos
	public int MAX_LOC;
	public String nomeLocadora;
	public int qtdLocatarios;
	ArrayList<PessoaFisica> pessoasFisica = new ArrayList<PessoaFisica>();
	//private Arraylist<PessoaJuridica> pessoaJuridica = new Arraylist<PessoaJuridica>();
	//private Frota frota;
	//Metodos
	
	public Locadora(String nomeLocadora) {
		this.nomeLocadora = nomeLocadora;
		this.qtdLocatarios = 0;
	}
	
	public String getNomeLocadora() {
		return this.nomeLocadora;
	}
	
	public int getQtdLocatarios() {
		return this.qtdLocatarios;
	}
	
	public void buscar(String idnomePF, String tipoPessoa) {
		if(tipoPessoa.equals("Pessoa Fisica")) {
			for(PessoaFisica pf : pessoasFisica){
				if(idnomePF.equals(pf.getNomeLocatario()) || idnomePF.equals(pf.getCpf())){
					JOptionPane.showMessageDialog(null, "Pessoa encontrada no sistema!");
					pf.info();
					return;	
				}
			}
		}/*else {
			for(PessoaJuridica pj : pessoasJuridica){
				if(idnomePF.equals(pf.getNomeLocatario()) || idnomePF.equals(pf.getCpf())){
					JOptionPane.showMessageDialog(null, "Pessoa encontrada no sistema!");
					pf.info();
					return;	
				}
			}
		}
		 */
		JOptionPane.showMessageDialog(null, "Inválido ou Não Cadastrado!");			
	}
	
	public void excluirPF(String idnomePF) {
	/*	for(PessoaFisica p : pessoaFisica) {
			if(idnomePF.equals(p.Nome) || idnomePF.equals(p.CPF)) {
				pessoaFisica.remove(p);
				JOptionPane.showMessageDialog(null, "Pessoa excluída com sucesso!");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Não foi possível excluir esta pessoa!");
			*/
	}
	
	public void excluirPJ(String idnomePJ) {
		/*for(PessoaJuridica j : pessoaJuridica) {
			if(idnomePJ.equals(j.Nome) || idnomePJ.equals(j.CNPJ)) {
				pessoaJuridica.remove(j);
				JOptionPane.showMessageDialog(null, "Empresa excluída com sucesso!");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Não foi possível excluir esta empresa!");
		*/		
	}
	
	public void cadastrarPF(String Nome, String CPF, String Email, int Idade, String Endereco, String Telefone, String Estado_civil) {
		PessoaFisica p = new PessoaFisica();
		
		p.setNomeLocatario(Nome);
		p.setID(CPF);
		p.setCpf(CPF);
		p.setEmail(Email);
		p.setIdade(Idade);
		p.setEndereco(Endereco);
		p.setTelefone(Telefone);
		p.setEstadoCivil(Estado_civil);
		
		this.pessoasFisica.add(p);
		p.info();
		
	}
	
	public void cadastrarPJ(String Nome, String CNPJ, String Email, String Endereco, String Telefone) {
		/*PessoaJuridica j = new PessoaJuridica;
		
		j.setNome(Nome);
		j.setCNPJ(CNPJ);
		j.setEmail(Email);
		j.setEndereco(Endereco);
		j.setTelefone(Telefone);
		
		pessoaJuridica.add(j);
		*/
	}
	
}