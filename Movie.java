public class Movie
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private int duration;// in minutes
    public Movie(int r, String t, int dur)
    {
        // initialise instance variables
        rating = r;
        title = t;
        duration = dur;

    }
    public String getTitle(){
        return title;
    }
    public double getDurationH(){//duration in hours
        return duration/60;//integer division
    }
    public double getDurationM(){//duration in minutes
        return duration - 60*getDurationH();
    }
    public void setTitle(String t){
        title = t;
    }
    public int getRating(){
        return rating;
    }
}
