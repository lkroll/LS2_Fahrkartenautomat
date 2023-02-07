import java.util.Scanner;

class Fahrkartenautomat {
    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        double eingezahlterGesamtbetrag;
        double zuZahlenderBetrag;

        begruessung();
        zuZahlenderBetrag = fahrkartenbestellungErfassung(tastatur);
        eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur,zuZahlenderBetrag);
        fahrkartenAusgeben();
        rueckgeldAusgeben(zuZahlenderBetrag,eingezahlterGesamtbetrag);

        tastatur.close();
    }

    static void begruessung() {
        System.out.println("Herzlich Willkommen!\n");
    }

    // Ticketauswahl
    public static double fahrkartenbestellungErfassung(Scanner tastatur) {

        int ticketAuswahl;
        int anzahlTickets;
        double zuZahlenderBetrag = 1;

        System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:\n");
        System.out.println("Kurzstrecke AB [2,00 EUR] (1)");
        System.out.println("Einzelfahrschein AB [3,00 EUR] (2)");
        System.out.println("Tageskarte AB [8,80 EUR] (3)");
        System.out.println("4-Fahrten-Karte AB [9,40 EUR] (4)\n");

        System.out.print("Ihre Wahl: ");
        ticketAuswahl = tastatur.nextInt();

        while (ticketAuswahl < 1 || ticketAuswahl > 4) {
            System.out.println(">> Falsche Eingabe! <<");
            System.out.print("Ihre Wahl: ");
            ticketAuswahl = tastatur.nextInt();
        }

        switch (ticketAuswahl){
            case 1 -> zuZahlenderBetrag = 2;
            case 2 -> zuZahlenderBetrag = 3;
            case 3 -> zuZahlenderBetrag = 8.80;
            case 4 -> zuZahlenderBetrag = 9.40;
        }

        // Anzahl der Tickets eingeben
        System.out.print("Anzahl der Tickets: ");
        anzahlTickets = tastatur.nextInt();

        while (anzahlTickets < 1 || anzahlTickets > 10){
            System.out.println(">> Wählen Sie bitte eine Anzahl zwischen 1 und 10! <<");
            System.out.print("Anzahl der Tickets: ");
            anzahlTickets = tastatur.nextInt();
        }

        return zuZahlenderBetrag * anzahlTickets;
    }

    // Geldeinwurf
    public static double fahrkartenBezahlen(Scanner tastatur, double zuZahlenderBetrag) {
        double eingeworfeneMuenze;
        double eingezahlterGesamtbetrag = 0.0;
        double nochZuZahlen = 0.0;
        while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
            nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
            System.out.printf("Noch zu zahlen: %1.2f Euro\n", nochZuZahlen);
            System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
            eingeworfeneMuenze = tastatur.nextDouble();
            eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
        }
        return eingezahlterGesamtbetrag;
    }

    // Fahrscheinausgabe
    public static void fahrkartenAusgeben() {
        System.out.println("\nFahrschein wird ausgegeben");
        for (int i = 0; i < 8; i++) {
            System.out.print("=");
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n\n");
    }

    // Rückgeldberechnung und -ausgabe
    public static void rueckgeldAusgeben(double zuZahlenderBetrag, double eingezahlterGesamtbetrag) {

        double rueckgabebetrag;

        rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
        if (rueckgabebetrag > 0.0) {
            System.out.printf("Der Rückgabebetrag in Höhe von %1.2f Euro\nwird in folgenden Münzen ausgezahlt:\n",rueckgabebetrag);

            rueckgabebetrag = muenzRueckgabe(rueckgabebetrag,2.0,"2 Euro");
            rueckgabebetrag = muenzRueckgabe(rueckgabebetrag,1.0,"1 Euro");
            rueckgabebetrag = muenzRueckgabe(rueckgabebetrag,0.5,"50 Cent");
            rueckgabebetrag = muenzRueckgabe(rueckgabebetrag,0.2,"20 Cent");
            rueckgabebetrag = muenzRueckgabe(rueckgabebetrag,0.1,"10 Cent");
            rueckgabebetrag = muenzRueckgabe(rueckgabebetrag,0.05,"5 Cent");
        }

        System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
                + "Wir wünschen Ihnen eine gute Fahrt.");

    }

    public static double muenzRueckgabe(double rueckgabebetrag, double x, String s) {

        while (rueckgabebetrag >= x) {
            System.out.println(s);
            rueckgabebetrag = Math.round((rueckgabebetrag - x) * 100.0) / 100.0;
        }

        return rueckgabebetrag;
    }
}
