package AluguelCarros.copy;

public class Motocicleta extends Veiculo {
	private Boolean controleTracao;
	private Boolean freioABS;
	private Boolean pilotoAutomatico;
	
	public Motocicleta() {
		super();
	}

	public boolean getControleTracao() {
		return controleTracao;
	}

	public void setControleTracao(boolean controleTracao) {
		this.controleTracao = controleTracao;
	}

	public boolean getFreioABS() {
		return freioABS;
	}

	public void setFreioABS(boolean freioABS) {
		this.freioABS = freioABS;
	}

	public boolean getPilotoAutomatico() {
		return pilotoAutomatico;
	}

	public void setPilotoAutomatico(boolean pilotoAutomatico) {
		this.pilotoAutomatico = pilotoAutomatico;
	}
	public String info() {
		return 	super.infoString() +
				"\n*Ar Condicionado: " + this.controleTracao +
			   "\n*Freio ABS: " + this.freioABS +
			   "\n*Piloto Automatico: " + this.pilotoAutomatico;
	}

}