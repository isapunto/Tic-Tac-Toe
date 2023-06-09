package tresraya;

public class Celda {
	private char valor;
	private boolean ocupada;

	public Celda(char valor, boolean ocupada) {
		this.valor = valor;
		this.ocupada = ocupada;
	}
	public char getValor() {
		return valor;
	}
	public void setValor(char valor) {
		this.valor = valor;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	@Override
	public String toString() {
		return "" + this.valor;
	}
}
