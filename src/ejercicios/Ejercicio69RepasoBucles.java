package ejercicios;

import java.util.Scanner;

public class Ejercicio69RepasoBucles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int altura;
		
		do {
			try {
				System.out.print("Introduzca la altura de la pirámide (tiene que ser mayor o igual a 3): ");
				altura = sc.nextInt();
			} catch (Exception ex) {
				sc.nextLine();
				altura = 0;
			}
		} while (altura < 3);
		
		for (int i = 0; i < altura; i++) {
			System.out.println();
			
			for (int j = 0; j < altura; j++) {
				if (j >= altura - i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			if (i % 2 == 0)
				System.out.print("****");
			else
				System.out.print("    ");
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
		}
		sc.close();
	}

}
