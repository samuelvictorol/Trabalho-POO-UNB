/*package AluguelCarros;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;


import java.text.DecimalFormat;
public class Reserva {
	
	String pessoa = "":
	DecimalFormat deci = new DecimalFormat("0.00"); // deci.format(n);
	VeiculoPasseio vp;
	PessoaFisica pf;
	PessoaJuridica pj;
	private String codigo;
	private String conteudo;
	
	public void setConteudo(String pessoa){
		if(pessoa = "pf"){
		this.conteudo =  "********* (SUA RESERVA NA LOCADORA GRUPO 10 UNB) *********"
							+ "\n*Reserva: " + this.codigo 
							+ "\n*Locatario: " + this.pf.getNomeLocatario()
							+ "\n*Responsável: " + this.pf.getNomeLocatario()
							+ "\n*Identificação(CPF/CNPJ): this.pf.getCpf();"
							+ "\n------------------------------------------------"
							+ "\nHorario pedido de reserva: " + this.vp.getHorarioReserva
							+ "\nData de Entrega: " + this.vp.;
		}		
	}
	public Reserva(VeiculoPasseio vp, PessoaFisica pf, PessoaJuridica pj, String dataEntrega) {
		this.vp = vp;
		this.vp.setHorarioReserva();
		this.vp.setDataEntrega(dataEntrega);
		if(pj == null){
			this.pf = pf;
			this.pessoa = "pf";
			this.vp.setDisponivel(false);
			conteudoPF();
		}else{
			
		}
	}
	public void setGetHorario(){
		
	}
	public void info() {
		JOptionPane.showMessageDialog(null, conteudo);
	}
}
*/