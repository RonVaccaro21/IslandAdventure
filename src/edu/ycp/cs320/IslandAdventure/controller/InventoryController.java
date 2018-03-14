package edu.ycp.cs320.IslandAdventure.controller;

import edu.ycp.cs320.IslandAdventure.model.Inventory;


public class InventoryController 
{
	private Inventory model;
	
	/*
	public InventoryController() {
		this.model = new Inventory();
	}
	*/
	public void setModel(Inventory model) 
	{
		this.model = model;
	}
	
	public void createGame()
	{
		model.setWoodAmount(0.0);
	}
	
	public void changeWoodAmount(double amount)
	{
		model.setWoodAmount(model.getWoodAmount() + amount);
	}
}
