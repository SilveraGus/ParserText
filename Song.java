public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favourite;
    public Song(int r, double p, java.lang.String s)
    {
        // initialise instance variables
        rating = r;
        price = p;
        title = s;
        
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t){
        title = t;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double i){
        price = i;
    }
    public void addToFavorites() {
        favourite = true;
    }
    public int getRating(){
        return rating;
    }
}
