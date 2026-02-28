public class Between10And20 {
    static void main(String[] args) {
        int x = 11;

        if(x < 10) {
            System.out.println("Less than 10");
        } else if (x >= 11 && x <= 19) {
            System.out.println("Between 10 and 20");
        } else if (x >= 20){
            System.out.println("Greater than or equal to 20");

        }
    }
}
