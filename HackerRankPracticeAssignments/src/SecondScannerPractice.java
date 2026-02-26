import java.util.Scanner;

class SecondScannerPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt for integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Prompt for double
        System.out.print("Enter a double: ");
        double pi = scanner.nextDouble();

        // Clear buffer
        scanner.nextLine();

        // Prompt for string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Print results
        System.out.println("You entered integer: " + num);
        System.out.println("You entered double: " + pi);
        System.out.println("You entered string: " + text);

        scanner.close();
    }
}
