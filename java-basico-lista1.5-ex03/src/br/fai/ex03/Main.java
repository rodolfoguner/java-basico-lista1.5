package br.fai.ex03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		String palavra[] = lerPalavra();
	}
	
	private String[] lerPalavra() {
		String palavra;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma palavra ou frase: ");
		palavra = scanner.nextLine();
		
		return palavra.split("");
	}
}
