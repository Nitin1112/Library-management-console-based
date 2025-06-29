package Controller;
import Model.BookModel;
import Model.Library;
import java.util.*;
public class Book implements BookAbstract{
    Scanner sc= new Scanner(System.in);
    @Override
    public void addBook(){
        System.out.println();
        System.out.println();
        System.out.println("----------ADDING A NEW BOOK----------");
        System.out.print("Enter the Book Title: ");
        String title=sc.nextLine();
        System.out.print("Enter the Book Author: ");
        String author=sc.nextLine();
        System.out.print("Enter the Publication Date: ");
        String publication_date=sc.nextLine();
        System.out.println();
        Library.addBook(title,new BookModel(title,author,publication_date));
    }

    @Override
    public void deleteBook(){
        System.out.println();
        System.out.println();
        System.out.println("!!----------DELETE A BOOK----------!!");
        System.out.print("Enter the book name: ");
        String bookName =sc.nextLine();
        System.out.println();
        Library.deleteBook(bookName);
    }
    @Override
    public void searchBook(){
        System.out.println();
        System.out.println();
        System.out.println("----------SEARCH BOOK----------");
        System.out.print("Enter the Title of the book: ");
        String title=sc.nextLine();
        System.out.println();
        if(Library.getBook().containsKey(title)){
            System.out.println(Library.getBook().get(title));
        }
        else{
            System.out.println("No Book found in the title \""+title+"\"");
        }
    }
    @Override
    public void displayAllBooks(){
        System.out.println();
        System.out.println();
        System.out.println("----------DISPLAYING BOOKS----------");
        for (Map.Entry<String, BookModel> e : Library.getBook().entrySet()) {
            System.out.println(e.getValue()); 
            System.out.println(); 
        }
    }
}
