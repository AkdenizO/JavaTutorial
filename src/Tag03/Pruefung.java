
public class Pruefung {
	public static void main(String[] args) {
		
		
		int zahl1 = -2147483648;  // 2147483647 + -2147483648
		int zahl2 = -1;
		
		/*
		 *  Überlaufprüfung bei einer Addition
		 *  
		 *  zahl1 + zahl2 > MAX_VALUE
		 */
		if(zahl2 > 0 && zahl1 > Integer.MAX_VALUE - zahl2) {  // Prüft auf Überlauf
			System.out.println("Überlauf bei Addition");
		}
		/*
		 * Unterlaufprüfung bei einer Addition
		 * 
		 * zahl1 + zahl2 < MIN_VALUE
		 */
		else if(zahl2 < 0 && zahl1 < Integer.MIN_VALUE - zahl2) {
			System.out.println("Unterlauf bei Addition");
		}
		else {
			System.out.println("Summe: " + (zahl1 + zahl2));
		}
		
		
		/*
		 * Über-/Unterlaufprüfung bei Subtraktion
		 */
		if(zahl2 < 0 && zahl1 > Integer.MAX_VALUE + zahl2) {
			System.out.println("Überlauf bei Subtraktion");
		}
		else if(zahl2 > 0 && zahl1 < Integer.MIN_VALUE + zahl2) {
			System.out.println("Unterlauf bei Subtraktion");
		}
		else {
			System.out.println("Differenz: " + (zahl1 - zahl2));
		}
		
		/*
		 * Über-/Unterlaufprüfung bei der Multiplikation
		 * 
		 * zahl1 * zahl2 > MAX_VALUE
		 */
		if(zahl1 < 0 ^ zahl2 < 0) { // Eine (NUR eine!) der beiden Zahlen ist negativ
			if(zahl2 != 0 && -Math.abs(zahl1) < Integer.MIN_VALUE / Math.abs(zahl2)) {
				System.out.println("Unterlauf bei Multiplikation");
			}
			else {
				System.out.println("Produkt: " + (zahl1 * zahl2));
			}
		}
		// Beide Zahlen sind positiv oder beide Zahlen sind negativ
		else if(zahl2 != 0 && zahl1 > Integer.MAX_VALUE / zahl2
				|| zahl1 == Integer.MIN_VALUE && zahl2 == -1) {
			System.out.println("Überlauf bei Multiplikation");
		}
		else {
			System.out.println("Produkt: " + (zahl1 * zahl2));
		}
		
		/*
		 * Prüfung bei Division
		 */
		if(zahl2 == 0) {
			System.out.println("Durch 0 darf nicht geteilt werden");
		}
		else if(zahl1 == Integer.MIN_VALUE && zahl2 == -1) {
			System.out.println("Überlauf bei Division");
		}
		else {
			System.out.println("Quotient: " + (zahl1 / zahl2));
		}
		
	}

}
