public class ArrayUebung {

    public static void main(String[] args) {
        System.out.println("Aufgabe 1: ");
        aufgabe1();
        System.out.println("\nAufgabe 2: ");
        aufgabe2();
    }

    public static void aufgabe1(){

        int[] zahlen = {1, 6, 3, 7, 2};
        int i = 4;

        System.out.println(zahlen[1]); // 6
        // System.out.println(zahlen[5]); // Error: Index out of Bounds
        System.out.println(zahlen[3]); // 7
        System.out.println(zahlen[i]); // 2
        System.out.println(zahlen[i-2]); // 3
        System.out.println(zahlen[zahlen[4]]); // 3

    }

    public static void aufgabe2(){

        int[] zahlen = {1, 6, 3, 7, 2, 2, 4, 8};

        // 3, 7,
        for (int i=2; i<=3; i++) {
            System.out.print(zahlen[i] + ", ");
        }

        // Error
        /*
        for (int i=0;  i<=zahlen.length;  i++) {
            System.out.print (zahlen[i] + ", ");
        }
        */

        System.out.println();

        // 6, 7, 2, 8,
        for (int i=1; i<=zahlen.length-1; i=i+2) {
            System.out.print(zahlen[i] + ", ");
        }

    }

}
