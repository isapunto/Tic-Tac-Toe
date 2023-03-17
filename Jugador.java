import java.util.Scanner;

public class Jugador {
  private String nombre;
  private char ficha;

  public Jugador(){
    this.nombre = "nombre";
    this.ficha = 'X';
  }
  public Jugador(String nombre, char ficha){
    this.nombre = nombre;
    this.ficha = ficha;
  }
  public String getNombre(){
    return this.nombre;
  }
  public char getFicha(){
    return this.ficha;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public void setFicha(char ficha){
    this.ficha = ficha;
  }

  public static void mostrarArrayJugadores(Jugador[] array){
    for(int i = 0 ; i < array.length ; i++){
      System.out.println(array[i]);
    }
  }

  public String toString(){
    return "El jugador se llama " + this.nombre + " y jugara con " + this.ficha + ".";
  }
  public static void main(String[] args) {
    Jugador jugador1 = new Jugador("Isa",'X');
    Jugador jugador2 = new Jugador("Dorotea", 'O');

    Jugador[] arrayJugadores = {jugador1,jugador2};
    mostrarArrayJugadores(arrayJugadores);

  }
}
