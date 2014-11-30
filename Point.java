package edu.cofc.csci221.ui;

/**
 * 
 * @author Henrique Lunkes
 * @since October 7, 2014
 *NOTE: This class instantiates the Point object 
 */
public class Point {
	private int x=0;
	private int y=0;
	
	/**
	 * Precondition:none;
	 * Postcondition: Instantiates X and Y to 0
	 */
	public Point()
	{
		x=0;
		y=0;
	}
	
	/**
	 * @param point
	 * Precondition: point!=null, x>=0 && x<=GridConstants.MAX_PANEL_WIDTH and y>=0 && y<=GridConstants.MAX_PANEL_HEIGHT
	 * Postcondition: Sets the values of X and Y.
	 */
	
	public Point( Point point)
	{
		if (x>=0 && x<=GridConstants.MAX_PANEL_WIDTH)
		{
			setX(point.x);
		}
		else
		{
			setX(point.x=0);
		}
		if (y>=0 && y<=GridConstants.MAX_PANEL_HEIGHT)
		{
			setY(point.y);
		}
		else
		{
			setY(point.y=0);
		}
	}
	
	/**
	 * Precondition: x>=0 && x<=GridConstants.MAX_PANEL_WIDTH and y>=0 && y<=GridConstants.MAX_PANEL_HEIGHT
	 * Postcondition: Sets the values of X and Y.
	 * @param x
	 * @param y
	 */
	public Point (int x, int y)
	{
		if (x>=0 && x<=GridConstants.MAX_PANEL_WIDTH)
		{
			setX(x);
		}
		else
		{
			setX(0);
		}
		if (y>=0 && y<=GridConstants.MAX_PANEL_HEIGHT)
		{
			setY(y);
		}
		else
		{
			setY(0);
		}
	}
	
	/**
	 * Precondition: None
	 * Postcondition: Returns the value of x
	 * @return x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Precondition: x>=0 && x<= GridConstants.MAX_PANEL_WIDTH
	 * Postcondition: Sets the value of X.
	 * @param x
	 */
	public void setX(int x) {
		if (x>=0 && x<= GridConstants.MAX_PANEL_WIDTH)
		this.x = x;
		else
			System.out.println("The value of x cannot be less than 0 or greater than the Width of the Panel.");
	}
	
	/**
	 * * Precondition: None
	 * Postcondition: Returns  the value of y
	 * @return y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Precondition: y>=0 && y<= GridConstants.MAX_PANEL_HEIGHT
	 * Postcondition: Sets the value of Y.
	 * @param y
	 */
	public void setY(int y) {
		if (y>=0 && y<=GridConstants.MAX_PANEL_HEIGHT)
		this.y = y;
		else
			System.out.println("The value of y cannot be less than 0 or greather than the Height of the Panel.");
	}
	
	/**
	 * Precondition: y>=0 && y<= GridConstants.MAX_PANEL_HEIGHT   and  x>=0 && x<= GridConstants.MAX_PANEL_WIDTH
	 * Postcondition: Sets the values of X and Y to the Point object
	 * @param p
	 */
	public void setPoint (Point p)
	{
		if (p!=null)
		{
			if ((x>=0 && x<= GridConstants.MAX_PANEL_WIDTH)&&(y>=0 && y<=GridConstants.MAX_PANEL_HEIGHT))
			setPoint(p);
		}
	}
}

