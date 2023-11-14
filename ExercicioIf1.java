package javaInicial;

import java.util.Scanner;

public class ExercicioIf1 {

	public static void main(String[] args) {
		int val1, val2, val3, soma;
		Scanner leia = new Scanner (System.in);
		System.out.println("Informe o 1º número: ");
		val1 = leia.nextInt();
		System.out.println("Informe o 2º número: ");
		val2 = leia.nextInt();
		System.out.println("Informe o 3º número: ");
		val3 = leia.nextInt();
		soma = val1 + val2;
		if (soma>val3) {
			System.out.println("A soma do 1º número com o 2º número é maior do que o 3º número");
		}
		if (soma<val3) {
			System.out.println("A soma do 1º número com o 2º número é menor do que o 3º número");
		}
		if (soma==val3) {
			System.out.println("A soma do 1º número com o 2º número é igual ao 3º número");
			
		}
	}

}
