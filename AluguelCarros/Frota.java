package AluguelCarros;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Frota {
	ArrayList<VeiculoPasseio> carros;
	//ArrayList<Moto> motos;
	//ArrayList<Utilitario> utilitarios;
	public Frota() {
		 this.carros = new ArrayList<VeiculoPasseio>();
		 //this.motos = new ArrayList<Moto>();
		// this.utilitarios = new ArrayList<Utilitario>();
	}
		
	public void cadastrarCarro(String categoria, Boolean protecaoPropria, Boolean arCondicionado, Boolean direcaoHidraulica, 
								Boolean cambioAutomatico, String renavam, String anoModelo,String placa,String cor,
								Double valorSeguroProprio, Double valorSeguroTerceiros, Double valorImpostos, Double valorDiaria, Double valorMensal) {
		VeiculoPasseio vp = new VeiculoPasseio();
		vp.setCategoria(categoria);
		vp.setProtecaoPropria(protecaoPropria);
		vp.setArCondicionado(arCondicionado);
		vp.setDirecaoHidraulica(direcaoHidraulica);
		vp.setCambioAutomatico(cambioAutomatico);
		vp.setRenavam(renavam);
		vp.setAnoModelo(anoModelo);
		vp.setPlaca(placa);
		vp.setCor(cor);
		vp.setValorVeiculo(valorSeguroProprio, valorSeguroTerceiros, valorImpostos, valorDiaria, valorMensal);
		vp.info();
		
		this.carros.add(vp);
	}
	
	public void pesquisarVeiculo(String pesquisa) {
			for(VeiculoPasseio vp : this.carros){
			    if(pesquisa.equals(vp.getPlaca()) || pesquisa.equals(vp.getAnoModelo()) || pesquisa.equals(vp.getRenavam())){
					JOptionPane.showMessageDialog(null, "Veiculo encontrada no sistema!");
					JOptionPane.showMessageDialog(null, vp.info());
					return;
			    }
			}
			      JOptionPane.showMessageDialog(null, "Este veiculo não foi encontrado no sistema!");	
	}
		
	public void alterarCor(String cor, String placa) {
		for(VeiculoPasseio vp :this. carros){
		    if(placa.equals(vp.placa)){
				JOptionPane.showMessageDialog(null, "Cor alterada!");
				vp.setCor(cor);
				JOptionPane.showMessageDialog(null, vp.info());
				return;
		    }
		}
		      JOptionPane.showMessageDialog(null, "Este veiculo não foi encontrado no sistema!");
			
	
	}
	
	/*public void excluirVeiculo(String placa) {
		for(Veiculo v : veiculos){
		    if(placa.equals(v.placa)){
				JOptionPane.showMessageDialog(null, "Veiculo removido do sistema!");
				v.info();
				veiculos.remove(v);
				return;
		    }
		}
		      JOptionPane.showMessageDialog(null, "Este veiculo não foi encontrado no sistema!");
	}
	*/

}