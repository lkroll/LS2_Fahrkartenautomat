public class Test {

    public static void main(String[] args) {
        int wert;

        int n = 2;

        switch (n) {
            case 1:
                wert = 100;
                break;
            case 2:
            case 3:
                wert = 2500;
                break;
            default:
                wert = 1;
        }

        System.out.println (wert);
    }
}
