package AluguelCarros;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
public class ProgramaLocadora {
	//Todas as funcoes de escolha estao nessa classe
	
	Locadora locadora = new Locadora("Locadora GRUPO 10 UNB");
    public ProgramaLocadora(){
            
    }
    public void erroShow() {
    	JOptionPane.showMessageDialog(null, "Inválid(o)!\nTente Novamente");
    	return;
    }
    
    public void sairShow() {
    	JOptionPane.showMessageDialog(null, "Finalizando Aplicativo...");
    	System.exit(0);
    }
    
    public void start(){
        String n = JOptionPane.showInputDialog(null, "******************** Menu Principal *********************\nA) Gerenciar Locatario          B) Gerenciar Frota\n"
        											+"	C) Gerenciar Reservas         D) Sair do Programa", this.locadora.getNomeLocadora());
        switch(n) {
        	case "A", "a":
        		optAShow();
        		break;
        	case "B", "b":
        		optBShow();
        		break;
        	case "C", "c":
        		optCShow(); 
        		 break;
        	case "D", "d":
        		sairShow();
        		break;
        	default:
        		erroShow();
        		break;
        }       
    }
  
    public void optBShow() {
    	String menu = "Frota";
    	String b = JOptionPane.showInputDialog(null, "******************** Gerenciar Frota *********************"
    												+ "\nA) Cadastrar Veiculo      B) Buscar Veiculo"
				 									+ "\nC) Retirar Veiculo           D) Entregar Carro"
    												+ "\nE) Alterar Cor                 	 F) Sair", menu);
    	switch(b) {
    	case "A", "a":
    		registraDadosFrota();
    		break;
    	case "B", "b": 
    		String pesquisa = JOptionPane.showInputDialog(null, "Digite o Modelo, Placa ou Renavam do veiculo", menu);
			this.locadora.frota.pesquisarVeiculo(pesquisa);
    		break;
    	case "C", "c":
			
    		break;
    	case "D", "d":
			
    		break;
    	case "E", "e":
				
    		break;
    	case "F", "f":
    		return;
    	default:
    		break;
    	}
		
    }


    public void registraDadosFrota() {
    	String menu = "Frota";
    	String categoria = JOptionPane.showInputDialog(null, "1) Veiculo Passeio 2) Motocicleta 3) Veiculo Utilitario"
    													   + "\nDigite a Categoria: ", menu);
    	switch(categoria) {
    	case "1":
    		categoria = "Veiculo Passeio";
    		registraDadosVeiculoPasseio(categoria);
    		break;
    	case "2":
    		
    		break;
    	case "3":
    		
    		break;
    	default:
    		erroShow();
    		return;
    	}
    }
    
    public void registraDadosVeiculoPasseio(String categoria) {
    	String menu = "Frota";
    	Boolean protecaoPropria = false;
    	Boolean arCondicionado = false;
    	Boolean direcaoHidraulica = false;
    	Boolean cambioAutomatico = false;
    	String renavam = JOptionPane.showInputDialog(null, "Digite o RENAVAM:", menu);
    	try {
    		Integer.parseInt(renavam);
    	}catch(Exception ex) {
    		erroShow();
    		return;
    	}
    	String anoModelo = JOptionPane.showInputDialog(null, "Digite o Modelo/Ano:", menu);
    	String placa =  JOptionPane.showInputDialog(null, "Digite a Placa:", menu);
    	String cor = JOptionPane.showInputDialog(null, "Digite a cor:", menu);
    	String valorSeguroProprio = JOptionPane.showInputDialog(null, "Digite o Valor do Seguro Proprio", menu);
    	try {
    		Double.valueOf(valorSeguroProprio).doubleValue();
    	}catch(Exception ex) {
    		erroShow();
    		return;
    	}
    	String valorSeguroTerceiros = JOptionPane.showInputDialog(null, "Digite o Valor do Seguro de Terceiros", menu);
    	try {
    		Double.valueOf(valorSeguroTerceiros).doubleValue();
    	}catch(Exception ex) {
    		erroShow();
    		return;
    	}
    	String valorImpostos = JOptionPane.showInputDialog(null, "Digite o Valor dos Impostos", menu);
    	try {
    		Double.valueOf(valorImpostos).doubleValue();
    	}catch(Exception ex) {
    		erroShow();
    		return;
    	}
    	String valorDiaria = JOptionPane.showInputDialog(null, "Digite o Valor da Diaria", menu);
    	try {
    		Double.valueOf(valorDiaria).doubleValue();
    	}catch(Exception ex) {
    		erroShow();
    		return;
    	}
    	String valorMensal = JOptionPane.showInputDialog(null, "Digite o Valor Mensal", menu);
    	try {
    		Double.valueOf(valorMensal).doubleValue();
    	}catch(Exception ex) {
    		erroShow();
    		return;
    	}
    	int intProtecaoPropria = JOptionPane.showConfirmDialog(null, "Possui Protecao Propria?");
    	if(intProtecaoPropria == 2) {
    		return;
    	}else if(intProtecaoPropria == 0) {
    		protecaoPropria = true;
    	}
    	int intArCondicionado = JOptionPane.showConfirmDialog(null, "Possui Ar Condicionado ?");
    	if(intArCondicionado == 2) {
    		return;
    	}else if(intArCondicionado == 0) {
    		arCondicionado = true;
    	}
    	int intDirecaoHidraulica = JOptionPane.showConfirmDialog(null, "Possui Direcao Hidraulica ?");
    	if(intDirecaoHidraulica == 2) {
    		return;
    	}else if(intDirecaoHidraulica== 0) {
    		direcaoHidraulica = true;
    	}
    	int intCambioAutomatico = JOptionPane.showConfirmDialog(null, "Possui Cambio Automatico ?");
    	if(intCambioAutomatico == 2) {
    		return;
    	}else if(intCambioAutomatico == 0) {
    		cambioAutomatico = true;
    	}
    	
    	locadora.cadastrarVeiculo(categoria, protecaoPropria, arCondicionado, direcaoHidraulica, cambioAutomatico, renavam, anoModelo, placa
    							, cor, Double.valueOf(valorSeguroProprio).doubleValue(), Double.valueOf(valorSeguroTerceiros).doubleValue(),
    							Double.valueOf(valorImpostos).doubleValue(), Double.valueOf(valorDiaria).doubleValue(), Double.valueOf(valorMensal).doubleValue());    	
    }
    
