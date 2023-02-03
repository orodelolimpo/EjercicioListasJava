package principal;

import java.util.Scanner;

import clasesCarta.Mano;
import clasesCarta.Mazo;
import excepciones.NoHayMasCartasException;

public class Juego {
	private static Mazo baraja; //main siempre es static si invoco a main tienen que ir private
	
	private static Mano jugador;
	private static Mano banca;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		try {
			inicializaJuego();
			String respuesta ="";
			do {
		System.out.println("Quieres carta (S/N):");
			respuesta = teclado.nextLine();
		
		if (respuesta.equalsIgnoreCase("S")) {
			jugador.pedirCarta(baraja);//la pido
			System.out.println("Tus cartas son: "+jugador);//la muestro
			
		}else if (respuesta.equalsIgnoreCase("N")) {
			System.out.println("Te has plantado con "+jugador);
			
		
		
		}else {
			System.out.println("Debe intoducir S o N ");
		
		}
		//Juego juego = new Juego(); //instancio juego aqui
		//juego.baraja=new Mazo (); //si hago esto no necesito poner static
	} while (!respuesta.equalsIgnoreCase ("n")&& !jugador.finDeJuego());
	
			jugarBanca();
			
		}catch (NoHayMasCartasException e) {
		System.out.println("No hay más cartas en la baraja.\n Fin del JUego");
		System.out.println("Tus cartas son : " +jugador);
		System.out.println("CArtas de la banca: "+banca);
		}
		jugarBanca();
		if (jugador.valorMano()>21) {
			System.out.println("Te has pasado. ");
			if (banca.valorMano()>21) {
				System.out.println("Nadie gana");
			}else {
			System.out.println("Gana la banca! Sigue intentándolo!");
			
		}
		}else{
			if (banca.valorMano()>=21) {
		}
			System.out.println("¡Gana la banca!  Sigue intentándolo!");
		}else {
			
			!jugador.finDeJuego()) {
		}
			System.out.println("¡Has ganado!  Enhorabuena");
			
			
		}else { 
			System.out.println("Nadie gana.");
	
		}
	}

	private static void jugarBanca() throws NoHayMasCartasException{
		// Debe saber la puntuacón del jugador e intentar supararla sin pasarse
		do {
			banca.pedirCarta(baraja);
		}while (!banca.finDeJuego()) || banca.valorMano()<jugador.valorMano());
		System.out.println("La banca ha sacado: "+banca);
		
	}

	private static void inicializaJuego() {

		baraja = new Mazo();
		jugador = new Mano ();
		banca = new Mano ();
		baraja.barajar();
		
		
		}
}
