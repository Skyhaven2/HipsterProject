package ctec.hipster.view;

import javax.swing.JFrame;

import ctec.hipster.controller.HipsterAppController;

public class HipsterFrame extends JFrame
{
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterAppController baseController)
	{
		this.basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 400);
		this.setResizable(false);
		this.setVisible(true);
	}

}
