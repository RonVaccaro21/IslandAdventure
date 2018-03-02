package edu.ycp.cs320.IslandAdventure.Junit.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.IslandAdventure.controller.NumbersController;
import edu.ycp.cs320.IslandAdventure.model.Numbers;

public class NumbersControllerTest {

	private NumbersController controller;
	private Numbers model;
	
	@Before
	public void setUp() {
		controller = new NumbersController();
		model = new Numbers();
		
		controller.setModel(model);
	}
	
	@Test
	public void testSetAdditionFields() 
	{
		double x, y, z;
		x = 5;
		y = 3;
		z = 8;
		
		controller.setAdditionFields(x, y, z);
		assertTrue(model.getAddFieldOne() == x);
		assertTrue(model.getAddFieldTwo() == y);
		assertTrue(model.getAddFieldThree() == z);
	}
	
	@Test
	public void testSetMultiplicationFields() 
	{
		double x, y;
		x = 8;
		y = 14;
		
		controller.setMultiplicationFields(x, y);
		assertTrue(model.getMultiplyFieldOne() == x);
		assertTrue(model.getMultiplyFieldTwo() == y);
	}
	
	@Test
	public void testAddResult() 
	{
		double x, y, z;
		x = 2;
		y = 7;
		z = 3;
		
		controller.addResult(x, y, z);
		assertTrue(model.getAddResult() == 12);
	}
	
	@Test
	public void testMultiplyResult() 
	{
		double x, y;
		x = 2;
		y = 8;
		
		controller.multiplyResult(x, y);
		assertTrue(model.getMultiplyResult() == 16);
	}

}
