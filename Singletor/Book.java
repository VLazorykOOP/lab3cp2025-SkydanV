package Singletor;
public class Book{
    private static Book book;
    private static String name = "book list. \n\n";

    public static Book getBook(){
if(book == null){
    book = new Book();
    }
    return book;
   }
   private Book(){

   }
   public void addBook(String bookName){
    name += bookName + "\n";
}
public void showBook(){
    System.out.println(name);
}
}