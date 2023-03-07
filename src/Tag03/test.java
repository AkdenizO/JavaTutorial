import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		int zähler = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Zahl1: ");
		String str1 = input.nextLine();
		int zahl1 = Integer.parseInt(str1);
		
		System.out.print("Zahl2: ");
		String str2 = input.nextLine();
		int zahl2 = Integer.parseInt(str2);
		
		
		
		 while(((zahl1 < 0 ^ zahl2 < 0)&&(zahl2 != 0 && -Math.abs(zahl1) < Integer.MIN_VALUE / Math.abs(zahl2)))
         		||((zahl2 != 0 && zahl1 > Integer.MAX_VALUE / zahl2)
         		|| (zahl1 == Integer.MIN_VALUE && zahl2 == -1))) { 
 			
             try {
             	System.out.println("Überlauf oder Unterlauf bei multiplikation");
             	System.out.print("Bitte 2. Zahl eingeben: ");
                String eingabe2 = input.nextLine();
                zahl2 = Integer.parseInt(eingabe2);
             	

             } catch (NumberFormatException nfe) {
             	
                 System.out.println("Fehlerhafte Eingabe!");
                 zähler++;
             }
         }
		 System.out.println(zahl1 * zahl2);
		

	}

}
