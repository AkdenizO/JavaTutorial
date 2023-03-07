package tag07;

public class Fakultaet {

	public static void main(String[] args) {
		int zahl = 6;  //  5! = 1 * 2 * 3 * 4 * 5  = 120   oder 5! = 4! * 5
		               //  4! = 1 * 2 * 3 * 4      =  24   oder 4! = 3! * 4
		               //  3! = 1 * 2 * 3          =   6   oder 3! = 2! * 3
		               //  2! = 1 * 2              =   2   oder 2! = 1! * 2
		               //  1! = 1                          oder 1! = 0! * 1
		               //  0! = 1
		
		
		System.out.println(fakul(zahl));
		System.out.println(fakultaet(zahl));
	}
	
	/**
	 * Fakultätsberechnung iterativ
	 * @param zahl
	 * @return
	 */
	public static double fakul(int zahl) {
		double fakultaet = 1;
		
		for(int i = 1; i <= zahl; i++) {
			fakultaet *= i;
		}
		return fakultaet;
	}
	
	/**
	 * Fakulktätsberechnung rekursiv
	 * @param zahl
	 * @return
	 */
	public static double fakultaet (int zahl) {
		if(zahl > 1) {  // Abruchbedingung - WICHTIG!!!
			return fakultaet(zahl-1) * zahl;
		}
		return 1;
	}

}
