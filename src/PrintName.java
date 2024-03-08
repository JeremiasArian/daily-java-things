import java.util.Scanner;

public class PrintName {
    public static void print() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name in the below line:");
        String input = scanner.nextLine();
        Name name = new Name();
        name.setName(input);
        System.out.println(name);
        System.out.println();
    }
}
