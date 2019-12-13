package Armas;

import Personajes.Personaje;
import Videojuego.Monster;

public abstract class Arma {
	private String tipoArma;
	private int daño;
	private int critico;
	private int fallo;
	int aux;
	
	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}
	
	

	public int getCritico() {
		return critico;
	}

	public void setCritico(int critico) {
		this.critico = critico;
	}

	public int getFallo() {
		return fallo;
	}

	public void setFallo(int fallo) {
		this.fallo = fallo;
	}

	public String getTipoArma() {
		return tipoArma;
	}

	public void setTipoArma(String tipoArma) {
		this.tipoArma = tipoArma;
	}

	public abstract void usar(Monster dragon);
}