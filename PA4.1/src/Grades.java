import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input < 0 || input > 100) {
            System.out.println("Score out of range");
        }
        else if (input >= 90) {
            System.out.println("Grade: A");
        }
        else if (input >= 80) {
            System.out.println("Grade: B");
        }
        else if (input >= 70) {
            System.out.println("Grade: C");
        }
        else if (input >= 60) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
        scanner.close();


    }
}
