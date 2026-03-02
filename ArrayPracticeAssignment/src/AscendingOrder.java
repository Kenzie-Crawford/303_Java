import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] array = {4, 2, 9, 13, 1, 0};
        int biggest = array[0];
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > biggest) {
                biggest = array[i];
            }

            if (array[i] < smallest) {
                smallest = array[i];
            }

            Arrays.sort(array);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("The smallest number is " + smallest);
        System.out.println("The biggest number is " + biggest);


    }
}


