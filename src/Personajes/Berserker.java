package Personajes;

import Videojuego.Monster;

public class Berserker extends Personaje{

	@Override
	public void atacar(Monster dragon) {
		System.out.println("BERSERKER ATACANDO...");
			getArma().usar(dragon);	
		
		
	}


}