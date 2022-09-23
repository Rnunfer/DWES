/*
	 Calcula la nota de un trimestre de la asignatura Programación. El programa
     pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
     Si la media de los dos controles da un número mayor o igual a 5, el alumno
     está aprobado y se mostrará la media. En caso de que la media sea un número
     menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
     se califica como apto o no apto, por tanto se debe preguntar al usuario
     ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
     resultado de la recuperación es apto, la nota será un 5; en caso
     contrario, se mantiene la nota media anterior.
 
     Ejemplo 1:
     Nota del primer control: 7
     Nota del segundo control: 10
     Tu nota de Programación es 8.5
 
     Ejemplo 2:
     Nota del primer control: 6
     Nota del segundo control: 3
     ¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
     Tu nota de Programación es 5
 */

/*
 * AUTOR: Rafael Núñez Fernández
 */

package ejercicios;

import java.util.Scanner;

public class EjerciciosCondicionales {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nota1 = 0, nota2 = 0;
		double media;
		String opcion;
		boolean salir;
		
		salir = false;
		do {
			try {
				System.out.print("Introduzca la primera nota: ");
				nota1 = sc.nextInt();
				salir = nota1 >= 0 && nota1 <= 10;
			} catch (Exception ex) {
				System.out.println("ERROR: " + ex.getMessage());
				sc.nextLine();
			}
		} while (!salir);
		
		salir = false;
		do {
			try {
				System.out.print("Introduzca la segunda nota: ");
				nota2 = sc.nextInt();
				salir = nota2 >= 0 && nota2 <= 10;
			} catch (Exception ex) {
				System.out.println("ERROR: " + ex.getMessage());
				sc.nextLine();
			}
		} while (!salir);
		
		sc.nextLine();
		media = (nota1*1.0 + nota2)/2*1.0;
		
		salir = false;
		if (media < 5) {
			do {
				System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
				opcion = sc.nextLine();
				switch (opcion) {
					case "apto":
						media = 5;
						salir = true;
						break;
					case "no apto":
						salir = true;
						break;
				}
			} while (!salir);
		}
		
		System.out.println("Su nota de programación es " + media);
		sc.close();
	}

}
