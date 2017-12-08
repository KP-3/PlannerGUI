import java.awt.BasicStroke;
import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Searchplus extends JPanel {
//static ArrayList<String > name=new ArrayList<String>();
	static JLabel label = new JLabel();
	static ArrayList<ArrayList<String>> namelist=new ArrayList<ArrayList<String>>();

	public static void main(String args[]) {
		MakePanel frame4 = new MakePanel();
		frame4.setBounds(10, 10 ,1000, 1000);
		 Searchplus app = new Searchplus();
		    frame4.getContentPane().add(app);
		    frame4.add(app);
		    
		frame4.setVisible(true);
	//	name.add("A");
	//	name.add("B");
	//	name.add("C");
		// JFrame frame1 = new JFrame();
		// JPanel frame = new JPanel();
		// JPanel fram2 = new JPanel();
		// fram2.setBounds(10,10,1000,1000);
		// frame1.add(fram2);
		// Searchplus app = new Searchplus();
	//	    frame.getContentPane().add(app);
		//    frame.add(app);
		 //   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    //frame1.setBounds(10, 10,4*300,4*200 );
		//    frame.setTitle("");
		//    frame.setVisible(true);
	//name.add("D");
	/*
	frame.getContentPane().remove(app);
	  Searchplus app1 = new Searchplus();
	    frame.getContentPane().add(app1);
	    frame.setVisible(true);*/
//	frame1.add(frame);
//	frame1.setVisible(true);
	}

	private void makeStateSpace() {


	}

	
	public void paintComponent(Graphics g){
	    Graphics2D g2 = (Graphics2D)g;
	    namelist = Planner.getblock(GraphFrame.in);
int i=namelist.size();
double x=90;
	    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
	                        RenderingHints.VALUE_ANTIALIAS_ON);
	    BasicStroke wideStroke = new BasicStroke(4.0f);
	    g2.setStroke(wideStroke);
	    Font font = new Font("Arial", Font.BOLD, 25);
	    g2.setFont(font);
for(int j=0;j<i;j++){
	ArrayList<String> nameline =namelist.get(j);
	//System.out.println(nameline);
	int y=90;	
	int high = 0;
	for(String s:nameline){
    g2.draw(new Rectangle2D.Double(j*300.0d, (Planner.name.size()*190.0-x)*1.0-(y*high)*1.0d, 160.0d, 90.0d));
    g2.drawString(s, j*300+70,Planner.name.size()*190-40-high*90);
    high++;
}}
g2.draw(new Rectangle2D.Double(300.0d, (Planner.name.size()*190.0+120)*1.0d, 160.0d, 90.0d));
g2.drawString("holding",300,(Planner.name.size()*190+100)*1);
if(!Planner.hold.equals("")){
g2.drawString(Planner.hold,300+50,(Planner.name.size()*190+150)*1);
}
	    g2.draw(new Line2D.Double(0.0d, Planner.name.size()*190.0d, Planner.name.size()*300.0d, Planner.name.size()*190.0d));

	  }
    public Dimension getPreferredSize() {
        return new Dimension(2000, 2000);
    }
}
class MakePanel extends JFrame{
	MakePanel(){
		setBounds(100,100,300,300);
		
	}
}

