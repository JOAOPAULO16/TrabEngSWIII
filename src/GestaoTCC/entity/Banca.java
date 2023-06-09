package GestaoTCC.entity;

import java.util.Date;

public class Banca {
	
	private Professor[] professores = new Professor[4];
	private Date data;
	
	public Professor[] getProfessores() {
		return professores;
	}
	
	public void setProfessores(Professor[] professores) {
		this.professores = professores;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	

}
