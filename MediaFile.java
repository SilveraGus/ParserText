import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Convenience class for getting input from the mymedia.txt file
 * 
 * @author ckinnard
 * @version 3/5/16
 */

public class MediaFile  
{
    private static final String DATA_FILE = "mymedia.txt";

    private static Scanner in;
    private static BufferedWriter out;
    MediaFile(){
       
  
    }
    /**
     * Opens a file to be used for input (if not already open),
     * reads a line from the file, and returns the entire line of data.
     * 
     * @return a line of text from the input file
     */
    public static String readString() {
        if (in == null) {
            try {
                in = new Scanner(new File(DATA_FILE));
            }
            catch (Exception e) {
                System.err.println("Cannot open file for input!");
                e.printStackTrace();
            }
        }
        try {
            if (in.hasNext()) {
                String s = in.nextLine();
                return s;
            }
            else {
                return null;
            }
        }
        catch (Exception e) {
            System.err.println("Cannot read  file!");
            e.printStackTrace();
        }
        return null;

    }

    /**
     * Oens a file to be used for output (if not already open),
     * writes a string to the file and wrties a newline.
     * 
     * @param s The string text to be written. Follwing the string, a newline is added to the file.
     */

    public static void writeStringFromLib() {
        //MediaLib.main();//calls all the things
        int numSongs = 7;
        Song songInfo[]=new Song[7]; 
        songInfo[0] = new Song(9001, 100.0, "Purple Reign");
        songInfo[1] = new Song(7, 35.0, "Hotel California");
        songInfo[2] = new Song(6, 18.0, "Hakuna Matata");
        songInfo[3] = new Song(7, 18.0, "another song");
        songInfo[4] = new Song(9, 18.0, "Sweet Talking Women");
        songInfo[5] = new Song(8, 18.0, "Hey Jude");
        songInfo[6] = new Song(5, 18.0, "west virinia");
        if (out == null) {
            try {
                out = new BufferedWriter(new FileWriter(DATA_FILE));
            }
            catch (Exception e) {
                System.err.println("Cannot create file for output!");
                e.printStackTrace();
            }
        }
        try {
            int i = 0;
                    out.write("My Favourite Songs");
                    out.newLine();
                    out.write("-------------------");
                    out.newLine();
            while(songInfo[i].getTitle() != null){
                boolean favourite = (songInfo[i].getRating() >= 8);//does the initial printing first
                if(favourite && i < 100){
                    //out.write("Title: ");
                    out.write(songInfo[i].getTitle());
                    out.write("(");
                    out.write(Double.toString(songInfo[i].getRating()));
                    out.write(")");
                    out.newLine();
                }
               /* else if(i < 100){//just using another check for limiting song amount
                    
                    //out.write("Title: ");
                    out.write(songInfo[i].getTitle());
                    out.write("(");
                    out.write(Double.toString(songInfo[i].getRating()));
                    out.write(")");
                    out.newLine();
                }*/
                ++i;
            }
        }
        catch (Exception e) {
            System.err.println("Cannot write file!");
            e.printStackTrace();
        }
    }
    public static void writeString(String s) {
        if (out == null) {
            try {
                out = new BufferedWriter(new FileWriter(DATA_FILE));
            }
            catch (Exception e) {
                System.err.println("Cannot create file for output!");
                e.printStackTrace();
            }
        }

        try {
            out.write(s);
            // out.newLine();
            out.write(" ");
            out.write("|");
        }
        catch (Exception e) {
            System.err.println("Cannot write file!");
            e.printStackTrace();
        }

    }

    /**
     * Saves and closes the file (when opened for either input or output). 
     * 
     * Note: If the program terminates before the file is closed,
     * no data will be saved or written to the file.
     */
    public static void saveAndClose() {
        if (in != null) {
            try {
                in.close();
                in = null;
            }
            catch (Exception e) {
                System.err.println("Cannot close input file!");
                e.printStackTrace();
            }
        }      
        if (out != null) {
            try {
                out.close();
                out = null;
            }
            catch (Exception e) {
                System.err.println("Cannot close output file!");
                e.printStackTrace();
            }
        }
    }
}
