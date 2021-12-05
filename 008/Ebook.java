
public class Ebook extends Book
{
    private String fileName;
    
    public Ebook(String title, String author, String name, String city, String fileName){
        super(title, author, name, city);
        this.fileName = fileName;
    }
    public String getFileName(){
        return fileName;
    }
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    public String toString(){
        return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPublisher: " + getName() + ", " + getCity() + "\nFile name: " + this.fileName;
    }
    public void display(){
        System.out.println(toString());
    }
    public static void main(String[] args){
        
        Book b1 = new Book("Pan Tadeusz", "Adam Mickiewicz", "Greg", "Kraków");
        Ebook eb1 = new Ebook("Dziady", "Adam Mickiewicz", "Greg", "Kraków", "dziady.pdf");
        Ebook eb2 = new Ebook("Wesele", "Stanisław Wyspiański", "Greg", "Kraków", "wesele.epub");
        b1.display();
        eb1.display();
        eb2.display();
    }
}
