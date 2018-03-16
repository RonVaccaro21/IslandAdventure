package edu.ycp.cs320.IslandAdventure.controller;

import java.util.HashMap;
import java.util.Map;

public class ActionController 
{
	private Map<String, Integer> inventory = new HashMap<String, Integer>();
	
	private InventoryController inventoryController = new InventoryController(inventory);
	
	public void interpretAction(String action)
	{
		if (action.equals("Chop Wood") || action.equals("chop wood")) 
		{
			inventoryController.changeWoodAmount(10);
		}
	}
}
