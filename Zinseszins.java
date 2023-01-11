import java.util.Scanner;

public class Zinseszins {

    public static void main(String[] args) {

        int vertragsLaufzeit;
        double eingezahlt;
        double kapital;
        double zinssatz;

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Vertragslaufzeit: ");
        vertragsLaufzeit = tastatur.nextInt();

        System.out.print("Kapital: ");
        kapital = tastatur.nextDouble();

        System.out.print("Zinssatz: ");
        zinssatz = tastatur.nextDouble();
        System.out.println();

        eingezahlt = kapital;

        for (int i = 0; i < vertragsLaufzeit; i++) {
            kapital = kapital + kapital * (zinssatz/100);
        }

        System.out.printf("Eingezahltes Kapital: %.2f Euro\n", eingezahlt);
        System.out.printf("Ausgezahltes Kapital: %.2f Euro", kapital);
    }
}
