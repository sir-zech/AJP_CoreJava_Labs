public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        try {
            System.out.println("Element at index 5: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        }
    }
}

/* Output:
Error: Array index out of bounds.
*/
