package Model;

import java.util.*;
public class Library{
    private static HashSet<BookModel> BookHash=new HashSet<>();
    private static HashSet<UserModel> UserHash=new HashSet<>();

    public static HashSet<BookModel> getBook(){
        return BookHash;
    } 
    public static HashSet<UserModel> getUser(){
        return UserHash;
    }
    public static void addBook(BookModel newBook){
        BookHash.add(newBook);
    }
}