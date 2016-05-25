/*
 * 
 */
package com.equasoft.corsowe;

public class Test1 {

	public static void main(String[] args) {
		MezzoDiTrasportoImpl b = new BiciclettaImpl();
		b.setNome("NOME");
		b.setMarca("pinarello");
		System.out.println(b.pippo("ciao", 1));
	}

}