    public void optCShow() {
    	String menu = "Reservas";
		String c = JOptionPane.showInputDialog(null, "******************** Gerenciar Reservas *********************\nA) Cadastrar Reserva        B) Verificar Reserva\n"
													 +" C) Excluir Reserva            D) Sair", menu);
		switch(c) {
			case "A", "a":
				locadora.cadastrarReserva();
				break;
		} 
    }
    
    public void optAShow() {
    	String n = JOptionPane.showInputDialog(null, "****************** Menu Gerência de Locatários *************"
    			+ "									\nA) Cadastrar Pessoa Física\nB) Cadastrar Pessoa Jurídica\nC) Buscar Locatário"
    			+ "									\nD) Excluir locatário\n" , this.locadora.getNomeLocadora());
    	switch(n) {
    		case "A", "a":
    			registraDadosPF();
    			break;
    		case "B", "b":
    			registraDadosPJ();
    			break;
    		case "C", "c":
    				String idnomeProcurado = JOptionPane.showInputDialog(null, "Digite o Nome, CPF ou CNPJ para procurar:", locadora.getNomeLocadora());
    				locadora.buscar(idnomeProcurado);
    		break;
    		case "D", "d":
    			String idnomeExcluir = JOptionPane.showInputDialog(null, "Digite o Nome, CPF ou CNPJ para remover:", locadora.getNomeLocadora());
    			locadora.excluir(idnomeExcluir);    				
    			break;	
    		default:
    			erroShow();
    			return;
    	}
    	
    }
  
