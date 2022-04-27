package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	
	int option = 0;

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
			if(option == 0)
				{
					option = nematodes.size() - 1;
				}
			option--;
		}		
		
		if (keyCode == RIGHT){
			if(option == nematodes.size() - 1){
				option = 0;
			}
			
			option++;
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
		for(TableRow r:table.rows())
		{
			Nematode n = new Nematode(r);
			nematodes.add(n);
		}

	}


	public void draw()
	{
		
		clear();
		Nematode n = nematodes.get(option);
		String Name = n.getName();
		
		textAlign(CENTER);
		textSize(60);
		fill(255, 0, 255);
		text(Name, 400, 50);

		for (int i = 0; i < n.getLength(); i++){
				int x = width / 2;
				int y, x1, x2;
				int colour = option * 60;
				x1 = x - 10;
				x2 = x + 10;
				if( i == 0){
					y = 50;
				} else {
					y = (i * 10) + 50;
				}
				//MALE 
				if(i == nematodes.size()-1){
					if(n.getGender() == "m"){
						if(n.getLimbs() == 1){
							stroke(blue(0), 255, 255);
							line(x1, y, x2, y);
							circle(x, y, 50);
						}else{
							stroke(colour, 255, 255);
							circle(x, y, 1000);
						}
					}
					//FEMALE 
					if(n.getGender() == "f"){
						if(n.getLimbs() == 1){
							stroke(colour, 255, 255);
							line(x1, y, x2, y);
							circle(x, y, 1000);
						}else{
							stroke(colour, 255, 255);
							circle(x, y, 50);
						}
					}
					if(n.getGender() == "h"){
						if(n.getLimbs() == 1){
							stroke(colour, 255, 255);
							line(x1, y, x2, y);
							circle(x, y, 50);
						}else{
							stroke(colour, 4255, 425);
							circle(x, y, 50);
							fill (0); 
						}
					}
					if(n.getGender() == "n"){
						if(n.getLimbs() == 1){
							stroke(colour, 435,425);
							line(x1, y, x2, y);
							circle(x, y, 50);
						}else{
							stroke(colour, 425, 425);
							circle(x, y, 50);
						}
					}
				}
						else
				{
					if(n.getLimbs() == 1){
						stroke(colour, 425, 425);
						line(x1, y, x2, y);
						circle(x, y, 225);
					}else{
						stroke(colour, 425, 425);
						circle(x, y, 100);
					}
				}
			}
		
	}
}
