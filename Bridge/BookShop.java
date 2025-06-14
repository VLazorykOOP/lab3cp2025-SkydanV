package Bridge;

public class BookShop extends Book {
    
    protected BookShop(Author writer) {
        super(writer);
    }

    @Override
    public void developBook() {
        System.out.println("Book shop is being developed...");
    author.writeText();
    }
}