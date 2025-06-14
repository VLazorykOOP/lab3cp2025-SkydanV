package Visitor;

public class Book implements BookElement {
    private BookElement[] bookElements;

    public Book() {
        this.bookElements = new BookElement[] {
            new BookPage(),
            new Illustration(),
            new Foreword()
        };
    }

    @Override
    public void beWritten(BookWriter writer) {
        for (BookElement element : bookElements) {
            element.beWritten(writer);
        }
    }
}
