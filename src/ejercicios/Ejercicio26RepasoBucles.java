package ejercicios;

import java.util.*;

public class Ejercicio26RepasoBucles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, dig;
		String cadNum = "";
		String solucion;
		
		// Se introduce el número
		do {
			try {
				System.out.print("Introduzca un número: ");
				num = sc.nextInt();
				cadNum = "" + num;
			} catch (Exception ex) {
				sc.nextLine();
			}
		} while (cadNum.equalsIgnoreCase(""));
		
		// Se introduce el dígito
		do {
			try {
				System.out.print("Introduzca un dígito: ");
				dig = sc.nextInt();
				if (dig < 0 || dig > 9)
					System.out.println("Valor de dígito no válido");
			} catch (Exception ex) {
				dig = -1;
				sc.nextLine();
			}
		} while (dig < 0 || dig > 9);
		
		// Se ve cuántas veces se ha repetido el dígito en el número
		solucion = posicionDigito(cadNum, dig);
		if (solucion.equalsIgnoreCase(""))
			System.out.println("No se ha encontrado el dígito " + dig);
		else
			System.out.println(solucion);
		sc.close();

	}
	
	static String posicionDigito (String cad, int dig) {
		String devolver = "";
		for (int i = 0; i < cad.length(); i++) {
			if (dig == Integer.valueOf(cad.substring(i, i+1)))
				devolver += "\nDígito " + dig + " encontrado en posición: " + i;
		}
		return devolver;
	}
}
