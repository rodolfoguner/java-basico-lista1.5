package br.fai.ex05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		String palavra;
		String frase[];
		int tamFrase;
		Scanner scannner = new Scanner(System.in);
		
		System.out.print("Digite uma palavra ou uma frase: ");
		palavra = scannner.nextLine();
		
		frase = palavra.trim().split(" ");
		tamFrase = frase.length;
		
		if (tamFrase == 1 && frase[0].equals("")) {
			System.out.println("Nada foi digitado.");
		} else if (tamFrase == 1){
			System.out.println("Penultima palavra: " + frase[tamFrase - 1]);
		} else {
			System.out.println("Penultima palavra: " + frase[tamFrase - 2]);
		}
		
		if (tamFrase > 4) {
			System.out.println("Texto muito longo.");
		}
	}
	
}
