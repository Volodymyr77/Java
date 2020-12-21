package HW1;

public class User {
    int id = 0;
    int age = 0;
    String name = null;
    String surname = null;
    double weight = 0.0;
    double height = 0.0;

    public User(){}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
