package Videojuego;

import Personajes.Personaje;

public class AreadeCombate {
	// si no pusieramos el metodo como sincronizado, podrían
		// entrar todos los obreros a la vez a descansar y entonces
		// estariamos inclumpiendo la regla de que solo un obrero puede
		// sentarse en esta silla a la vez
		public synchronized void entrar(Personaje p1, Monster dragon) {
			int help = 0;
			if (dragon.getVida()>0) {
				System.out.println(
						"DIN DIN DIN  BATALLA , SE ENFRANTARÁN:\n" + p1.getNombre() +   " Con su inugualable "
								+ p1.getArma().getTipoArma() + "\nContra " + dragon.getNombre() + " Que dispone de " + dragon.getVida() + " Puntos de vida");
					
			}else {
				System.out.println("EL DRAGON YA ESTA DERROTADO Y " + p1.getNombre() + " SE RIE DE EL");
			}
			
			while (p1.getVida()>0 && dragon.getVida()>0) {
				p1.atacar(dragon);
				if (dragon.getVida()<0) {
					System.out.println(p1.getNombre() + " Ha salido vencedorrr a caido " + dragon.getNombre());
				help=21;
				}else {
					System.out.println(dragon.getNombre() + "me quedan: " + dragon.getVida());
				}
				
				if (help!=21) {
					dragon.atacar(p1);
				if (p1.getVida()<=0) {
					System.out.println(dragon.getNombre() + " Ha salido vencedorrr a caido " + p1.getNombre());
				}else {
					System.out.println(p1.getNombre() + " me quedan: " + p1.getVida());
				}
				}
			}
		}
	}
