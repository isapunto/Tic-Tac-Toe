package tr3;


public class Jugador {
  private boolean IA;
  private String nombre;
  private char ficha;

  public Jugador(){
	this.IA = false;
    this.nombre = "nombre";
    this.ficha = 'X';
  }
  public Jugador(boolean IA, String nombre, char ficha){
	this.IA = IA;
    this.nombre = nombre;
    this.ficha = ficha;
  }
  public String getNombre(){
    return this.nombre;
  }
  public char getFicha(){
    return this.ficha;
  }
  public boolean getIA() {
	  return this.IA;
  }
  
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public void setFicha(char ficha){
    this.ficha = ficha;
  }
  public void setIA(boolean IA) {
	  this.IA = IA;
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
    Jugador jugador1 = new Jugador(false,"Isa",'X');
    Jugador jugador2 = new Jugador(false,"Dorotea", 'O');

    Jugador[] arrayJugadores = {jugador1,jugador2};
    mostrarArrayJugadores(arrayJugadores);

  }
}
