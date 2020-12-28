package lesson3;

public interface Printable {

    int A = 4;

    void paint();

    default void method() {
        System.out.println("default");
    }
}
