package Videojuego;

import Personajes.Personaje;

public class Dragon extends Monster {

	
	@Override
	public void atacar(Personaje p) {
		System.out.println("DRAGON ATACANDO...");
		p.setVida(p.getVida() - (int)(getDaño()+((Math.random() * 220) + 1)));
	}


}
