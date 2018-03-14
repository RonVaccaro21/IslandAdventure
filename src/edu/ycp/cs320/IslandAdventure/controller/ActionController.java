package edu.ycp.cs320.IslandAdventure.controller;

import edu.ycp.cs320.IslandAdventure.model.*;

public class ActionController 
{
	InventoryController inventoryController = new InventoryController();
	
	public void interpretAction(String action)
	{
		if (action.equals("Chop Wood") || action.equals("chop wood")) 
		{
			inventoryController.changeWoodAmount((double) 10.0);
		}
	}
}
