package br.fai.ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	private void start() {
		int valores[] = lerValores();
		int maior = retornaValor(valores, "maior");
		int menor = retornaValor(valores, "menor");

		System.out.println("O menor valor é: " + menor);
		System.out.println("O maior valor é: " + maior);
		
		if (maior > 50) {
			System.out.println("Valor muito alto.");
		} else {
			System.out.println("Valor normal.");
		}
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
	
	private int retornaValor(int valores[], String opcao) {
		int maior = -1;
		int menor = 2147483647;
		
		for (int valor: valores) {
			maior = Math.max(maior, valor);
			menor = Math.min(menor, valor);
		}
		
		switch (opcao) {
		case "maior": {
			return maior;
		}case "menor": {
			return menor;
		}
		default:
			return -1;
		}
	}	
}
