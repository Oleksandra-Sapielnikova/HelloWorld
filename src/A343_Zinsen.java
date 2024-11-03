import java.util.Scanner;

public class A343_Zinsen {
    public static void main(String[] args){

        //eingebung   der variablen
        double anfangsKapital, verzinstesKapital;
        int jahre, zinsen;

        //erstellen eines scanner-obkektes
        Scanner input = new Scanner(System.in);

        //aufforderung zur eingabe
        System.out.print("Bitte geben Sie Anfangskapital ein: ");
        anfangsKapital = input.nextDouble();

        System.out.print("Bitte geben Sie die Zinsen ein: ");
        zinsen = input.nextInt();

        System.out.print("Bitte geben Sie die Jahre ein: ");

        jahre = input.nextInt();
        double gesamt = anfangsKapital *(1 + zinsen/ 100);

        verzinstesKapital = Math.pow(gesamt, jahre);

//        verzinstesKapital = input.nextDouble();

        System.out.print(verzinstesKapital);


//        Verzinstes Kapital = Anfangskapital * (1 + Zinssatz / 100)Jahre
//
//                Konsolensicht
//        Einzahlung in Euro: 100000
//        Zinsen in Prozent: 4
//        Jahre: 10
//
//        Der Investor hat insgesamt 140000.0 Euro erhalten
//        Der Investor hat insgesamt 148024.42849183443 Euro erhalten (mit Zinseszins)




    }
}
