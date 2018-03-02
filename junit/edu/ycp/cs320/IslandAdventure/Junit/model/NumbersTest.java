package edu.ycp.cs320.IslandAdventure.Junit.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.IslandAdventure.model.Numbers;

public class NumbersTest {
	
	private Numbers model;
	
	@Before
	public void setUp() {
		model = new Numbers();
	}
	
	@Test
	public void testAddFieldOne() {
		model.setAddFieldOne(5.0);
		assertTrue(5.0 == model.getAddFieldOne());
	}
	
	@Test
	public void testAddFieldTwo() {
		model.setAddFieldTwo(3.0);
		assertTrue(3.0 == model.getAddFieldTwo());
	}
	
	@Test
	public void testAddFieldThree() {
		model.setAddFieldThree(8.0);
		assertTrue(8.0 == model.getAddFieldThree());
	}
	
	@Test
	public void testMultiplyFieldOne() {
		model.setMultiplyFieldOne(6.0);
		assertTrue(6.0 == model.getMultiplyFieldOne());
	}
	
	@Test
	public void testMultiplyFieldTwo() {
		model.setMultiplyFieldOne(8.0);
		assertTrue(8.0 == model.getMultiplyFieldOne());
	}

}
