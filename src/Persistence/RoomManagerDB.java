
package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import Data.ClassRoom;
import Data.Office;
import Data.Room;
import Tools.DBconnection;

/**
 * 
 */
public class RoomManagerDB extends RoomManager {
	/**
	 * Tools allows the connection to the dataBase
	 */
	public DBconnection dBconnection;

	/**
	 * 
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

	public void addRoom( Room room ) {
		this.addListRoom(room);
		try {

			if(room.getClass().getSimpleName().equals("ClassRoom")){

				dBconnection.getState().executeUpdate(
						"INSERT INTO `lotusbleu`.`ROOM` (`roomName`, `roomArea`, `numberOfParticpant`, `roomType`)"
								+ "VALUES ('"+ room.getRoomName() +"', "
								+ room.getArea() +", "
								+((ClassRoom)room).getMaximumNumberOfParticipant() 
								+", 'ClassRoom')");
			}
			else if(room.getClass().getSimpleName().equals("Office")){
				dBconnection.getState().executeUpdate(
						"INSERT INTO `lotusbleu`.`ROOM` (`roomName`, `roomArea`, `numberOfParticpant`, `roomType`)"
								+ "VALUES ('"+ room.getRoomName() +"', "
								+ room.getArea() +", "
								+"null , Office)");
			}
			else{
				//TODO
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * allows to add a classRoom to the database and to the list
	 * @param :STring name , int area, int numberOfParticipant (parameters of a classroom) 
	 */
	public void addRoom( String name, int area, int numberOfParticipant ) {
		Room room = new ClassRoom(name, area, numberOfParticipant);
		this.addListRoom(room);
		try {
			dBconnection.getState().executeUpdate(
					"INSERT INTO `lotusbleu`.`ROOM` (`roomName`, `roomArea`, `numberOfParticpant`, `roomType`)"
							+ "VALUES ('"+ room.getRoomName() +"', "
							+ room.getArea() +", "
							+((ClassRoom)room).getMaximumNumberOfParticipant() 
							+", 'ClassRoom')");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * allows to add an office to the database and to the list
	 * @param :int roomID, int area (parameters of a office) 
	 */
	public void addRoom(  String name, int area ) {
		Room room = new Office(name, area);
		this.addListRoom(room);
		try {
			dBconnection.getState().executeUpdate(
					"INSERT INTO `lotusbleu`.`ROOM` (`roomName`, `roomArea`, `numberOfParticpant`, `roomType`)"
							+ "VALUES ('"+ room.getRoomName() +"', "
							+ room.getArea() +", "
							+"null , Office)");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void removeRoom(Room room) {
		this.removeListRoom(room);
		try {
			dBconnection.getState().executeUpdate(
					"DELETE FROM Room WHERE roomName = '"
							+ room.getRoomName() +"'");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
