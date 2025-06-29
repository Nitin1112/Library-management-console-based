package View;
import java.util.Scanner;
public class MainMenu {
    public void display(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println("1. Book");
            System.out.println("2. User");
            System.out.println("3. Lend");
            System.out.println("4. History");
            System.out.println("5. Exit");
            System.out.print("Enter an option: ");
            int n=sc.nextInt();

            switch(n){
                case 1:
                    BookMenu book=new BookMenu();
                    book.display();
                    break;
                    case 2:
                    UserMenu user=new UserMenu();
                    user.display();
                    break;
                    case 3:
                    LendMenu lend=new LendMenu();
                    lend.display();
                    break;
                    case 4:
                    History history=new History();
                    history.display();
                    break;
                    case 5:
                    System.exit(0);
                break;

                default: 
                    System.out.println("Enter Valid Option");
            }
        }
    }
}
