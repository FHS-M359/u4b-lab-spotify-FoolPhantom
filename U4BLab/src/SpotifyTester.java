import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SpotifyTester {

     public static void main(String[] args) throws FileNotFoundException, NoSuchElementException {
         Scanner unique = new Scanner( new File("H:\\M359 MacTavish\\u4b-lab-spotify-FoolPhantom\\U4BLab\\src\\spotify_unique_years_artists.txt"));

         Scanner scan = new Scanner(System.in);

         ArrayList <Song> testplaylist=  new ArrayList<Song>();
         ArrayList <Song> PartySong = new ArrayList<>();

         while(unique.hasNextLine())
         {
             String[] fullSong = unique.nextLine().split(",");
             String songName = fullSong[0];
             String artistName = fullSong[1];
             String album = fullSong[2];
             int time = Integer.parseInt(fullSong[3]);
             int year = Integer.parseInt(fullSong[4]);
             String genre = fullSong[5];


             Song temp = new Song(songName,artistName,album,time,year,genre);
            PartySong.add(temp);
         }

         Playlist uniqueSpotify = new Playlist(PartySong);
         Song testSong = new Song("Born this Way","Lady gaga","daddasdsa",423,2010,"Music");

         System.out.println(uniqueSpotify.toString());

         testplaylist.add(testSong);
         Playlist test = new Playlist(testplaylist);
         System.out.println(test.toString());
     }



}
