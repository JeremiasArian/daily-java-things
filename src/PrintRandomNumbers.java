import java.util.Random;

public class PrintRandomNumbers {
    public static void print() {
        Random random = new Random();

        System.out.println("Print random int number:");
        System.out.println(random.nextInt(5));
        System.out.println("Print random double number:");
        System.out.println(random.nextDouble() * 5);
        System.out.println();
    }
}
