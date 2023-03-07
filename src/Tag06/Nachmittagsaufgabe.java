package Tag06;

import java.util.Scanner;

public class Nachmittagsaufgabe {
    public static void main(String[] args) {

        String pfandAdresse = "";

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Bitte Pfadadresse eingeben: ");
            pfandAdresse = input.nextLine();

        }catch (StringIndexOutOfBoundsException sib){
            System.out.println("Fehlerhafte Eingabe");
        }

       boolean erste = erstesZeichen(pfandAdresse);
       boolean doppel = doppelPunkt(pfandAdresse);
       boolean dritte = drittesZeichen(pfandAdresse);
       boolean letzte = letzteZeichen(pfandAdresse);
       boolean zwischen = buchstaben(pfandAdresse);

       if (erste || doppel || dritte || letzte || zwischen == true){
           System.out.println("Pfad ist leider ungültig!");
       }else {
           System.out.println("Pfad ist gültig");
       }
    }

    /**
     * Überprüfung von c und d
     * @param pfandAdresse
     *
     * @return wenn ein Fehler auftritt, wird boolen true zugewiesen, sonst false
     */
    public static boolean erstesZeichen(String pfandAdresse){
        boolean istFehler = false;

        try {
            if (pfandAdresse.charAt(0) == 'c' || pfandAdresse.charAt(0) == 'd'){
                istFehler = false;
            }else {
                istFehler = true;
                System.out.println("Pfand muss mit c ode d anfangen!");
            }
        }catch (StringIndexOutOfBoundsException sib){
            System.out.println("Fehlerhafte Eingabe!");
        }

        return istFehler;
    }

    /**
     * Überprüfung von :
     * @param dp
     * @return wenn ein Fehler auftritt, wird boolean true zugewiesen
     */
    public static boolean doppelPunkt(String dp){
        boolean istFehler = false;
        try {
            if (dp.charAt(1) == ':'){
                istFehler = false;
            }else {
                istFehler = true;
                System.out.println("Doppel Punkt fehlt!");
            }
        }catch (StringIndexOutOfBoundsException sib){
            System.out.println("Fehlerhafte Eingabe!");
        }


        return istFehler;
    }

    /**
     * Überprüfung von Slash und Backslash
     * @param slash
     * @return
     */
    public static boolean drittesZeichen(String slash){
        boolean istFehler = false;
       try {
           if (slash.charAt(2) == '/' || slash.charAt(2) == '\\'){
               istFehler = false;
           }else {
               istFehler = true;
               System.out.println("Dritte Zeichen muss entweder / oder \\ sein!");
           }
       }catch (StringIndexOutOfBoundsException sib){
           System.out.println("Fehlerhafte Eingabe!");
       }

        return istFehler;
    }

    /**
     * Überprüfung der Erweiterung
     * laengeString länge der Erweiterung
     * @param erweiterung
     * @return
     */
    public static boolean letzteZeichen(String erweiterung) {
        boolean istFehler = false;
        int laengeString = erweiterung.length();

        try {
            if (erweiterung.substring((laengeString-4), laengeString).equals(".txt")){
                istFehler = false;
            }
            else {
                istFehler = true;
                System.out.println("Erweiterung muss unbedingt .txt sein!");
            }
        }catch (StringIndexOutOfBoundsException sib){
            System.out.println("Fehlerhafte Eingabe!");
        }



        return istFehler;
    }

    /**
     * Überprüfung von Buchstabe aber ohne Umlaute (äüöß)
     * @param str
     * @return
     */
    public static boolean buchstaben(String str){
        boolean istFehler = false;
        int r = 65;

        // Array wird deklariert und erzeugt für die bucstaben.
        char[] c = new char[26];
        for (int i = 0; i < 26 ; i++) {
            c[i] = (char)r;
            r++;
        }

        // ich finde hier indexnummer vom letzten Slash, Backslash und Punkt
        int letztesSlash = str.lastIndexOf('/');
        int letztesBackSlash = str.lastIndexOf('\\');
        int letzterPunkt = str.lastIndexOf('.');

        String zwischenTextMitBackslash = "";
        String zwischenTextMitSlash = "";

        try {
            // hier wird der Text zwischen .txt und dem Slash - Backslash zugewiesen
            zwischenTextMitBackslash = str.toUpperCase().substring(letztesBackSlash+1, letzterPunkt);
            zwischenTextMitSlash = str.toUpperCase().substring(letztesSlash+1, letzterPunkt);


        }catch (StringIndexOutOfBoundsException sib){
            System.out.println("Fehlerhafte Eingabe");
        }

        int zähler = 0;
        // wenn der Text keinen Slash hat, bekomme ich -1, daher ...
        if (letztesSlash == -1){
            for (int i = 0; i < zwischenTextMitBackslash.length(); i++) {
                // mindestens ein Buchstabe daher, wenn ein Buchstabe gefunden wird, dann breche ich die schleife
                if (zähler > 0){
                    break;
                }
                for (int j = 0; j < c.length ; j++) {
                    if (zwischenTextMitBackslash.charAt(i) == c[j]){
                        istFehler = false;
                        zähler++;
                        break;

                    }istFehler = true;

                }
            }
            // wenn nichts eingegeben wird(einfach Enter drücken) oder zum Beispiel so eingeben wird: "c:\dateien\.txt"
            if (zwischenTextMitBackslash.isEmpty()){
                istFehler = true;
            }


        }
        else
        {

            // wenn der Text keinen Slash hat, bekomme ich -1, daher ..
            for (int i = 0; i < zwischenTextMitSlash.length() ; i++) {
                if (zähler > 0){
                    break;
                }
                for (int j = 0; j < c.length ; j++) {
                    if (zwischenTextMitSlash.charAt(i) == c[j]){
                        istFehler = false;
                        zähler++;
                        break;
                    }istFehler = true;
                }
            }
            if (zwischenTextMitSlash.isEmpty()){
                istFehler = true;
            }

        }
        return istFehler;
    }

}

