package uapi.lista01;

import java.util.Scanner;

public class SomaNumerica {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int numero1, numero2, soma;
		
		System.out.println("Informe um número: ");
		numero1 = in.nextInt();
		System.out.println("Informe outro número: ");
		numero2 = in.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.println("A soma dos número " + numero1 + " e " + numero1 + " é igual a: " + soma);
		
	}
}	
	
	
	


