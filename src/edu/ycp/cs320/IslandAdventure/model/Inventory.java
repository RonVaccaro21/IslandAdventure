package edu.ycp.cs320.IslandAdventure.model;

public class Inventory 
{
	private double wood = 0.0;
	
	public Inventory() {
		wood = 0.0;
	}
	
	public void setWoodAmount(double wood) 
	{
		this.wood = wood;
	}
	
	public double getWoodAmount()
	{
		return wood;
	}
}
