package Personajes;

import Armas.Arma;
import Videojuego.Fortaleza;
import Videojuego.Monster;

public abstract class Personaje implements Runnable{
	private int vida;
	private Arma arma;
	private String nombre;
	private Fortaleza fortaleza;

	public abstract void atacar(Monster monstruo);

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public Fortaleza getFortaleza() {
		return fortaleza;
	}

	public void setFortaleza(Fortaleza fortaleza) {
		this.fortaleza = fortaleza;
	}

	@Override
	public void run() {
		fortaleza.salaDeEspera(this);
		
	}

	
	
}