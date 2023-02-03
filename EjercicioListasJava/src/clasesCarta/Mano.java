package clasesCarta;

import java.util.ArrayList;

import excepciones.NoHayMasCartasException;

public class Mano extends Mazo {

//constructor	
	public Mano() {
		this.cartas= new ArrayList<Carta>() ;
////
//		Método valorMano sin parámetros. Calcula cual es valor que 
//		tenemos en la mano de cartas. Para hacerlo recorreremos la lista de 
//		cartas sumando los puntos de cada una.
		
		}
//		
		public int valorMano() {
			int puntos = 0;
			for (Carta c:cartas) {
				puntos = puntos+c.getValor();
			}
		return puntos;
		
	}

		public boolean finDeJuego() {
			if (valorMano()>=21) {
				return true;
				
			}else {
				return false;
			}
		}
		public String toString() {
			String res= "Valor de la Mano: "+this.valorMano()+"\n";
					
					return res;
		}
		
		public void pedirCarta(Mazo m)throws NoHayMasCartasException{
			Carta c= m.solicitaCarta();
			this.cartas.add(c);
		}
		
}
