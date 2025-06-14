package Visitor;

public interface BookWriter {
    void create(BookPage page);

    void create(Illustration illustration);
    
    void create(Foreword foreword);
}
