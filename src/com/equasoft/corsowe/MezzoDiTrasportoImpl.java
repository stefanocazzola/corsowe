package com.equasoft.corsowe;

public abstract class MezzoDiTrasportoImpl implements MezzoDiTrasporto {

	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String pippo(String s, int i) {
		return s + " " + i;
	}

}
