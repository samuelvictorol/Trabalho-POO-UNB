package AluguelCarros.copy;

abstract class Utilitario extends Veiculo{
	public String nomeMotorista = "Fulano da Silva";
	public String cpfMotorista = "01293132812314";
	protected Boolean motorista;
	
	public Utilitario() {
		super();
	}
	public void setMotorista(Boolean motorista) {
		this.motorista = motorista;
		
	}
	
	public String infoStr() {
		String info;
			if(this.motorista == false) {
				info = super.infoString() + "\n*Aluguel Sem Motorista Particular";
			}else {
				info = super.infoString() + "\n*Aluguel Com Motorista Particular"
						 + "\n*Motorista: " + this.nomeMotorista
						 + "\n*CPF Motorista: " + this.cpfMotorista;
			}
		return info;
	}

}
