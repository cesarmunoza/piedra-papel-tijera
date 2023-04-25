package com.practica.juego;

import java.util.Scanner;

public class juego {	
	private static String eleccion1;
	private static String eleccion2;

	public static void main(String[] args) {
		jugar();
	}

	public static void jugar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Empieza el juego!!!");
		System.out.println("****************************************************");
		System.out.printf("%s%n", "Jugador uno elija piedra papel o tijera: ");
		eleccion1 = entrada.next();

		System.out.printf("%s%n", "Jugador dos elija piedra papel o tijera: ");
		eleccion2 = entrada.next();

		entrada.close();

		String decision = null;

		if (eleccion1.equals("piedra") && eleccion2.equals("piedra")
				|| eleccion1.equals("papel") && eleccion2.equals("papel")
				|| eleccion1.equals("tijera") && eleccion2.equals("tijera")) {
			decision = "empate";
		} else if (eleccion1.equals("piedra") && eleccion2.equals("papel")
				|| eleccion1.equals("papel") && eleccion2.equals("tijera")
				|| eleccion1.equals("tijera") && eleccion2.equals("piedra")) {
			decision = "gana2";
		} else if (eleccion1.equals("piedra") && eleccion2.equals("tijera")
				|| eleccion1.equals("papel") && eleccion2.equals("piedra")
				|| eleccion1.equals("tijera") && eleccion2.equals("papel")) {
			decision = "gana1";
		}

		switch (decision) {
		case "empate":
			System.out.println("Hicieron la misma elección, es un empate!!!");
			break;
		case "gana2":
			System.out.println("El jugador 2 ganó!!!");
			break;
		case "gana1":
			System.out.println("El jugador 1 ganó!!!");
			break;
		}
	}
}