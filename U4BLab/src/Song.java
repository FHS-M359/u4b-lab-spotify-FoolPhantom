public class Song {
    private String songName;
    private String artistName;
    private String album;
    private int time;
    private int year;
    private String genre;

    public Song(String songName, String artistName, String album,int time, int year, String genre)
    {
        this.songName = songName;
        this.artistName = artistName;
        this.album = album;
        this.time = time;
        this.year = year;
        this.genre = genre;
    }

    public String toString()
    {
        String output = "";
        output += this.songName + " ";
        output += this.artistName+ " ";
        output += this.album+ " ";
        output += this.year+ " ";
        output += this.genre+ " ";
        output = String.format(output,"%-20s %10s %20s %6d %8s");

        return output;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbum() {
        return album;
    }

    public int getTime() {
        return time;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }
}
