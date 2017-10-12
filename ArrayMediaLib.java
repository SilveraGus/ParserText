public class ArrayMediaLib
{
    // instance variables - replace the example below with your own
    private static String[] names = {  
                   "Jamal",
                   "Emily",
                   "garbage",
                   "Mateo",
                   "Sofia"  // notice no comma
                };
    private static String[] sharingFriends = names;
    private static int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
    private static int total = 0;
    private static String names2[] = {"Adam", "Barbara", "Carlos", "Dianne"};

    private static Song[] topTenSongs = {  
                   new Song(10, 6.95, "The Twist"),
                   new Song(1, 9.95, "Smooth"),
                   new Song(4, 9.95, "Mack The Knife"),
                   new Song(1, 9.95, "How Do I live"),
                   new Song(1, 9.95, "Party Rock Anthem"),
                   new Song(1, 9.95, "I Gotta Feeling"),
                   new Song(1, 9.95, "Macarena (Bayside Boys Mix)"),
                   new Song(1, 9.95, "Physical"),
                   new Song(1, 9.95, "You Light Up My Life"),
                   new Song(1, 9.95, "Hey Jude")
                   
                };
    
    public ArrayMediaLib()
    {
        // initialise instance variable
        sharingFriends = names;
    }
    public static void songthings()
    {
        // initialise instance variable
        for (Song s: topTenSongs)
        {
            System.out.println(s.getTitle()); 
        }
        // change the array
        System.out.println("-BEFORE--");
       /* for (Song changeSong : topTenSongs) {
            changeSong.setTitle("test");
            System.out.println(changeSong.getTitle());
        }*/
        // show the array
        for (Song i : topTenSongs) {
            i.setPrice(1.29);
        }
        for(int i = 2; i<topTenSongs.length; i+=3){
            topTenSongs[i].setPrice(0.99);    
        }
        System.out.println("-AFTER--");
        for (Song showSong : topTenSongs) {
            System.out.print(showSong.getPrice());
            System.out.print("—");
            System.out.println(showSong.getTitle());
        }
    }
    public static void main(){
       for(int i = 0; i<sharingFriends.length; i++){
           System.out.println(sharingFriends[i]);
        }
    }
    public static void getAverage(){
       for(int i = 0; i<daysBtwnPurchase.length; i++){
           total = total + daysBtwnPurchase[i];
        }
        total = total/daysBtwnPurchase.length;
        System.out.println(total);
    }
    
}
