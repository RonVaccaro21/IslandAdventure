package edu.ycp.cs320.IslandAdventure.model;

import java.util.HashMap;
import java.util.Map;

public class Inventory 
{
	private Map<String, Integer> inventory = new HashMap<String, Integer>();
	
	public void addItem(String item, int amount) 
	{
	    Integer count = inventory.get(item);
	    if (count == null) 
	    {
	        count = amount;
	    } 
	    else 
	    {
	        inventory.put(item, count + amount);
	    }
	}
	
	public Integer getItemCount(String item)
	{
		return inventory.get(item);
	}
	
	public Integer getWoodCount()	// Temporary method for testing
	{
		return inventory.get("Wood");
	}
}
