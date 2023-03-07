package tag01;

public class P3_Ganzzahlen {

	public static void main(String[] args) {
		byte b  = 127;   // Ganzzahl-Variable,  8Bit, -128 bis +127
		short s = 32767; // Ganzzahl-Variable, 16bit, -32768 bis +32767
		int i   = 42;    // Ganzzahl-Variable, 32bit, +- ~ 2 Mrd
		long l  = 3_000_000_000L; // Ganzzahl-Variable, 64bit, +- ~ 9 Trillionen
		                          // Literal vom Typ long durch anhängen von L
		                          // Gruppierung von Ziffern mit _
		
		i = 052;      // Oktalzahl (führende 0, oktal 52 -> dezimal 42)
		i = 0x2A;     // Hexadezimal (hex 2A -> dezimal 42)
		i = 0b101010; // Binärzahl (binär 101010 -> dezimal 42)
        // i = 42L; // Fehler, weil i eine Integer-Variable ist		
		
		i = (int) l; // Explizite Konvertierung mit dem Cast-Operator
		
		System.out.println("Wert von i: " + i);


	}

}
