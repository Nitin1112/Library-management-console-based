package Model;
public class BookModel{
    private String title;
    private String author;
    private String publication_date;

    public BookModel(String title, String author, String publication_date){
        this.title=title;
        this.author=author;
        this.publication_date=publication_date;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
    
    public String getPublication(){
        return publication_date;
    }

    
    @Override
    public String toString(){
        return "Title: "+title+"\nAuthor: "+author+"\nPublication Date: "+publication_date;
    }
}