import java.util.Scanner;

public class Rabattsystem {

    public static void main(String[] args) {

        double bestellwert;

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihren Bestellwert ein: ");
        bestellwert = tastatur.nextDouble();

        if (bestellwert >= 0.0 && bestellwert <= 100.0) {
            bestellwert = bestellwert * 0.9;
        }

        else if (bestellwert > 100.0 && bestellwert <= 500.0) {
            bestellwert = bestellwert * 0.85;
        }

        else {
            bestellwert = bestellwert * 0.8;
        }

        System.out.println("Der Bestellwert abzüglich Rabatt beträgt: " + bestellwert + " EUR");
    }
}
