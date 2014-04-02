import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GUIPanel extends JPanel {

	Board b;
	playerSearch p;
	private JButton drop1, drop2, drop3, drop4, drop5, drop6, drop0;

	public GUIPanel(Board b, playerSearch p) {
		this.b = b;
		this.p = p;
	
		drop1.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				move(1);
				repaint();
			}
		});


		drop2.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				move(2);
				repaint();
			}
		});


		drop3.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				move(3);
				repaint();
			}
		});


		drop4.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				move(4);
				repaint();
			}
		});


		drop5.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				move(5);
				repaint();
			}
		});


		drop6.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				move(6);
				repaint();
			}
		});


		drop0.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				move(0);
				repaint();
			}
		});

		//Add the buttons to the panel
		add(drop0, BorderLayout.NORTH);
		add(drop1, BorderLayout.NORTH);
		add(drop2, BorderLayout.NORTH);
		add(drop3, BorderLayout.NORTH);
		add(drop4, BorderLayout.NORTH);
		add(drop5, BorderLayout.NORTH);
		add(drop6, BorderLayout.NORTH);
	}
	
	public void move(int i) {
		b.makeMove(i);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		paintBoard(g);
		paintCounters(g);
	}
	
	public void paintBoard(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 700, 600);
	}
	
	public void paintCounters(Graphics g) {
	
		for(int i=0;i<b.rows;i++) {
			for(int j=0;i<b.cols;i++) {
				
				if(b.grid[i][j].getState()== 0){
					g.setColor(Color.white);
				} else if(b.grid[i][j].getState()==1) {
					g.setColor(Color.red);
				} else if(b.grid[i][j].getState()==-1) {
					g.setColor(Color.blue);
				}
				
				g.fillOval(i*100, j*100, 100, 100);
			}
		}
		
	}


}
