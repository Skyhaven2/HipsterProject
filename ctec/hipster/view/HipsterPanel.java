package ctec.hipster.view;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

import ctec.hipster.controller.HipsterAppController;

public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private JComboBox albumBox;
	private JLabel albumLabel;
	private JLabel hipsterImage;
	private JLabel titleLabel;
	private SpringLayout baseLayout;
	
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		titleLabel = new JLabel("Welcome to Learn about Hipster Music!");
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 10, SpringLayout.WEST, this);
		albumLabel = new JLabel("Album info here :D");
		baseLayout.putConstraint(SpringLayout.EAST, albumLabel, -10, SpringLayout.EAST, this);
		hipsterImage = new JLabel("Link", new ImageIcon(HipsterPanel.class.getResource("/ctec/hipster/view/images/LinkSpriteDown.png")), JLabel.CENTER);
		baseLayout.putConstraint(SpringLayout.NORTH, hipsterImage, -1, SpringLayout.NORTH, albumLabel);
		baseLayout.putConstraint(SpringLayout.WEST, hipsterImage, 10, SpringLayout.WEST, this);
		hipsterImage.setVerticalAlignment(SwingConstants.BOTTOM);
		albumBox = new JComboBox();
		baseLayout.putConstraint(SpringLayout.NORTH, albumLabel, 6, SpringLayout.SOUTH, albumBox);
		baseLayout.putConstraint(SpringLayout.NORTH, titleLabel, 0, SpringLayout.NORTH, albumBox);
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		albumBox.setModel(new DefaultComboBoxModel(baseController.getSelfHipster().getHipsterAlbums()));
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(baseLayout);
		this.setSize(500, 300);
		this.add(albumBox);
		this.add(albumLabel);
		this.add(hipsterImage);
		this.add(titleLabel);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, albumBox, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, albumBox, -10, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		albumBox.addItemListener(new ItemListener()
		{

			@Override
			public void itemStateChanged(ItemEvent arg0)
			{
				if(albumBox.getSelectedIndex() == 0)
				{
					albumLabel.setText("You are truly a hipster");
				}
				else if(albumBox.getSelectedIndex() <= 2)
				{
					albumLabel.setText("You may have some hipster quality");
				}
				else
				{
					albumLabel.setText("NOT A HIPSTER");
				}
			}
			
		});
	}

}
