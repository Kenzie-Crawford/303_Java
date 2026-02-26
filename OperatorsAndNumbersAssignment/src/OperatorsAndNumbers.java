public class OperatorsAndNumbers {

    public static void main(String[] args) {


        int x = 2;
        System.out.println("Original decimal: " + x);
        System.out.println("Original binary: " + Integer.toBinaryString(x));

        // Prediction:
        // Decimal: 4
        // Binary: 100

        x = x << 1;

        System.out.println("Shifted decimal: " + x);
        System.out.println("Shifted binary: " + Integer.toBinaryString(x));



        int y = 9;
        // Prediction:
        // Decimal: 18
        // Binary: 10010

        y = y << 1;

        System.out.println("\n9 shifted:");
        System.out.println("Decimal: " + y);
        System.out.println("Binary: " + Integer.toBinaryString(y));



        int z = 17;
        // Prediction:
        // Decimal: 34
        // Binary: 100010

        z = z << 1;

        System.out.println("\n17 shifted:");
        System.out.println("Decimal: " + z);
        System.out.println("Binary: " + Integer.toBinaryString(z));



        int a = 88;
        // Prediction:
        // Decimal: 176
        // Binary: 10110000

        a = a << 1;

        System.out.println("\n88 shifted:");
        System.out.println("Decimal: " + a);
        System.out.println("Binary: " + Integer.toBinaryString(a));

    }
}
