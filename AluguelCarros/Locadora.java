package AluguelCarros;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Locadora {
	//Classe vai armazenar atributos de uma locadora hipotetica e conter 2 Lists para armazenar objetos do tipo Pessoa Fisicas ou Pessoas Juridicas
	//Atributos
	public int MAX_LOC = 50;
	public String nomeLocadora;
	ArrayList<PessoaFisica> pessoasFisica = new ArrayList<PessoaFisica>();
	ArrayList<PessoaJuridica> pessoasJuridica = new ArrayList<PessoaJuridica>();
	ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	Frota frota = new Frota();
	//Metodos
	
	public Locadora(String nomeLocadora) {
		frota = new Frota();
	}
	
	public String getNomeLocadora() {
		return this.nomeLocadora;
	}

	public PessoaFisica buscarPF(String idnomePF) {
			for(PessoaFisica pf : pessoasFisica){
				if(idnomePF.equals(pf.getNomeLocatario()) || idnomePF.equals(pf.getCpf())){
					JOptionPane.showMessageDialog(null, "Pessoa Fisica encontrada no sistema!");
					pf.info();
					return pf;	
				}
			}
			JOptionPane.showMessageDialog(null, "Invalido ou Não Cadastrado!");		
			return null;
	}
	public PessoaJuridica buscarPJ(String idnomePF) {
			for(PessoaJuridica pj : pessoasJuridica){
				if(idnomePF.equals(pj.getNomeLocatario()) || idnomePF.equals(pj.getCnpj())){
					JOptionPane.showMessageDialog(null, "Pessoa Juridica encontrada no sistema!");
					pj.info();
					return pj;	
				}
				return null;
			}
		JOptionPane.showMessageDialog(null, "Invalido ou Não Cadastrado!");			
		return null;
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

	public void cadastrarReserva(String responsavel, String qtdDias,  PessoaFisica pf, Motocicleta v) {
		Reserva r = new Reserva(responsavel);
		v.setValorTotal(Double.parseDouble(qtdDias.replaceAll(",", ".")));
		r.fillReserva(pf, v);
		r.info();
		this.reservas.add(r);
		
	}
	
	public void cadastrarReserva(String responsavel, String qtdDias,  PessoaFisica pf, VeiculoPasseio v) {
		Reserva r = new Reserva(responsavel);
		v.setValorTotal(Double.parseDouble(qtdDias.replaceAll(",", ".")));
		r.fillReserva(pf, v);
		r.info();
		this.reservas.add(r);	
	}
	public void cadastrarReserva(String responsavel, String qtdDias,  PessoaFisica pf,  VeiculoCarga v) {
		Reserva r = new Reserva(responsavel);
		v.setValorTotal(Double.parseDouble(qtdDias.replaceAll(",", ".")));
		r.fillReserva(pf, v);
		r.info();
		this.reservas.add(r);
	}
	public void cadastrarReserva(String responsavel, String qtdDias,  PessoaFisica pf,  Van v) {
		Reserva r = new Reserva(responsavel);
		v.setValorTotal(Double.parseDouble(qtdDias.replaceAll(",", ".")));
		r.fillReserva(pf, v);
		r.info();
		this.reservas.add(r);
	}
	public void cadastrarReserva(String responsavel, String qtdDias, PessoaJuridica pj, Motocicleta v) {
		Reserva r = new Reserva(responsavel);
		v.setValorTotal(Double.parseDouble(qtdDias.replaceAll(",", ".")));
		r.fillReserva(pj, v);
		r.info();
		this.reservas.add(r);
		
	}
	
	public void cadastrarReserva(String responsavel, String qtdDias,  PessoaJuridica pj, VeiculoPasseio v) {
		Reserva r = new Reserva(responsavel);
		v.setValorTotal(Double.parseDouble(qtdDias.replaceAll(",", ".")));
		r.fillReserva(pj, v);
		r.info();
		this.reservas.add(r);	
	}
	public void cadastrarReserva(String responsavel, String qtdDias,  PessoaJuridica pj,  VeiculoCarga v) {
		Reserva r = new Reserva(responsavel);
		v.setValorTotal(Double.parseDouble(qtdDias.replaceAll(",", ".")));
		r.fillReserva(pj, v);
		r.info();
		this.reservas.add(r);
	}
	public void cadastrarReserva(String responsavel, String qtdDias,  PessoaJuridica pj,  Van v) {
		Reserva r = new Reserva(responsavel);
		v.setValorTotal(Double.parseDouble(qtdDias.replaceAll(",", ".")));
		r.fillReserva(pj, v);
		r.info();
		this.reservas.add(r);
	}
	public void buscarReserva(String busca) {
		for(Reserva r : reservas) {
			if(r.responsavel.equals(busca)) {
				r.info();
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Reserva nao Encontrada/Registrada");	
	}
	public void excluiReserva(String busca) {
		for(Reserva r : reservas) {
			if(r.responsavel.equals(busca)) {
				r.info();
				reservas.remove(r);
				JOptionPane.showMessageDialog(null, "Reserva Excluida com sucesso");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Reserva nao Encontrada/Registrada");	
	}

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