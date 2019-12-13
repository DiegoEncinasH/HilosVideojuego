package Personajes;

import Videojuego.Monster;

public class Mago extends Personaje{

	@Override
	public void atacar(Monster dragon) {
		System.out.println("MAGO ATACANDO...");
			getArma().usar(dragon);	
	}

	


	}
