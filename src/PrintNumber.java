import java.util.Scanner;

public class PrintNumber {
    public static void print() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number in the below line:");
        int intInput = scanner.nextInt();
        Number number = new Number(intInput);
        number.setNumber(intInput);
        System.out.println(number);
        System.out.println();
    }
}
