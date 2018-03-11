package br.com.alura;

import java.util.TreeSet;

public class testaTreeSet {

	public static void main(String[] args) {
		
		Recibo rec1 = new Recibo(123, "ValeCard");
		// atribui valores
		Recibo rec2 = new Recibo(321, "TriVale");
		// atribui valores
		Recibo rec3 = new Recibo(213, "ValeTech");
		
		TreeSet<Recibo> livroCaixa = new TreeSet<>();
		
		livroCaixa.add(rec3);
		livroCaixa.add(rec2);
		livroCaixa.add(rec1);
		livroCaixa.add(rec1);
		
		System.out.println(livroCaixa);
		
	}
	

}


