import java.util.ArrayList;
public class Library
{
    private String name;
    private ArrayList<Book> books;
    
    public Library(String name, ArrayList<Book> books){
        this.name = name;
        this.books = books; 
    }
    public void display(){
        System.out.println(this.name + "\nOferta biblioteki: ");
        for(Book book : this.books){
            System.out.println(book);
        }
    }
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<Book>();
        Book b1 = new Book("title", "author", "publisher", "city");
        Book eb1 = new Ebook("title1","author1","publisher1", "city1", "ebook.pdf");
        Book eb2 = new Ebook("title2", "author2","publisher2", "city2", "ebook.epub");
        Book ab1 = new Audiobook("title3", "author3", "publisher3", "city3", 39, 55);
        Book ab2 = new Audiobook("title4", "author4", "publosghe==r4", "city4", 67, 23);
        books.add(b1);
        books.add(eb1);
        books.add(eb2);
        books.add(ab1);
        books.add(ab2);
        Library l = new Library("Biblioteka miejska", books);
        l.display();
        
    }
    
}
