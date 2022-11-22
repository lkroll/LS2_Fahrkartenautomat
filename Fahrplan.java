import java.util.Scanner;

public class Fahrplan {

    public static void main(String[] args) {

        // Weichenstellungen
        int fahrzeit = 0;
        boolean haltInSpandau;
        boolean richtungHannover;
        boolean ueberStendal;
        boolean endetInW;
        boolean richtungBraunschweig;
        int Ziel;

        // Zielabfrage
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Wählen sie ihr Ziel:");
        System.out.println("1: Hannover");
        System.out.println("2: Wolfsburg");
        System.out.println("3: Braunschweig");
        System.out.println("4: Hamburg");

        Ziel = tastatur.nextInt();

        // Setzen der Weichen je nach Ziel
        if (Ziel == 1) {
            haltInSpandau = false;
            richtungHannover = true;
            richtungBraunschweig = false;
            ueberStendal = true;
            endetInW = false;
        }

        else if (Ziel == 2) {
            haltInSpandau = false;
            richtungHannover = true;
            richtungBraunschweig = false;
            ueberStendal = false;
            endetInW = true;
        }

        else if (Ziel == 3) {
            haltInSpandau = false;
            richtungHannover = true;
            richtungBraunschweig = true;
            ueberStendal = false;
            endetInW = false;
        }

        else { // Hamburg
            haltInSpandau = true;
            richtungHannover = false;
            richtungBraunschweig = false;
            ueberStendal = false;
            endetInW = false;
        }

        fahrzeit = fahrzeit + 8; // Fahrzeit Hbf -> Spandau

        // Halt in Spandau + 2 min
        if (haltInSpandau) fahrzeit = fahrzeit + 2; // Halt in Spandau

        if (richtungHannover) { // Richtung Hannover
            fahrzeit = fahrzeit + 34;
            if (ueberStendal) { // Strecke über Stendal Hbf
                fahrzeit = fahrzeit + 16;
            }
            else { // Umfahrung Stendal
                fahrzeit = fahrzeit + 6;
            }
            if (endetInW) { // Ende in Wolfsburg
                fahrzeit = fahrzeit + 29;
                System.out.println("\nSie erreichen Wolfsburg nach " + fahrzeit + " Minuten");
            }
            else if (richtungBraunschweig) { // Ende in Braunschweig
                fahrzeit = fahrzeit + 50;
                System.out.println("\nSie erreichen Braunschweig nach " + fahrzeit + " Minuten");
            }
            else { // Ende in Hannover
                fahrzeit = fahrzeit + 62;
                System.out.println("\nSie erreichen Hannover nach " + fahrzeit + " Minuten");
            }
        }
        else { // Richtung Hamburg
            fahrzeit = fahrzeit + 96;
            System.out.println("\nSie erreichen Hamburg nach " + fahrzeit + " Minuten");
        }

    }

}