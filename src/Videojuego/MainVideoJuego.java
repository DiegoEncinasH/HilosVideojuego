package Videojuego;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Armas.Arco;
import Armas.Espada;
import Armas.Silla;
import Armas.Varita;
import Personajes.Berserker;
import Personajes.Guerrero;
import Personajes.Mago;
import Personajes.Personaje;
import Personajes.Titan;

public class MainVideoJuego {

	public static void main(String[] args) {

		Monster dragon;
		dragon = new Dragon();
		dragon.setNombre("El dragon de copa blanca");
		dragon.setVida(3000);
		dragon.setDaño(200);
		AreadeCombate area = new AreadeCombate();

		// cada obrero se encarga de poner ladrillos en una
		// valla, cada obrero cubre una porción de una valla
		Fortaleza f1 = new Fortaleza(dragon);
		f1.setArea(area);
		
		List<Personaje> listaPersonajes = new ArrayList<Personaje>();

		for (int i = 0; i <= 8; i++) {
			System.out.println("hola?");
			int help = 0;
			Personaje p1;
			int aux;
			aux = (int) ((Math.random() * 4) + 1);
			if (aux == 1) {
				p1 = new Berserker();
				p1.setNombre("Vicius");
				p1.setVida(1000);
			} else if (aux == 2) {
				p1 = new Mago();
				p1.setNombre("Lucifer");
				p1.setVida(820);
			} else if (aux == 3) {
				p1 = new Titan();
				p1.setNombre("TITAAN");
				p1.setVida(1420);
			} else {
				p1 = new Guerrero();
				p1.setNombre("Juan el oscuro");
				p1.setVida(1250);
			}
			aux = (int) ((Math.random() * 4) + 1);
			switch (aux) {
			case 1:
				Varita varita = new Varita();
				varita.setDaño(90);
				varita.setCritico(15);
				varita.setFallo(18);
				varita.setTipoArma("Varita");
				if (p1.getClass() == Mago.class) {
					varita.setDaño(190);
					varita.setFallo(10);
					varita.setTipoArma("EL PALITROKE");
				}
				p1.setArma(varita);
				break;
			case 2:
				Espada espada = new Espada();
				espada.setDaño(45);
				espada.setCritico(35);
				espada.setFallo(8);
				espada.setTipoArma("Espada");
				if (p1.getClass() == Guerrero.class) {
					espada.setDaño(150);
					espada.setFallo(3);
					espada.setTipoArma("Excalibur");
				}
				p1.setArma(espada);
				break;
			case 3:
				Silla silla = new Silla();
				silla.setDaño(40);
				silla.setCritico(35);
				silla.setFallo(8);
				silla.setTipoArma("Silla");
				if (p1.getClass() == Titan.class) {
					silla.setDaño(300);
					silla.setFallo(25);
					silla.setTipoArma("Sofa");
				}
				p1.setArma(silla);
				break;
			case 4:
				Arco arco = new Arco();
				arco.setDaño(90);
				arco.setCritico(21);
				arco.setFallo(20);
				arco.setTipoArma("Arco");
				if (p1.getClass() == Berserker.class) {
					arco.setDaño(270);
					arco.setFallo(35);
					arco.setTipoArma("Ballesta");
				}
				p1.setArma(arco);
				break;
			default:
				break;
			}

			p1.setFortaleza(f1);
			listaPersonajes.add(p1);
		}
		


		for(Personaje p1 : listaPersonajes) {
			new Thread(p1).start();
		}
		
		
//		Thread t2 = new Thread(hr2);
//		Thread t3 = new Thread(hr3);
//		Thread t4 = new Thread(hr4);
//		
//		t1.setName("Hilo Runnable 1");
//		t2.setName("Hilo Runnable 2");
//		t3.setName("Hilo Runnable 3");
//		t4.setName("Hilo Runnable 4");
//			

//		List<Personaje> listaPersonajes = new ArrayList<Personaje>();
		// crear 10 personajes
//		for(int i = 1;i <)9;i++){
//			listaPersonajes.add(arg0)
//		}
//		p1 = new Personaje();
//		p1.setFortaleza(fortaleza);
//		Thread t1 = new Thread(p1);

//			t1.start();
//			System.out.println("HILO: " + t1.getName());
//			try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//			t2.start();
//			System.out.println("HILO: " + t2.getName());
//			t3.start();
//			System.out.println("HILO: " + t3.getName());
//			t4.start();
//			System.out.println("HILO: " + t4.getName());
//			t5.start();
//			System.out.println("HILO: " + t5.getName());
//			t6.start();
//			System.out.println("HILO: " + t6.getName());
//			t7.start();
//			System.out.println("HILO: " + t7.getName());
//			t8.start();
//			System.out.println("HILO: " + t8.getName());
//			t9.start();
//			System.out.println("HILO: " + t9.getName());
//		Guerrero g1 = new Guerrero();
//		g1.setNombre("Juan el oscuro");
//		g1.setVida(300);
//		Espada e1 = new Espada();
//		e1.setDaño(30);
//		e1.setTipoArma("Espada Corta");
//		g1.setArma(e1);
////		
//		Mago mago = new Mago();
//		mago.setNombre("Lucifer");
//		mago.setVida(150);
//		Varita varita = new Varita();
//		varita.setDaño(90);
//		varita.setTipoArma("palo de sauco");
//		mago.setArma(varita);
//		
//		int aux;
//		aux = (int) ((Math.random() * 4) + 1);
//		if (aux == 1) {
//			p1 = new Berserker();
//			p1.setNombre("Vicius");
//			p1.setVida(1000);
//		} else if (aux == 2) {
//			p1 = new Mago();
//			p1.setNombre("Lucifer");
//			p1.setVida(820);
//		}else if (aux == 3) {
//			p1 = new Titan();
//			p1.setNombre("TITAAN");
//			p1.setVida(1420);
//		}else {
//			p1 = new Guerrero();
//			p1.setNombre("Juan el oscuro");
//			p1.setVida(1250);
//		}
//		
//		
//		int help = aux;
//		while (aux == help) {
//			aux = (int) ((Math.random() * 3) + 1);
//		}
//		if (aux == 1) {
//			p2 = new Berserker();
//			p2.setNombre("Vicius");
//			p2.setVida(1000);
//		} else if (aux == 2) {
//			p2 = new Mago();
//			p2.setNombre("Lucifer");
//			p2.setVida(820);
//		} else {
//			p2 = new Guerrero();
//			p2.setNombre("Juan el oscuro");
//			p2.setVida(1250);
//		}
//
//		aux = (int) ((Math.random() * 3) + 1);
//		switch (aux) {
//		case 1:
//			Varita varita = new Varita();
//			varita.setDaño(90);
//			varita.setCritico(15);
//			varita.setFallo(15);
//			varita.setTipoArma("Varita");
//			if (p1.getClass() == Mago.class) {
//				varita.setDaño(120);
//				varita.setFallo(10);
//				varita.setTipoArma("EL PALITROKE");
//			}
//			p1.setArma(varita);
//			break;
//		case 2:
//			Espada espada = new Espada();
//			espada.setDaño(40);
//			espada.setCritico(35);
//			espada.setFallo(8);
//			espada.setTipoArma("Espada");
//			if (p1.getClass() == Guerrero.class) {
//				espada.setDaño(60);
//				espada.setFallo(3);
//				espada.setTipoArma("Scalibur");
//			}
//			p1.setArma(espada);
//			break;
//		case 3:
//			Arco arco = new Arco();
//			arco.setDaño(70);
//			arco.setCritico(20);
//			arco.setFallo(23);
//			arco.setTipoArma("Arco");
//			if (p1.getClass() == Berserker.class) {
//				arco.setDaño(140);
//				arco.setFallo(40);
//				arco.setTipoArma("Ballesta");
//			}
//			p1.setArma(arco);
//			break;
//		default:
//			break;
//		}
//		help = aux;
//		while (aux == help) {
//			aux = (int) ((Math.random() * 3) + 1);
//		}
//		switch (aux) {
//		case 1:
//			Varita varita = new Varita();
//			varita.setDaño(90);
//			varita.setCritico(15);
//			varita.setFallo(15);
//			varita.setTipoArma("Palillo");
//			if (p2.getClass() == Mago.class) {
//				varita.setDaño(120);
//				varita.setFallo(10);
//				varita.setTipoArma("EL PALITROKE");
//			}
//			p2.setArma(varita);
//			break;
//		case 2:
//			Espada espada = new Espada();
//			espada.setDaño(40);
//			espada.setCritico(35);
//			espada.setFallo(8);
//			espada.setTipoArma("Espada Corta");
//			if (p2.getClass() == Guerrero.class) {
//				espada.setDaño(60);
//				espada.setFallo(3);
//				espada.setTipoArma("Scalibur");
//			}
//			p2.setArma(espada);
//			break;
//		case 3:
//			Arco arco = new Arco();
//			arco.setDaño(70);
//			arco.setCritico(25);
//			arco.setFallo(23);
//			arco.setTipoArma("Arco");
//			if (p2.getClass() == Berserker.class) {
//				arco.setDaño(140);
//				arco.setFallo(40);
//				arco.setTipoArma("Ballesta");
//			}
//			p2.setArma(arco);
//			break;
//		default:
//			break;
//		}
//		System.out.println(
//				"DIN DIN DIN LA BATALLA VA A EMPEZAR, SE ENFRANTARÁN:\n" + p1.getNombre() +   " Con su inugualable "
//						+ p1.getArma().getTipoArma() + "\nContra " + p2.getNombre() + " Con su certeza con " + p2.getArma().getTipoArma());
//		while (p1.getVida()>0 && p2.getVida()>0) {
//			p1.atacar(p2);
//			if (p2.getVida()<0) {
//				System.out.println(p1.getNombre() + " Ha salido vencedorrr a caido " + p2.getNombre());
//			help=21;
//			}else {
//				System.out.println(p2.getNombre() + "me quedan: " + p2.getVida());
//			}
//			
//			if (help!=21) {
//			p2.atacar(p1);
//			if (p1.getVida()<0) {
//				System.out.println(p2.getNombre() + " Ha salido vencedorrr a caido " + p1.getNombre());
//			}else {
//				System.out.println(p1.getNombre() + " me quedan: " + p1.getVida());
//			}
//			}
//		}
//		
//
//		
//		
//		int aux;
//		Guerrero g1 = new Guerrero();
//		Mago m1 = new Mago();
//		Berserker b1 = new Berserker();
//		Arco arco = new Arco();
//		Varita varita = new Varita();
//		Espada espada = new Espada();
//		
//		espada.setTipoArma("El filo del mal");
//		varita.setTipoArma("El conjuro oscuro");
//		arco.setTipoArma("La flecha infinita");
//		
//		aux = (int)((Math.random()*3)+1);
//		if (aux==3) {
//			p1 = new Guerrero();
//			p1.setRol("Guerrero");
//		}else if(aux==2) {
//			p1.setRol("Berserker");
//		}else {
//			p1.setRol("Magoo");
//		}
//		aux = (int)((Math.random()*3)+1);
//		if (aux==3) {
//			p2.setRol("Guerrero");
//		}else if(aux==2) {
//			p2.setRol("Berserker");
//		}else {
//			p2.setRol("Magoo");
//		}
//		
//	//2	p1.setArma(espada);
//		g1.atacar();
//		
//	}

	}
}