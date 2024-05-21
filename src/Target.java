import java.awt.Image;

import javax.swing.ImageIcon;

public class Target{
	
	private ImageIcon pic;
	private int x;
	private int y;
	private int dx;
	private int dy;
	private int width;
	private int height;
	private boolean movert;
	private boolean movedn;


	public Target() {
		super();
	}
	
	public Target(String s, int x1, int y1, int w1, int h1) {

		x=x1;
		y=y1;
		dx=0;
		dy=0;
		width=w1;
		height=h1;
		movert=false;
		movedn=false;

	}
	
	
	public Target(String s, int x1, int y1, int dx1, int dy1, int w, int h,boolean r, boolean d) {

		x=x1;
		y=y1;
		dx=dx1;
		dy=dy1;
		width=w;
		height=h;
		movert=r;
		movedn=d;
	}
	public void setDx(int c) {
		dx=c;
	}
	public void setDy(int c) {
		dy=c;
	}
	public ImageIcon getPic() {
		return pic;
	}

	public int getW() {
		return width;
	}

	public int getH() {
		return height;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getDX() {
		return dx;
	}
	public int getDY() {
		return dy;
	}
}

