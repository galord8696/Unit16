package unit16;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
        private int yp;
        private int xp;

	public AlienHorde(int size)
	{
            xp = 10;
            yp = 10;
                 
            for (int i = 0; i<size;i++){
                aliens.add(new Alien(xp,yp,10,15,0));
                xp += 15;
                yp += 20;
            }
	}

	public void add(Alien al)
	{
            aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
            for (Alien x: aliens){
                x.draw(window);
            }
	}

	public void moveEmAll(String dir)
	{
            for (Alien x: aliens){
                x.move(dir);
            }
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
	}

	public String toString()
	{
		return "";
	}
}
