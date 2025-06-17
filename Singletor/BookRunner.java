package Singleton;

import Singleton.Book;

public class BookRunner {
public static void main(String[] args) {
    Book.getBook().addBook("Моторошне сяйво");
    Book.getBook().addBook("Пуаро веде слідство");
    Book.getBook().addBook("Воскреситель.Анатомія фантастичних істот");

    Book.getBook().showBook();
  }    
}
