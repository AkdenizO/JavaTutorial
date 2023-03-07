package tag07;

import java.util.Scanner;

public class Drehen {

	public static void main(String[] args) {
		Scanner konsole = new Scanner(System.in);
		
		System.out.print("Text eingeben: ");
		String eingabe = konsole.nextLine();
		
		System.out.println(rekursiv(eingabe));

	}

	public static String rekursiv(String eingabe) {

		if(eingabe.length() > 1) { // Abbruchbedingung für die Rekursion
			return rekursiv(eingabe.substring(1)) + eingabe.charAt(0);
		}

		return eingabe;
	}

}
