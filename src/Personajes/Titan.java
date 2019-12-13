package Personajes;

import Videojuego.Monster;

public class Titan extends Personaje{

	@Override
	public void atacar(Monster dragon) {
		System.out.println("TITAN ATACANDO...");
			getArma().usar(dragon);	
		
	}


	


	}