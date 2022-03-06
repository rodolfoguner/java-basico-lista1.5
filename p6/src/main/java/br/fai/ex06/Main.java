package br.fai.ex06;
import org.apache.commons.lang3.ArrayUtils;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		int array1[] = {50, -20, 0, 40};
		int array2[] = {5, -50, 10, 60};
		int arrayCombinado[];
		float soma = 0;
		float media = 0;
		
		arrayCombinado = ArrayUtils.addAll(array1, array2);
		
		for (int num: arrayCombinado) {
			soma += num;
		}
		
		media = soma / arrayCombinado.length;
		
		System.out.println("Valores do array: " + ArrayUtils.toString(array1));
		System.out.println("Valores do array: " + ArrayUtils.toString(array2));
		System.out.println("Arrays combinados: " + ArrayUtils.toString(arrayCombinado));
		System.out.printf("Soma: %.0f", soma);
		System.out.printf("\nMedia: %.2f", media);
	}
}
