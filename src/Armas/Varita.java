package Armas;

import Personajes.Personaje;
import Videojuego.Monster;

public class Varita extends Arma {
	public void usar(Monster dragon) {
		aux = (int) ((Math.random() * 100) + 1);
		if (aux > getFallo()) {
			aux = (int) ((Math.random() * 100) + 1);
			if (aux > getCritico()) {
				dragon.setVida(dragon.getVida() - getDa�o());	
			}else {
				dragon.setVida(dragon.getVida() - (getDa�o()*2));	
				System.out.println("crit");
			}
		}else {
			System.out.println("La "+ getTipoArma()  + " se no estaba bien calibrada!!");
		}
		
	}
	}