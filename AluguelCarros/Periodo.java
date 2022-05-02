package AluguelCarros;

public class Periodo {
	
	private String diaInicio, diaFim;
	private String horaInicio, horaFim;
	private String data;
	private int diarias;
	
	public Periodo() {
		
	}

	public String getDiaInicio() {
		return diaInicio;
	}

	public void setDiaInicio(String diaInicio) {
		this.diaInicio = diaInicio;
	}

	public String getDiaFim() {
		return diaFim;
	}

	public void setDiaFim(String diaFim) {
		this.diaFim = diaFim;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}
	
	public int calculaDiarias(String diaInicio, String diaFim) {
		//separando dia/mês/ano
		String dInicio[] = diaInicio.split("/");
		String dFim[] = diaFim.split("/");
		
		//transformando em int
		int diaI = Integer.parseInt(dInicio[0]);
		int mesI = Integer.parseInt(dInicio[1]);
		int anoI = Integer.parseInt(dInicio[2]);
		
		int diaF = Integer.parseInt(dFim[0]);
		int mesF = Integer.parseInt(dFim[1]);
		int anoF = Integer.parseInt(dFim[2]);
		
		//calculando diárias
		if (anoF > anoI) {
			int meses = mesF + (12 - mesI);
			diarias = (30 * meses) - ((30 - diaI) + (30 - diaF));
		} else {
			if (mesF > mesI) {
				int meses = mesF - mesI;
				diarias = (30 * meses) - ((30 - diaI) + (30 - diaF));
			} else {
				diarias = diaF - diaI;
			}
		}
		
		return diarias;		
	}
	
	public String formataData(String diaInicio, String diaFim, String horaInicio, String horaFim) {
		data = ("\nIníco: " + diaInicio + " - " + horaInicio + "\nFim " + diaFim + " - " + horaFim
				+ "\nDiárias calculadas: " + diarias);
		return data;
	}

}
