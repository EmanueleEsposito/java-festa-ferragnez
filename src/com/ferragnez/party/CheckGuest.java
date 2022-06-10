package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// Creazione e inizializzazione array contennte nome degli invitati.
		String[] nomiDegliInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
				"Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
		for (int i = 0; i < nomiDegliInvitati.length; i++) {
			System.out.println(nomiDegliInvitati[i]);
		}

		// Richesta del nome dell'utente e verifica della presenza del nome nell'array
		Scanner scan = new Scanner(System.in);
		String nomeUtente;
		System.out.println("Scrivi il tuo nome: ");
		nomeUtente = scan.nextLine();

		boolean trovato = false;
		for (int i = 0; i < nomiDegliInvitati.length; i++) {
			if (nomiDegliInvitati[i].equalsIgnoreCase(nomeUtente)) {
				System.out.println("Puoi Entrare alla festa");
				trovato = true;
			}

		}
		if (!trovato) {
			System.out.println("Non puoi entrare alla festa");
		}

		scan.close();

	}

}
