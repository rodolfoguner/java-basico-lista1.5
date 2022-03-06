package br.fai.ex07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		int[] array1 = lerValoresArray(1);
		int[] array2 = lerValoresArray(2);
		int arrayCombinado[];
		
		
	}
	
	private int[] lerValoresArray(int numArray) {
		String opcao = "";
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		Integer arrayObtido[];
		
		while (true) {
			int num = 0;
			
			System.out.print("Digite um número de -100 até 100 para lista " + numArray + " ou sair: ");
			opcao = scanner.nextLine().trim();

			if (opcao.equals("sair")) {
				break;
			}
			
			num = Integer.parseInt(opcao);
			
			if (num >= -100 && num <= 100) {
				array.add(num);
			} else {
				System.out.println("Valor fora do alcance");
			}
			
		}
		
		arrayObtido = array.toArray(new Integer[array.size()]);
		
		return ArrayUtils.toPrimitive(arrayObtido);
	}
}
