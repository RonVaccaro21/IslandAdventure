package edu.ycp.cs320.IslandAdventure.model;

import java.util.HashMap;
import java.util.Map;

public class Inventory 
{
	Map<Item, Integer> inventory = new HashMap<Item, Integer>();
	
	public void addItem(Item item, int amount) 
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
	
	public Integer getItemCount(Item item)
	{
		return inventory.get(item);
	}
}
