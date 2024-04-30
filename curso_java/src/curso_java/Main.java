package curso_java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		QuebraDeLinha();
	}

	private static void EntradaDeDados() {

		Scanner sc = new Scanner(System.in);

		String carro;
		Double ipva;
		Integer fipe;

		System.out.println("Pesquise o seu carro");
		carro = sc.nextLine();

		System.out.println("Digite a FIPE do seu " + carro);
		fipe = sc.nextInt();

		ipva = fipe * 0.03;

		System.out.println("O seu carro " + carro + " possui o IPVA de: " + ipva);

		sc.close();

	}

	private static void QuebraDeLinha() {

		Scanner sc = new Scanner(System.in);

		String x, y, z;
		Integer n;

		System.out.println("Digite um número:");
		n = sc.nextInt();

		System.out.println("Digite algo:");
		x = sc.nextLine();
		x = sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();

		System.out.println(n + x + y + z);

		sc.close();
	}

}
