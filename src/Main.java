import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> List = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        GenericClass<Integer> integerObj = new GenericClass<>(5436);
        System.out.println("Generic Integer return: " + integerObj.getThing());
        GenericClass<String> stringObj = new GenericClass<>("Hello World");
        System.out.println("Generic String return: " + stringObj.getThing());

        System.out.println("Print random int number:");
        System.out.println(random.nextInt(5));
        System.out.println("Print random double number:");
        System.out.println(random.nextDouble() * 5);

        System.out.println("Print random int numbers:");
        for (int i = 0; i < 10; i++) {
            List.add(random.nextInt(5));
        }
        System.out.println(List);

        System.out.println("Default random Math:");
        System.out.println(Math.random());
        System.out.println("Custom range random math:");
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random() * 5);
        }

        System.out.println("----------------------------------------------");
        System.out.println("Printing");
        System.out.println("----------------------------------------------");
        System.out.println();

        // Printing a name.
        System.out.println("Enter your name:");
        String input = scanner.nextLine();
        PrintName name = new PrintName();
        name.setName(input);
        System.out.println(name);

        //Printing a number.
        System.out.println("Enter a number:");
        int intInput = scanner.nextInt();
        PrintNumber number = new PrintNumber(intInput);
        number.setNumber(intInput);
        System.out.println(number);

        //Printing sum.
        System.out.println("Enter a number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter another number:");
        int secondNumber = scanner.nextInt();
        SumOfNumbers newSum = new SumOfNumbers(firstNumber, secondNumber);
        System.out.println(newSum);

        //Printing division.
        System.out.println("Enter a number:");
        int dividend = scanner.nextInt();
        System.out.println("Enter another number:");
        int divisor = scanner.nextInt();
        DivisionOfTwoNumbers division = new DivisionOfTwoNumbers(dividend, divisor);
        System.out.println(division);

        //Printing product.
        System.out.println("Enter a number:");
        int firstProductNumber = scanner.nextInt();
        System.out.println("Enter another number:");
        int secondProductNumber = scanner.nextInt();
        ProductOfNumbers product = new ProductOfNumbers(firstProductNumber, secondProductNumber);
        System.out.println(product);

        //Printing a two-dimensional array.
        System.out.println("Enter a number:");
        int row = scanner.nextInt();
        System.out.println("Enter another number:");
        int column = scanner.nextInt();
        TwoDimensionalArray theArray = new TwoDimensionalArray(row, column);
        System.out.println(theArray);
    }
}
