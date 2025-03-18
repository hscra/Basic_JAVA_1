import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.*;
import javax.swing.*;



public class Lab01 extends JComponent {
	
	public static void main (String[] args) {
        Charges charge = new Charges() ;
        
        double [] columb = {2.0,-2.0,1.0,-1.0};
		int [] xAxis = {0,0,1,1};
		int [] yAxis = {-1,2,-1,1};
        
        for (int i =0 ; i<columb.length ; i++) {
        	System.out.println("the value of charge= "+charge.getCharge(columb[i]));
        	charge.getCoordinateX(xAxis[i]);
        	charge.getCoordinateY(yAxis[i]);
        	
        	
        	System.out.println("value of electricfield= "+charge.elecField(columb[i]));
        	
        	System.out.println("value of force= "+charge.elecField(columb[i])/columb[i]);
        	System.out.println();
        	
        }
        
        System.out.println("sum of charge = "+charge.sumCharge());
        
       
	}
 
	private int width, height;
	
	public Lab01(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	protected void paintComponent(Graphics g) {
		
		BufferedImage img = new BufferedImage( 
		            500, 500, BufferedImage.TYPE_INT_RGB );
		
		Graphics2D g2d2 = (Graphics2D) g;
		Graphics2D g2d = img.createGraphics();

		Ellipse2D.Double  e1 = new Ellipse2D.Double(20,10,10,10);
		Ellipse2D.Double  e2 = new Ellipse2D.Double(20,40,10,10);
		Ellipse2D.Double  e3 = new Ellipse2D.Double(30,10,5,5);
		Ellipse2D.Double  e4 = new Ellipse2D.Double(30,30,5,5);

		// RED : +  , BLUE : -
		
		
		g2d.setColor(Color.BLUE);
		g2d.fill(e1);
		
		g2d2.setColor(Color.BLUE);
		g2d2.fill(e1);
		
		g2d.setColor(Color.RED);
		g2d.fill(e2);
		
		g2d2.setColor(Color.RED);
		g2d2.fill(e2);
		
		g2d.setColor(Color.BLUE);
		g2d.fill(e3);
		
		g2d2.setColor(Color.BLUE);
		g2d2.fill(e3);
		
		g2d.setColor(Color.RED);
		g2d.fill(e4);
		
		g2d2.setColor(Color.RED);
		g2d2.fill(e4);
		
		try{
	        File f = new File("charge.png");
	        ImageIO.write(img, "PNG", f);
	    }
	    catch(Exception ex){
	        ex.printStackTrace();
	    }
	}
}


class Charges {

// fields:

	private int N;                          // number of charges
	public double k = 9.00d;                      	// constant of electric field
    //public double r ;                     // distance to charge
    private double x, y ,z ;                  // coordinates for each charge
    private double ValOfCharge ;            // value of the charge
    private double SumOfCharge ;

// constructors:
	
    Charges (){}
    Charges (int N){
        this.N = N ;
    }

// methods:

    public double getCharge(double q){
        return this.ValOfCharge= q;
    }

    public double getCoordinateX(double x){
        return this.x = x;
 
    }
    
    public double getCoordinateY(double y){
        return this.y = y;
 
    }
    
    public double sumCharge(){
        for (int i=0 ; i<N ; i++){
            SumOfCharge+=ValOfCharge;
        }
    return SumOfCharge;
    }

    public double getDistance(){
        return Math.sqrt((x*x) + (y*y) + (z*z));
    }

    public double elecField(double ValOfCharge){
        return k*ValOfCharge / (getDistance()*getDistance()) ;
    }

    public double getForce(){
        return sumCharge() * elecField(ValOfCharge);
    }
}    
   



