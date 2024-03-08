public class DefaultJavaRandomMath {
    public static void print() {
        System.out.println("Default random Math:");
        System.out.println(Math.random());
        System.out.println("Custom range random math:");
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random() * 5);
        }

        System.out.println();
    }
}
