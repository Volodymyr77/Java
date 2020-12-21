package lesson2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor

public class Person {

    public Person () {}

    private int id;
    private  String name;



    public void saySmth(String smth) {
        System.out.println(smth);
        System.out.println(smth);
        System.out.println(smth);
   }
//   reload
    public void saySmth(int smth) {
        System.out.println(smth);
        System.out.println(smth);
        System.out.println(smth);
    }
//    reload
    public void saySmth(String smth, int s) {
        System.out.println(smth);
        System.out.println(smth);
        System.out.println(smth);
   }

   public String combintIdAndName() {
        return id + ": " + name;
   }

}
