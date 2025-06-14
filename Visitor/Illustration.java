package Visitor;

public class Illustration implements BookElement {
    @Override
    public void beWritten(BookWriter writer) {
        writer.create(this);
    }
}
