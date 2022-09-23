package ejercicios;

import java.util.Scanner;

public class E21RepasoBucle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numTotal = 0;
		int numImpares = 0;
		int mediaImpar = 0;
		int mayorPar = 0;
		int num = 0;
		
		do {
			try {
				System.out.print("Introduzca un número: ");
				num = sc.nextInt();
				if (num >= 0) {
					numTotal++;
					if (num % 2 == 0 && num > mayorPar)
						mayorPar = num;
					else {
						numImpares++;
						mediaImpar += num;
					}
				}
				
			} catch (Exception ex) {
				System.out.println("Solo se aceptan valores numéricos");
				sc.nextLine();
			}
		} while (num >= 0);
		
		if (numImpares != 0)
			mediaImpar = mediaImpar/numImpares;
		sc.close();
		
		System.out.println("\nCantidad de números: " + numTotal);
		System.out.println("Media de los impares: " + mediaImpar);
		System.out.println("Mayor número par: " + mayorPar);
	}

}
