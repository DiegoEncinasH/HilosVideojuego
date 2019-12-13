package Videojuego;

import Personajes.Personaje;

public abstract class Monster {

	
	private int vida;
	private String nombre;
	private int da�o;

	public int getDa�o() {
		return da�o;
	}

	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}

	public abstract void atacar(Personaje p);

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
