package br.com.gerenciador.servelet;

import java.util.Date;

public class Empresa {
	
	
	private int id;
	private String Nome;
	private Date dataAbertura = new Date();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}

}
