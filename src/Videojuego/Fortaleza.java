package Videojuego;

import java.util.concurrent.ThreadLocalRandom;

import Armas.Arco;
import Armas.Espada;
import Armas.Silla;
import Armas.Varita;
import Personajes.Berserker;
import Personajes.Guerrero;
import Personajes.Mago;
import Personajes.Personaje;
import Personajes.Titan;

public class Fortaleza {

	private Monster dragon;
	private AreadeCombate area;

	public Fortaleza(Monster dragon) {
		this.dragon = dragon;
	}

	public AreadeCombate getArea() {
		return area;
	}

	public void setArea(AreadeCombate area) {
		this.area = area;
	}

	public Monster getDragon() {
		return dragon;
	}

	public void setDragon(Monster dragon) {
		this.dragon = dragon;
	}

	public void salaDeEspera(Personaje p1) {

		
		try {
			area.entrar(p1, dragon);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
