package main;

import java.util.Scanner;

public class Factorial {
	private static Scanner keyboard = new Scanner(System.in);

	private static int pedirNumero() {
		int number;
		boolean correct;
		do {
			System.out.print("Introduce un número entero mayor o igual que 0: ");
			if(keyboard.hasNextInt()) {
				number = keyboard.nextInt();
				correct = true;
			}else {
				System.out.println("Entrada no válida. Introduce un entero.");
	            keyboard.next();
	            correct = false;
	            number = -1;
			}
			
		}while(!correct);
		
		return number;
	}

	public static void main(String[] args) {

		int number = pedirNumero();

		if (number < 0) {
			System.out.println("ERROR: el número debe ser mayor o igual que 0.");
		} else {
			System.out.println("Has introducido el número: " + number);
			System.out.println("RESULTADO - En versiones posteriores se calculará el factorial del número " + number);
		}
		
	}

}
