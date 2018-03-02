package edu.ycp.cs320.IslandAdventure.Junit.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.IslandAdventure.model.GuessingGame;

public class GuessingGameTest {
	private GuessingGame model;
	
	@Before
	public void setUp() {
		model = new GuessingGame();
	}
	
	@Test
	public void testSetMin() {
		model.setMin(1);
		assertEquals(1, model.getMin());
	}
	
	@Test
	public void testSetMax() {
		model.setMax(100);
		assertEquals(100, model.getMax());
	}
	
	@Test
	public void testIsDone() 
	{
		model.setMin(1);
		model.setMax(100);
		assertFalse(model.isDone());
		
		model.setMin(10);
		model.setMax(10);
		assertTrue(model.isDone());
	}
	
	@Test
	public void testGetGuess() {
		model.setMin(1);
		model.setMax(100);
		int guess = model.getGuess();
		assertEquals(50, guess);
	}
}
