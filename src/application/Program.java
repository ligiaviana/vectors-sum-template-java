package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}

		double avg = soma / vect.length;

		System.out.print("VALORES = ");

		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vect[i]);
		}

		 System.out.printf("\nSOMA = %.2f\n", soma);
		 System.out.printf("MEDIA = %.2f\n", avg);

		sc.close();

	}

}
