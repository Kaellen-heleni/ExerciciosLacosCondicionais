package javaInicial;

import java.util.Scanner;

public class ExercicioIf2 {

	public static void main(String[] args) {
		float numero;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite um número: ");
		numero = leia.nextFloat();
		
		if(numero % 2 == 0 && numero>0) {
			System.out.println(" O número "+numero+" é par e positivo.");
		}
	    if (numero % 2 == 0 && numero<0) {
	    	System.out.println("O número "+numero+" é par e negativo.");
	    }
	    if(numero %2!=0 && numero>0) {
	    	System.out.println("O número "+numero+" é impar e positivo.");
	    	}
	    if(numero %2!=0 && numero<0) {
	    	System.out.println("O número "+numero+" é impar e negativo.");
	    }
		
	}

}
