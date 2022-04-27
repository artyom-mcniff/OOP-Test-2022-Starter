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

	public void drawArrows()
	{
		float arrowhead = 25;
		stroke(255);
		//left arrow
		line(width/4, height/2, (width/4) + (width/6), height/2);
		line(width/4, height/2, width/4 + arrowhead, height/2 - arrowhead);
		line(width/4, height/2, width/4 + arrowhead, height/2 + arrowhead); 
		//right arrow
		line(width - width/4, height/2, width - ( (width/4) + width/6), height/2);
		line(width - width/4, height/2, width - width/4 - arrowhead, height/2 - arrowhead );
		line(width - width/4, height/2, width - width/4 - arrowhead, height/2 + arrowhead );

	}


	public void draw()
	{
		background(0);
		drawArrows();
	}
}
