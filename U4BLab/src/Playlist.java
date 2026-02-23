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



    public void sortArtistNameAZ()
    {
        for(int i = 0; i < this.music.size();i++)
        {
            int mindex = i;

            for(int j = i +1; j < this.music.size(); j ++)
            {


                if(0 > (this.music.get(j).getArtistName().compareToIgnoreCase(this.music.get(mindex).getArtistName())))
                {
                    mindex = j;
                }
            }
            Song temp = this.music.get(i);
            this.music.set(i,this.music.get(mindex));
            this.music.set(mindex,temp);
        }

    }

    public void sortArtistNameZA()
    {
        for(int i = 0; i < this.music.size();i++)
        {
            int mindex = i;

            for(int j = i +1; j < this.music.size(); j ++)
            {


                if(0 < (this.music.get(j).getArtistName().compareToIgnoreCase(this.music.get(mindex).getArtistName())))
                {
                    mindex = j;
                }
            }
            Song temp = this.music.get(i);
            this.music.set(i,this.music.get(mindex));
            this.music.set(mindex,temp);
        }
    }

    public void oldest()
    {
        for(int i = 1; i < this.music.size();i++)
        {
            int tempYear = this.music.get(i).getYear();
            Song tempValue = this.music.get(i);

            int position = i;

            while(position > 0 && this.music.get(position -1).getYear() > tempYear)
            {
                this.music.set(position,this.music.get(position -1));
                position --;
            }
            //Insert value in the sorrted location
            this.music.set(position,tempValue);


        }

    }

    public void newest()
    {
        for(int i = 1; i < this.music.size();i++)
        {
            int tempYear = this.music.get(i).getYear();
            Song tempValue = this.music.get(i);

            int position = i;

            while(position > 0 && this.music.get(position -1).getYear() < tempYear)
            {
                this.music.set(position,this.music.get(position -1));
                position --;
            }
            //Insert value in the sorrted location
            this.music.set(position,tempValue);

        }

    }

    public void Search(String goal)
    {
        ArrayList <Song> output = new ArrayList<>();

        for(int i = 0; i < this.music.size();i++)
        {
            if(this.music.get(i).getGenre().equalsIgnoreCase(goal))
            {
                //System.out.println(this.music.get(i).toString());
                output.add(this.music.get(i));
            }
        }


        for (Song song : output) {
            System.out.println(song.toString());
        }
        if(output.isEmpty())
        {
            System.out.println("There is no genre called " + goal);
        }

    }


}
