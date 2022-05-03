package AluguelCarros.copy;

public class Van extends Utilitario {
	private String capacidadePessoas;
		
	public Van() {
		super();
	}
	public void setCapacidadePessoas(String capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}
	public String info() {
		return super.infoStr()+ "\n*Capacidade de Pessoas: " + this.capacidadePessoas;
	}
}
