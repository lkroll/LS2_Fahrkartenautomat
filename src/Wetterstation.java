public class Wetterstation {

    public static void main(String[] args) {

        double[] wetterdaten = { -15.55, -2.55, -11.44, -8.6, -14.4, -5.17, 1.48, -3.47, 2.00, 2.14, 4.05, 7.45, 3.25, 5.04, 11.4, 7.67, 8.64, 13.28, 6.87, 15.54, 12.45, 16.55, 20.42, 22.38, 19.58, 18.85, 23.84, 24.42, 25.54, 28.35, 30.16, 32.44, 26.55, 22.13, 16.64, 13.33, 16.45, 17.34, 15.33, 11.13, 15.16, 11.44, 6.55, 2.13, 6.64, 3.33, 6.45, -1.34, 5.33, -11.15 };
        double durchschnitt;
        double summe = 0.0;
        double min = 0.0;
        double max = 0.0;
        double maxDiff = 0.0;
        double diff;

        for (int i = 0; i < wetterdaten.length; i++) {
            summe = summe + wetterdaten[i];
            if (wetterdaten[i] < min) min = wetterdaten[i];
            if (wetterdaten[i] > max) max = wetterdaten[i];
            if (i < wetterdaten.length-1) {
                diff = wetterdaten[i]-wetterdaten[i+1];
                if (diff > maxDiff){
                    maxDiff = diff;
                }
            }
        }

        durchschnitt = Math.round ((summe / wetterdaten.length) * 100.0) / 100.0;

        System.out.println("Anzahl an Daten: " + wetterdaten.length);
        System.out.println("Durchschnittstemperatur: " + durchschnitt);
        System.out.println("Minimum " + min);
        System.out.println("Maximum " + max);
        System.out.println("Umschwung: " + (maxDiff))   ;
    }

}
