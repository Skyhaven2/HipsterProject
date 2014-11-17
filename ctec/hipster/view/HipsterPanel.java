package ctec.hipster.view;

import javax.swing.*;

import ctec.hipster.controller.HipsterAppController;

public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private JComboBox albumBox;
	private JLabel albumLabel;
	private JLabel hipsterImage;
	
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
