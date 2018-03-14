package edu.ycp.cs320.IslandAdventure.model;

public class Account 
{
	// Fields
	private String username;
	private String password;
	private Player player;
	private Location map[][][];
	
	//Constructors

	
	public Account(String username, String password, Player player, Location[][][] map){
		this.username = username;
		this.password = password;
		this.player = player;
		this.map = map;
	}
	
	
	// Methods
	
	public String getUsername(){
		return this.username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public Player getPlayer(){
		return this.player;
	}
	
	public void setPlayer(Player player){
		this.player = player;
	}
	
	public Location[][][] getMap(){
		return this.map;
	}
	
	public void setMap(Location[][][] map){
		this.map = map;
	}
}
