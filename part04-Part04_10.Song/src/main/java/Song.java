
/**
 * This is a song object with attributes {@code name} and {@code length} and
 * methods to return these attributes.
 *
 * <p>
 * Calling the {@code name} method will return the song title. Calling the
 * {@code length} method returns the songs duration in seconds.
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class Song {

    /**
     * The name of the song.
     */
    private String name;
    /**
     * The length in seconds of the song.
     */
    private int length;

    /**
     * Construct a {@code song} object.
     *
     * @param initialName the name of the song
     * @param initialLength the length in seconds of the song
     */
    public Song(String initialName, int initialLength) {
        this.name = initialName;
        this.length = initialLength;
    }
    
    /**
     * Return the name of the song.
     * 
     * @return the songs name
     */
    public String name(){
        return this.name;
    }
    
    /**
     * Return the length of the song in seconds.
     * 
     * @return the song's length
     */
    public int length(){
        return this.length;
    }
}
