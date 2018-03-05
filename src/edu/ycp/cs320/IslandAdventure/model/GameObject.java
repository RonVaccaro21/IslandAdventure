package edu.ycp.cs320.IslandAdventure.model;

public class GameObject {
	
	// Fields
	private String name;
	private String description;
	private Integer x, y, z;
	
	// Constructors
	public GameObject() {
		
	}
	
	public GameObject(String name, String description, Integer x, Integer y, Integer z){
		this.name = name;
		this.description = description;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// Methods
	
	// Name methods (get and set)
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// Description methods (get and set)
	public String getDescription() {
		return this.description;
	}
	
	public void setDescript(String description) {
		this.description = description;
	}
	
	// XYZ methods (get and set)
	public Integer getX() {
		return this.x;
	}
	
	public void setX(Integer x) {
		this.x = x;
	}
	
	public Integer getY() {
		return this.y;
	}
	
	public void setY(Integer y) {
		this.y = y;
	}
	
	public Integer getZ() {
		return this.z;
	}
	
	public void setZ(Integer z) {
		this.z = z;
	}
}