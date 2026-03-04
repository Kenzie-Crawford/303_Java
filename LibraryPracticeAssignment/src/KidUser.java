public class KidUser implements LibraryUser{
    int age;
    String bookType;

    public void registerAccount() {
        if (age <= 11) {
            System.out.println("You have successfully registered under a Kids account");
        } else if (age > 11) {
            System.out.println("Sorry, you must be less then 12 to register as a kid.");
        }
    }

    public void requestBook() {
        if(bookType.equals("Kids")) {
            System.out.println("Book issued successfully. Please return the book within 10 days.");
        } else {
            System.out.println("Oops, you are only allowed to take kids books.");
        }
    }
}
