package br.fai.ex02;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	private void start() {
		int soma[] = lerValores();
		int media = calculaMedia(soma[0], soma[1]);
		
		System.out.println("Soma: " + soma[0]);
		System.out.println("Media: " + media);
	}
	
	private int[] lerValores() {
		int valores[] = new int[2];
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Caso desejar para digite -1.");
		while (i != -1) {
			System.out.printf("Digite um valor %d: ", i + 1);
			int valor = scanner.nextInt();
			
			if (valor != -1) {
				i++;
				valores[0] += valor;
				valores[1] = i;
			}else if (i < 4 && valor == -1) {
				System.out.println("Devem ser digitado no mínimo 4 valores");
			} else {
				break;
			}
		}
		
		return valores;
	}
	
	private int calculaMedia(int soma, int qtd_valores) {
		return soma / qtd_valores;
	}
	
}
