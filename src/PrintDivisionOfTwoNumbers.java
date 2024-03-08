import java.util.Scanner;

public class PrintDivisionOfTwoNumbers {
    public static void print() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number in the below line:");
        int dividend = scanner.nextInt();
        System.out.println("Enter another number in the below line:");
        int divisor = scanner.nextInt();
        DivisionOfTwoNumbers division = new DivisionOfTwoNumbers(dividend, divisor);
        System.out.println(division);
        System.out.println();
    }
}
