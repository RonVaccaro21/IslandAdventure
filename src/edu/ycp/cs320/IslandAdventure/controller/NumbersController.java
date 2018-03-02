package edu.ycp.cs320.IslandAdventure.controller;

import edu.ycp.cs320.IslandAdventure.model.Numbers;

public class NumbersController 
{
	private Numbers model;
	
	public void setModel(Numbers model) 
	{
		this.model = model;
	}
	
	// Set the Addition fields
	public void setAdditionFields(Double first, Double second, Double third) 
	{
		model.setAddFieldOne(first);
		model.setAddFieldTwo(second);
		model.setAddFieldThree(third);
	}
	
	// Set the Multiplication fields
	public void setMultiplicationFields(Double first, Double second) 
	{
		model.setMultiplyFieldOne(first);
		model.setMultiplyFieldTwo(second);
	}
	
	// Sets result for addition
	public void addResult(Double first, Double second, Double third) 
	{
		model.setAddResult(first + second + third);
	}
	
	// Sets result for multiplication
	public void multiplyResult(Double first, Double second) 
	{
		model.setMultiplyResult(first * second);
	}
}
