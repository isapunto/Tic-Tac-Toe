package tresraya;

public class Juego {
	private Tablero tablero;
	private Jugador jugador1;
	private Jugador jugador2;
	boolean turno = false;
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

	public void mostrarTurnoActual() {

		if (turno) {
			System.out.println("Le toca a " + jugador1.getNombre());
		} else {
			System.out.println("Le toca a " + jugador2.getNombre());
		}

	}
	public void cambiaTurno() {
		this.turno = !this.turno;

	}
	public boolean gameOver() {
		
		return tablero.comprobarFila()||tablero.comprobarColumna()||tablero.comprobarDiagonal()||tablero.lleno();
	}
	public boolean empate() {
		return tablero.lleno();
	}
	public String ganador() {
		String resultado = "Ha ganado " + jugador1.getNombre() + "!!";
		if (!turno) {
			resultado = "Ha ganado " + jugador2.getNombre() + "!!";
		}
		return resultado;
	}
	@Override
	public String toString() {
		return "Comienza el juego con " + this.jugador1 + " y " + this.jugador2
				+ ". A continuacion el tablero de juego: " + this.tablero;
	}
}