    //Registro de Dados:
    public void registraDadosPF() {
    	String tipo = "Pessoa Fisica"; // Apenas pra printar no JOptionPane
		String nome = JOptionPane.showInputDialog(null, "Digite o Nome:",  tipo, JOptionPane.INFORMATION_MESSAGE);
		String email = JOptionPane.showInputDialog(null, "Digite o Email: ",  tipo, JOptionPane.INFORMATION_MESSAGE);
		String cpfTeste = (JOptionPane.showInputDialog(null, "Digite o CPF:", "Pessoa Fisica",  JOptionPane.INFORMATION_MESSAGE));
		Boolean checkCpf = verificaCpf(cpfTeste);			
		String cpf = "";
		int idade = 0;
		if(checkCpf) {
			cpf = cpfTeste;	
		}
		else {
			erroShow();
			return;
		}
		String idadeString = JOptionPane.showInputDialog(null, "Digite a idade", tipo, JOptionPane.INFORMATION_MESSAGE);
		try {
			int idadeTesteInt = Integer.parseInt(idadeString);
			if(idadeTesteInt < 18) {
				JOptionPane.showMessageDialog(null, "Idade Não Permitida!");
				return;
			}
		}catch(NumberFormatException e) {
			erroShow();
			return;
		}
			idade = Integer.parseInt(idadeString);
		String endereco = JOptionPane.showInputDialog(null, "Digite o Endereco:", tipo, JOptionPane.INFORMATION_MESSAGE);
		String telefone = JOptionPane.showInputDialog(null, "Digite o Telefone:", tipo, JOptionPane.INFORMATION_MESSAGE);
		String estadoCivil = JOptionPane.showInputDialog(null, "Digite o Estado Civil:", tipo, JOptionPane.INFORMATION_MESSAGE);
		locadora.cadastrarPF(nome, cpf, email, idade, endereco, telefone, estadoCivil);		

    }
    public ArrayList<PessoaFisica> registraDadosFuncionariosPJ(int qtdFuncionarios) { 
     	ArrayList<PessoaFisica> funcionarios = new ArrayList<PessoaFisica>();
     	int i = 1;
     	do{
     		String tipo = "Funcionario ";
			String nome = JOptionPane.showInputDialog(null, "Digite o Nome:",  tipo + i, JOptionPane.INFORMATION_MESSAGE);
			String email = JOptionPane.showInputDialog(null, "Digite o Email: ",  tipo + i, JOptionPane.INFORMATION_MESSAGE);
			String cpfTeste = (JOptionPane.showInputDialog(null, "Digite o CPF:", tipo + i,  JOptionPane.INFORMATION_MESSAGE));
			Boolean checkCpf = verificaCpf(cpfTeste);			
			String cpf = "";
			int idade;
			if(checkCpf) {
				cpf = cpfTeste;	
			}
			else {
				erroShow();
				return null;
			}
			String idadeString = JOptionPane.showInputDialog(null, "Digite a idade", tipo + i, JOptionPane.INFORMATION_MESSAGE);
			try {
				int idadeTesteInt = Integer.parseInt(idadeString); // garante que vai ser digitado um numero
			}catch(NumberFormatException e) {
				erroShow();
				return null;
			} 
			
			idade = Integer.parseInt(idadeString);
			String endereco = JOptionPane.showInputDialog(null, "Digite o Endereco", tipo + i, JOptionPane.INFORMATION_MESSAGE);
			String telefone = JOptionPane.showInputDialog(null, "Digite o Telefone", tipo + i, JOptionPane.INFORMATION_MESSAGE);
			String estadoCivil = JOptionPane.showInputDialog(null, "Digite o Estado Civil:", tipo + i, JOptionPane.INFORMATION_MESSAGE);
			funcionarios.add(new PessoaFisica(nome, cpf, email, endereco, telefone, idade, estadoCivil));	

			i++;
     	}while(i <= qtdFuncionarios);
		return funcionarios;
    }
    public void registraDadosPJ() {
    	String tipo = "Pessoa Juridica";
		String nome = JOptionPane.showInputDialog(null, "Digite a Razão Social:",  tipo, JOptionPane.INFORMATION_MESSAGE);
		String email = JOptionPane.showInputDialog(null, "Digite o Email: ",  tipo, JOptionPane.INFORMATION_MESSAGE);
		String cnpj= (JOptionPane.showInputDialog(null, "Digite o CNPJ:", "Pessoa Fisica",  JOptionPane.INFORMATION_MESSAGE));
		String endereco = JOptionPane.showInputDialog(null, "Digite o Endereco:", tipo, JOptionPane.INFORMATION_MESSAGE);
		String telefone = JOptionPane.showInputDialog(null, "Digite o Telefone: ", tipo, JOptionPane.INFORMATION_MESSAGE);
		String testeQtdFunc = JOptionPane.showInputDialog(null, "Digite quantos funcionarios deseja adicionar:\n(0) Retornar:", tipo, JOptionPane.INFORMATION_MESSAGE);
		try {
			int n = Integer.parseInt(testeQtdFunc);
			if(n >= 1) {
				 ArrayList<PessoaFisica> funcionarios = registraDadosFuncionariosPJ(n);
				 locadora.cadastrarPJ(nome, cnpj, email, endereco, telefone, funcionarios);	
			}else if (n == 0) {
				sairShow();
			}
			else {
				erroShow();
				return;
			}
		}catch(NumberFormatException e) {
			erroShow();
			return;
		}catch(NullPointerException e) {
			return;
		}
		
    }
    public void registraDadosReserva() {
    	
    	
    	
    	
    	
    }
    public Boolean verificaCpf(String CPF) {
    	if (CPF.length() != 11) {			
			return false;
		}
		char dig10, dig11;
		int sm, i, r, num, peso;
		sm = 0;
		peso = 10;
		for (i = 0; i < 9; i++) {

			num = (int) (CPF.charAt(i) - 48);
			sm = sm + (num * peso);
			peso = peso - 1;
		}

		r = 11 - (sm % 11);

		if ((r == 10) || (r == 11))
			dig10 = '0';
		else
			dig10 = (char) (r + 48);
		sm = 0;
		peso = 11;
		for (i = 0; i < 10; i++) {
			num = (int) (CPF.charAt(i) - 48);
			sm = sm + (num * peso);
			peso = peso - 1;
		}

		r = 11 - (sm % 11);

		if ((r == 10) || (r == 11)) {
			dig11 = '0';			
		} else {
			dig11 = (char) (r + 48);			
		}

		if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
			return true;
		} else {
			return false;
		}
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
