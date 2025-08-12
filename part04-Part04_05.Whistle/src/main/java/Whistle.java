/**
 * This is a class that represents a whistle that is given a custom sound. It 
 * has an attribute sound and a method sound which prints the whistle's sound
 * out
 * 
 * <p> The class could be used in a game application or for the purposes of
 * demonstrating persistence of class attributes to students of computer 
 * science </p>
 * 
 * @author Adam McCarthy
 * @version 1.0
 */
public class Whistle {
    /**
     * The sound the whistle will make.
     */
    private String sound;
    
    /**
     * Constructs a new whistle with a specified sound.
     * 
     * @param sound     a custom sound the whistle will make
     */
    public Whistle(String sound){
        this.sound = sound;
    }
    
    /**
     * Prints the sound the whistle makes
     */
    public void sound(){
        System.out.println(this.sound);
    }
}
