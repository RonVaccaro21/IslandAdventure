package edu.ycp.cs320.IslandAdventure.Junit.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.IslandAdventure.model.GameObject;

public class GameObjectTest {
	private GameObject gameObject;
	
	@Before
	public void setUp() {
		gameObject = new GameObject("Sample Object", "This is an arbitrary object.", 1,2,3);
	}
	
	// Name Tests
	@Test
	public void testGetName() {
		assertTrue(gameObject.getName().equals("Sample Object"));
	}
	
	@Test
	public void testSetName() {
		gameObject.setName("New Object");
		assertTrue(gameObject.getName().equals("New Object"));
	}
	
	// Description Tests
	@Test
	public void testGetDescription() {
		assertTrue(gameObject.getDescription().equals("This is an arbitrary object."));
	}
	
	@Test
	public void testSetDescription() {
		gameObject.setDescript("New Description");
		assertTrue(gameObject.getDescription().equals("New Description"));
	}
	
	// XYZ Tests
	@Test
	public void testGetX() {
		assertTrue(gameObject.getX().equals(1));
	}
	
	@Test
	public void testSetX() {
		gameObject.setX(4);
		assertTrue(gameObject.getX().equals(4));
	}
	
	@Test
	public void testGetY() {
		assertTrue(gameObject.getY().equals(2));
	}
	
	@Test
	public void testSetY() {
		gameObject.setY(5);
		assertTrue(gameObject.getY().equals(5));
	}
	
	@Test
	public void testGetZ() {
		assertTrue(gameObject.getZ().equals(3));
	}
	
	@Test
	public void testSetZ() {
		gameObject.setZ(6);
		assertTrue(gameObject.getZ().equals(6));
	}
	
}