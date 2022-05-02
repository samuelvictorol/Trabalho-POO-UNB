package AluguelCarros;

import java.time.Period;
import java.util.Calendar;

public class Periodo {
	
	private Calendar inicio = Calendar.getInstance();
	private Calendar fim = Calendar.getInstance();
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
	
	/*
	public void formataInicioFim(String diaInicio, String diaFim, Calendar inicio, Calendar fim) {
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
		
		//determinando meses
		switch (mesI) {
		case 1:
			inicio.set(Calendar.MONTH, Calendar.JANUARY);
			break;
		case 2:
			inicio.set(Calendar.MONTH, Calendar.FEBRUARY);
			break;
		case 3:
			inicio.set(Calendar.MONTH, Calendar.MARCH);
			break;
		case 4:
			inicio.set(Calendar.MONTH, Calendar.APRIL);
			break;
		case 5:
			inicio.set(Calendar.MONTH, Calendar.MAY);
			break;
		case 6:
			inicio.set(Calendar.MONTH, Calendar.JUNE);
			break;
		case 7:
			inicio.set(Calendar.MONTH, Calendar.JULY);
			break;
		case 8:
			inicio.set(Calendar.MONTH, Calendar.AUGUST);
			break;
		case 9:
			inicio.set(Calendar.MONTH, Calendar.SEPTEMBER);
			break;
		case 10:
			inicio.set(Calendar.MONTH, Calendar.OCTOBER);
			break;
		case 11:
			inicio.set(Calendar.MONTH, Calendar.NOVEMBER);
			break;
		case 12:
			inicio.set(Calendar.MONTH, Calendar.DECEMBER);
			break;
		}
		
		switch (mesF) {
		case 1:
			fim.set(Calendar.MONTH, Calendar.JANUARY);
			break;
		case 2:
			fim.set(Calendar.MONTH, Calendar.FEBRUARY);
			break;
		case 3:
			fim.set(Calendar.MONTH, Calendar.MARCH);
			break;
		case 4:
			fim.set(Calendar.MONTH, Calendar.APRIL);
			break;
		case 5:
			fim.set(Calendar.MONTH, Calendar.MAY);
			break;
		case 6:
			fim.set(Calendar.MONTH, Calendar.JUNE);
			break;
		case 7:
			fim.set(Calendar.MONTH, Calendar.JULY);
			break;
		case 8:
			fim.set(Calendar.MONTH, Calendar.AUGUST);
			break;
		case 9:
			fim.set(Calendar.MONTH, Calendar.SEPTEMBER);
			break;
		case 10:
			fim.set(Calendar.MONTH, Calendar.OCTOBER);
			break;
		case 11:
			fim.set(Calendar.MONTH, Calendar.NOVEMBER);
			break;
		case 12:
			fim.set(Calendar.MONTH, Calendar.DECEMBER);
			break;
		}
		
		//criando datas
		inicio.set(Calendar.DAY_OF_MONTH, diaI);
		inicio.set(Calendar.YEAR, anoI);
		
		fim.set(Calendar.DAY_OF_MONTH, diaF);
		fim.set(Calendar.YEAR, anoF);
		
		//calculando período
		Period diarias = Period.between(inicio, fim);
	}*/
	
	public String formataData(String diaInicio, String diaFim, String horaInicio, String horaFim) {
		data = ("\nIníco: " + diaInicio + " - " + horaInicio + "\nFim " + diaFim + " - " + horaFim
				+ "\nDiárias calculadas: " /*+ diarias*/);
		return data;
	}

}
