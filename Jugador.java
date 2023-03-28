package tr3;

public class Jugador {
	private boolean IA;
	private String nombre;
	private char ficha;

	public Jugador(String nombre) {

		this.nombre = nombre;

	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void mostrarArrayJugadores(Jugador[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public String toString() {
		return "El jugador se llama " + this.nombre + " y jugara con " + this.ficha + ".";
	}

	public static void main(String[] args) {
		Jugador jugador1 = new Jugador("Isa");
		Jugador jugador2 = new Jugador("Dorotea");

		Jugador[] arrayJugadores = { jugador1, jugador2 };
		mostrarArrayJugadores(arrayJugadores);

	}
}
