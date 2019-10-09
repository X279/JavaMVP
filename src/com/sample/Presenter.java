package com.sample;

public class Presenter implements ModelInterface{
	Model model;
	Presenter(Model model)
	{
		this.model = model;
	}
	
	public int getXpos()
	{
		return this.model.xPosition;
	}
	
	public int getYpos()
	{
		return this.model.yPosition;
	}
	
	public int getBALLSIZE()
	{
		return this.model.BALL_SIZE;
	}
}
