package clasesCarta;

import java.util.ArrayList;
import java.util.Collections;

import excepciones.NoHayMasCartasException;

public class Mazo {
	protected ArrayList <Carta>cartas ; // protegida
	
	
	public Mazo () {
		this.cartas= new ArrayList<Carta>();//imicializo la variable.  Importar la librería porque da error
		for(Palo p: Palo.values()) {
			for (int i=1; i<14; i++) {
				Carta nueva= new Carta(i,p);//no syso, no muestro, instancio y llamo al constructor de carta 
				this.cartas.add(nueva);
			}
		}
	
	}
	public void barajar () {
		Collections.shuffle(cartas);	
	}
	@Override
	public String toString() {
		String res="";
		for (Carta c:cartas) {
			res=res+"\n"+c;	//en esta clase  no hace falta el toString porque al llamar a + invoca a toString
			//res=res+carta.toString()+ "\n;
		}
		return res;
		
	}
		
	public Carta solicitaCarta() throws NoHayMasCartasException {
		//ahora hago una excepción
		if (this.cartas.size()==0) {//estre trozo significa si hay cartas
			throw new NoHayMasCartasException();
		}
		Carta seleccionada= cartas.get(0);
		this.cartas.remove(0);//tamibién podemos poner aquí (carta) //
		return seleccionada;
		
	}
}
