package ejercicios;

import java.util.Scanner;

public class Ejercicio8RepasoBidimensionales {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tablero[][] = new int[8][8];
		String pos;
		boolean salir = false;
		
		do {
			System.out.print("Introduzca la posición del alfil: ");
			pos = sc.nextLine();
			if (pos.length() == 2) {
				if ((pos.charAt(0) >= 97 && pos.charAt(0) <= 104) && (pos.charAt(1) >= 49 && pos.charAt(1) <= 56)) {
					salir = true;
				} 
			}
			if (!salir)
				System.out.println("La posición sigue una regla de [a-h][1-8]");
		} while (!salir);
		
	}
}
