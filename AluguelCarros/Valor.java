package AluguelCarros;

import javax.swing.JOptionPane;

public class Valor {

	private String tipoLocacao;
	private boolean seguroOpcional;
	private float valorTotal;
	
	public Valor() {
		
	}

	public String getTipoLocacao() {
		return tipoLocacao;
	}

	public void setTipoLocacao(String tipoLocacao) {
		this.tipoLocacao = tipoLocacao;
	}

	public boolean isSeguroOpcional() {
		return seguroOpcional;
	}

	public void setSeguroOpcional(boolean seguroOpcional) {
		this.seguroOpcional = seguroOpcional;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public boolean pedeSeguro() {
		String opcao = JOptionPane.showInputDialog(null, "O seguro opcional equivale a 8% do valor da locação."
														+ "\nDeseja obte-lo? (S/N)?" );
		
		if (opcao == "S") {
			seguroOpcional = true;
		} else if (opcao == "N") {
			seguroOpcional = false;
		}
		
		return seguroOpcional;
	}
	
	public float determinaValorTotal(String tipoLocacao, boolean seguroOpcional, float valorTotal) {
		switch (tipoLocacao) {
		case "normal":
			valorTotal = diarias * valorDiaria;
			break;
		case "reduzida":
			valorTotal = diarias * (valorDiaria * 0.9);
			break;
		case "empresarial":
			valorTotal = diarias * (valorDiaria * 0.7);
			break;
		case "mensal":
			valorTotal = valorMensal * diarias/30;
		}
		
		//determina valor com seguro
		float valorSeguroOpc = 0;
		if (seguroOpcional == true) {
			valorSeguroOpc = valorTotal + (valorTotal*8/100);
		}
		
		//outros impostos
		valorTotal = valorTotal + (valorTotal * 12/100) + (valorTotal * 5/100) + valorSeguroOpc;
		
		return valorTotal;
	}

}
