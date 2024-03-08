import java.util.Scanner;

public class PrintSumOfNumbers {
    public static void print() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number in the below line:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter another number in the below line:");
        int secondNumber = scanner.nextInt();
        SumOfNumbers newSum = new SumOfNumbers(firstNumber, secondNumber);
        System.out.println(newSum);
        System.out.println();
    }
}
