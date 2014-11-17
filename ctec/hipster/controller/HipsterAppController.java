package ctec.hipster.controller;

import ctec.hipster.model.Hipster;
import ctec.hipster.view.HipsterFrame;
/**
 *  HipsterAppController for the 2014 Hipster day project
 * @author CodyH
 * @version 1.0 11/12/14 Basic framework only
 */
public class HipsterAppController
{
	private HipsterFrame baseFrame;
	private Hipster selfHipster;
	private String [] myAlbums;
	
	public HipsterAppController()
	{
		selfHipster = new Hipster("Camron", 17);
		buildAlbumArray();
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void buildAlbumArray()
	{
		myAlbums = new String[4];
		myAlbums[0] = "Final Fantasy XIII Soundtrack";
		myAlbums[1] = "The Essential Charlie Parker";
		myAlbums[2] = "Conversin' with the Elders";
		myAlbums[3] = "The Essential Billy Joel";
		selfHipster.setHipsterAlbums(myAlbums);
		
		//way 2
		// String [] otherAlbums = {"stuff", "other", "way for", "hipster array"};
		
		//way 3
		// String [] weirdAlbums;
		
		// weirdAlbums = new String [] {"weird", "sad", "hi", "this" };
	}
	
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}
}
