package com.sample;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

public class View extends Canvas implements Observer{
	Controller controller;
	Presenter presenter;
	int stepNumber = 0;
	 View(Model model)
	 {
		 this.presenter = new Presenter(model);
	 }
	 
	 public void paint(Graphics g)
	 {
		 g.setColor(Color.red);
		 g.fillOval(presenter.getXpos(), presenter.getYpos(), presenter.getBALLSIZE(), presenter.getBALLSIZE());
		 controller.showStatus("Step " + (stepNumber++) + ",x="+presenter.getXpos() + ",y="+presenter.getYpos());
	 }
	 
	 @Override
	 public void update(Observable o,Object arg)
	 {
		 repaint();
	 }
}
