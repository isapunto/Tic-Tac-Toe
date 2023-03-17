package tr3;

public class Juego {
	private Tablero tablero;
	private Jugador jugador1;
	private Jugador jugador2;
	
 public Juego(Tablero tablero, Jugador jugador1, Jugador jugador2) {
		this.tablero = tablero;
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}

public Tablero getTablero() {
	return tablero;
}

public void setTablero(Tablero tablero) {
	this.tablero = tablero;
}

public Jugador getJugador1() {
	return jugador1;
}

public void setJugador1(Jugador jugador1) {
	this.jugador1 = jugador1;
}

public Jugador getJugador2() {
	return jugador2;
}

public void setJugador2(Jugador jugador2) {
	this.jugador2 = jugador2;
}

@Override
public String toString() {
	return "Comienza el juego con " + this.jugador1 + " y " +this.jugador2 + ". A continuacion el tablero de juego: " + this.tablero;
}
	

}
