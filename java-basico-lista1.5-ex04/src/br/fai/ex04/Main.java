package br.fai.ex04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		String palavraDigitada;
		int numeroConvertido;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("String: ");
		palavraDigitada = scanner.nextLine();
		
		numeroConvertido = Integer.parseInt(palavraDigitada);
		
		System.out.printf("Int: %d", numeroConvertido);
		
	}	
}
