//Notes
// What will happen if two players are in the same room and call getRoom

// @author Nick McCarty & Drew Morton
// Txt RPG created by Drewbie Dew and Nickie Poo

// This will be the Main class that will configure and run the game.

import java.util.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.*; 

public class Main {
	
	private static File file;
	private static ArrayList<String> rooms = new ArrayList<String>();
	public Character human;
	

// This will be the Main method that will be the method that runs the game.
	
	public static void main(String[] args){
		
		//Create character Human
		human = new Character.CharacterBuilder("Drew", "Swing", 100, 10, "Mighty Swing", "Sword");
		
		//TO DO: Test the below. If they print then they work as expected.
		System.out.println(human.getName());
		System.out.println(human.getAttack());
		System.out.println(human.getHealth());
		System.out.println(human.getPower());
		System.out.println(human.getPowerName());
		System.out.println(human.getWeapon());
		
		setFile("World.txt");
		scanTextFile(file);
	    Room Room = new Room(getRooms().get(0), rooms.get(1), rooms.get(2), rooms.get(3), rooms.get(4));
	    
	    System.out.println(Room.getCurrentRoom());
	    System.out.println(Room.getNorthRoom());
	    System.out.println(Room.getSouthRoom());
	    System.out.println(Room.getEastRoom());
	    System.out.println(Room.getWestRoom());
	    
	  }
	
	/*
	 * scanTextFile()
	 * Desc: Use to read game file from World.txt
	 * @param file: the file should be a text document in order for it to be read
	 */
	private static void scanTextFile(File file) {
		ArrayList<String> tempRooms = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				tempRooms.add(sc.nextLine());
			}
			
			if (tempRooms.equals(rooms)) {

			}
			else {
				setRooms(tempRooms);
			}
			sc.close();
			
		}	catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<String> getRooms() {
		return rooms;
	}
	
	public static void setRooms(ArrayList<String> rooms) {
		Main.rooms = rooms;
	}

	public static File getFile() {
		return file;
	}

	public static void setFile(String fileName) {
		Main.file = new File(fileName);
	}

}
