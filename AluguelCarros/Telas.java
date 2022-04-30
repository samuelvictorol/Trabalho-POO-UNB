package AluguelCarros;
import javax.swing.JOptionPane;
public class Telas {
	//Locadora locadora = new Locadora("Locadora GRUPO 10");
    public Telas(){
            
    }
    
    public void erroShow() {
    	JOptionPane.showMessageDialog(null, "Inválid(o)!\nTente Novamente");
    	return;
    }
    
    public void sairShow() {
    	JOptionPane.showMessageDialog(null, "Finalizando Aplicativo...");
    	System.exit(0);
    }
    
    public void telaShow(){
        String n = JOptionPane.showInputDialog(null, "******************** Menu Principal *********************\nA) Gerenciar Locatario          B) Gerenciar Frota\nC) Gerenciar Reservas         D) Sair do Programa");
        switch(n) {
        	case "A", "a":
        		t1opAShow();
        		break;
        	case "B", "b":
        		
        		break;
        	case "C", "c":
        		
        		break;
        	case "D", "d":
        		sairShow();
        		break;
        	default:
        		erroShow();
        		break;
        }       
    }
    
    public void t1opAShow() {
    	String n = JOptionPane.showInputDialog(null, "****************** Menu Gerência de Locatários *************\nA) Cadastrar Pessoa Física\nB) Cadastrar Pessoa Jurídica\nC) Buscar Locatário\nD) Pesquisar Locatário\nE) Excluir locatário\n");
    	switch(n) {
    		case "A", "a":
    			registraDadosPF();
    			break;
    		case "B", "b":
    			registraDadosPJ();
    			break;
    		case "C", "c":
    		
    		break;
    		case "D", "d":
    			
    			break;
    		case "E", "e":
    			
    			break;
    		default:
    			erroShow();
    			return;
    	}
    	
    }
    public void registraDadosPF() {
    	String tipo = "Pessoa Fisica";
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
		}catch(NumberFormatException e) {
			erroShow();
			return;
		}
			idade = Integer.parseInt(idadeString);
		String endereco = JOptionPane.showInputDialog(null, "Digite o Endereco", tipo, JOptionPane.INFORMATION_MESSAGE);
		String telefone = JOptionPane.showInputDialog(null, "Digite o Telefone", tipo, JOptionPane.INFORMATION_MESSAGE);
		String estadoCivil = JOptionPane.showInputDialog(null, "Digite o Estado Civil:", tipo, JOptionPane.INFORMATION_MESSAGE);
		//locadora.cadastrarPessoaFisica(nome, cpf, email, idade, endereco, telefone, estadoCivil);		

    }
   /* public List<PessoaFisica> registraDadosFuncionariosPJ(int qtdFuncionarios) {
    * 	List<String> funcionarios = new List<String>();
    * 	int funcionariosRegistrados = 0;
     	do{
     		String tipo = "Pessoa Fisica";
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
			}catch(NumberFormatException e) {
				erroShow();
				return;
			}
			idade = Integer.parseInt(idadeString);
			String endereco = JOptionPane.showInputDialog(null, "Digite o Endereco", tipo, JOptionPane.INFORMATION_MESSAGE);
			String telefone = JOptionPane.showInputDialog(null, "Digite o Telefone", tipo, JOptionPane.INFORMATION_MESSAGE);
			String estadoCivil = JOptionPane.showInputDialog(null, "Digite o Estado Civil:", tipo, JOptionPane.INFORMATION_MESSAGE);
			funcionarios.add(new PessoaFisica(nome, cpf, email, idade, endereco, telefone, estadoCivil));	
			funcionariosRegistrados++;
		while(qtdFuncionarios > funcionariosRegistrados);
	return funcionarios;
    }*/
    public void registraDadosPJ() {
    	String tipo = "Pessoa Fisica";
		String nome = JOptionPane.showInputDialog(null, "Digite a Razão Social:",  tipo, JOptionPane.INFORMATION_MESSAGE);
		String email = JOptionPane.showInputDialog(null, "Digite o Email: ",  tipo, JOptionPane.INFORMATION_MESSAGE);
		String cnpj= (JOptionPane.showInputDialog(null, "Digite o CNPJ:", "Pessoa Fisica",  JOptionPane.INFORMATION_MESSAGE));
		String endereco = JOptionPane.showInputDialog(null, "Digite o Endereco:", tipo, JOptionPane.INFORMATION_MESSAGE);
		String telefone = JOptionPane.showInputDialog(null, "Digite o Telefone: ", tipo, JOptionPane.INFORMATION_MESSAGE);
		String testeQtdFunc = JOptionPane.showInputDialog(null, "Digite quantos funcionarios deseja adicionar:\n(0) Retornar:", tipo, JOptionPane.INFORMATION_MESSAGE);
		try {
			int n = Integer.parseInt(testeQtdFunc);
			if(n >= 1) {
				// List<PessoaFisica> funcionarios = registraDadosPF(testeQtdFunc);
				// locadora.cadastrarPessoaJuridica(nome, cnpj, email, endereco, telefone, funcionarios);	
			}else if (n == 0) {
				return;
			}
			else {
				erroShow();
				return;
			}
		}catch(NumberFormatException e) {
			erroShow();
			return;
		}
		
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
