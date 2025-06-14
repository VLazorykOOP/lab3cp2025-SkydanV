package Visitor;

public class BookPage implements BookElement {
    @Override
    public void beWritten(BookWriter writer) {
        writer.create(this);
    }
}
