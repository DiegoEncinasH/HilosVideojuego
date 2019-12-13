package Armas;

import Personajes.Personaje;
import Videojuego.Monster;

public abstract class Arma {
	private String tipoArma;
	private int da�o;
	private int critico;
	private int fallo;
	int aux;
	
	public int getDa�o() {
		return da�o;
	}

	public void setDa�o(int da�o) {
		this.da�o = da�o;
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