package training_prewiev;

public class XXX {
    public static void main(String[] args) {
        User user1 = new User();
        User bobik = new User(1, "bobik", 21, 34332);
        User kulik = new User(2, "kulik", 33, 23455);

        boolean result = bobik.age > kulik.age;
        result = bobik.cash == kulik.cash;
        System.out.println(result);

        String a = "oktenweb";
        String b = new String("sdad");
        System.out.println(a == b);
    }
}
