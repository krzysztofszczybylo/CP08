
public class Audiobook extends Book
{
    private int minutes;
    private int seconds;
    
    public Audiobook(String title, String author, String name, String city, int minutes, int secodns){
        super(title, author, name, city);
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int getMinutes(){
        return this.minutes;
    }
    public int getSeconds(){
        return this.seconds;
    }
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    public void setSeconds(int Seconds){
        this.minutes = minutes;
    }
    public String toString(){
        return "Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor() + "\nPublisher: " + getName() + ", " + getCity() + "\nDuration: " + this.minutes + ":" + this.seconds;
    }
    public void display(){
        System.out.println(toString());
    }
    public static void main(String[] args){
        Book b1 = new Book("Pierwszy śnieg", "Jo Nesbo", "Nowa Era", "Warszawa");
        Audiobook a1 = new Audiobook(b1.getTitle(), b1.getTitle(), b1.getName(), b1.getCity(), 123, 11);
        Audiobook a2 = new Audiobook("Market Leader Advanced", "Iwonna Dubicka", "Publisher", "London", 212, 6);
        b1.display();
        a1.display();
        a2.display();
    }
}
