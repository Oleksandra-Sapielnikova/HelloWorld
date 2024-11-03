import java.util.Scanner;

public class  A341_Rechteck {
    public static void main(String[] args) {

        //eingebung der variablen

        int seiteA, seiteB, umfang, flaeche;

        //erstellen eines scanner-obkektes
        Scanner tastatur = new Scanner(System.in);

        //aufforderung zur eingabe
        System.out.print("Bitte geben Sie eine Zahl für die Seite A ein: ");

        //eingaber einer zahl
        seiteA = tastatur.nextInt();

        //aufforderung zur eingabe
        System.out.print("Bitte geben Sie eine Zahl für die Seite B ein: ");

        //eingaber einer zahl
        seiteB = tastatur.nextInt();

        //berechnen den umfang und die fläche
        umfang = (seiteA + seiteB) * 2;
        flaeche = seiteA * seiteB;

        //leerzeil
        System.out.println();

        //ausgabe der ergebnisse
        System.out.println("SeiteA (in cm): " + seiteA);
        System.out.println("SeiteB (in cm): " + seiteB);
        System.out.println("Umfang = " + umfang + " cm");
        System.out.println("Flaeche = " + flaeche + " cm²");

        //Schließen des Scanners
        tastatur.close();
    }
}