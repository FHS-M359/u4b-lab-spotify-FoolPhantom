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
        for(int i = 0; i < this.music.size();i++)
        {
            int mindex = i;

            for(int j = i +1; j < this.music.size(); j ++)
            {

                if(this.music.get(mindex).getYear() > this.music.get(j).getYear())
                {
                    mindex = j;
                }
            }

            Song temp = this.music.get(i);
            this.music.set(i,this.music.get(mindex));
            this.music.set(mindex,temp);
        }
    }

    public void newest()
    {
        for(int i = 0; i < this.music.size();i++)
        {
            int maxdex = i;

            for(int j = i +1; j < this.music.size(); j ++)
            {

                if(this.music.get(maxdex).getYear() < this.music.get(j).getYear())
                {
                    maxdex = j;
                }
            }

            Song temp = this.music.get(i);
            this.music.set(i,this.music.get(maxdex));
            this.music.set(maxdex,temp);
        }

    }

    public void Search(String goal)
    {
        ArrayList <Song> output = new ArrayList<>();

        for(int i = 0; i < this.music.size();i++)
        {
            if(this.music.get(i).getGenre().equalsIgnoreCase(goal))
            {
                output.add(this.music.get(i));
            }
        }

        System.out.println(output.toString());

    }


}
