package AluguelCarros;

public class Periodo {
	
	private String diaInicio, diaFim;
	private String horaInicio, horaFim;
	private String data;

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
	
	public String formataData(String diaInicio, String diaFim, String horaInicio, String horaFim) {
		data = ("\nDe " + diaInicio + " a partir de " + horaInicio + " até " + diaFim + " às " + horaFim);
		return data;
	}

}
