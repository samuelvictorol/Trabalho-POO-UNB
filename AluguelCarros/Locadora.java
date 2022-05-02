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
	//ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	Frota frota = new Frota();
	//Metodos
	
	public Locadora(String nomeLocadora) {
		this.nomeLocadora = nomeLocadora;
		this.qtdLocatarios = 0;
		frota = new Frota();
	}
	
	public String getNomeLocadora() {
		return this.nomeLocadora;
	}

	public Boolean buscar(String idnomePF) {
			for(PessoaFisica pf : pessoasFisica){
				if(idnomePF.equals(pf.getNomeLocatario()) || idnomePF.equals(pf.getCpf())){
					JOptionPane.showMessageDialog(null, "Pessoa Fisica encontrada no sistema!");
					pf.info();
					return true;	
				}
			}
			for(PessoaJuridica pj : pessoasJuridica){
				if(idnomePF.equals(pj.getNomeLocatario()) || idnomePF.equals(pj.getCnpj())){
					JOptionPane.showMessageDialog(null, "Pessoa Juridica encontrada no sistema!");
					pj.info();
					return true;	
				}
			}
		JOptionPane.showMessageDialog(null, "Invalido ou Não Cadastrado!");			
		return false;
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
	
	public void cadastrarVeiculo(String categoria, Boolean protecaoPropria, Boolean x, Boolean y
								, Boolean z, String renavam, String anoModelo,String placa,String cor
								, Double valorSeguroProprio, Double valorSeguroTerceiros, Double valorImpostos
								, Double valorDiaria, Double valorMensal) {
								
		if(categoria.equals("Veiculo Passeio")) {
			this.frota.cadastrarCarro(categoria, protecaoPropria, x, y, z, renavam, anoModelo, placa
					  				, cor, valorSeguroProprio, valorSeguroTerceiros, valorImpostos, valorDiaria, valorMensal);
		}
		if(categoria.equals("Motocicleta")) {
			this.frota.cadastrarMoto(categoria, protecaoPropria, x, y,
										z, renavam, anoModelo,placa,cor,
										valorSeguroProprio, valorSeguroTerceiros, valorImpostos, valorDiaria, valorMensal);
		}
		
	}

/*	public void cadastrarReserva(String responsavel, String veiculo) {
		Reserva r;
		Object resp, veic;
		foFisica p : this.pessoasFisica) {
			
		}
		r = new Reserva(resp, veic);
		this.reservas.add(r);
	}*/

	public void cadastrarVCarga(Boolean motorista, String categoria, Boolean protecaoPropria, String x
			, String renavam, String anoModelo,String placa,String cor
			, Double valorSeguroProprio, Double valorSeguroTerceiros, Double valorImpostos
			, Double valorDiaria, Double valorMensal) {
		if(categoria.equals("Carga")) {
			this.frota.cadastrarVCarga(motorista, categoria, protecaoPropria, x, renavam, anoModelo,placa,cor,
										valorSeguroProprio, valorSeguroTerceiros, valorImpostos, valorDiaria, valorMensal);
		}
		
	}
	
	public void cadastrarVan(Boolean motorista, String categoria, Boolean protecaoPropria, String x
			, String renavam, String anoModelo,String placa,String cor
			, Double valorSeguroProprio, Double valorSeguroTerceiros, Double valorImpostos
			, Double valorDiaria, Double valorMensal) {
		if(categoria.equals("Van")) {
			this.frota.cadastrarVan(motorista, categoria, protecaoPropria, x, renavam, anoModelo,placa,cor,
										valorSeguroProprio, valorSeguroTerceiros, valorImpostos, valorDiaria, valorMensal);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}