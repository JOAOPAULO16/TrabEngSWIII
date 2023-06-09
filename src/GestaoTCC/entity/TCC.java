package GestaoTCC.entity;

import java.util.Date;

public class TCC {
	
	private Date data;
	private GrupoAluno grupo;
	private String titulo;
	private String codigo;
	private double nota;
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public GrupoAluno getGrupo() {
		return grupo;
	}
	
	public void setGrupo(GrupoAluno grupo) {
		this.grupo = grupo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
}
