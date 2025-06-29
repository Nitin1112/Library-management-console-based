package View;
import java.util.*;
import Controller.*;
public class BookMenu {
    public void display(){
        Book BookControl =new Book();
        Scanner sc= new Scanner(System.in);
        System.out.println("1. Add book");
        System.out.println("2. Delete book");
        System.out.println("3. Search book");
        System.out.println("4. View books");

        int n=sc.nextInt();
        switch(n){
            case 1:
                BookControl.addBook();
                break;
            case 2:
                BookControl.deleteBook();
                break;
            case 3:
                BookControl.searchBook();
                break;
            case 4:
                BookControl.displayAllBooks();
                break;
            default:
                System.out.println("Enter valid number");
        }
    }
}
