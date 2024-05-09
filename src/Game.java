import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
public class Game extends JPanel implements Runnable, KeyListener{

	private Player Re;
	private Target Tg;

	private BufferedImage back;
	private int key;
	private char screen;
	


	public Game() {
		new Thread(this).start();
		this.addKeyListener(this);
		Re=new Player("Reticle.png",500,30,2,3,100,100,true,false);
		Tg=new Target("Target.png",500,30,2,3,100,100,true,false);
screen = 'S';

		key =-1;
	}
	
	
	
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.currentThread();
				Thread.sleep(5);
				repaint();
			}

		}
		catch(Exception e) {

		}


	}
	@Override
	public void paint(Graphics g) {
		Graphics2D twoDgraph = (Graphics2D) g;
		if( back ==null) {
			back=(BufferedImage)( (createImage(getWidth(), getHeight())));
		}

		Graphics g2d = back.createGraphics();
		g2d.clearRect(0,0,getSize().width, getSize().height);
		g2d.setFont( new Font("Broadway", Font.BOLD, 50));
		g2d.drawString("key " + key, 340, 100);
		twoDgraph.drawImage(back, null, 0, 0);
		g2d.drawImage(Tg.getImg().getImage(), Tg.getX(),580, Tg.getW(), Tg.getH(), this);
		g2d.drawImage(Re.getImg().getImage(), Re.getX(),580, Re.getW(), Re.getH(), this);


	}

	public void screen(Graphics g2d) {
	switch(screen) {
	
	
	case 'S':
		
		
	}
	}


	//DO NOT DELETE
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	//DO NOT DELETE
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		key= e.getKeyCode();
		System.out.println(key);
	}
	//DO NOT DELETE
	@Override
	public void keyReleased(KeyEvent e) {
	}
	
}