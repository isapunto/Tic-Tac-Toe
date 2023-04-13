package tresraya;

public class Tablero {
	Celda[][] matrizTablero = new Celda[3][3];

	public Tablero() {
		int letra = 97;
		for (int i = 0; i < this.matrizTablero.length; i++) {
			for (int j = 0; j < 3; j++) {
				matrizTablero[i][j] = new Celda((char) letra++, false);
			}
		}
	}
	public Tablero(Celda[][] matrizTablero) {
		this.matrizTablero = matrizTablero;
	}
	public Celda[][] getMatrizTablero() {
		return this.matrizTablero;
	}
	public void setMatrizTablero(Celda[][] matrizTablero) {
		this.matrizTablero = matrizTablero;
	}
	public void fichaEnTablero(char ficha, int[] posicion) {
		matrizTablero[posicion[0]][posicion[1]].setValor(ficha);
		matrizTablero[posicion[0]][posicion[1]].setOcupada(true);
	}
	public boolean celdaOcupada(int[] posicion) {
		return matrizTablero[posicion[0]][posicion[1]].isOcupada();
	}
	public boolean comprobarFila() {
		
		
		/*return (matrizTablero[0][0].getValor() == matrizTablero[0][1].getValor()
				&& matrizTablero[0][0].getValor() == matrizTablero[0][2].getValor())
				|| (matrizTablero[1][0].getValor() == matrizTablero[1][1].getValor()
						&& matrizTablero[1][0].getValor() == matrizTablero[1][2].getValor())
						|| (matrizTablero[2][0].getValor() == matrizTablero[2][1].getValor()
								&& matrizTablero[2][0].getValor() == matrizTablero[2][2].getValor()); */
		boolean filaBien, encontrado = false;
		char simbolo = 0;
		for (int i = 0; i < 3 && !encontrado; i++) { // Fila
			filaBien = true;
			for (int j = 0; j < 3 && filaBien; j++) { // Columna
				filaBien = (simbolo == matrizTablero[i][j].getValor());
			}
			encontrado = filaBien;
		}
		return encontrado;
	}
	
	public boolean comprobarColumna() {
		
		/*return (matrizTablero[0][0].getValor() == matrizTablero[1][0].getValor()
				&& matrizTablero[0][0].getValor() == matrizTablero[2][0].getValor())
				|| (matrizTablero[0][1].getValor() == matrizTablero[1][1].getValor()
						&& matrizTablero[0][1].getValor() == matrizTablero[2][1].getValor())
						|| (matrizTablero[0][2].getValor() == matrizTablero[1][2].getValor()
								&& matrizTablero[0][2].getValor() == matrizTablero[2][2].getValor());*/
		boolean culumnaBien, encontrado = false;
		char simbolo = 0;
		for (int i = 0; i < 3 && !encontrado; i++) { // Fila
			culumnaBien = true;
			for (int j = 0; j < 3 && culumnaBien; j++) { // Columna
				culumnaBien = (simbolo == matrizTablero[j][i].getValor());
			}
			encontrado = culumnaBien;
		}
		return encontrado;
	}
	public boolean comprobarDiagonal() {
		
		return (matrizTablero[0][2].getValor() == matrizTablero[1][1].getValor()
				&& matrizTablero[0][2].getValor() == matrizTablero[2][0].getValor())
				|| (matrizTablero[0][0].getValor() == matrizTablero[1][1].getValor()
						&& matrizTablero[0][0].getValor() == matrizTablero[2][2].getValor());

	}
	public boolean lleno() {
	
		boolean ocupada = true;
		for (int i = 0; i < 3 && ocupada; i++) { // Fila
			for (int j = 0; j < 3 && ocupada; j++) { // Columna
				ocupada = matrizTablero[i][j].isOcupada();
				
			}
	  }
		return ocupada;
	}
	public int[] posicion(char letra) {
		int[] pos = new int[2];
		switch (letra) {
		case 'a':
			pos[0] = 0;
			pos[1] = 0;
			break;
		case 'b':
			pos[0] = 0;
			pos[1] = 1;
			break;
		case 'c':
			pos[0] = 0;
			pos[1] = 2;
			break;
		case 'd':
			pos[0] = 1;
			pos[1] = 0;
			break;
		case 'e':
			pos[0] = 1;
			pos[1] = 1;
			break;
		case 'f':
			pos[0] = 1;
			pos[1] = 2;
			break;
		case 'g':
			pos[0] = 2;
			pos[1] = 0;
			break;
		case 'h':
			pos[0] = 2;
			pos[1] = 1;
			break;
		case 'i':
			pos[0] = 2;
			pos[1] = 2;
			break;
		default:
			pos[0] = -1;
			pos[1] = -1;
		}
		return pos;
	}
	public String toString() {
		String tablero = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tablero += " | " + (matrizTablero[i][j]);
			}
			tablero += " |" + "\n";
		}
		return tablero;
	}
	public static void main(String[] args) {
		Tablero tablero = new Tablero();
		System.out.println(tablero);
	}
}
