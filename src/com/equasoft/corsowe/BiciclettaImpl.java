package com.equasoft.corsowe;

public class BiciclettaImpl extends MezzoDiTrasportoImpl {
	
	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String pippo(String x, int i) {
		return super.pippo(x, i) + " " + getNome() + getMarca();
	}

}
