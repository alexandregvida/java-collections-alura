package br.com.alura;

public class Recibo implements Comparable<Recibo>{
	int codBarras;
	String razaoSocial;
	
	
	public Recibo(int codBarras, String razaoSocial) {
		super();
		this.codBarras = codBarras;
		this.razaoSocial = razaoSocial;
		
	}


	@Override
	public String toString() {
		return "Recibo [codBarras=" + codBarras + ", razaoSocial=" + razaoSocial + "]";
	}

	
	public int compareTo(Recibo outroRecibo) {
		if(outroRecibo.codBarras > codBarras){
			return -1;
		}else if(outroRecibo.codBarras < codBarras){
			return 1;
		}else{
			return 0;
		}
	}

}
