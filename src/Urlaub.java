import java.util.Scanner;

public class Urlaub {

    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        String land = stringEinlesen(tastatur, "Geben Sie ihr Reiseland ein: ");
        double budget = doubleEinlesen(tastatur, "Geben Sie ihr Reisebudget ein (in Euro): ");

        budget = umrechnen(land, budget);
        String waehrung = waehrungErmitteln(land);

        System.out.println("Ihr Budget beträgt umgerechnet: " + budget + " " + waehrung);

        abbuchen(tastatur,budget,waehrung,land);
    }

    public static void abbuchen(Scanner tastatur, double budget, String waehrung, String land) {

        double grundBudget = budget;

        while (true) {
            double eingabe = doubleEinlesen(tastatur, "Geben Sie eine Abbuchung ein (in Fremdwährung): ");
            if (eingabe > budget) {
                System.out.println("Abbuchung zu groß, kein Budget mehr übrig! Probieren Sie einen kleineren Betrag! ");
                continue;
            }
            budget = budget - eingabe;
            System.out.println("Sie haben noch: " + budget + " " + waehrung);
            if (budget < (0.1 * grundBudget) && budget > 0) {
                double neuesBudget = doubleEinlesen(tastatur,"Budget kleiner als 10% vom Ursprung, bitte neues Budget (in Euro) eintragen oder 0 eingeben zum Beenden: ");
                if (neuesBudget == 0) {
                    System.out.println("Eingabe 0: Programm beendet!");
                    break;
                }
                else {
                    budget = umrechnen(land, neuesBudget);
                    grundBudget = budget;
                    System.out.println("Ihr neues Budget beträgt: " + budget + " " + waehrung);
                }
            }
            if (budget == 0) {
                System.out.println("Sie sind pleite!");
                break;
            }
        }

    }

    public static String waehrungErmitteln(String land){

        String waehrung = "";

        switch (land) {
            case "USA", "usa", "Usa" -> waehrung = "USD (Dollar)";
            case "Japan", "japan" -> waehrung = "JPY (Yen)";
            case "England", "england" -> waehrung = "GBP (Pfund)";
            case "Schweiz", "schweiz" -> waehrung = "CHF (Franken)";
            case "Dänemark", "dänemark" -> waehrung = "DKK (Kronen)";
        }

        return waehrung;
    }


    public static double umrechnen(String land, double budget) {

        switch (land) {
            case "USA", "usa", "Usa" -> budget = budget * 0.98;
            case "Japan", "japan" -> budget = budget * 141;
            case "England", "england" -> budget = budget * 0.88;
            case "Schweiz", "schweiz" -> budget = budget * 0.96;
            case "Dänemark", "dänemark" -> budget = budget * 7.44;
        }

        return budget;
    }

    public static double doubleEinlesen(Scanner tastatur, String text) {
        System.out.print(text);
        return tastatur.nextDouble();
    }

    public static String stringEinlesen(Scanner tastatur, String text) {
        System.out.print(text);
        return tastatur.next();
    }

}
