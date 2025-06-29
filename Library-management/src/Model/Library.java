package Model;

import java.util.*;
public class Library{
    private static HashMap<String,BookModel> BookHash=new HashMap<>();
    private static HashMap<String,UserModel> UserHash=new HashMap<>();

    public static HashMap<String,BookModel> getBook(){
        return BookHash;
    } 
    public static HashMap<String,UserModel> getUser(){
        return UserHash;
    }
    public static void addBook(String title,BookModel newBook){
        BookHash.put(title,newBook);
    }
    public static void deleteBook(String title){
        BookHash.remove(title);
    }

}