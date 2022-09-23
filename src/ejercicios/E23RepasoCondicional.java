package ejercicios;

import java.util.Scanner;

public class E23RepasoCondicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double baseImponible, total;
		String tipoIVA, cod;
		
		// Introducir base imponible
		do {
			try {
				System.out.print("Introduzca la base imponible: ");
				total = baseImponible = sc.nextDouble();
			} catch (Exception ex) {
				total = baseImponible = -1;
				sc.nextLine();
			}
			
		} while (baseImponible < 0);
		
		// Introducir tipo de IVA
		do {
			try {
				System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
				tipoIVA = sc.nextLine();
			} catch (Exception ex) {
				tipoIVA = " ";
				sc.nextLine();
			}
		} while (!tipoIVA.equalsIgnoreCase("general") && !tipoIVA.equalsIgnoreCase("reducido") && !tipoIVA.equalsIgnoreCase("superreducido"));
		
		// Introducir código promocional
		do {
			try {
				System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
				cod = sc.nextLine();
			} catch (Exception ex) {
				cod = " ";
				sc.nextLine();
			}
		} while (!cod.equalsIgnoreCase("nopro") && !cod.equalsIgnoreCase("mitad") && !cod.equalsIgnoreCase("meno5") && !cod.equalsIgnoreCase("5porc"));
		
		System.out.println("\nBase imponible: " + baseImponible);
		
		// IVA
		switch(tipoIVA) {
		case "general":
			total = baseImponible + (baseImponible*0.21);
			System.out.println("IVA (21%): " + (baseImponible*0.21));
			break;
		case "reducido":
			total = baseImponible + (baseImponible*0.1);
			System.out.println("IVA (10%): " + (baseImponible*0.21));
			break;
		case "superreducido":
			total = baseImponible + (baseImponible*0.04);
			System.out.println("IVA (4%): " + (baseImponible*0.21));
			break;
		}
		System.out.println("Precio con IVA: " + total);
		
		// Código promocional
		switch(cod) {
		case "nopro":
			System.out.println("Cód. promo. (ninguno): 0");
			break;
		case "mitad":
			System.out.println("Cód. promo. (mitad): -" + (total*0.5));
			total = total - (total*0.5);
			break;
		case "meno5":
			System.out.println("Cód. promo. (5 euros descuento): -5");
			total = total - 5;
			if (total < 0)
				total = 0;
			break;
		case "5porc":
			System.out.println("Cód. promo. (5% descuento): " + (total*0.5));
			total = total - (total*0.5);
			break;
		}
		
		System.out.println("TOTAL: " + total);
		sc.close();
	}
}
