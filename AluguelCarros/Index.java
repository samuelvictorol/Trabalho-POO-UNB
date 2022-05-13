package AluguelCarros;

public class Index{
    public static void main(String[] args){
    	//Index apenas inicia o Programa e roda em loop
    	Boolean app = true;
        ProgramaLocadora iniciar = new ProgramaLocadora();
      
        do{
            iniciar.start();             
            }while(app); 
    }    	
}   
