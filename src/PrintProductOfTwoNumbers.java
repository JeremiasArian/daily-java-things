import java.util.Scanner;

public class PrintProductOfTwoNumbers {
    public static void print() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number in the below line:");
        int firstProductNumber = scanner.nextInt();
        System.out.println("Enter another number in the below line:");
        int secondProductNumber = scanner.nextInt();
        ProductOfNumbers product = new ProductOfNumbers(firstProductNumber, secondProductNumber);
        System.out.println(product);
        System.out.println();
    }
}
