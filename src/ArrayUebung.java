public class ArrayUebung {

    public static void main(String[] args) {

        // 1. Deklaration eines Arrays für ganze Zahlen.
        int[] nummern;

        // 2. Initialisierung des Arrays mit 100 Elementen.
        nummern = new int[100];

        // 3. Durchlaufen des gesamten Arrays und Ausgabe des Inhalts.
        for (int i=0; i < nummern.length; i++) {
            System.out.println(nummern[i]);
        }

        // 4. Das Array mit allen ganzen Zahlen von 1 bis 100 befüllen.
        for (int i=0; i < nummern.length; i++) {
            nummern[i] = i+1;
        }

        // 5. Geben Sie den Wert an der 89. Position des Arrays aus.
        System.out.println(nummern[88]);

        // 6. Ändern Sie den Wert des Arrayelements mit dem Index 49 zu 1060.
        nummern[49] = 1060;

        // Außerdem ändern Sie den Wert an der ersten und der letzte Stelle des Arrays zu 2023.
        nummern[0] = 2023;
        nummern[nummern.length - 1] = 2023;

        // 7. Erneutes Ausgeben des Arrayinhalts.  Darstellung: Index und zugehöriger Inhalt (z.B. Index 6 - Inhalt: 7)
        for (int i=0; i < nummern.length; i++) {
            System.out.println("Index " + i + " - Inhalt: " + nummern[i]);
        }

        // 8. Berechnung des Durchschnitts aller Arrayelemente
        int summe = 0;
        for (int i=0; i < nummern.length; i++) {
            summe = summe + nummern[i];
        }
        System.out.println((double) summe / (double) nummern.length);

    }

}
