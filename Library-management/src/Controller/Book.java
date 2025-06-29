package Controller;
import Model.BookModel;
import Model.Library;
import java.util.*;
public class Book implements BookAbstract{
    @Override
    public void addBook(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Book Title: ");
        String title=sc.nextLine();
        System.out.println();
        System.out.print("Enter the Book Author: ");
        String author=sc.nextLine();
        System.out.println();
        System.out.print("Enter the Publication Date: ");
        String publication_date=sc.nextLine();
        System.out.println();
        Library.addBook(new BookModel(title,author,publication_date));
    }

    @Override
    public void deleteBook(){

    }
    @Override
    public void searchBook(){
        
    }
    @Override
    public void displayAllBooks(){
        for(BookModel b: Library.getBook()){
            System.out.println("Title: "+b.getTitle()+"\nAuthor: "+b.getAuthor()+"\nDate of publication: "+b.getPublication());
            System.out.println();
        }
    }
}
