
public class Publisher
{
    private String name;
    private String city;
    
    public Publisher(String name, String city){
        this.name = name;
        this.city = city;
    }
    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCity(String city){
        this.city = city;
    }
    
}
