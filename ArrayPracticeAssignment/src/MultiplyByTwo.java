import java.util.Arrays;

public class MultiplyByTwo {
    public static void main(String[] args) {
        int [] array = new int [5];
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        System.out.println(Arrays.toString(array));
    }
    }

