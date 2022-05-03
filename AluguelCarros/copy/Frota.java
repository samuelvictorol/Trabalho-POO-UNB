package AluguelCarros.copy;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Frota{
	ArrayList<VeiculoPasseio> carros;
	ArrayList<Motocicleta> motos;
	ArrayList<VeiculoCarga> vcargas;
	ArrayList<Van> vans;
	public Frota() {
		 this.carros = new ArrayList<VeiculoPasseio>();
		 this.motos = new ArrayList<Motocicleta>();
		 this.vcargas = new ArrayList<VeiculoCarga>();
		 this.vans = new ArrayList<Van>();
	}
		
	public void cadastrarCarro(String categoria, Boolean protecaoPropria, Boolean x, Boolean y, 
								Boolean z, String renavam, String anoModelo,String placa,String cor,
								Double valorSeguroProprio, Double valorSeguroTerceiros, Double valorImpostos, Double valorDiaria, Double valorMensal) {
		VeiculoPasseio vp = new VeiculoPasseio();
		vp.setCategoria(categoria);
		vp.setProtecaoPropria(protecaoPropria);
		vp.setArCondicionado(x);
		vp.setDirecaoHidraulica(y);
		vp.setCambioAutomatico(z);
		vp.setRenavam(renavam);
		vp.setAnoModelo(anoModelo);
		vp.setPlaca(placa);
		vp.setCor(cor);
		vp.setValorVeiculo(valorSeguroProprio, valorSeguroTerceiros, valorImpostos, valorDiaria, valorMensal);
		JOptionPane.showMessageDialog(null, vp.info());
		this.carros.add(vp);
	}
	public void cadastrarMoto(String categoria, Boolean protecaoPropria, Boolean controleTracao, Boolean freioABS, 
								Boolean pilotoAutomatico, String renavam, String anoModelo,String placa,String cor,
								Double valorSeguroProprio, Double valorSeguroTerceiros, Double valorImpostos, Double valorDiaria, Double valorMensal) {
		JOptionPane.showMessageDialog(null, "teste frota");
		Motocicleta mt = new Motocicleta();
			mt.setCategoria(categoria);
			mt.setProtecaoPropria(protecaoPropria);
			mt.setControleTracao(controleTracao);
			mt.setFreioABS(freioABS);
			mt.setPilotoAutomatico(pilotoAutomatico);
			mt.setRenavam(renavam);
			mt.setAnoModelo(anoModelo);
			mt.setPlaca(placa);
			mt.setCor(cor);
			mt.setValorVeiculo(valorSeguroProprio, valorSeguroTerceiros, valorImpostos, valorDiaria, valorMensal);
			JOptionPane.showMessageDialog(null, mt.info());
				
			this.motos.add(mt);
	}
	
	public void cadastrarVCarga(Boolean motorista, String categoria, Boolean protecaoPropria, String x, 
								String renavam, String anoModelo,String placa,String cor,
								Double valorSeguroProprio, Double valorSeguroTerceiros, Double valorImpostos, Double valorDiaria, Double valorMensal) {
			VeiculoCarga vc = new VeiculoCarga();
			vc.setMotorista(motorista);
			vc.setCategoria(categoria);
			vc.setProtecaoPropria(protecaoPropria);
			vc.setCapacidade(x);
			vc.setRenavam(renavam);
			vc.setAnoModelo(anoModelo);
			vc.setPlaca(placa);
			vc.setCor(cor);
			vc.setValorVeiculo(valorSeguroProprio, valorSeguroTerceiros, valorImpostos, valorDiaria, valorMensal);
			JOptionPane.showMessageDialog(null, vc.info());
			
			this.vcargas.add(vc);
		
	}
	
	public void cadastrarVan(Boolean motorista, String categoria, Boolean protecaoPropria, String x, String renavam,
			String anoModelo, String placa, String cor, Double valorSeguroProprio, Double valorSeguroTerceiros,
			Double valorImpostos, Double valorDiaria, Double valorMensal) {
		Van v = new Van();
		v.setMotorista(motorista);
		v.setCategoria(categoria);
		v.setProtecaoPropria(protecaoPropria);
		v.setCapacidadePessoas(x);
		v.setRenavam(renavam);
		v.setAnoModelo(anoModelo);
		v.setPlaca(placa);
		v.setCor(cor);
		v.setValorVeiculo(valorSeguroProprio, valorSeguroTerceiros, valorImpostos, valorDiaria, valorMensal);
		JOptionPane.showMessageDialog(null, v.info());
		
		this.vans.add(v);
		
	}
	
	public Boolean pesquisarVeiculo(String pesquisa) {
			for(VeiculoPasseio vp : this.carros){
			    if(pesquisa.equals(vp.getPlaca()) || pesquisa.equals(vp.getAnoModelo()) || pesquisa.equals(vp.getRenavam())){
					JOptionPane.showMessageDialog(null, "Veiculo encontrada no sistema!");
					JOptionPane.showMessageDialog(null, vp.info());
					return true;
			    }
			}
			
			for(Motocicleta mt : this.motos){
				if(pesquisa.equals(mt.getPlaca()) || pesquisa.equals(mt.getAnoModelo()) || pesquisa.equals(mt.getRenavam())){
					JOptionPane.showMessageDialog(null, "Veiculo encontrada no sistema!");
					JOptionPane.showMessageDialog(null, mt.info());
						return true;
					}
			}
			for(VeiculoCarga v : this.vcargas){
				if(pesquisa.equals(v.getPlaca()) || pesquisa.equals(v.getAnoModelo()) || pesquisa.equals(v.getRenavam())){
					JOptionPane.showMessageDialog(null, "Veiculo encontrado no sistema!");
					JOptionPane.showMessageDialog(null, v.info());
						return true;
					}
			}
			for(Van v : this.vans){
				if(pesquisa.equals(v.getPlaca()) || pesquisa.equals(v.getAnoModelo()) || pesquisa.equals(v.getRenavam())){
					JOptionPane.showMessageDialog(null, "Veiculo encontrado no sistema!");
					JOptionPane.showMessageDialog(null, v.info());
						return true;
					}
			}
			
			JOptionPane.showMessageDialog(null, "Este veiculo não foi encontrado no sistema!");			 
			return false;
	}
	public VeiculoPasseio retornaVP(String pesquisa) {
		for(VeiculoPasseio v : this.carros) {
			if(pesquisa.equals(v.getPlaca()) || pesquisa.equals(v.getAnoModelo()) || pesquisa.equals(v.getRenavam())){
				JOptionPane.showMessageDialog(null, "Veiculo encontrada no sistema!");
				return v;
		    }
		}
		return null;
	}

	public Motocicleta retornaMT(String pesquisa) {
		for(Motocicleta v : this.motos) {
			if(pesquisa.equals(v.getPlaca()) || pesquisa.equals(v.getAnoModelo()) || pesquisa.equals(v.getRenavam())){
				JOptionPane.showMessageDialog(null, "Veiculo encontrada no sistema!");
				return v;
		    }
		}
		return null;
	}
	public VeiculoCarga retornaVC(String pesquisa) {
		for(VeiculoCarga v : this.vcargas) {
			if(pesquisa.equals(v.getPlaca()) || pesquisa.equals(v.getAnoModelo()) || pesquisa.equals(v.getRenavam())){
				JOptionPane.showMessageDialog(null, "Veiculo encontrada no sistema!");
				return v;
		    }
		}
		return null;
	}
	public Van retornaVan(String pesquisa) {
		for(Van v : this.vans) {
			if(pesquisa.equals(v.getPlaca()) || pesquisa.equals(v.getAnoModelo()) || pesquisa.equals(v.getRenavam())){
				JOptionPane.showMessageDialog(null, "Veiculo encontrada no sistema!");
				return v;
		    }
		}
		return null;
	}
	public void alterarCor(String cor, String pesquisa) {
		for(VeiculoPasseio vp : this.carros){
		    if(pesquisa.equals(vp.getPlaca()) || pesquisa.equals(vp.getAnoModelo()) || pesquisa.equals(vp.getRenavam())){
				JOptionPane.showMessageDialog(null, "Cor Alterada no sistema!");
				vp.setCor(cor);
				JOptionPane.showMessageDialog(null, vp.info());
				return;
		    }
		}
		
		for(Motocicleta mt : this.motos){
			if(pesquisa.equals(mt.getPlaca()) || pesquisa.equals(mt.getAnoModelo()) || pesquisa.equals(mt.getRenavam())){
				JOptionPane.showMessageDialog(null, "Cor Alterada no sistema!");
				mt.setCor(cor);
				JOptionPane.showMessageDialog(null, mt.info());
					return ;
				}
		}
		for(VeiculoCarga v : this.vcargas){
			if(pesquisa.equals(v.getPlaca()) || pesquisa.equals(v.getAnoModelo()) || pesquisa.equals(v.getRenavam())){
				JOptionPane.showMessageDialog(null, "Cor Alterada no sistema!");
				v.setCor(cor);
				JOptionPane.showMessageDialog(null, v.info());
				
					return ;
				}
		}
		for(Van v : this.vans){
			if(pesquisa.equals(v.getPlaca()) || pesquisa.equals(v.getAnoModelo()) || pesquisa.equals(v.getRenavam())){
				JOptionPane.showMessageDialog(null, "Cor Alterada no sistema!");
				v.setCor(cor);
				JOptionPane.showMessageDialog(null, v.info());
					return ;
				}
		}			
	}
	
	public void excluirVeiculo(String pesquisa) {
		for(VeiculoPasseio v : this.carros){
			if(pesquisa.equals(v.getPlaca()) || pesquisa.equals(v.getAnoModelo()) || pesquisa.equals(v.getRenavam())){
				JOptionPane.showMessageDialog(null, "Veiculo encontrado no sistema!");
				JOptionPane.showMessageDialog(null, v.info());
				JOptionPane.showMessageDialog(null, "Veiculo Retirado de Frota!");
				carros.remove(v);
					return;
				}
		}
		for(Motocicleta v : this.motos){
			if(pesquisa.equals(v.getPlaca()) || pesquisa.equals(v.getAnoModelo()) || pesquisa.equals(v.getRenavam())){
				JOptionPane.showMessageDialog(null, "Veiculo encontrado no sistema!");
				JOptionPane.showMessageDialog(null, v.info());
				JOptionPane.showMessageDialog(null, "Veiculo Retirado de Frota!");
				motos.remove(v);
					return;
				}
		}
		
		for(VeiculoCarga v : this.vcargas){
			if(pesquisa.equals(v.getPlaca()) || pesquisa.equals(v.getAnoModelo()) || pesquisa.equals(v.getRenavam())){
				JOptionPane.showMessageDialog(null, "Veiculo encontrado no sistema!");
				JOptionPane.showMessageDialog(null, v.info());
				JOptionPane.showMessageDialog(null, "Veiculo Retirado de Frota!");
				vcargas.remove(v);
					return;
				}
		}
		for(Van v : this.vans){
			if(pesquisa.equals(v.getPlaca()) || pesquisa.equals(v.getAnoModelo()) || pesquisa.equals(v.getRenavam())){
				JOptionPane.showMessageDialog(null, "Veiculo encontrado no sistema!");
				JOptionPane.showMessageDialog(null, v.info());
				JOptionPane.showMessageDialog(null, "Veiculo Retirado de Frota!");
				vans.remove(v);
					return;
				}
		}
		
		
		      JOptionPane.showMessageDialog(null, "Este veiculo não foi encontrado no sistema!");
		 
	}


	/*public VeiculoPasseio disponivelVeiculo(boolean b, String pesquisa) {
		for(VeiculoPasseio vp : this.carros){
		    if(pesquisa.equals(vp.getPlaca()) || pesquisa.equals(vp.getAnoModelo()) || pesquisa.equals(vp.getRenavam())){
				JOptionPane.showMessageDialog(null, "Carro Disponivel?");
				vp.setDisponivel(b);
				JOptionPane.showMessageDialog(null, vp.info());
				return vp;
		    }
		}
		JOptionPane.showMessageDialog(null, "Este veiculo não foi encontrado no sistema!");	
		return null;
	}
	public Motocicleta disponivelVeiculo(boolean b, String pesquisa) {
		for(Motocicleta mt : this.motos){
			if(pesquisa.equals(mt.getPlaca()) || pesquisa.equals(mt.getAnoModelo()) || pesquisa.equals(mt.getRenavam())){
				JOptionPane.showMessageDialog(null, "Carro Disponivel?");
				mt.setDisponivel(b);
				JOptionPane.showMessageDialog(null, mt.info());
					return mt;
				}
		}
	}
	public Motocicleta disponivel(boolean b, String pesquisa) {
		for(VeiculoCarga v : this.vcargas){
			if(pesquisa.equals(v.getPlaca()) || pesquisa.equals(v.getAnoModelo()) || pesquisa.equals(v.getRenavam())){
				JOptionPane.showMessageDialog(null, "Carro Disponivel?");
				v.setDisponivel(b);
				JOptionPane.showMessageDialog(null, v.info());		
					return v;
				}
			
		}
		JOptionPane.showMessageDialog(null, "Este veiculo não foi encontrado no sistema!");	
		return null;
}
		for(Van v : this.vans){
			if(pesquisa.equals(v.getPlaca()) || pesquisa.equals(v.getAnoModelo()) || pesquisa.equals(v.getRenavam())){
				JOptionPane.showMessageDialog(null, "Carro Disponivel?");
				v.setDisponivel(b);
				JOptionPane.showMessageDialog(null, v.info());
					return v;
				}
		}	
		JOptionPane.showMessageDialog(null, "Este veiculo não foi encontrado no sistema!");	
		return null;
	}

*/	
}