
package Bridge;
public abstract class Book {
    protected Author author;

    protected Book(Author author) {
        this.author = author;
    }

    public abstract void developBook();
}