import java.util.Scanner;

public class Volumen {

    public static void main(String[] args) {

        double input;

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Geben Sie die Seitenlänge ein (in cm): ");
        input = tastatur.nextDouble();

        System.out.println("Das Volumen des Würfels beträgt: " + wuerfelVolumen(input) + " cm³");
    }

    public static double wuerfelVolumen(double x) {
        return Math.pow(x,3);
    }
}
