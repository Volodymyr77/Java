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

public class Book extends magOfBook implements Printable {

    public Book(String name, int year) {
        super(name, year);
    }

    public static void printBooks(List<Printable> printables) {
        for (Printable printBookMagazine:
             printables) {
            if (printBookMagazine instanceof Magazine) {
                System.out.println(((Book) printBookMagazine).getName()); }
        }
    }


    @Override
    public void print() {
        System.out.println(this);
    }
}