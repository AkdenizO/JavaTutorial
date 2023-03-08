package Tag08;

public class Temperatur {
    private static int zaehler;
    private double wert; // instanzvariable (Eigenschaft)
                         // Vorgabewert: 0.0
                         // private: verhindert direkten Zugriff
                         // wird dür jedes erzeigte Objekt angelegt
    public static void zaehler(){
        zaehler++;
    }
    public static int anzahl(){
        return zaehler;
    }
    /*-----------------------------------------------------------------
    * Eingenscften
    * ---------------------------------------------------------------*/
    /**
     * Speichert einen Temperaturwert
     * @param wert Messwert
     * @return true wenn erfolgraich, sonst false
     */
    public boolean messen(double wert){
        // abs. Nullpukt        Plancktemperatur
        if (wert >= -273.15 && wert <= 1.42e32 ){
            this.wert = wert; // this verweist auf das aktuelle Objekt
            return true;
        }
        return false;
    }

    /**
     * Gibt dei Temperatur formatiert zurück
     * @return Temperatur im Format xx.x°C
     */
    public String ausgabe(){
        return wert + "°C";
    }
}
