package edu.ycp.cs320.IslandAdventure.model;

public class Numbers 
{
	private double addFieldOne, addFieldTwo, addFieldThree;
	
	private double multiplyFieldOne, multiplyFieldTwo;
	
	private double addResult, multiplyResult;
	
	public Numbers() {
	}
	
	// Field One Addition
	public void setAddFieldOne(double addFieldOne) 
	{
		this.addFieldOne = addFieldOne;
	}
	
	public double getAddFieldOne() 
	{
		return addFieldOne;
	}
	
	// Field Two Addition
	public void setAddFieldTwo(double addFieldTwo) 
	{
		this.addFieldTwo = addFieldTwo;
	}
	
	public double getAddFieldTwo() 
	{
		return addFieldTwo;
	}
	
	// Field Three Addition
	public void setAddFieldThree(double addFieldThree) 
	{
		this.addFieldThree = addFieldThree;
	}
	
	public double getAddFieldThree() 
	{
		return addFieldThree;
	}
	
	// Multiply Field One
	public void setMultiplyFieldOne(double multiplyFieldOne) 
	{
		this.multiplyFieldOne = multiplyFieldOne;
	}
	
	public double getMultiplyFieldOne() 
	{
		return multiplyFieldOne;
	}
	
	// Multiply Field Two
	public void setMultiplyFieldTwo(double multiplyFieldTwo) 
	{
		this.multiplyFieldTwo = multiplyFieldTwo;
	}
	
	public double getMultiplyFieldTwo() 
	{
		return multiplyFieldTwo;
	}
	
	// Addition Result
	public void setAddResult(double addResult) 
	{
		this.addResult = addResult;
	}
	
	public double getAddResult() 
	{
		return addResult;
	}
	
	// Multiply Result
	public void setMultiplyResult(double multiplyResult) 
	{
		this.multiplyResult = multiplyResult;
	}
	
	public double getMultiplyResult() 
	{
		return multiplyResult;
	}
}
