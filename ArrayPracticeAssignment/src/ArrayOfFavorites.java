import java.util.Scanner;
import java.util.Arrays;

public class ArrayOfFavorites {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int count = scanner.nextInt();
        scanner.nextLine();
        String [] favorites = new String [count];
        for (int i = 0; i < favorites.length; i ++) {
            System.out.println("Enter your favorite thing: ");
            favorites[i] = scanner.nextLine();

        }
        System.out.println("Your favorite things are: ");
        System.out.println(Arrays.toString(favorites));


    }
}
