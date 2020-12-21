package lesson2;

public class Student extends Person{

    @Override
    public void saySmth(String smth) {
        System.out.println("Student method:");
        super.saySmth(smth);

    }
    public void session() {
        System.out.println("i'm crying");
    }
}
