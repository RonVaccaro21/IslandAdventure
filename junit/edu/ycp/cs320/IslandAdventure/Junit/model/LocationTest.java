package edu.ycp.cs320.IslandAdventure.Junit.model;

import edu.ycp.cs320.IslandAdventure.model.Location;
import static org.junit.Assert.*;



public class LocationTest {
	Location loc = new Location(1,2,3);
	
	public void testPossibleMoves()
	{
		assertTrue(loc.getPossibleMove());
		loc.setPossibleMove(false);
		assertFalse(loc.getPossibleMove());
	}

	public void testVisable()
	{
		assertFalse(loc.getVisable());
		loc.setVisable(true);
		assertTrue(loc.getVisable());
	}

}
