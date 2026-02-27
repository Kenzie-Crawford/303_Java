import java.util.Arrays;

public class SplitMethodDemo {
    static void main(String[] args) {
        String vowels = "a::b::c::d:e";

        String[] result = vowels.split("::");
        System.out.println("result = " + Arrays.toString(result));

    }
}
