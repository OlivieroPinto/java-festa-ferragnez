package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		boolean invitatoTrovato = false;
		int i = 0;
		int n = 0;
		String utente;
		String[] invitatiFesta = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
				"Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
		System.out.println("Inserisci numero della lista degli invitati:");
		Scanner scan = new Scanner(System.in);
		utente = scan.nextLine();

		// while (i < invitatiFesta.length) {
		// if (utente.equalsIgnoreCase(invitatiFesta[i])) {
		// n = i;
		// invitatoTrovato = true;
		// }
		// i++;
		// }
		for (n = 0; i < invitatiFesta.length; i++) {
			if (utente.equalsIgnoreCase(invitatiFesta[i])) {
				n = i;
				invitatoTrovato = true;
			}

		}
		if (invitatoTrovato) {
			System.out.println("Benvenut* " + invitatiFesta[n] + " alla festa dei Ferragnez");

		} else {
			System.out.println("Mi dispiace " + utente + " Non sei nella lista, sei pregato di andare via");
		}
		scan.close();
	}

}
