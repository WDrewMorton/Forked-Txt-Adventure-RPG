//Notes
// What will happen if two players are in the same room and call getRoom

// @author Nick McCarty & Drew Morton
// Txt RPG created by Drewbie Dew and Nickie Poo

// This will be the Main method that will be the method that runs the game.

import java.util.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.*; 

public class Main {
	
	public static void main(String[] args){
			
		
		File file = new File("World.txt");
		ArrayList<String> rooms = new ArrayList<String>();
		
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				rooms.add(sc.nextLine());
			}
			sc.close();
			
		}  catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
		
	    Room Room = new Room(rooms.get(0), rooms.get(1), rooms.get(2), rooms.get(3), rooms.get(4));
	    
	    System.out.println(Room.getCurrentRoom());
	    System.out.println(Room.getNorthRoom());
	    System.out.println(Room.getSouthRoom());
	    System.out.println(Room.getEastRoom());
	    System.out.println(Room.getWestRoom());
	    
	  }

}