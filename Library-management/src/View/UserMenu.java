package View;

import java.util.*;
public class UserMenu {
    public void display(){
        Scanner sc= new Scanner(System.in); 
        System.out.println();
        System.out.println("Add user");
        System.out.println("Enter user Phone: ");

        int n=sc.nextInt();
        switch (n){
            case 1:
                
                break;
            default:
                throw new AssertionError();
        }
    }
}
