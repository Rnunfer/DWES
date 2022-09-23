package ejercicios;
import java.math.*;
import java.util.Scanner;

public class TransferenciaDinero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigDecimal pesetas = new BigDecimal(10000);
		BigDecimal factor = new BigDecimal(166.386f);
		BigDecimal euros;
		boolean salir = false;
		
		do {
			try {
				System.out.print("Introduzca una cantidad de pesetas: ");
				pesetas = sc.nextBigDecimal();
				euros = pesetas.divide(factor, 10, RoundingMode.HALF_UP);
				System.out.println("Cantidad de euros: " + euros.toPlainString());
				euros = pesetas.divide(factor, 2, RoundingMode.HALF_UP);
				System.out.println("Cantidad de euros: " + euros.setScale(7, RoundingMode.HALF_UP).toPlainString());
				salir = true;
			} catch (Exception ex) {
				System.out.println("ERROR");
			}
		} while (!salir);
		sc.close();
	}

}
