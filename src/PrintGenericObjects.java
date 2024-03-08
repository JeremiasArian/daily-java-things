public class PrintGenericObjects {
    public static void print() {
        System.out.println();
        GenericClass<Integer> integerObj = new GenericClass<>(5436);
        System.out.println("Generic Integer return: " + integerObj.getThing());
        GenericClass<String> stringObj = new GenericClass<>("Hello World");
        System.out.println("Generic String return: " + stringObj.getThing());
        System.out.println();
    }
}
