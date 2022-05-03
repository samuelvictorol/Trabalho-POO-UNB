package AluguelCarros;
import java.time.ZonedDateTime;
import javax.swing.JOptionPane;
import java.util.Random;

public class Reserva {
	String responsavel = "";
	PessoaFisica pf; 
	PessoaJuridica pj;
	VeiculoPasseio vp;
	Motocicleta mt;
	VeiculoCarga vcarga;
	Van van;
	public int codigo;
	private String conteudo;
	public String  horarioReserva;
	
	public void setConteudoPFVP(String pessoa){
		this.conteudo =  "********* (SUA RESERVA NA LOCADORA GRUPO 10 UNB) *********"
							+ "\n*Reserva: " + this.codigo 
							+ "\n*Locatario: " + this.pf.getNomeLocatario()
							+ "\n*Responsável: " + this.responsavel
							+ "\n*Tipo Pessoa: " + pessoa
							+ "\n*Identificação(CPF/CNPJ):" + this.pf.getCpf()
							+ "\n------------------------------------------------"
							+ "\n*Horario pedido de reserva: \n" + this.horarioReserva
							+ "\n*Valor Seguro Proprio : " +this.vp.getValorSeguroProprio()
							+ "\n*Valor Seguro Terceiros: " +this.vp.getValorSeguroTerceiros()
							+ "\n*Valor Impostos: " + this.vp.getValorImpostos()
							+ "\n*Valor Total: " +this.vp.getValorTotal()
							+ "\n------------------------------------------------"
							+ this.vp.info();
	}
	private void setConteudoPFMT(String pessoa) {
		this.conteudo =  "********* (SUA RESERVA NA LOCADORA GRUPO 10 UNB) *********"
				+ "\n*Reserva: " + this.codigo 
				+ "\n*Locatario: " + this.pf.getNomeLocatario()
				+ "\n*Responsável: " + this.responsavel
				+ "\n*Tipo Pessoa: " + pessoa
				+ "\n*Identificação(CPF/CNPJ):" + this.pf.getCpf()
				+ "\n------------------------------------------------"
				+ "\n*Horario pedido de reserva: \n" + this.horarioReserva
				+ "\n*Valor Seguro Proprio : " +this.mt.getValorSeguroProprio()
				+ "\n*Valor Seguro Terceiros: " +this.mt.getValorSeguroTerceiros()
				+ "\n*Valor Impostos: " + this.mt.getValorImpostos()
				+ "\n*Valor Total: " +this.mt.getValorTotal()
				+ "\n------------------------------------------------"
				+ this.mt.info();	
	}
	private void setConteudoPFVC(String pessoa) {
		this.conteudo =  "********* (SUA RESERVA NA LOCADORA GRUPO 10 UNB) *********"
				+ "\n*Reserva: " + this.codigo 
				+ "\n*Locatario: " + this.pf.getNomeLocatario()
				+ "\n*Responsável: " + this.responsavel
				+ "\n*Tipo Pessoa: " + pessoa
				+ "\n*Identificação(CPF/CNPJ):" + this.pf.getCpf()
				+ "\n------------------------------------------------"
				+ "\n*Horario pedido de reserva: \n" + this.horarioReserva
				+ "\n*Valor Seguro Proprio : " +this.vcarga.getValorSeguroProprio()
				+ "\n*Valor Seguro Terceiros: " +this.vcarga.getValorSeguroTerceiros()
				+ "\n*Valor Impostos: " + this.vcarga.getValorImpostos()
				+ "\n*Valor Total: " +this.vcarga.getValorTotal()
				+ "\n------------------------------------------------"
				+ this.vcarga.info();	
	}
	private void setConteudoPFVan(String pessoa) {
		this.conteudo =  "********* (SUA RESERVA NA LOCADORA GRUPO 10 UNB) *********"
				+ "\n*Reserva: " + this.codigo 
				+ "\n*Locatario: " + this.pf.getNomeLocatario()
				+ "\n*Responsável: " + this.responsavel
				+ "\n*Tipo Pessoa: " + pessoa
				+ "\n*Identificação(CPF/CNPJ):" + this.pf.getCpf()
				+ "\n------------------------------------------------"
				+ "\n*Horario pedido de reserva: \n" + this.horarioReserva
				+ "\n*Valor Seguro Proprio : " +this.van.getValorSeguroProprio()
				+ "\n*Valor Seguro Terceiros: " +this.van.getValorSeguroTerceiros()
				+ "\n*Valor Impostos: " + this.van.getValorImpostos()
				+ "\n*Valor Total: " +this.van.getValorTotal()
				+ "\n------------------------------------------------"
				+ this.van.info();	
	}

