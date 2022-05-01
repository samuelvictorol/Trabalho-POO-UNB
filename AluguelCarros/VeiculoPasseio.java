package AluguelCarros;

public class VeiculoPasseio extends Veiculo {

	private Boolean arCondicionado;
	private Boolean direcaoHidraulica;
	private Boolean cambioAutomatico;
	
	public VeiculoPasseio() {
		super();
		this.setDisponivel(true);
	}
	
	public boolean getArCondicionado() {
		return arCondicionado;
	}


	public void setArCondicionado(Boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}


	public boolean getDirecaoHidraulica() {
		return direcaoHidraulica;
	}


	public void setDirecaoHidraulica(Boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}


	public boolean getCambioAutomatico() {
		return cambioAutomatico;
	}


	public void setCambioAutomatico(Boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}
	
	public String info() {
		return 	super.infoString() +
				"\n*Ar Condicionado: " + this.arCondicionado +
			   "\n*Direcao Hidraulica: " + this.direcaoHidraulica +
			   "\n*Cambio Automatico: " + this.cambioAutomatico;
	}

}