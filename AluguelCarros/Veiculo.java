package AluguelCarros;
import java.time.ZonedDateTime;

abstract class Veiculo {
	protected Boolean disponivel;
	protected Boolean protecaoPropria;
	protected String categoria;
	protected String renavam;
	protected String anoModelo;
	protected String placa;
	protected String cor;
	protected String horarioReserva;
	protected String dataEntrega;
	protected double valorTotal;
	protected double valorSeguroProprio;
	protected double valorSeguroTerceiros;
	protected double valorImpostos;
	private double valorDiaria;
	private double valorMensal;
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setProtecaoPropria(Boolean protecaoPropria) {
		this.protecaoPropria = protecaoPropria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria ;
	}
	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setHorarioReserva() {	
		this.horarioReserva = ZonedDateTime.now().toString();
	}
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public String getRenavam() {
		return this.renavam;
	}
	
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getCor() {
		return this.cor;
	}
	public String getCategoria() {
		return this.categoria;
	}
	public String getAnoModelo() {
		return this.anoModelo;
	}
	public String getPlaca() {
		return this.placa;
	}
	public String getHorarioReserva() {
		return this.horarioReserva;
	}
	
	public String getDataEntrega() {
		return this.dataEntrega;
	}
	
	public double getValorTotal() {
		return this.valorTotal;
	}
	
	public double getValorSeguroProprio() {
		return this.valorSeguroProprio;
	}
	public double getValorSeguroTerceiros() {
		return this.valorSeguroTerceiros;
	}
	public double getValorImpostos() {
		return this.valorImpostos;
	}

	public void setValorVeiculo(double valorSeguroProprio, double valorSeguroTerceiros, double valorImpostos, double valorDiaria, double valorMensal) {
		this.valorSeguroProprio = valorSeguroProprio;
		this.valorSeguroTerceiros = valorSeguroTerceiros;
		this.valorImpostos = valorImpostos;
		this.valorDiaria = valorDiaria;
		this.valorMensal = valorMensal;
		this.valorTotal =  valorSeguroProprio + valorSeguroTerceiros + valorImpostos; 
	}
	
	public void setValorTotal(double qtdDias) {
		if(qtdDias >= 30 && qtdDias < 59) {
			this.valorTotal += (this.valorMensal * 1);
		}else if(qtdDias >= 60 && qtdDias < 89) {
			this.valorTotal += (this.valorMensal * 2);
		}else if(qtdDias >= 90 && qtdDias <= 120) {
			this.valorTotal += (this.valorMensal * 3);
		}else if(qtdDias < 30) {
			this.valorTotal += (this.valorDiaria * qtdDias);
		}
	}
	public String infoString() {
		return  "\n*Veiculo: " + this.categoria
				+ "\n*Ano de fabricação / modelo: " + this.anoModelo// + molde.anoModelo
				+ "\n*Placa: " + this.placa 
				+ "\n*Categoria: " + this.categoria
				+ "\n*Protecao Propria: " + this.protecaoPropria// 
				+ "\n*Disponivel: " + this.disponivel
				+ "\n------------------------------------------------------------------------------"
				+ "\n*Valor Seguro Proprio: " + this.valorSeguroProprio
				+ "\n*Valor do seguro de terceiros: " + this.valorSeguroTerceiros
				+ "\n*Valor da diária: " + this.valorDiaria
				+ "\n*Valor Mensal: " + this.valorMensal
				+ "\n------------------------------------------------------------------------------";
	}
}
