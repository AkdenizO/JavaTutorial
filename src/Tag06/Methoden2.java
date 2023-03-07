package tag06;

public class Methoden2 {

	public static void main(String[] args) {
		int zahl = 11;
		m01(zahl);   // Übergeben wird ein Argument: der Wert des Arguments wird in den
		             // Parameter der Methode kopiert: Call by value
		System.out.println("Zahl = " + zahl); // Zahl = 11
		
		int[] zahlen = {42, 137}; // zahlen enthält die Anfangsadresse des Arrays (Referenzvariable)
		m02(zahlen, zahl);
		for(int i = 0; i < zahlen.length; i++) {
			System.out.print(zahlen[i] + " ");   // 43 137
		}
		System.out.println("zahl: " + zahl);
		System.out.println();
		
		String s = "Isses denn"; // Referenztyp
		m03(s);
		System.out.println("String: " + s); // String: Isses denn

	}
	
	/**
	 * Ergänzt den String um ein Fragezeichen
	 * @param s zu ergänzende String
	 */
	public static void m03(String s) // Call by reference
	{
		s = s.concat("?");
		System.out.println(s);
	}

	/**
	 * Erhöht den ersten Wert eines Arrays um eins
	 * @param zahlen  Array mit Werten
	 */
	public static void m02(int[] zahlen, int zahl) // zahlen enthält eine Kopie der übergebenen Speicheradresse
	                                       // verweist auf dasselbe Array 
	                                       // Call by reference für das Array
	                                       // Call by value für den int-Wert
	{
		zahlen[0]++;
		zahl++;
	}

	/**
	 * gibt eine um eins reduzierte Zahl zurück
	 * 
	 * @param zahl  zu reduzierende Zahl
	 * @return      um 1 reduzierte Zahl
	 */
	public static int m01(int zahl) // Parameter zahl ist eine lokale Variable
	                                  // Argumente wird in den Parameter kopiert: Call by value
	{
		zahl--;
		return zahl;
	}

}
