import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SpotifyTester {

     public static void main(String[] args) throws FileNotFoundException, NoSuchElementException {
         Scanner unique = new Scanner( new File("H:\\M359 MacTavish\\u4b-lab-spotify-FoolPhantom\\U4BLab\\src\\spotify_unique_years_artists.txt"));

         Scanner scan = new Scanner(System.in);

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

         boolean isActive = true;
         String options = "==== Spotify Menu ==== \n1- Sort by artist (A-Z) \n";
         options += "2- Sort by artist (Z-A) \n3- Sort by year (Oldest - Newest) \n";
         options += "4- Sort by year (Newest - Oldest) \n5- Search all by genre \n";
         options += "6- Display all songs \n7- Quit \n";

         while(isActive)
         {
             System.out.println(options);
             int answer = scan.nextInt();

             if(answer == 7)
             {
                 isActive = false;
             }

             if(answer == 6)
             {
                 System.out.println(String.format("%-30s %-30s %-30s %-5s %-30s", "Song Name", "Artist", "Album", "Year", "Genre"));
                 System.out.println(uniqueSpotify.toString());
             }

             if(answer == 5)
             {
                 System.out.println("Please enter genre desired");
                 scan.nextLine();
                 String genre = scan.next();

             }



             if(answer == 4)
             {
                 System.out.println(String.format("%-30s %-30s %-30s %-5s %-30s", "Song Name", "Artist", "Album", "Year", "Genre"));
                 uniqueSpotify.newest();
                 System.out.println(uniqueSpotify.toString());
             }

             if(answer == 3)
             {
                 System.out.println(String.format("%-30s %-30s %-30s %-5s %-30s", "Song Name", "Artist", "Album", "Year", "Genre"));
                 uniqueSpotify.oldest();
                 System.out.println(uniqueSpotify.toString());
             }

             if(answer == 2)
             {
                 System.out.println(String.format("%-30s %-30s %-30s %-5s %-30s", "Song Name", "Artist", "Album", "Year", "Genre"));
                 uniqueSpotify.sortArtistNameZA();
                 System.out.println(uniqueSpotify.toString());
             }

             if(answer == 1)
             {
                 System.out.println(String.format("%-30s %-30s %-30s %-5s %-30s", "Song Name", "Artist", "Album", "Year", "Genre"));
                 uniqueSpotify.sortArtistNameAZ();
                 System.out.println(uniqueSpotify.toString());
             }


         }



     }



}
