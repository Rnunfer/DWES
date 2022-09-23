package ejercicios;

import java.util.Scanner;

public class diasSemanas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String opcion, solucion = "";
		
		do {
			System.out.print("Elija un día de la semana: ");
			opcion = sc.nextLine();
			switch (opcion) {
				case "Lunes":
					solucion = "Desarrollo Web en Entorno de Cliente";
					break;
				case "Martes":
					solucion = "Desarrollo de Interfaces Web";
					break;
				case "Miércoles":
					solucion = "Desarrollo Web en Entorno de Cliente";
					break;
				case "Jueves":
					solucion = "Desarrollo Web en Entorno de Servidor";
					break;
				case "Viernes":
					solucion = "Desarrollo Web en Entorno de Servidor";
					break;
				case "Sábado":
					solucion = "No hay clases";
					break;
				case "Domingo":
					solucion = "No hay clases";
					break;
			}
		} while (solucion == "");
		System.out.println(solucion);
		sc.close();
	}

}
