package HW3;

import java.util.ArrayList;
import java.util.List;

public class MainShop {

    public static void main(String[] args) {
//        Book book = new Book();
//        Magazine magazine = new Magazine();
//
//        book.print();
//        magazine.print();

        List<Printable> catalogOfBooks = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            catalogOfBooks.add(new Book("bookName" + (i+1), 2000+i));
            catalogOfBooks.add(new Magazine("magazineName" + (i + 1),2010 +i):
        }

        for (Printable catalogOfBook : catalogOfBooks) {
            catalogOfBook.print();
        }

       Magazine.printMagazine(catalogOfBooks);
        Book.printBooks(catalogOfBooks);
    }



}
