
package Bridge;

public class BookCreator {
    public static void main(String[] args) {
        Book[] books = {
            new BookShop(new DetectiveNovelAuthor()),
            new EBook(new DarkRomanceAuthor())
        };

        for (Book book : books) {
         book.developBook();
        }
    }
}
