import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class PrintRandomNumber {
    public static void print() {
        Random random = new Random();
        List<Integer> List = new ArrayList<>();

        System.out.println("Print random int numbers:");

        for (int i = 0; i < 10; i++) {
            List.add(random.nextInt(5));
        }
        System.out.println(List);

        System.out.println();
    }
}
