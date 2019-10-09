package com.sample;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Controller extends JApplet{
	JPanel buttonPanel = new JPanel();
	JButton stepButton = new JButton("Step");
	
	Model model = new Model();
	View view = new View(model);
	
	public void init()
	{
		setLayout(new BorderLayout());
		buttonPanel.add(stepButton);
		this.add(BorderLayout.SOUTH,buttonPanel);
		this.add(BorderLayout.CENTER,view);
		stepButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				model.makeOneStep();
			}
		});
		model.addObserver(view);
		view.controller = this;
	}
	
	public void start()
	{
		model.xLimit = view.getSize().width - model.BALL_SIZE;
		model.yLimit = view.getSize().height - model.BALL_SIZE;
		repaint();
	}
}
