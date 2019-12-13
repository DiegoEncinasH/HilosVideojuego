package Personajes;

import Videojuego.Monster;

public class Guerrero extends Personaje{

	@Override
	public void atacar(Monster dragon) {
		System.out.println("GUERRERO ATACANDO...");
			getArma().usar(dragon);	
	}


}