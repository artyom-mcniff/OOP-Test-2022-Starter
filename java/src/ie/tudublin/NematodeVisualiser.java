package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	ArrayList<Nematode> todes = new ArrayList<Nematode>();

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();		
		loadNematodes();		
	}
	

	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");

		for (TableRow row : table.rows())
		{
			Nematode tode = new Nematode(row);
			todes.add(tode);
		}

	}


	public void draw()
	{	
	}
}
