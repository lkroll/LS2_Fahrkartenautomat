public class Zahlen {

    public static void main(String[] args) {

        int counter;
        int max = 0;
        int zahl = 0;

        int[] zahlen = {3,4,2,3,5,1,2,7,2,1,2,4};

        for (int i=0; i < zahlen.length; i++) {
            counter = 0;
            for (int j=1; j < zahlen.length; j++) {
                if (zahlen[i] == zahlen[j]) counter++;
            }
            if (counter > max) {
                max = counter;
                zahl = zahlen[i];
            }
        }

        System.out.println("Häufigste Zahl: " + zahl + " (" + max + " Vorkommen)");

    }

}
