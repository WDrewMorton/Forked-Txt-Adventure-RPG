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

public class GameController {
	
	private static File file;
	private static ArrayList<String> roomList = new ArrayList<String>();
	
	public static void main(String[] args){
		setFile("World.txt");
		Room room = new Room();
		GameView gameView = new GameView();
		gameView.setStartVisible();
		room.setCurrentRoom("Bathroom");
		scanTextFile(file, room);
	    System.out.println(room.getNorthRoom());
	    System.out.println(room.getSouthRoom());
	    System.out.println(room.getEastRoom());
	    System.out.println(room.getWestRoom());
	    
	  }
	
	/*
	 * update(Room room)
	 * Desc: Whenever new information or data is stored or changed, this will update the "player view".
	 * @param room: room object needed for any changes or updates within it.
	 */
	public static void update(Room room) {
		room.setCurrentRoom(roomList.get(0));
		room.setNorthRoom(roomList.get(1));
		room.setSouthRoom(roomList.get(2));
		room.setEastRoom(roomList.get(3));
		room.setWestRoom(roomList.get(4));
	}
	
	/*
	 * scanTextFile(File file, Room room)
	 * Desc: Use to read game file from World.txt
	 * @param file: the file should be a text document in order for it to be read
	 * @param room: the room object that it is reading from and updating is considered here the "player view"
	 */
	private static void scanTextFile(File file, Room room) {
		ArrayList<String> tempRooms = new ArrayList<String>();
		String strRoom = "[" + room.getCurrentRoom() + "]";
		try {
			Scanner sc = new Scanner(file);
			String strLine = "";
			tempRooms.add(room.getCurrentRoom());
			while ((strLine = sc.nextLine()) != null && sc.hasNextLine()) {
				if (strLine.equals(strRoom)) {
					for (int i = 0; i <=3; i++) {
						tempRooms.add(sc.nextLine());
					}
					break;
				}
			}
				
			if (tempRooms.equals(roomList)) {

			}
				
			else {
				setRoomList(tempRooms);
				update(room);
			}
			
			sc.close();
				
		}	catch (FileNotFoundException e) {
				e.printStackTrace();
		}
	}
		
	
	public static ArrayList<String> getRoomList() {
		return roomList;
	}
	
	public static void setRoomList(ArrayList<String> roomList) {
		GameController.roomList = roomList;
	}

	public static File getFile() {
		return file;
	}

	public static void setFile(String fileName) {
		GameController.file = new File(fileName);
	}

}