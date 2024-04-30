package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diferenca();
	}

	
	private static void Soma() {
		
		Scanner sc = new Scanner(System.in);
		
		
		Integer num1, num2, soma;
		
		System.out.println("Digite o primeiro número");
		num1 = sc.nextInt();

		System.out.println("Digite o segundo número");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("A soma é " + soma);
	}
	
	
	private static void Raio() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double tt = 3.14159;
		double raio, area;
		
		System.out.println("Digite o raio:");
		raio = sc.nextDouble();
		
		area = tt * raio * raio;
		
		System.out.println("A área é " + area);
		
		
	}
	
	private static void Diferenca() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double A, B, C, D, dif;
		
		System.out.println("Digite os valores em ordem respectiva: ");
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		dif = A * B - C * D; 
		
		System.out.println("A diferença é " + dif);
		
	}
	
}
