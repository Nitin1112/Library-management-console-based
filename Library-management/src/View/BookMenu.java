package View;
import Controller.*;
import java.util.*;
public class BookMenu {
    public void display(){
        Book BookControl =new Book();
        Scanner sc= new Scanner(System.in);
        System.out.println();
        System.out.println("1. Add book");
        System.out.println("2. Delete book");
        System.out.println("3. Search book");
        System.out.println("4. View books");
        System.out.println("5. <--Back");
        System.out.print("Enter an option: ");
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
            case 5:
                return;
            default:
                System.out.println("Enter valid number");
        }
    }
}
