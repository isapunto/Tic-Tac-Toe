import java.util.Scanner;

public class Tablero {
    private char [][] matrizTablero = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};

    public Tablero(){}
    public Tablero(char [][] matrizTablero){
      this.matrizTablero = matrizTablero;
    }
    public char[][] getMatrizTablero(){
      return this.matrizTablero;
    }
    public void setMatrizTablero(char [][] matrizTablero){
      this.matrizTablero = matrizTablero;
    }
    public void fichaEnTablero(char ficha, int[] posicion){
      matrizTablero[ posicion[0] ][ posicion[1] ] = ficha;
    }
    /*
    public void mostrarTablero(){
      for (int i = 0 ; i < 3 ; i++ ) {
        for (int j = 0 ; j < 3 ; j++ ){
          System.out.print(matrizTablero[i][j] + " ");
        }
        System.out.println();
      }
    }
    */

    public String toString(){
      String tablero = "";
      for (int i = 0 ; i < 3 ; i++ ) {
        for (int j = 0 ; j < 3 ; j++ ){
          tablero += (matrizTablero[i][j] + " ");
        }
        tablero += "\n";
      }
      return tablero;
    }

    public static void main(String[] args) {
      int [] pos = {0,1}; // b
      Tablero tablero = new Tablero();
      System.out.println(tablero);
      tablero.fichaEnTablero('X', pos);
      System.out.println(tablero);

    }
  }
