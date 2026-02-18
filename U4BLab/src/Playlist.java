import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> music = new ArrayList<Song>();


    public Playlist(ArrayList<Song> music) {
        this.music = music;
    }

    public String toString()
    {
        String output = "";
        for(int i = 0; i < this.music.size(); i++)
        {
            //System.out.println(i +"+" +this.music);
            output += (this.music.get(i).toString() + "\n");
        }

        return output;
    }




}