	private void setConteudoPJVP(String pessoa) {
		this.conteudo =  "********* (SUA RESERVA NA LOCADORA GRUPO 10 UNB) *********"
				+ "\n*Reserva: " + this.codigo 
				+ "\n*Locatario: " + this.pj.getNomeLocatario()
				+ "\n*Responsável: " + this.responsavel
				+ "\n*Tipo Pessoa: " + pessoa
				+ "\n*Identificação(CPF/CNPJ):" + this.pj.getCnpj()
				+ "\n------------------------------------------------"
				+ "\n*Horario pedido de reserva: \n" + this.horarioReserva
				+ "\n*Valor Seguro Proprio : " +this.vp.getValorSeguroProprio()
				+ "\n*Valor Seguro Terceiros: " +this.vp.getValorSeguroTerceiros()
				+ "\n*Valor Impostos: " + this.vp.getValorImpostos()
				+ "\n*Valor Total: " +this.vp.getValorTotal()
				+ "\n------------------------------------------------"
				+ this.vp.info();	
	}
	private void setConteudoPJMT(String pessoa) {
		this.conteudo =  "********* (SUA RESERVA NA LOCADORA GRUPO 10 UNB) *********"
				+ "\n*Reserva: " + this.codigo 
				+ "\n*Locatario: " + this.pj.getNomeLocatario()
				+ "\n*Responsável: " + this.responsavel
				+ "\n*Tipo Pessoa: " + pessoa
				+ "\n*Identificação(CPF/CNPJ):" + this.pj.getCnpj()
				+ "\n------------------------------------------------"
				+ "\n*Horario pedido de reserva: \n" + this.horarioReserva
				+ "\n*Valor Seguro Proprio : " +this.mt.getValorSeguroProprio()
				+ "\n*Valor Seguro Terceiros: " +this.mt.getValorSeguroTerceiros()
				+ "\n*Valor Impostos: " + this.mt.getValorImpostos()
				+ "\n*Valor Total: " +this.mt.getValorTotal()
				+ "\n------------------------------------------------"
				+ this.mt.info();	
	}
	private void setConteudoPJVC(String pessoa) {
		this.conteudo =  "********* (SUA RESERVA NA LOCADORA GRUPO 10 UNB) *********"
				+ "\n*Reserva: " + this.codigo 
				+ "\n*Locatario: " + this.pj.getNomeLocatario()
				+ "\n*Responsável: " + this.responsavel
				+ "\n*Tipo Pessoa: " + pessoa
				+ "\n*Identificação(CPF/CNPJ):" + this.pj.getCnpj()
				+ "\n------------------------------------------------"
				+ "\n*Horario pedido de reserva: \n" + this.horarioReserva
				+ "\n*Valor Seguro Proprio : " +this.vcarga.getValorSeguroProprio()
				+ "\n*Valor Seguro Terceiros: " +this.vcarga.getValorSeguroTerceiros()
				+ "\n*Valor Impostos: " + this.vcarga.getValorImpostos()
				+ "\n*Valor Total: " +this.vcarga.getValorTotal()
				+ "\n------------------------------------------------"
				+ this.vcarga.info();	
	}
	private void setConteudoPJVan(String pessoa) {
		this.conteudo =  "********* (SUA RESERVA NA LOCADORA GRUPO 10 UNB) *********"
				+ "\n*Reserva: " + this.codigo 
				+ "\n*Locatario: " + this.pj.getNomeLocatario()
				+ "\n*Responsável: " + this.responsavel
				+ "\n*Tipo Pessoa: " + pessoa
				+ "\n*Identificação(CPF/CNPJ):" + this.pj.getCnpj()
				+ "\n------------------------------------------------"
				+ "\n*Horario pedido de reserva: \n" + this.horarioReserva
				+ "\n*Valor Seguro Proprio : " +this.van.getValorSeguroProprio()
				+ "\n*Valor Seguro Terceiros: " +this.van.getValorSeguroTerceiros()
				+ "\n*Valor Impostos: " + this.van.getValorImpostos()
				+ "\n*Valor Total: " +this.van.getValorTotal()
				+ "\n------------------------------------------------"
				+ this.vp.info();	
	}
	
	public Reserva(String responsavel) {
		Random r = new Random();
		this.codigo = r.nextInt(9000);
		this.horarioReserva = ZonedDateTime.now().toString();
		this.responsavel = responsavel;
	}
	public void fillReserva(PessoaFisica p, VeiculoPasseio vp) {
		this.pf = p;
		this.vp = vp;
		setConteudoPFVP("Pessoa Fisica");
	}
	public void fillReserva(PessoaFisica pf, Motocicleta v) {
		this.pf = pf;
		this.mt = v;
		setConteudoPFMT("Pessoa Fisica");
	}
	public void fillReserva(PessoaFisica pf,  VeiculoCarga v) {
		this.pf = pf;
		this.vcarga = v;
		setConteudoPFVC("Pessoa Fisica");
	}
	public void fillReserva(PessoaFisica pf,  Van v) {
		this.pf = pf;
		this.van = v;
		setConteudoPFVan("Pessoa Fisica");
	}
	public void fillReserva(PessoaJuridica pj, VeiculoPasseio vp) {
		this.pj = pj;
		this.vp = vp;
		setConteudoPJVP("Pessoa Juridica");
	}
	public void fillReserva(PessoaJuridica pj, Motocicleta v) {
		this.pj = pj;
		this.mt = v;
		setConteudoPJMT("Pessoa Juridica");
	}
	public void fillReserva(PessoaJuridica pj,  VeiculoCarga v) {
		this.pj = pj;
		this.vcarga = v;
		setConteudoPJVC("Pessoa Juridica");
	}
	public void fillReserva(PessoaJuridica pj, Van v) {
		this.pj = pj;
		this.van = v;
		setConteudoPJVan("Pessoa Juridica");
	}
	
	public void info() {
		JOptionPane.showMessageDialog(null, conteudo);
	}
	

}