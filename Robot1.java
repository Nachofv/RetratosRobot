

import java.util.*;

public class Robot1 {
	
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		String [][] rasgos = {
				{"el pelo", "WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"},
				{"los ojos", "| O   O |", "|-(· ·)-|", "|-(o o)-|", "| \\   / |"},
				{"la nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
				{"la boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
				{"la barbilla", "\\_______/", "\\,,,,,,,/"}
		};
		
		int [] opciones = new int[rasgos.length];
		
		for (int i=0; i< rasgos.length; i++)
			opciones[i] = elegirRasgo(rasgos[i]);
		for (int i=0; i< rasgos.length; i++)
			System.out.println(rasgos[i][opciones[i]]);
		
	}
	
	static int elegirRasgo(String[] rasgos) {
		int rasgo;
		System.out.println("Elige un rasgo para " + rasgos[0]);
		do {
			for (int i=1; i<rasgos.length; i++)
				System.out.printf("%d - %s\n", i, rasgos[i]);
			System.out.print("Rasgo: ");
			rasgo = s.nextInt();
			if (rasgo < 1 || rasgo >= rasgos.length) {
				System.out.println("Opción no válida, elige de nuevo.");
			}
		} while (rasgo < 1 || rasgo >= rasgos.length);
		return rasgo;
	}
		
}