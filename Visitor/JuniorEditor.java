package Visitor;

public class JuniorEditor implements BookWriter {
    @Override
    public void create(BookPage bookPage) {
        System.out.println("Junior: Writing simple book page...");
    }

    @Override
    public void create(Illustration illustration) {
        System.out.println("Junior: Adding basic illustration...");
    }

    @Override
    public void create(Foreword foreword) {
        System.out.println("Junior: Writing rough foreword...");
    }
}
