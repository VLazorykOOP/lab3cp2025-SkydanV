package Visitor;

public class Foreword implements BookElement {
    @Override
    public void beWritten(BookWriter writer) {
        writer.create(this);
    }
}
