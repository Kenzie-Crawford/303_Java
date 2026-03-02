public class ArrayWithFiveElements {
   public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5};

       System.out.println(myArray[0]);
       System.out.println(myArray[myArray.length-1]);
       System.out.println(myArray[myArray.length]);
       myArray[5] = 15;
    }
}
