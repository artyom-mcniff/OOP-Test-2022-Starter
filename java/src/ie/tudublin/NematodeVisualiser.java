package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	ArrayList<Nematode> todes = new ArrayList<Nematode>();
	int index = 0;

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}
		if (keyCode == RIGHT)
		{
			System.out.println("right");
			if (index+1 == todes.size())
			{
				index = 0;
			}
			else
			{
				index++;
			}
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

	float next = 0;
	float r = 25;

	public void drawNematodes(float k)
	{
		textSize(24);
		textAlign(CENTER, CENTER);
		text(todes.get(index).getName(), width/2, height/4);


		noFill();
		circle(width/2, height/2+k, r);
	}



	/*
	public void circleTest()
	{
		int radius = 25;
		noFill();
		circle(width/2, height/2, radius);
		circle(width/2, height/2+radius, radius);
		circle(width/2, height/2-radius, radius);
	}
	*/


	public void draw()
	{
		background(0);
		drawArrows();
		next = 0;
		for (int i = 0; i <= todes.get(index).getLength(); i++)
		{
			drawNematodes(next);
			if (i % 2 == 0)
			{
				next = next - r * i;
			}
			else
			{
				next = next + r * i;
			}
		}

	}
}
