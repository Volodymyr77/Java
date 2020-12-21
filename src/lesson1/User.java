package lesson1;

public class User {
    int id=0;
    int age=0;
    String name = "john";
    double weight = 0.0f;
    double height = 0.0f;
    boolean status = true;

    public User() {

    }

    public User(int id, int age, String name, double weight, double height, boolean status) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.status = status;
    }

    public User(int id, int age, double weight, double height) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + this.id +
                ", age=" + this.age +
                ", name='" + this.name + '\'' +
                ", weight=" + this.weight +
                ", status=" + this.status +
                '}';
    }
public String greeting(String msg) {
       return msg + " my name is " + this.name + ", and I " + this.age + " old" ;
}

}
