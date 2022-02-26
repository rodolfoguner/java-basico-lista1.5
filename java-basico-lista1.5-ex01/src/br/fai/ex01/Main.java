package br.fai.ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	private void start() {
		int valores[] = lerValores();

	}
	
	private int[] lerValores() {
		Scanner scanner = new Scanner(System.in);
		int valores[] = new int[4];
		
		for (int i = 0; i < 4; i++) {
			System.out.printf("Digite um valor inteiro %d: ", i + 1);
			valores[i] = scanner.nextInt();
		}
		
		return valores;
	}
}
