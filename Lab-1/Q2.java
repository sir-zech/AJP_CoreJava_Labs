import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        int max = (num1 > num2) ? num1 : num2;
        System.out.println("The maximum number is: " + max);
    }
}

/*
Sample Output:
Enter first number: 
5
Enter second number: 
10
The maximum number is: 10
*/
