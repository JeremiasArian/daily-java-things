import java.util.ArrayList;
import java.util.List;

public class Printing {

    public static void divisionOfTwoNumbers() {
        System.out.println("Division: " + (50 / 3));
    }

    public static void multipleOperations() {
        int first = -5 + 8 * 6;
        int second = (55 + 9) % 9;
        int third = 20 + -3 * 5 / 8;
        int fourth = 5 + 15 / 3 * 2 - 8 % 3;

        List<Integer> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        System.out.println(list);
    }

    public int productOfTwoNumbers(int first, int second) {
        return first * second;
    }
}
