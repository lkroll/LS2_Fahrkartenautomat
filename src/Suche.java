import java.util.Scanner;

public class Suche {

    public static void main(String[] args) {

        int[] zahlenArray = { 1, 5, 5, 7, 3, 11, 22, 23, 27 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Eingabe: ");
        int eingabe = scanner.nextInt();
        boolean gefunden = false;

        for (int i=0; i < zahlenArray.length ; i++) {
            if (eingabe == zahlenArray[i]) {
                gefunden = true;
                break;
            }
        }

        if (gefunden) {
            System.out.println("Gefunden");
        }
        else {
            System.out.println("Nicht gefunden");
        }

    }

}
