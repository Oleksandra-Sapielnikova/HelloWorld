import java.util.Scanner;

public class A342_Spielbank {
    public static void main(String[] args){
        int chips5, chips10, chips20, chips50, chips100, mengeChips5, mengeChips10, mengeChips20, mengeChips50, mengeChips100, auszahlungsBetrag;

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Wie viel 5 euro Chips haben Sie: ");
        chips5 = tastatur.nextInt();

        System.out.print("Wie viel 10 euro Chips haben Sie: ");
        chips10 = tastatur.nextInt();

        System.out.print("Wie viel 20 euro Chips haben Sie: ");
        chips20 = tastatur.nextInt();

        System.out.print("Wie viel 50 euro Chips haben Sie: ");
        chips50 = tastatur.nextInt();

        System.out.print("Wie viel 100 euro Chips haben Sie: ");
        chips100 = tastatur.nextInt();

        //  assberechnen
        mengeChips5 = chips5 * 5;
        mengeChips10 = chips10 * 10;
        mengeChips20 = chips20 * 20;
        mengeChips50 = chips50 * 50;
        mengeChips100 = chips100 * 100;
        auszahlungsBetrag = mengeChips5 + mengeChips10 + mengeChips20 + mengeChips50 + mengeChips100;

        //leerzeil
        System.out.println();

        //ausgabe der ergebnisse
        System.out.println("Anzahl an 5 Euro Chips: " + chips5);
        System.out.println("Anzahl an 10 Euro Chips: " + chips10);
        System.out.println("Anzahl an 20 Euro Chips: " + chips20);
        System.out.println("Anzahl an 50 Euro Chips: " + chips50);
        System.out.println("Anzahl an 100 Euro Chips: " + chips100);
        //leerzeil
        System.out.println();

        System.out.println("Ihr Auszahlungsbetrag beträgt: " + auszahlungsBetrag + " Euro");


//Schließen des Scanners
        tastatur.close();


    }
}
