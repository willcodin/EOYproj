import javax.swing.ImageIcon;

public class Player{

private ImageIcon pic;
private int x;
private int y;
private int dx;
private int dy;
private int width;
private int height;
private boolean movert;
private boolean movedn;

public Player () {
	pic=new ImageIcon();
	x=0;
	y=0;
	dx=0;
	dy=0;
	width=0;
	height=0;
	movedn=false;
	movert=false;


}

public Player(String s, int x1, int y1, int w1, int h1) {

	x=x1;
	y=y1;
	dx=0;
	dy=0;
	width=w1;
	height=h1;
	movert=false;
	movedn=false;

}

public Player(String s, int x1, int y1, int dx1, int dy1, int w, int h,boolean r, boolean d) {

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



public void bounce() {

	if (movert) {
		x+=dx;
	}
	else {
		x-=dx;
	}
	if(movedn) {
		y+=dy;
	}
	else {
		y-=dy;
	}

	if(x<0) {
		movert=true;
	}
	if(x+width>800) {
		movert=false;
	}



	if(y<0) {
		movedn=true;
	}
	if(y+height>600) {
		movedn=false;
	}
}

public void move() {
	x+=dx;
	if(x+width>800) {
		x=800-width;
	}

	if(x<0) {
		x=0;
	}

	y+=dy;
	if(y+height>600) {
		y=600-height;
	}


	if(y<0) {
		y=0;
	}


}



}
