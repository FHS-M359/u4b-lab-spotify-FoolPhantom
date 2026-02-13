import java.util.ArrayList;
import java.util.Scanner;

public class SpotifyTester {

     public static void main(String[] args) {
         Scanner unique = new Scanner("H:\\M359 MacTavish\\u4b-lab-spotify-FoolPhantom\\U4BLab\\src\\spotify_unique_years_artists.txt");

         Scanner scan = new Scanner(System.in);

         ArrayList <Song> testplaylist=  new ArrayList<Song>();
         Song testSong = new Song("Born this Way","Lady gaga","daddasdsa",423,2010,"Music");
         System.out.println(testSong.toString());
         testplaylist.add(testSong);
         Playlist test = new Playlist(testplaylist);
         System.out.println(test.toString());
     }



}
