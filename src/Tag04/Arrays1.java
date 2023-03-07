package tag04;

public class Arrays1 {

	public static void main(String[] args) {

		// Array: Sammlung gleichartiger Daten, die über einen Index angesprochen werden
		int[] arr;  // Array mit Integer-Werten
		            // arr enthält die Speicheradresse des eigentlichen Arrays
		            // ohne Initialisierung: Speicheradresse 0
		            // arr ist eine Referenz auf ein Array (Referenzvariable)
		
		arr = new int[2]; // Der new-Operator erzeugt den Speicherplatz für 2 int-Elemente
		                   // new-Operator git die Speicheradresse des 1. Elements
		
		System.out.println("Inhalt von arr: " + arr);
		
		arr[0] = 42;
		arr[1] = 73;
		
		System.out.println("Inhalt des 1. Elements von arr: " + arr[0]);
		System.out.println("Inhalt des 2. Elements von arr: " + arr[1]);
		
		int[] b = arr;  // b enthält jetzt die Adresse des Arrays (2. Referenz auf dasselbe Array)
		b[1] = 137;
		
		b = new int[2]; // b enthält jetzt die Adresse eines neuen Arrays (arr behält die ursprüngliche Adresse)
		
		System.out.println("Adresse von b: " + b);
		
		arr = b; // arr enthält jetzt dieselbe Referenz wie b
		         // das ursprüngliche Array von arr wird vom Garbage-Collector vernichtet
		
		System.out.println();
		System.out.println("Inhalt des 1. Elements von b: " + b[0]);
		System.out.println("Inhalt des 2. Elements von b: " + b[1]);
		
		System.out.println();
		System.out.println("Inhalt des 1. Elements von arr: " + arr[0]);
		System.out.println("Inhalt des 2. Elements von arr: " + arr[1]);
}

}
