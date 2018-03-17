package edu.ycp.cs320.IslandAdventure.controller;

import java.util.HashMap;
import java.util.Map;

import edu.ycp.cs320.IslandAdventure.model.Inventory;


public class InventoryController 
{
	private Inventory model;
	
	public InventoryController(Map<String, Integer> inventory) 
	{
		this.model = new Inventory(inventory);
	}
	
	public Inventory createNewInventory()
	{
		Map<String, Integer> inventoryMap = new HashMap<String, Integer>();
		Inventory inventory = new Inventory(inventoryMap);
		return inventory;
	}
	
	public void setModel(Inventory model) 
	{
		this.model = model;
	}
	
	public void changeWoodAmount(int amount)
	{
		model.addItem("Wood", amount);
	}
}
