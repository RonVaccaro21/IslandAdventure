package edu.ycp.cs320.IslandAdventure.controller;

import java.util.Map;

import edu.ycp.cs320.IslandAdventure.model.Inventory;


public class InventoryController 
{
	private Inventory model;
	
	
	public InventoryController(Map<String, Integer> inventory) 
	{
		this.model = new Inventory(inventory);
	}
	
	public void setModel(Inventory model) 
	{
		this.model = model;
	}
	
/*	public void createGame()
	{
		model.
	}
*/	
	public void changeWoodAmount(int amount)
	{
		model.addItem("Wood", amount);
	}
}
