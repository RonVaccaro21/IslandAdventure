package edu.ycp.cs320.IslandAdventure.controller;

public class ActionController 
{
	InventoryController inventoryController = new InventoryController();
	
	public void interpretAction(String action)
	{
		if (action.equals("Chop Wood") || action.equals("chop wood")) 
		{
			inventoryController.changeWoodAmount(10.0);
		}
	}
}
