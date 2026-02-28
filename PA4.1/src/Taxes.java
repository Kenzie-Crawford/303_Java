import java.util.Scanner;

public class Taxes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Filing Status:");
        System.out.println("1 = Single");
        System.out.println("2 = Married Filing Jointly");
        System.out.println("3 = Married Filing Separately");
        System.out.println("4 = Head of Household");

        System.out.print("Enter your status: ");
        int status = scanner.nextInt();

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        double tax = 0;

        // SINGLE
        if (status == 1) {

            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = income * 0.15;
            else if (income <= 82250)
                tax = income * 0.25;
            else if (income <= 171550)
                tax = income * 0.28;
            else if (income <= 372950)
                tax = income * 0.33;
            else
                tax = income * 0.35;
        }

        // MARRIED FILING JOINTLY
        else if (status == 2) {

            if (income <= 16700)
                tax = income * 0.10;
            else if (income <= 67900)
                tax = income * 0.15;
            else if (income <= 137050)
                tax = income * 0.25;
            else if (income <= 208850)
                tax = income * 0.28;
            else if (income <= 372950)
                tax = income * 0.33;
            else
                tax = income * 0.35;
        }

        // MARRIED FILING SEPARATELY
        else if (status == 3) {

            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = income * 0.15;
            else if (income <= 68525)
                tax = income * 0.25;
            else if (income <= 104425)
                tax = income * 0.28;
            else if (income <= 186475)
                tax = income * 0.33;
            else
                tax = income * 0.35;
        }

        // HEAD OF HOUSEHOLD
        else if (status == 4) {

            if (income <= 11950)
                tax = income * 0.10;
            else if (income <= 45500)
                tax = income * 0.15;
            else if (income <= 117450)
                tax = income * 0.25;
            else if (income <= 190200)
                tax = income * 0.28;
            else if (income <= 372950)
                tax = income * 0.33;
            else
                tax = income * 0.35;
        }

        else {
            System.out.println("Invalid filing status.");
            scanner.close();
            return;
        }

        System.out.println("Tax owed: $" + tax);

        scanner.close();
    }
}
