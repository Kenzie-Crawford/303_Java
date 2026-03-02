import java.util.Arrays;
public class ArrayOfStrings {
    public static void main(String[] args) {

        String[] strings = {"red", "green", "blue", "yellow"};
        String[] clone = strings.clone();

        System.out.println(strings.length);
        System.out.println(Arrays.toString(clone));

    }
}
