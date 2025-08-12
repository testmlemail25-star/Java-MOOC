/**
  * This is a class that represents a room in a building. It has some attribute
  * such as the number of chairs in the room, and also the code used to locate
  * the room.
  *
  * <p> This class can be used in applications such as meeting management systems
  * or building layout trackers </p>
  *
  * @author Adam McCarthy
  * @version 1.0
  */
public class Room {

    /**
     * The code that represents the room location in the building.
     */
    private String code;
    /**
     * The number of seats available in the room.
     */
    private int seats;
    
    /**
     * Constructs a new room with the specified number of seats
     * 
     * @param code      the code used to identify the rooms location
     * @param seats     the number of seats located in the room
     */
    public Room(String code, int seats) {
        this.code = code;
        this.seats = seats;
    }

}
