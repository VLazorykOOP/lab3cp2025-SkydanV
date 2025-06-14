package Bridge;

public class EBook extends Book {

    protected EBook(Author author) {
        super(author);
    }

    @Override
    public void developBook() {
        System.out.println("E-Book is being developed...");
    author.writeText();
    }
    
}