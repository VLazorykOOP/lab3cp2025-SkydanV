package Visitor;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book();
        BookWriter junior = new JuniorEditor();
        BookWriter senior = new SeniorEditor();

        System.out.println("Junior is working...");
        book.beWritten(junior);

        System.out.println("\n=======================\n");

        System.out.println("Senior is working...");
        book.beWritten(senior);
    }
}
