package edu.ycp.cs320.IslandAdventure.controller;

import edu.ycp.cs320.IslandAdventure.model.Player;

public class ActionController 
{
	private Player player;
	
	private InventoryController inventoryController;
	
	public ActionController(Player player) 
	{
		this.player = player;
		inventoryController = new InventoryController(player.getInventory());
	}
	
	public void interpretAction(String action)
	{
		if (action.equals("Chop Wood") || action.equals("chop wood")) 
		{
			inventoryController.changeWoodAmount(10);
		}
	}
}
