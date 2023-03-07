package tag06;

public class Methoden1 {

	public static void main(String[] args) {
		double erg = test(41.0);   // 43.0
		System.out.println("Erster Aufruf: " + erg);

		double erg2 = test(41); // 42.0
		System.out.println("Zweiter Aufruf: " + erg2);
	}

	/**
	 * Macht irgendwas<br>
	 * Und noch was anderes
	 * 
	 * @param zahl  Zahl für irgendwas
	 * @return      Gibt das richtige zurück
	 */
	public static double test(double zahl) 
	{
		if(zahl < 0) {
			return 0.0; // springt zum Aufruf der Methode zurück
		}
		return zahl + 2;
	}
	
	/**
	 * Überladung der Methode test(double zahl)
	 * @param x  Irgendwas anderes
	 * @return   Irgendwas plus 1
	 */
	public static double test(float x)
	{
		return ++x;
	}
}
