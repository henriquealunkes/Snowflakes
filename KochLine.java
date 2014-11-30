package edu.cofc.csci221.ui;
/**
 * 
 * @author Henrique Lunkes
 * @since November 28 2014
 *NOTE: This class extends the Line class and creates the lines A,B,C and D which are the
 *4 segments of the draw.The ComputeFractal Method calculates the equation that defines the draw.
 *The isKochLineValid Method checks if all the lines are valid.
 */
public class KochLine extends Line{
	
	private Point p1=null;
	private Point p2=null;
	private Point p3=null;
	private Point p4=null;
	private Point p5=null;
/**
 * 
 * Precondition: none
 * @param start
 * @param end
 */
	public KochLine(Point start, Point end) {
		
		super(start, end);
		p1=super.getStart();
		p5=super.getEnd();
	}
	/**
	 * Precondition: none
	 * Postcondition: returns the kochline obj
	 * @return kochlineA
	 */
	public KochLine getLineA(){
		
		
		KochLine kochlineA = new KochLine(p1,p2);
		
		return kochlineA;
	}
	/**
	 * 
	 
	 * Precondition: none
	 * Postcondition: returns the kochline obj
	 * @return kochlineB
	 */
	public KochLine getLineB(){
		
		KochLine kochlineB = new KochLine(p2,p3);
		
		return kochlineB;
		
	}
	/**
	 * 
	 * Precondition: none
	 * Postcondition: returns the kochline obj
	 * @return kochlineC;
	 */
	public KochLine getLineC(){
		
		KochLine kochlineC = new KochLine(p3,p4);
		
		
		return kochlineC;
		
	}
	/**
	 * 
	 * Precondition: none
	 * Postcondition: returns the kochline obj
	 * @return kochlineD
	 */
	public KochLine getLineD(){
		
		KochLine kochlineD= new KochLine(p4,p5);
		
		return kochlineD;
		
	}
	/**
	 * 
	 * Precondition: none
	 * Postcondition: computes the draw
	 */
	public void ComputeFractal()
	{
		p2=new Point();
		p2.setX((p1.getX()+(p5.getX()-p1.getX())/3));
		p2.setY((p1.getY()+(p5.getY()-p1.getY())/3));
		
		p3=new Point();
		int temp= (int)((p1.getX()+p5.getX())/2+(Math.sqrt(3)*(p1.getY()-p5.getY())/6));
		p3.setX(temp);
		temp= (int)((p1.getY()+p5.getY())/2+(Math.sqrt(3)*(p5.getX()-p1.getX())/6));
		p3.setY(temp);
		
		p4=new Point();
		p4.setX( p1.getX() +( 2*( p5.getX() - p1.getX())/3));
		p4.setY( p1.getY() +( 2*( p5.getY() - p1.getY())/3));
	
	}
	/**
	 * 
	 * Precondition: none
	 * Postcondition: returns true if all the lines are valid.
	 * @return true
	 */
	public boolean isKochLineValid() 
	{
		if(getLineA().isValid() && getLineB().isValid() && getLineC().isValid() && getLineD().isValid())
		{
		return true;
		}
		else
			return false;
	}
	
	

}

