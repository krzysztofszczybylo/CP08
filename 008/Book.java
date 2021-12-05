
public class Book extends Publisher
{
    private String title;
    private String author;
    
    public Book(String title, String author, String name, String city){
        super(name, city);
        this.title = title;
        this.author = author;
        
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String toString(){
        return "Title: " + title + "\nAuthor: " +author + "\nPublisher: " + getName()+ ", " + getCity();
    }
    public void display(){
        System.out.println(toString());
    }
    public static void main (String[] args){
        Publisher p1 = new Publisher("Greg", "Kraków");
        Book b1 = new Book("Pan Tadeusz", "Adam Mickiewicz", p1.getName(), p1.getCity());
        Book b2 = new Book("Dziady", "Adam Mickiewicz", p1.getName(), p1.getCity());
        b1.display();
        b2.display();
    }
    
}
