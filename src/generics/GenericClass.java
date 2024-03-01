package generics;

public class GenericClass<T> {
    private final T thing;

    public GenericClass(T thing) {
        this.thing = thing;
    }

    public T getThing() {
        return this.thing;
    }
}
