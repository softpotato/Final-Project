package background;

import entity.*;
import java.util.ArrayList;

public class Room {
	
	private ArrayList<Barrier> barriers;			// ArrayList of all the barriers or walls in the Room
	private ArrayList<Entity> entities;				// ArrayList of all the entities or NPCs in the Room
	private ArrayList<Interactables> interactable;	// ArrayList of all the simple interactable elements in the room
	private ArrayList<Item> items;					// ArrayList of all the items or things that you can pick up and possible more than interact
	private ArrayList<Prop> props;					// ArrayList of all the simple accents in the Room
	private ArrayList<TileMap> tiles;				// ArrayList of all the tilemaps in the game. This loads first.
	private Player player;
	private Room nextRoom;
	private String description;
	private int roomNum;
	
	public Room() {
		
		barriers = new ArrayList<Barrier>();
		entities = new ArrayList<Entity>();
		interactable = new ArrayList<Interactables>();
		items = new ArrayList<Item>();
		props = new ArrayList<Prop>();
		tiles = new ArrayList<TileMap>();
		player = new Player();
		
	}
	
	public Room(Player player) {
		
		barriers = new ArrayList<Barrier>();
		entities = new ArrayList<Entity>();
		interactable = new ArrayList<Interactables>();
		items = new ArrayList<Item>();
		props = new ArrayList<Prop>();
		tiles = new ArrayList<TileMap>();
		this.player = player;
		
	}
	
	public Room(ArrayList<Item> items,Room nextRoom,String description) {
		
		
		
	}
	
	public ArrayList<Item> getItems() {
		
		return items;
		
	}
	
	public String getDescription() {
		
		return description;
		
	}
	
	public void setNextRoom(Room nextRoom) {
		
		this.nextRoom = nextRoom;
		
	}
	
	/*
	 * This method should sort all incoming data on a line by line basis.
	 */
	public void addItem(String text) {
		
		
		
	}
	
	public void addBarrier(String text) {
		
		
		
	}
	
	public void addEntity(String text) {
		
		
		
	}
	
	public void addProp(String text) {
		
		
		
	}
	
	public void addTiles(String text) {
		
		
		
	}
	
	public void addInteractable(String text) {
		
		
		
	}
	
	public int getRoomNum() {
		
		return roomNum;
		
	}
	
	public void setRoomNum(int roomNum) {
		
		this.roomNum = roomNum;
		
	}
	
	public Player getPlayer() {
		
		return player;
		
	}
	
	public void setPlayer(Player player) {
		
		this.player = player;
		
	}
	
}
