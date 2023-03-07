package tag01;

public class P4_SonstigeTypen {

	public static void main(String[] args) {
		// Fließkommatypen
		float f =  1.376535621f; // Fließkommavariable, 32bit, 6 Stellen Genauigkeit
		double d = 1.376535621;  // Fließkommavariable, 64bit, 15 Stelen Genauigkeit
		
		d = (0.1 + 0.7) * 8 / 8;  // Ergebnis = 0.8
		
		if(d == 0.8) {  // NIEMALS Fließkommazahlen mit == (oder !=) vergleichen, immer mit > oder <
			System.out.println("Stimmt!");
		}
		else {
			System.out.println("Stimmt nicht!");
		}
		
		// Wissenschaftliche Notation
		// 8.0E-1 ~ 8,0 mal 10 hoch -1 ~ 0,8
		// 4.2E2  ~ 4,2 mal 10 hoch 2  ~ 420
		f = 4.2E2f;
		
		System.out.println("Wert von f: " + f);
		System.out.println("Wert von d: " + d);
		
		// Wahrheitswerte
		boolean jn = false; // true oder false
		
		System.out.println("Wahrheitswert: " + jn);
		
		
		// Zeichentypen
		char z = 'é';             // Zeichenvariable, 16bit, 0 bis 65535
		String text = "blafasel"; // Zeichenkettenvariable
		
		System.out.println("Zeichen: " + z);
		System.out.println("Text: " + text);

	}

}
