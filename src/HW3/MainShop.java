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

        Book[] books = {
          new Book("1984", 1965),
          new Book("482", 1995),
          new Book("13",2913)
        };
        for (Book book : books) {
             if (book.year > 2000) System.out.println(book);

        }


        for (int i = 0; i < 4; i++) {
            catalogOfBooks.add(new Book("bookName" + (i+1), 2000 + i));
            catalogOfBooks.add(new Magazine("magazineName" + (i + 1),2010 +i));
        }

        for (Printable catalogOfBook : catalogOfBooks) {
            catalogOfBook.print();
        }

       Magazine.printMagazine(catalogOfBooks);
        Book.printBooks(catalogOfBooks);
    }



}
