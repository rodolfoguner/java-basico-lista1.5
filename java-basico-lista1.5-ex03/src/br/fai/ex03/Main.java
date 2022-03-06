package br.fai.ex03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		String palavra[] = lerPalavra();
		int tamPalavra = palavra.length;
		String palavraInvertida = inverterPalavra(palavra, tamPalavra);
		
		System.out.print("Por caractere: ");
		for (String letra: palavraInvertida.split("")) {
			System.out.print(letra);
		}
		
		System.out.println("\nString: " + palavraInvertida);
		
	}
	
	private String[] lerPalavra() {
		String palavra;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma palavra ou frase: ");
		palavra = scanner.nextLine();
		
		return palavra.split("");
	}
	
	private String inverterPalavra(String palavra[], int tam) {
		
		String palavraInvertida = "";
		
		for (int i = tam; i > 0; i--) {
			palavraInvertida += palavra[i - 1];
		}
		
		return palavraInvertida;
	}
}
