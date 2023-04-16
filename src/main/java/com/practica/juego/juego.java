package com.practica.juego;

import java.util.Scanner;

public class juego {
	private String piedra;
	private String papel;
	private String tijeras;
	private static String eleccion1;
	private static String eleccion2;
	private static boolean gameover = false;
		
	public static void main(String[] args) {
		jugar();
	}
	
	public static void jugar() {
		Scanner entrada = new Scanner(System.in);
		
		
			System.out.println("Empieza el juego!!!");
			System.out.println("****************************************************");
			System.out.printf("%s%n","Jugador uno elija piedra papel o tijera: ");
			eleccion1 = entrada.next();
					
			System.out.printf("%s%n","Jugador dos elija piedra papel o tijera: ");
			eleccion2 = entrada.next();
			
			if (eleccion1.equals("piedra") && eleccion2.equals("piedra")) {
				System.out.println("Los dos eligieron piedra, es un empate");
				gameover = true;
			}else if (eleccion1.equals("piedra") && eleccion2.equals("papel")) {
				System.out.println("El jugador 2 gana. El papel envuelve a la piedra");
				gameover = true;
			}else if (eleccion1.equals("piedra") && eleccion2.equals("tijera")) {
				System.out.println("El jugador 1 gana. La piedra quiebra la tijera");
				gameover = true;
			}
			
			if (eleccion1.equals("papel") && eleccion2.equals("papel")) {
				System.out.println("Los dos eligieron papel, es un empate");
				gameover = true;
			}else if (eleccion1.equals("papel") && eleccion2.equals("piedra")) {
				System.out.println("El jugador 1 gana. El papel envuelve a la piedra");
				gameover = true;
			}else if (eleccion1.equals("papel") && eleccion2.equals("tijera")) {
				System.out.println("El jugador 2 gana. La tijera corta el papel");
				gameover = true;
			}
			
			if (eleccion1.equals("tijera") && eleccion2.equals("tijera")) {
				System.out.println("Los dos eligieron tijera, es un empate");
				gameover = true;
			}else if (eleccion1.equals("tijera") && eleccion2.equals("papel")) {
				System.out.println("El jugador 1 gana. La tijera corta el papel");
				gameover = true;
			}else if (eleccion1.equals("tijera") && eleccion2.equals("piedra")) {
				System.out.println("El jugador 2 gana. La piedra quiebra la tijera");
				gameover = true;
			}
			
			entrada.close();
		
		
	}

}
