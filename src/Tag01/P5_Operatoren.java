package tag01;

public class P5_Operatoren {

	public static void main(String[] args) {
		// arithmetische Operatoren
		// + - * / %
		double zahl1 = 4.2, zahl2 = 7.3;
		
		System.out.println(zahl1 + " + " + zahl2 + " = " + (zahl1 + zahl2));

		
		// Zuweisungsoperatoren
		// = += -= *= /= %=
		zahl1  = zahl1 + zahl2;  // einfacher Zuweisungsoperator
		zahl1 += zahl2;         // zusammengesetzte Zuweisung
		
		System.out.println("Wert von zahl1: " + zahl1);
		System.out.println("Wert von zahl2: " + zahl2);
		
		
		// Vergleichsopertoren
		// == > >= < <= !=
		
		if(zahl1 > zahl2) {
			System.out.println("Zahl1 ist größer");
		}
		else {
			System.out.println("Zahl2 ist größer oder gleich");
		}
		
		
		// logische Operatoren
		// &, &&, |, ||, ^, !
		if(zahl1 < zahl2 & 0 > zahl1++) { // & bedeutet, beide Seiten werden ausgewertet
			System.out.println("passt");
		}
		System.out.println("zahl1 nach Abfrage: " + zahl1);
		
		
		// zahl1: 19.8
		if(zahl1 < zahl2 && 0 > zahl1++) {  // && bedeutet, rechte Seite wird nur ausgewertet
			                                // wenn die linke Seite true ist
			System.out.println("passt");
		}
		System.out.println("zahl1 nach 2. Abfrage: " + zahl1);
		
		// Inkrement- und Dekrement-Operator
		// ++ --
		zahl1 = 5;
		zahl2 = 3;
			  // 5    +    2
		zahl1 = zahl1 + --zahl2;  // prefix-Notation: in den umgebenden Ausdruck wird der Wert 
                                  // von zahl2 NACH der Ausführung des Dekrements geschrieben
		System.out.println("zahl1: " + zahl1); // 7
		System.out.println("zahl2: " + zahl2); // 2

		      //  7   +   2
		zahl1 = zahl1 + zahl2--;  // postfix-Notation: in den umgebenden Ausdruck wird der Wert 
		                          // von zahl2 VOR der Ausführung des Dekrements geschrieben 
		System.out.println("zahl1: " + zahl1); // 9
		System.out.println("zahl2: " + zahl2); // 1		
	}

}
