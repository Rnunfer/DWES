package ejercicios;

public class Ejercicio69RepasoBucles {

	public static void main(String[] args) {

		int altura;
		altura = 5;
		
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

	}

}
