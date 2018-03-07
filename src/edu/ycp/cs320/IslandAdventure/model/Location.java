package edu.ycp.cs320.IslandAdventure.model;

public class Location {
	
	private int x;
	private int y;
	private int z;
	private boolean visable;
	private boolean possibleMove;
	
	public Location(int a, int b, int c)
	{
		x = a;
		y = b;
		z = c;
		possibleMove = true; //move these to a move class 
		visable = false;
	}

	public void setPossibleMove(boolean pos)
	{
		this.possibleMove = pos;
	}
	
	public boolean getPossibleMove()
	{
		return possibleMove;
	}
	
	public void setVisable(boolean vis)
	{
		this.visable = vis;
	}

	public boolean getVisable()
	{
		return visable;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getZ()
	{
		return z;
	}
	
	public void setLocation(int a, int b, int c)
	{
		x = a;
		y = b;
		z = c;
	}
	
	public void setLocation(Location loc)
	{
		x = loc.getX();
		y = loc.getY();
		z = loc.getZ();
	}
	
	public void setX(int a)
	{
		x = a;
	}
	
	public void setY(int b)
	{
		y = b;
	}
	
	public void setZ(int c)
	{
		z = c;
	}
	
	
	
	
	
	
}
