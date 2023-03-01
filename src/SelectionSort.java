import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int min;
        int minIndex = 0;

        int[] liste = { 4, 2, 10, 3, -5, 0, 17 };

        for (int i = 0; i < liste.length-1; i++) {
            min = liste[i];
            for (int j = i+1; j < liste.length; j++) {
                if (liste[j] < min) {
                    min = liste[j];
                    minIndex = j;
                }
            }

            if (min < liste[i]) {
                int first = liste[i];
                liste[i] = min;
                liste[minIndex] = first;
            }
        }

        System.out.println(Arrays.toString(liste));
    }

}
