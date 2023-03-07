package tag01;

public class P6_ForSchleife {

	public int test = 1;
	
	public static void main(String[] args) {
		//  Initialisierung Bedingung Reinitialisierung
		for(int i = 1;      i <= 10;     ++i) { // for-Schleife, läuft 7 mal
			
			if(i % 2 == 0) { // Wenn Zahl gerade ist ...
				continue;   // ... nächster Schleifendurchlauf (Sprung zur Reinitialisierung)
			}
			
			System.out.print(i + " ");
			
			if(i > 6) {
				break;  // Bricht die Schleife ab
			}
			
		}

	}

}
