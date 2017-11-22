package Intranet;

//import java.util.Vector;

public class Textbook {

    private String title;

    private String isbn;

//    private Vector<String> author;
  
//    public Vector<String> getAuthor() {
//        String answer = "";
//        for(Author a: author) {  
//            answer = answer + ", " + a; 
//        }
//    }

//    public void setAuthor(String Author) {
//        this.Author.add(Author);
//    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String toString(){
        return "Textbook title: " + title + ". ISBN: " + isbn + ". Author(s): "; //+ getAuthor(); 
    }
}

