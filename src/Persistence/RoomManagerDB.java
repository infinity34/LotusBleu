
package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import Data.ClassRoom;
import Data.Office;
import Data.Room;
import Tools.DBconnection;

/**
 * 
 * @author remy
 * @author Design Prisca
 */
public class RoomManagerDB extends RoomManager {
	/**
	 * Tools allows the connection to the dataBase
	 */
	public DBconnection dBconnection;

	/**
	 * Constructor of RoomManagerDB
	 * this class deals with the persistent
	 *  of an object room
	 *  We use a Data Base as persistence
	 */
	public RoomManagerDB() {
		super();
		this.dBconnection = DBconnection.getConnection();
	}

	/**
	 * @return the connection
	 */
	public DBconnection getConnection() {
		return dBconnection;
	}

	/**
	 * @param connection the connection to set
	 */
	public void setConnection(DBconnection connection) {
		this.dBconnection = connection;
	}

	/**
	 * Initialize the list rooms
	 * with the rooms presents in the database
	 */
	public void loadRooms() {
		try {
			ResultSet resultatClassRoom = dBconnection.getState().executeQuery(
					"SELECT * FROM lotusbleu.ROOM where roomType='ClassRoom'");
			while (resultatClassRoom.next()) {
				this.addListRoom(new ClassRoom(resultatClassRoom.getString("roomName"),
						resultatClassRoom.getInt("roomArea"),
						resultatClassRoom.getInt("numberOfParticpant")));
			}

			ResultSet resultatOffice = dBconnection.getState().executeQuery(
					"SELECT * FROM lotusbleu.ROOM where roomType='ClassRoom'");
			while (resultatOffice.next()) {
				this.addListRoom(new ClassRoom(resultatOffice.getString("roomName"),
						resultatOffice.getInt("roomArea"),
						resultatOffice.getInt("numberOfParticpant")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * add a room to the list rooms
	 * and add the room in the DB
	 * @param room
	 */
	public boolean addRoom( Room room ) {
		this.addListRoom(room);
		int statut = 0;
		
		try {
			if(room.getClass().getSimpleName().equals("ClassRoom")){

				statut = dBconnection.getState().executeUpdate(
						"INSERT INTO `lotusbleu`.`ROOM` (`roomName`, `roomArea`, `numberOfParticpant`, `roomType`)"
								+ "VALUES ('"+ room.getRoomName() +"', "
								+ room.getArea() +", "
								+((ClassRoom)room).getMaximumNumberOfParticipant() 
								+", 'ClassRoom')");
			}
			else if(room.getClass().getSimpleName().equals("Office")){
				statut = dBconnection.getState().executeUpdate(
						"INSERT INTO `lotusbleu`.`ROOM` (`roomName`, `roomArea`, `numberOfParticpant`, `roomType`)"
								+ "VALUES ('"+ room.getRoomName() +"', "
								+ room.getArea() +", "
								+"null , Office)");
			}
			else{
				//TODO Exception
				System.out.println("probleme room invalide");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statut>0;
	}

	/**
	 * allows to add a classRoom to the database and to the list
	 * @param name 
	 * @param area
	 * @param numberOfParticipant
	 */
	public boolean addRoom( String name, int area, int numberOfParticipant ) {
		Room room = new ClassRoom(name, area, numberOfParticipant);
		this.addListRoom(room);
		int statut = 0;
		try {
			statut = dBconnection.getState().executeUpdate(
					"INSERT INTO `lotusbleu`.`ROOM` (`roomName`, `roomArea`, `numberOfParticpant`, `roomType`)"
							+ "VALUES ('"+ room.getRoomName() +"', "
							+ room.getArea() +", "
							+((ClassRoom)room).getMaximumNumberOfParticipant() 
							+", 'ClassRoom')");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statut >0;
	}

	/**
	 * allows to add an office to the database and to the list
	 * @param name
	 * @param area 
	 */
	public boolean addRoom(  String name, int area ) {
		Room room = new Office(name, area);
		this.addListRoom(room);
		int statut = 0;
		
		try {
			statut = dBconnection.getState().executeUpdate(
					"INSERT INTO `lotusbleu`.`ROOM` (`roomName`, `roomArea`, `numberOfParticpant`, `roomType`)"
							+ "VALUES ('"+ room.getRoomName() +"', "
							+ room.getArea() +", "
							+"null , 'Office')");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statut>0;
	}
	
	/**
	 * Delete a room of the DB
	 * and of the list rooms
	 * @param room
	 * @return true if the update 
	 * has modified the room 
	 * 
	 */
	public boolean removeRoom(Room room) {
		this.removeListRoom(room);
		int result = 0;
		try {
			result = dBconnection.getState().executeUpdate(
					"DELETE FROM Room WHERE roomName = '"
							+ room.getRoomName() +"'");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result>0;
	}
	
	/**
	 * Delete a room with the name "name" of the DB
	 * and of the list rooms
	 * @param name
	 * @return true if the udate has modified a room
	 * in the DB
	 */
	public boolean removeRoom(String name) {
		this.removeListRoom(name);
		int result = 0;
		try {
			result =dBconnection.getState().executeUpdate(
					"DELETE FROM `lotusbleu`.`ROOM` WHERE roomName = '"
							+ name +"'");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result>0;
	}

	/**
	 * get the room with the name name
	 * in The DB
	 * @param name
	 */
	public Room getRoom(String name){
		try{
			ResultSet resultatRoom = dBconnection.getState().executeQuery(
					"SELECT * FROM lotusbleu.ROOM WHERE roomName = '"
							+ name+"'");
			if (resultatRoom.next()){
				
				Room room;
				
				String nameRoom = resultatRoom.getString("roomName");
				int area = resultatRoom.getInt("roomArea");
				if (resultatRoom.getString("roomType").equals("ClassRoom")){
					int NB = resultatRoom.getInt("numberOfParticpant");
					room = new ClassRoom(nameRoom, area, NB);
				}
				else{
					room = new Office(nameRoom, area);
				}
				return room;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	/**
	 * update a room oldroom
	 * with a name, and an area
	 * @param name
	 * @param  area
	 * @param  oldroom
	 * @return true if the update 
	 * has found the old room
	 * and if it has modified its fields
	 */
	public boolean updateRoom(String name, int area, Room oldroom) {
		int result = 0;
		try {
			result = dBconnection.getState().executeUpdate(
					"UPDATE `lotusbleu`.`ROOM` SET roomName ='" + name 
									+ "', roomArea = "+ area
									+" WHERE  roomName = '" + oldroom.getRoomName() +"'");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return result>0;
	}

}
