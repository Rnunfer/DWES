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
		
		tablero = ponerPosibleMovimientos(tablero, pos);
		dibujarTablero(tablero);
	}
	
	static int[][] ponerAlfil(String posicion) {
		int tablero[][] = new int[8][8];
		
		return tablero;
	}
	
	static int[][] ponerPosibleMovimientos(int [][] tablero, String posicion) {
		
		int i = 0;
		try {
			while(true) {
				tablero[Integer.valueOf(posicion.charAt(1))-49+i][(int)posicion.charAt(0) - 97+i] = 1;
				i++;
			}
		} catch (Exception ex) {
		}
		
		i=0;
		try {
			while(true) {
				tablero[Integer.valueOf(posicion.charAt(1))-49+i][(int)posicion.charAt(0) - 97-i] = 1;
				i++;
			}
		} catch (Exception ex) {
		}
		
		i=0;
		try {
			while(true) {
				tablero[Integer.valueOf(posicion.charAt(1))-49-i][(int)posicion.charAt(0) - 97+i] = 1;
				i++;
			}
		} catch (Exception ex) {
		}
		
		i=0;
		try {
			while(true) {
				tablero[Integer.valueOf(posicion.charAt(1))-49-i][(int)posicion.charAt(0) - 97-i] = 1;
				i++;
			}
		} catch (Exception ex) {
		}
		tablero[Integer.valueOf(posicion.charAt(1))-49][(int)posicion.charAt(0) - 97] = 2;
		return tablero;
	}
	
	static void dibujarTablero(int[][] tablero) {
		int contador = 1;
		System.out.println("  a b c d e f g h");
		for (int[] i: tablero) {
			System.out.print(contador + " ");
			for(int j : i) {
				if (j == 0)
					System.out.print("  ");
				else if (j == 1)
					System.out.print("* ");
				else
					System.out.print("A ");
			}
			System.out.println(contador);
			contador++;
		}
		System.out.println("  a b c d e f g h");
	}
}
