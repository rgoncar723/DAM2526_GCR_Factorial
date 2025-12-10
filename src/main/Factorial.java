package main;

import java.util.Scanner;

public class Factorial {
	private static Scanner keyboard = new Scanner(System.in);

	private static int pedirNumero() {
		System.out.print("Introduce un número entero mayor o igual que 0: ");
		return keyboard.nextInt();
	}

	public static void main(String[] args) {

		int number = pedirNumero();

		if (number < 0) {
			System.out.println("ERROR: el número debe ser mayor o igual que 0.");
		} else {
			System.out.println("Has introducido el número: " + number);
			System.out.println("RESULTADO - El factorial del número " + number + " es " + factorialRec(number));
		}
		
	}
	/**
	 * Calcula el factorial de un número utilizando un enfoque recursivo.
	 *
	 * @param number Número entero del que se quiere obtener el factorial.
	 * @return Factorial de n, calculado mediante recursividad.
	 */
	private static long factorialRec(int number) {
	    if (number == 0 || number == 1) {
	      return 1;
	    }

	    return number * factorialRec(number - 1);
	}

}
