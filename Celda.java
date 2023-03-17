package tr3;

import java.util.HashMap;

public class Celda {
 private int valor;
 private HashMap<Character, Integer>posicion; //Hacer un array de posicion para meter el array posicion en el hashmap en vez de integer
 private boolean ocupada;
 
 public Celda() {
	this.posicion = new HashMap<Character, Integer>();
}

public Celda(int valor,HashMap<Character, Integer>posicion, boolean ocupada) {
	this.valor = valor;
	this.posicion = posicion;
	this.ocupada = ocupada;
}

public int getValor() {
	return valor;
}

public void setValor(int valor) {
	this.valor = valor;
}

public HashMap<Character, Integer> getPosicion() {
	return posicion;
}

public void setPosicion(HashMap<Character, Integer> posicion) {
	this.posicion = posicion;
}

public boolean isOcupada() {
	return ocupada;
}

public void setOcupada(boolean ocupada) {
	this.ocupada = ocupada;
}

@Override
public String toString() {
	return "La celda tiene un valor de " + this.valor + ", se encuentra en la posicion "  + this.posicion + " y esta ocupada:" + this.ocupada ;
}
 
 
}
