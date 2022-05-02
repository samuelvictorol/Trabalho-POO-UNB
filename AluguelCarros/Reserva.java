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
	Random codigo;
	private String conteudo;
	public String  horarioReserva;
	
	public void setConteudoPF(String pessoa){
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
	public Reserva(String responsavel) {
		this.codigo = new Random();
		this.horarioReserva = ZonedDateTime.now().toString();
		this.responsavel = responsavel;
	}
	public void fillReserva(PessoaFisica p, VeiculoPasseio vp) {
		this.pf = p;
		this.vp = vp;
		setConteudoPF("Pessoa Fisica");
	}
	public void info() {
		JOptionPane.showMessageDialog(null, conteudo);
	}

}