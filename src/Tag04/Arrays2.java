package tag04;

public class Arrays2 {

	public static void main(String[] args) {
		int[] arr = new int[8];
		
		// Werte des Arrays in einer Schleife füllen
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i * i;
		}
		
		/*
		 *  Array erweitern ANFANG
		 */
		
		// temporäres Array mit einem Element mehr als arr
		int[] temp = new int[arr.length + 1];
		
		// Werte von arr in temp kopieren
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		
		arr = temp; // arr zeigt jetzt auf das neue Array
		
		/*
		 * Array erweitern ENDE
		 */
		
		
		// letzte Element füllen
		arr[arr.length - 1] = (arr.length - 1) * (arr.length - 1);
		
		// Alle Arrayelemente ausgeben
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
