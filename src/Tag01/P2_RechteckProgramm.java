package tag01;

public class P2_RechteckProgramm {

	public static void main(String[] args) {
		// Rechteck erzeugen
		Rechteck r1 = new Rechteck();  // new-Operator erzeugt ein Objekt
		                               // vom Typ Rechteck
		
		// Eigenschaften des Rechtecks angeben
		r1.laenge = 2;  // 2 ist Integer
		r1.breite = 1.37;
		
		System.out.println("Länge von r1:  " + r1.laenge);
		System.out.println("Breite von r1: " + r1.breite);
		System.out.println("Fläche von r1: " + r1.flaeche());
	}

}
