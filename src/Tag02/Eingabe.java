package tag02;

import java.util.Scanner;  // Einbinden der Scanner-Klasse

public class Eingabe {

	public static void main(String[] args) {
		
		// System.in.read();  // Liest nur ein Byte aus dem Eingabestrom
		
		System.out.print("Bitte eine Zahl eingeben: ");
		
		Scanner konsole = new Scanner(System.in);
		
		String eingabe = konsole.nextLine(); // holt den eingegebenen Wert von der Tastatur
		
		try {  // Prüft, ob eine der Anweisungen in dem Block eine Exception wirft
			   // Wenn ja, wird der passende Catch-Block ausgeführt
			int zahl = Integer.parseInt(eingabe);  // Wandelt die Eingabe in einen Integer um
			System.out.println("Du hast eingegeben: " + zahl);
		} catch (NumberFormatException nfe) {
			System.out.println("Fehlerhafte Eingabe");
		} 
		
		System.out.println("Größter long-Wert: " + Long.MAX_VALUE);
		System.out.println("Kleinster long-Wert: " + Long.MIN_VALUE);

	}

}
