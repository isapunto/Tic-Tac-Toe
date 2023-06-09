package tresraya;

import java.util.Scanner;

public class main3Raya {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tablero tablero = new Tablero();
		Jugador jugador1 = new Jugador("Jugador1");
		Jugador jugador2 = new Jugador("Jugador2");
		Juego juego = new Juego(tablero, jugador1, jugador2);
		int[] posicion = new int[2];
		char letraMetida;
		String nombreJugador, ganador = "";
		int turno = 1;

		// Empieza el juego

		System.out.println("Bienvenido al juego 3 en raya!");
		System.out.println("Jugador 1, introduce tu nombre: ");
		nombreJugador = sc.nextLine();
		jugador1.setNombre(nombreJugador);
		System.out.println("Jugador 2, introduce tu nombre: ");
		nombreJugador = sc.nextLine();
		jugador2.setNombre(nombreJugador);
		System.out.println("Jugador 1: " + jugador1.getNombre() + " X");
		System.out.println("Jugador 2: " + jugador2.getNombre() + " O");

		while (!juego.gameOver()) {

			if (turno == 1) {

				System.out.println(jugador1.getNombre() + ", es tu turno.");
				System.out.println(tablero.toString());
				System.out.println("Por favor, introduce la letra donde quieres poner tu ficha: ");
				letraMetida = sc.next().charAt(0);
				posicion = tablero.posicion(letraMetida); // Me devuelve la posición en la que quiero meter la ficha.
				if (!tablero.celdaOcupada(posicion)) {
					char ficha = 'X';
					tablero.fichaEnTablero(ficha, posicion);
				}
				System.out.println(tablero.toString());

				if (juego.gameOver())
					ganador = jugador1.getNombre(); // si juego es gameOver el ganador por defecto es el jugador1, es
													// para

				turno = 2;
			} else {

				System.out.println(jugador2.getNombre() + ", es tu turno.");
				System.out.println(tablero.toString());
				System.out.println("Por favor, introduce la letra donde quieres poner tu ficha: ");
				letraMetida = sc.next().charAt(0);
				posicion = tablero.posicion(letraMetida); // Me devuelve la posición en la que quiero meter la ficha.
				if (!tablero.celdaOcupada(posicion)) {
					char ficha = 'O';
					tablero.fichaEnTablero(ficha, posicion);
				}
				System.out.println(tablero.toString());

				if (juego.gameOver() && ganador == "")
					ganador = jugador2.getNombre();// si el juego es game over y un jugador sin asignar, gana jugador 2
				turno = 1;
			}
		}

		if (juego.empate()) {
			System.out.println("¡El juego ha terminado en empate!");
		} else {
			System.out.println("¡" + ganador + " ha ganado el juego!");
		}
	}
}
