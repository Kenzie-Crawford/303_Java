import java.util.Arrays;

public class PrintAllExceptMiddle {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            if (i == array.length / 2) {
                continue;
            }
            System.out.println(array[i]);
        }
    }
}


