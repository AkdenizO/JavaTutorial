package Tag08;

import java.util.Map;

public class OOP1 {
    public static void main(String[] args) {
        Temperatur.zaehler();
        Temperatur t1 = new Temperatur();
        t1.messen(-300);

        Temperatur.zaehler();
        Temperatur t2 = new Temperatur();
        t2.messen(137);

        System.out.println(t1.ausgabe());
        System.out.println("Objekte: " + Temperatur.anzahl());

        System.out.println(t2.ausgabe());
        System.out.println("Objekte: " + Temperatur.anzahl());


    }
}
