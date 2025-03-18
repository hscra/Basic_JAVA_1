
import javax.swing.*;


public class Drawing {
	public static void main(String[] args) {
		int w = 640;
		int h = 480;
		JFrame f = new JFrame();
		Lab01 dc = new Lab01(w,h);
		f.setSize(w,h);
		f.setTitle("Distibution of charges");
		f.add(dc);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
