package Videojuego;

import Personajes.Personaje;

public abstract class Monster {

	
	private int vida;
	private String nombre;
	private int daño;

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
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
