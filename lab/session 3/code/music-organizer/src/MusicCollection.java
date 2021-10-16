import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        player = new MusicPlayer();
        files = new ArrayList<Music>();
    }

    /**
     * Add a file to the collection.
     * @param music The file to be added.
     */
    public void addFile(Music music)
    {
        this.files.add(music);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return this.files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        System.out.println(index + " : " + files.get(index).getName());
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for(int i = 0; i < files.size() ; i++)
            System.out.println(i + " ) name : "
                    + files.get(i).getName()
                    + " / singer : "+files.get(i).getSinger()
                    +" / year " + files.get(i).getYear());
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        files.remove(index);
        System.out.println("removed!");
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.startPlaying(files.get(index).getName());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        if(index > 0 && index <= files.size())
            return true;
        else
            return false;

    }
    public void search (String musicName)
    {
        boolean flag = false;
        for(int i = 0; i < files.size(); i++)
        {
            if(files.get(i).getName().equals(musicName))
            {
                flag = true;
                System.out.println("index = " + i);
                break;
            }
        }
        if(flag == false)
            System.out.println(musicName + " Not found");
    }
}