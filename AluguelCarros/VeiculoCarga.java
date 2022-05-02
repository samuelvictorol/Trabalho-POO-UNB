package AluguelCarros;

public class VeiculoCarga extends Utilitario{
	private String capacidade;
	public VeiculoCarga() {
		super();
	}
	
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	
	public String info() {
		return super.infoStr()+ "\n*Capacidade: " + this.capacidade;
	}
	
}
