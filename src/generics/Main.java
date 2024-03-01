package generics;

public class Main {
    public static void main(String[] args) {

        GenericClass<Integer> integerObj = new GenericClass<>(5436);
        System.out.println("Generic Integer return: " + integerObj.getThing());

        GenericClass<String> stringObj = new GenericClass<>("Hello World");
        System.out.println("Generic String return: " + stringObj.getThing());
    }
}
