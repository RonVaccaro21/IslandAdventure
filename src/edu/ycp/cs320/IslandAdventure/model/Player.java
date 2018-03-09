package edu.ycp.cs320.IslandAdventure.model;

public class Player 
{
	int score;
	int health;
	int stamina;
	int time;
	Inventory inventory;
	Location location[][][];
	
	public int getScore()
	{
		return score;
	}
	public int getHealth()
	{
		return health;
	}
	public int getStamina()
	{
		return stamina;
	}
	public int getTime()
	{
		return time;
	}
}
