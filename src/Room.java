// Class for the global Room variables
public class Room{
  
    private String currentRoom;
	private String northRoom;
	private String southRoom;
	private String eastRoom;
	private String westRoom;
	  
    
	public Room(String currentRoom, String northRoom, String southRoom, String eastRoom, String westRoom) {
		this.currentRoom = currentRoom;
		this.northRoom = northRoom;
		this.southRoom = southRoom;
		this.eastRoom = eastRoom;
	    this.westRoom = westRoom;
	}
	  
	public void setCurrentRoom(String currentRoom){
		this.currentRoom = currentRoom;
	 }

	public String getCurrentRoom(){
	    return currentRoom;
	 }
	  
	public void setNorthRoom(String northRoom){
		this.northRoom = northRoom;
	  }

	public String getNorthRoom(){
	    return northRoom;
	  }
	  
	 public void setSouthRoom(String southRoom){
	    this.southRoom = southRoom;
	  }

	public String getSouthRoom(){
	    return southRoom;
	  }
	  
	public void setEastRoom(String eastRoom){
	    this.eastRoom = eastRoom;
	  }

	public String getEastRoom(){
	    return eastRoom;
	  }
	  
	public void setWestRoom(String westRoom){
	    this.westRoom = westRoom;
	  }

	public String getWestRoom(){
	    return westRoom;
	  }

    
}