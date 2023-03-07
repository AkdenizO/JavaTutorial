package tag05;

public class Strings {

	public static void main(String[] args) {

		String s1 = "abc";  // "abc" ist eine Konstante (Literal)
		                    // in der Variablen s1 steht die Speicheradresse des String-Objekts (Referenz)
		String s2 = "abc";  // s2 ist eine weitere Referenz auf die Textkonstante
		String s3 = new String("aBc"); // new-Operator erzwingt die Erzeugung eines neuen Objekts
		String s4 = "abcdefghijklmnopqrstuvwxyzb";
		
		if(s1 == s2) {  // == vergleicht die Adressen in s1 und s2
			System.out.println("s1 und s2 sind gleich");
		}
		else {
			System.out.println("s1 und s2 sind nicht gleich");
		}
		
		if(s1.equals(s3)) {  // equals() vergleicht den Inhalt der Objekte s1 unbd s3 
			System.out.println("s1 und s3 sind gleich");
		}
		else {
			System.out.println("s1 und s3 sind nicht gleich");
		}
		
		// "abcdefghijklmnopqrstuvwxyzb"
		System.out.println("Zweites Zeichen von s1: " + s1.charAt(1));  // Zeichen an der angegebenen Position
		System.out.println("Länge von s1:           " + s1.length());   // gibt die Anzahl der Zeichen zurück
		System.out.println("s1 gleich s3:           " + s1.equalsIgnoreCase(s3)); // Vergleicht ohne Berücksichtigung von Groß-/Kleinschreibung
		System.out.println("Vergleich s1/s3:        " + s3.compareTo(s1));  // s1 - s3 ~  98 - 66 = 32
		System.out.println("Position von 'b' in s1: " + s1.indexOf('b')); // Sucht das angegebene Zeichen und gibt die Position zurück
		System.out.println("Letzte Position von 'b': " + s4.lastIndexOf('b'));
		System.out.println("Alle Zeichen ab Pos. 7: " + s4.substring(7)); // Alle Zeichen ab dem angegebenen Index
		System.out.println("3 Zeichen ab dem 2.:    " + s4.substring(1, 4)); // Alle Zeichen ab dem Startindex bis zum
		                                                                     // Zeichen VOR dem Endindex
		
		String[] texte = {"abc", "def", "ghijkl", "jkl"}; // Kurzschreibweise zur Initialisierung eines Arrays
		System.out.println("Anzahl der Arrayelemente: " + texte.length);
		System.out.println("Länge des 3. Elements:    " + texte[2].length());
		
		// s1 = "abc", s3 = "aBc"
		s1 = s1.concat(s3);
		System.out.println("s1 und s3 verkettet: " + s1);
		
	}

}
