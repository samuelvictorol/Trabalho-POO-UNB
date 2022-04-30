package AluguelCarros;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Locadora {
	//Classe vai armazenar atributos de uma locadora hipotetica e conter 2 Lists para armazenar objetos do tipo Pessoa Fisicas ou Pessoas Juridicas
	//Atributos
	public int MAX_LOC = 50;
	public String nomeLocadora;
	public int qtdLocatarios;
	ArrayList<PessoaFisica> pessoasFisica = new ArrayList<PessoaFisica>();
	ArrayList<PessoaJuridica> pessoasJuridica = new ArrayList<PessoaJuridica>();
	//private Frota frota;
	//Metodos
	
	public Locadora(String nomeLocadora) {
		this.nomeLocadora = nomeLocadora;
		this.qtdLocatarios = 0;
	}
	
	public String getNomeLocadora() {
		return this.nomeLocadora;
	}

	public void buscar(String idnomePF) {
			for(PessoaFisica pf : pessoasFisica){
				if(idnomePF.equals(pf.getNomeLocatario()) || idnomePF.equals(pf.getCpf())){
					JOptionPane.showMessageDialog(null, "Pessoa Fisica encontrada no sistema!");
					pf.info();
					return;	
				}
			}
			for(PessoaJuridica pj : pessoasJuridica){
				if(idnomePF.equals(pj.getNomeLocatario()) || idnomePF.equals(pj.getCnpj())){
					JOptionPane.showMessageDialog(null, "Pessoa Juridica encontrada no sistema!");
					pj.info();
					return;	
				}
			}
		JOptionPane.showMessageDialog(null, "Invalido ou Não Cadastrado!");			
	}
	
	public void excluir(String idnomePF) {
			for(PessoaFisica pf : pessoasFisica){
				if(idnomePF.equals(pf.getNomeLocatario()) || idnomePF.equals(pf.getCpf())){
					JOptionPane.showMessageDialog(null, "Pessoa Física encontrada no sistema!");
					pf.info();
					pessoasFisica.remove(pf);
					JOptionPane.showMessageDialog(null, "Pessoa Fisica deletada Com Suscceso!");
					return;	
				}
			}
			for(PessoaJuridica pj : pessoasJuridica){
				if(idnomePF.equals(pj.getNomeLocatario()) || idnomePF.equals(pj.getCnpj())){
					JOptionPane.showMessageDialog(null, "Pessoa Juridica encontrada no sistema!");
					pj.info();
					pessoasJuridica.remove(pj);
					JOptionPane.showMessageDialog(null, "Pessoa Juridica deletada Com Suscceso!");
					return;	
				}
			}
		JOptionPane.showMessageDialog(null, "Inválido ou Não Cadastrado!");			
		
	}
	
	public void cadastrarPF(String Nome, String CPF, String Email, int Idade, String Endereco, String Telefone, String Estado_civil) {
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNomeLocatario(Nome);
		pf.setID(CPF);
		pf.setCpf(CPF);
		pf.setEmail(Email);
		pf.setIdade(Idade);
		pf.setEndereco(Endereco);
		pf.setTelefone(Telefone);
		pf.setEstadoCivil(Estado_civil);
		pf.info();
		
		this.pessoasFisica.add(pf);
		this.qtdLocatarios++; 
	}
	
	public void cadastrarPJ(String Nome, String CNPJ, String Email, String Endereco, String Telefone, ArrayList<PessoaFisica> funcionarios) {
		PessoaJuridica pj = new PessoaJuridica();
		
		pj.setNomeLocatario(Nome);
		pj.setID(CNPJ);
		pj.setCnpj(CNPJ);
		pj.setEmail(Email);
		pj.setEndereco(Endereco);
		pj.setTelefone(Telefone);
		pj.setFuncionario(funcionarios);
		pj.info();
		
		this.pessoasJuridica.add(pj);
		this.qtdLocatarios++; 
	}
	
}