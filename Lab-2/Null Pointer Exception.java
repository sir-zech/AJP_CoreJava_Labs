public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println("Length of the string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception.");
        }
    }
}

/* Output:
Error: Null pointer exception.
*/
