package clasesCarta;

public class Carta {
	
	private int numero;
	private Palo palo;
	
	public Carta(int numero,Palo palo) {
		if (numero>0 && numero<14) {
		this.numero = numero;
		this.palo=palo;
		}
	
	}

	public int getNumero() {
	
		return numero;
	}

	public Palo getPalo() {
		return palo;
	}
	
	public int getValor() {//lo he hecho a mano, se puede hacer con un if
		switch (numero) {
		case 1: return 11;
		case 11: return 10;
		case 12: return 10;
		case 13: return 10;
		default: return this.numero;
	
		}
	}
	public String mostrarNumero () {
		
		switch (numero) {
		case 1: return "AS";
		case 11: return "J";
		case 12: return "Q";
		case 13: return "K";
		default: return ""+this.numero;
		}
	}
	public String toString () {
		return "["+mostrarNumero()+ "-"+palo+"]";
	}
}
