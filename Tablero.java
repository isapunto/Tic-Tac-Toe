package tr3;

public class Tablero {
    private Celda[][] matrizTablero;

    public Tablero() {
    	char letra = 'a';
    	for(int i= 0; i<this.matrizTablero.length; i++) {
    		for (int j = 0; j<3; j++) {
    			matrizTablero[i][j] = new Celda(letra, false);
    		}
    	}
    }
    public Tablero(Celda [][] matrizTablero){
      this.matrizTablero = matrizTablero;
    }
    public Celda[][] getMatrizTablero(){
      return this.matrizTablero;
    }
    public void setMatrizTablero(Celda [][] matrizTablero){
      this.matrizTablero = matrizTablero;
    }
    public void fichaEnTablero(Celda ficha, int[] posicion){
      matrizTablero[ posicion[0] ][ posicion[1] ] = ficha;
    }
    

    public String toString(){
      String tablero = "";
      for (int i = 0 ; i < 3 ; i++ ) {
        for (int j = 0 ; j < 3 ; j++ ){
          tablero += " | " +(matrizTablero[i][j]);
        }
        tablero += " |" + "\n";
      }
      return tablero;
    }
    public boolean comprobarFilaColumna(int f, int c) {

    	boolean filaBien = true ;

    	boolean columnaBien = true;

    	char letra = matrizTablero[f][c].getValor();

    	for(int h = 0; h<3;h++) {

    	if(filaBien) {

    	filaBien=letra==matrizTablero[f][h].getValor();

    	}

    	if(columnaBien) {

    	filaBien=letra==matrizTablero[h][c].getValor();

    	}

    	}

    	return filaBien || columnaBien;

    	}

    	public boolean comprobarDiagonal() { //COMPROBAR DIAGONAL CREA UNA COMPARACION DE LAS CELDAS DEL ARRAY DE MANERA DIAGONAL LAS 2 POSIBLES


    	return (matrizTablero[0][2].getValor() == matrizTablero[1][1].getValor()

    	&& matrizTablero[0][2].getValor() == matrizTablero[2][0].getValor())


    	|| (matrizTablero[0][0].getValor() == matrizTablero[1][1].getValor()

    	&& matrizTablero[0][0].getValor() == matrizTablero[2][2].getValor());

    	}


    
    public int[] posicion(char letra) {
    	
    	int [] pos = new int [2];
    	
    	switch (letra) {
	        case 'a':
	        	pos[0]= 0;
	        	pos[1] = 0;
	            break;
	        case 'b':
	        	pos[0]= 0;
	        	pos[1] = 1;
	            break;
	        case 'c':
	            pos[0]= 0;
	        	pos[1] = 2;
	            break;
	        case 'd':
	        	pos[0]= 1;
	        	pos[1] = 0;
	            break;
	        case 'e':
	        	pos[0]= 1;
	        	pos[1] = 1;
	            break;
	        case 'f':
	        	pos[0]= 1;
	        	pos[1] = 2;
	            break;
	        case 'g':
	        	pos[0]= 2;
	        	pos[1] = 0;
	            break;
	        case 'h':
	        	pos[0]= 2;
	        	pos[1] = 1;
	            break;
	        case 'i':
	        	pos[0]= 2;
	        	pos[1] = 2;
	            break;
	        default:
	        	pos[0]= -1;
	        	pos[1] = -1;
        }
    	return pos;
    }

    public static void main(String[] args) {
    	Tablero tablero = new Tablero();
    	System.out.println(tablero);
    }
  }