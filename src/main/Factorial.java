package main;
import java.util.Scanner;
public class Factorial {

		public static void main(String[] args) {
	        Scanner keyboard = new Scanner(System.in);

	        System.out.print("Introduce un número entero mayor o igual que 0: ");
	        int number = keyboard.nextInt();

	        if (number < 0) {
	            System.out.println("ERROR: el número debe ser mayor o igual que 0.");
	        } else {
	            System.out.println("Has introducido el número: " + number);
	        }

	        keyboard.close();
		}

}
