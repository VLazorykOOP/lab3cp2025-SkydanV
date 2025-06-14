package Visitor;

public class SeniorEditor implements BookWriter {
    @Override
    public void create(BookPage bookPage) {
        System.out.println("Senior: Editing book page thoroughly...");
    }

    @Override
    public void create(Illustration illustration) {
        System.out.println("Senior: Enhancing illustration quality...");
    }

    @Override
    public void create(Foreword foreword) {
        System.out.println("Senior: Writing polished foreword...");
    }
}
