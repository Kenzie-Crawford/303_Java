public class DoubleTuition {
    public static void main(String[] args) {

        int years = 0;

        double tuition = 10000;

        while (tuition < 20000) {
            tuition = tuition * 1.07;
            years ++;

        }
        System.out.println("Tuition doubles in " + years + " years.");
    }
}
