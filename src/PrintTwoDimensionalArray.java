import java.util.Scanner;

public class PrintTwoDimensionalArray {
    public static void print() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number in the below line:");
        int row = scanner.nextInt();
        System.out.println("Enter another number in the below line:");
        int column = scanner.nextInt();
        TwoDimensionalArray theArray = new TwoDimensionalArray(row, column);
        System.out.println(theArray);
        System.out.println();
    }
}
