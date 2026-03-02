import java.util.Arrays;

public class SwapFirstAndMiddle {
    static void main(String[] args) {
        String[] arr = {"red", "blue", "yellow", "green", "orange"};
        int middle = arr.length/2;
        String temp = arr[0];
        arr[0]= arr[middle];
        arr[middle]=temp;
        System.out.println(Arrays.toString(arr));


    }
}
