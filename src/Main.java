import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> List = new ArrayList<>();

//        GenericClass<Integer> integerObj = new GenericClass<>(5436);
//        System.out.println("Generic Integer return: " + integerObj.getThing());
//
//        GenericClass<String> stringObj = new GenericClass<>("Hello World");
//        System.out.println("Generic String return: " + stringObj.getThing());

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
    }
}
