public class Book
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;

    public Book(int r, java.lang.String t)
    {
        // initialise instance variables
        rating = r;
        title = t;

    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t){
        title = t;
    }
    public int getRating(){
        return rating;
    }
}
