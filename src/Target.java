import java.awt.Image;

import javax.swing.ImageIcon;

public class Target extends ArchTarg{
	
public Image getshipImg;
public int getX;
public int getY;
public int getW;
public int getH;


	public Target() {
		super();
	}
	
	public Target(int x, int y) {
		super(x, y, new ImageIcon("Target.png"));
	}
	
}

