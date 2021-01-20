package lesson5;


import java.util.*;

public class MainList {

    public static void main(String[] args) {
//    List<String> list = new ArrayList<>();
//         list.add("first");
//        list.add("second");
//        list.add("third");
//        list.add("fouth");

//        String[] ar = new  String[] {"first", "second"};
//        List  = Arrays.asList(ar);
//        System.out.println(strings);

//    String s1 = "Hello";
//    String s2 = "Hello";
//
//        Person p1 = new Person(1, "Naras");
//        Person p2 = new Person(2, "Naras");
//
//        System.out.print(s1.equals(s2));
//        System.out.println(p1.equals(p2));

//        List<Person> list = new ArrayList<>();
//        list.add(new Person(1,"Taras"));
//        list.add(new Person(2,"Ihor"));
//        list.add(new Person(3,"Hanna"));

//        for (Person person : list) {
//            if (person.getName().startsWith("I")) {
//                System.out.println(person);
//            }
//        }

//        Iterator<Person> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            final Person p = iterator.next();
//            System.out.println(p);
//            iterator.remove();
//        }
//        System.out.println(list);

//        Set<Person> set = new HashSet<>();
//        set.add(new Person(1, "Olenf"));
//        set.add(new Person(2, "Volodymyr"));
//        set.add(new Person(3, "Roman"));
//        set.add(new Person(1, "Serhiy"));
//        set.add(new Person(2, "Volodymyr"));

        Map<String, Person> map = new HashMap<>();
        map.put("first", new Person(1, "Olena"));
        map.put("second", new Person(2, "Ihor"));
        map.put("third", new Person(3, "Dir"));


        System.out.println(map);

    }
}
