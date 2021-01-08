package HW3;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString

public class Magazine extends magOfBook implements Printable{

    public Magazine(String name, int year) {
        super(name, year);
    }

    public static void printMagazine(List<Printable> printables) {
        for (Printable printBookMagazine : printables) {
         if (printBookMagazine instanceof Magazine) {
             System.out.println(((Magazine) printBookMagazine).getName() );
         }
        }
   }

    @Override
    public void print() {
        System.out.println(this);
    }
}
