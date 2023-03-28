package tr3;
import java.util.Scanner;

public class main3Raya {

	public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              Tablero tablero = new Tablero();
              Jugador jugador1 = new Jugador (false,"Jugador1", 'X');
              Jugador jugador2 = new Jugador (false,"Jugador2", 'X');
              Juego juego = new Juego(tablero, jugador1, jugador2);
              
              System.out.println("Bienvenido al juego 3 en raya!");
              System.out.println("Contra que quieres jugar, contra una persona real o contra la maquina?");
              Jugador contrincante = new Jugador();
              System.out.println("Jugador 1: " + jugador1.getNombre() + " (X)");
              System.out.println("Jugador 2: " + jugador2.getNombre() + " (O)");
              System.out.println(tablero.toString());
              
              while (!juego.gameOver()) {
                  
                  System.out.println(jugador1.getNombre() + ", es tu turno.");
                  System.out.println(tablero.toString());
                  System.out.println("Por favor, introduce la letra donde quieres poner tu ficha: ");
                  char letraMetida = scanner.next().charAt(0);
                 
                  do {
                      
                      System.out.println(tablero.posicion(letraMetida));
                  }while(true); 
              }
              
              if (juego.empate()) {
                  System.out.println("¡El juego ha terminado en empate!");
              } else {
                  System.out.println("¡" + juego.ganador() + " ha ganado el juego!"); //como poner jugador1 o 2?
              }
          }
      }

    

