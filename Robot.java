
import java.util.Scanner;

public class Robot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int pelo;
		System.out.println("Elige un rasgo para el pelo:");
		do {
			System.out.println("1 - WWWWWWWWW");
			System.out.println("2 - \\\\\\//////");
			System.out.println("3 - |\"\"\"\"\"\"\"|");
			System.out.println("4 - |||||||||");
			pelo = s.nextInt();
			if (pelo < 1 || pelo > 4) {
				System.out.println("Opción no válida, elige de nuevo.");
			}
		} while (pelo < 1 || pelo > 4);
		
		int ojos;
		System.out.println("Elige un rasgo para los ojos:");
		do {
			System.out.println("1 - | O   O |");
			System.out.println("2 - |-(· ·)-|");
			System.out.println("3 - |-(o o)-|");
			System.out.println("4 - | \\   / |");
			ojos = s.nextInt();
			if (ojos < 1 || ojos > 4) {
				System.out.println("Opción no válida, elige de nuevo.");
			}
		} while (ojos < 1 || ojos > 4);
		
		int nariz;
		System.out.println("Elige un rasgo para la nariz y orejas:");
		do {
			System.out.println("1 - @   J   @");
			System.out.println("2 - {   \"   }");
			System.out.println("3 - [   j   ]");
			System.out.println("4 - <   -   >");
			nariz = s.nextInt();
			if (nariz < 1 || nariz > 4) {
				System.out.println("Opción no válida, elige de nuevo.");
			}
		} while (nariz < 1 || nariz > 4);
		
		int boca;
		System.out.println("Elige un rasgo para la boca:");
		do {
			System.out.println("1 - |  ===  |");
			System.out.println("2 - |   -   |");
			System.out.println("3 - |  ___  |");
			System.out.println("4 - |  ---  |");
			boca = s.nextInt();
			if (boca < 1 || boca > 4) {
				System.out.println("Opción no válida, elige de nuevo.");
			}
		} while (boca < 1 || boca > 4);
		
		int barbilla;
		System.out.println("Elige un rasgo para la barbilla:");
		do {
			System.out.println("1 - \\_______/");
			System.out.println("2 - \\,,,,,,,/");
			barbilla = s.nextInt();
			if (barbilla < 1 || barbilla > 4) {
				System.out.println("Opción no válida, elige de nuevo.");
			}
		} while (barbilla < 1 || barbilla > 4);
		
		System.out.println("RETRATO:");
		
		switch (pelo) {
		case 1:
			System.out.println("WWWWWWWWW");
			break;
		case 2:
			System.out.println("\\\\\\//////");
			break;
		case 3:
			System.out.println("|\"\"\"\"\"\"\"|");
			break;
		case 4:
			System.out.println("|||||||||");
			break;
		}
		
		switch (ojos) {
		case 1:
			System.out.println("| O   O |");
			break;
		case 2:
			System.out.println("|-(· ·)-|");
			break;
		case 3:
			System.out.println("|-(o o)-|");
			break;
		case 4:
			System.out.println("| \\   / |");
			break;
		}
		
		switch (nariz) {
		case 1:
			System.out.println("@   J   @");
			break;
		case 2:
			System.out.println("{   \"   }");
			break;
		case 3:
			System.out.println("[   j   ]");
			break;
		case 4:
			System.out.println("<   -   >");
			break;
		}
		
		switch (boca) {
		case 1:
			System.out.println("|  ===  |");
			break;
		case 2:
			System.out.println("|   -   |");
			break;
		case 3:
			System.out.println("|  ___  |");
			break;
		case 4:
			System.out.println("|  ---  |");
			break;
		}
		
		switch (barbilla) {
		case 1:
			System.out.println("\\_______/");
			break;
		case 2:
			System.out.println("\\,,,,,,,/");
			break;
		}
	}

}
