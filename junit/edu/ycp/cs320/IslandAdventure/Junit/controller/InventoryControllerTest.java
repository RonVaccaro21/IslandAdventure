package edu.ycp.cs320.IslandAdventure.Junit.controller;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.IslandAdventure.controller.InventoryController;
import edu.ycp.cs320.IslandAdventure.model.Inventory;

public class InventoryControllerTest 
{
	private InventoryController inventoryController = new InventoryController(null);
	private Inventory inventory;
	
	@Before
	public void setUp()
	{
		Map<String, Integer> inventoryMap = new HashMap<String, Integer>();
		inventory = new Inventory(inventoryMap);
	}
		
	@Test
	public void testCreateNewInventory() 
	{
		Inventory inventory2 = inventoryController.createNewInventory();
		assertTrue(inventory2.equals(inventory));
	}
}
