/** 
* @author CSCI 221- Program 4 Test Cases for Point.java and Line.java
* @since Fall 2014
*
* Notes to duplicate grading: 
* 	If an error occurs at a particular test, comment it out and run the test again.
* 	If you come across an error in your grade, please come to office hours to discuss it.
* 	Use break points and the eclipse debugger to find the error in your own code.
* 		If you are still unable to find the mistake in your code, come to office hours.
* 
* 
* 
*/




package edu.cofc.csci221.ui;

public class TestCaseGridUI {
	private int score = 0;
	private final int MAX_SCORE = 60;
	
	public int getScore(){
		return score;
	}
	public void addPoints(int addPts){
		score += addPts;
	}
	
	public void test1(Point p, String testN){
		int ptsGained = 0;
		int ptsPossible = 2;
		boolean pass = false;

		if(p != null){
			ptsGained += 2;
			pass = true;
		}
		
		
		score += ptsGained;
		
		printTest(pass, testN, ptsGained, ptsPossible);
		
	}
	
	
	public void test2(Point p){
		int ptsGained = 0;
		int ptsPossible = 3;
		boolean pass = false;
		
		if (p.getX() == 0 && p.getY() == 0){
			ptsGained += 3;
			pass = true;
		}
		
		score += ptsGained;
		
		printTest(pass, "2", ptsGained, ptsPossible);
		
	}
	
	public void test3(int num, String testN){
		int ptsGained = 0;
		int ptsPossible = 3;
		boolean pass = false;
		
		Point temp = new Point(num, num);
		
		switch (testN){
		
		case "3A":
			if (temp.getX() == num && temp.getY() == num){
				ptsGained += 3;
				pass = true;
			}
			break;
		case "3B":
		case "3C":
			if (temp.getX() == 0 && temp.getY() == 0){
				ptsGained += 3;
				pass = true;
			}
			break;
		default: 
			break;			
		}
		
		
		score += ptsGained;
		
		printTest(pass, testN, ptsGained, ptsPossible);
		
	}
	
	
	public void test4(Point pt1, Point pt2, String testN){
		int ptsGained = 0;
		int ptsPossible = 3;
		boolean pass = false;
		
		switch (testN){
			case "4B":
				if (pt1.getX() == 0 && pt1.getY() == 0){
					ptsGained += 3;
					pass = true;
				}
				break;
			case "4D":
				int x = pt1.getX();
				int y = pt1.getY();
				pt1.setPoint(null);
				if (x == pt1.getX() && y == pt1.getY()){
					ptsGained += 3;
					pass = true;
				}
				break;
			case "4A":
			case "4C":
				ptsPossible = 2;
				if (pt1.getX() != 0 && pt1.getY() != 0 && pt1.getX() == pt2.getX() && pt1.getY() == pt2.getY()){
					ptsGained += 2;
					pass = true;
				}
				break;
			default:
				break;
		}
		
		score += ptsGained;
		
		printTest(pass, testN, ptsGained, ptsPossible);
		
	}
	
	public void test5(){
		int ptsGained = 0;
		int ptsPossible = 9;
		boolean pass = false;
		boolean passA = false;
		boolean passB = false;
		boolean passC = false;
		
		Point p7 = new Point(220, 220);
		
		//invalid neg. ints
		p7.setX(-5);
		p7.setY(-5);
		
		if(p7.getX() == 0  && p7.getY() == 0){
			ptsGained += 3;
			passB = true;
		}
		
		//valid ints
		p7.setX(8);
		p7.setY(100);
		
		if(p7.getX() == 8 && p7.getY() == 100){
			ptsGained += 3;
			passA = true;
		}
	
		//invalid ints
		p7.setX((GridConstants.MAX_PANEL_WIDTH + 10));
		p7.setY((GridConstants.MAX_PANEL_HEIGHT + 10));
		
		if(p7.getX() == 0 && p7.getY() == 0){
			ptsGained += 3;
			passC = true;
		}
		
		if(passA && passB && passC){
			pass = true;
		}
		
		score += ptsGained;
		
		printTest(pass, "5", ptsGained, ptsPossible);
	}
	
	public void test6(Line line1, Point p3, Point p4){
		int ptsGained = 0;
		int ptsPossible = 5;
		boolean pass = false;
		Point pEnd = line1.getEnd();
		Point pStart = line1.getStart();
		if(p3.getX() == pStart.getX() && p3.getY() == pStart.getY() 
				&& p4.getX() == pEnd.getX() && p4.getY() == pEnd.getY() ){
			ptsGained += 5;
			pass = true;
		}
		
		score += ptsGained;
		printTest(pass, "6", ptsGained, ptsPossible);
	}
	
	public void test7(Line line1, Point startPt, Point endPt, String testN){
		int ptsGained = 0;
		int ptsPossible = 5;
		boolean pass = false;
		
		Point s = line1.getStart();
		Point e = line1.getEnd();
		
		line1.setStart(startPt);
		line1.setEnd(endPt);
		
		//7A
		if(startPt != null){
			/**
			 * pass by reference
			 */
			if(line1.getStart().equals(startPt) && line1.getEnd().equals(endPt)){
				ptsGained += 5;
				pass = true;
			}
			
		//7B
		}else{
			if(line1.getStart() == s && line1.getEnd() == e){
				ptsGained += 5;
				pass = true;
			}	
			
			
		}
		
		score += ptsGained;
		printTest(pass, testN, ptsGained, ptsPossible);
	}
	
	public void test8(Line line, String testN){
		int ptsGained = 0;
		int ptsPossible = 4;
		boolean pass = false;
		
		switch (testN) {
		
		case "8A":
			if(!line.isValid()){
				pass = true;
				ptsGained += 4;
			}
			break;
		case "8B":
			if(line.isValid()){
				pass = true;
				ptsGained += 4;
			}
			break;
		default:
			break;
		}
		
		score += ptsGained;
		printTest(pass, testN, ptsGained, ptsPossible);
		
	}	
	
	
	
	
	private void printTest(boolean pass, String testN, int ptsGained, int ptsPossible){
		String passOrFail = "Failed";
		if (pass) passOrFail = "Passed";
		
		System.out.printf("Test %s: %s\t[%d / %d]\n", testN, passOrFail, ptsGained, ptsPossible);
		
	}
	
	public void printScore(){
		System.out.printf("Total Score:\t%d / %d\n", score, MAX_SCORE);
	}
	
	
	public static void main(String[] args) {
	TestCaseGridUI testCases = new TestCaseGridUI();
	
	
	
	/**
	 * Tests for Point.java
	 */
	
	/*===========================================================
	 * Test 1(A,B,C): Point.java Constructors 
	 * testing that the 3 constructors are Available [2 pts each]
	 *===========================================================
	 */
		//Test 1A
		Point pA = new Point();
		testCases.test1(pA, "1A");
		
		//Test 1B
		Point pB = new Point(10,10);
		testCases.test1(pB, "1B");
		
		//Test 1C
		Point pC = new Point(pB);
		testCases.test1(pC, "1C");
		
		
	/*================================================================
	 * Test 2: Point.java Constructor Point() 
 	 * pA testing getX and getY are both 0 [3 pts]
	 *================================================================
	 */
		testCases.test2(pA);
		
		
	/*================================================================
	 * Test 3(A, B, C): Point.java Constructor Point(x,y) 
	 * testing constructor with valid and invalid values for 
	 * 		X and Y [9 pts]
	 *================================================================
	 */
		
		
		//Test 3A: valid positive int
		testCases.test3(50, "3A");
		//Test 3B: invalid negative int
		testCases.test3(-8, "3B");
		//Test 3C: invalid int pass MAX
		testCases.test3(500, "3C");
			
		
	/*===================================================================
	 * Test 4A: Point.java Constructor Point(Point p)
	 * testing that p5's  X and Y are equal to p4's X and Y [3 pts]
	 *===================================================================
	 */
		Point p4 = new Point(100, 100);
		Point p5 = new Point(p4);
		
		testCases.test4(p5, p4, "4A");
		
		
	/*===================================================================
	 * Test 4B: Point.java Constructor Point(Point p)
	 * testing that pointN's  X and Y are set to the default 
	 * 		value 0 when a null Point is used[3 pts]
	 *===================================================================
	 */
		Point pointN = new Point(null);
		testCases.test4(pointN, null, "4B");
		
	
		
	/*===================================================================
	 * Test 4C: Point.java setPoint(Point p)
	 * testing that p3's X and Y are equal to p6's X and Y [3 pts]
	 *===================================================================
	 */
		Point p3 = new Point(0, 100);
		Point p6 = new Point(2, 2);
		p3.setPoint(p6);
		
		testCases.test4(p3, p6, "4C");
	
		
	/*===================================================================
	 * Test 4D: Point.java setPoint(Point p)
	 * testing that tempP's X and Y values are still the same after
	 * trying to set the point's values with null [3 pts]
	 *===================================================================
	 */
				
		testCases.test4(p6, null, "4D");
	
	
	/*===================================================================
	 * Test 5: Point.java setX and setY [9 pts]
	 * tests valid positive ints, invalid negative ints, 
	 * 		and invalid ints outside of the panel maximums
	 *===================================================================
	 */
	
		
		
		testCases.test5();
		
		
		
	
		
		
	/********************************************
	 * Tests for Line.java	
	 ********************************************
	 */		
		
		
	/*===================================================================
	 * Test 6: Line.java Constructor Line( Point start, Point end )
	 * testing getStart and getEnd are equal to p3 and p4 [5 pts]
	 *===================================================================
	 */
		Point p2 = new Point(0,50);
		Line line1 = new Line(p2, p4);
		testCases.test6(line1, p2, p4);
		
		
	/*===================================================================
	 * Test 7A: Line.java setStart and setEnd
	 * testing Start and End points are equal to the points they were set
	 * 		to with the setter methods [5 pts]
	 *===================================================================
	 */
		Point pt1 = new Point(8, 8);
		Point pt2 = new Point(91, 55);
		testCases.test7(line1, pt1, pt2, "7A");
	
		
		
	/*===================================================================
	 * Test 7B: Line.java setStart and setEnd
	 * testing Start and End points are equal to the points they were NOT
	 * 		set to the invalid points with the setter methods [5 pts]
	 *===================================================================
	 */
		testCases.test7(line1, null, null, "7B");
	
	/*===================================================================
	 * Test 8A: Line.java isValid()
	 * testing the returned boolean value from isValid() 
	 * 		with invalid line[4 pts]
	 *===================================================================
	 */
		
		Point pointS = new Point(10,10);
		Line line2 = new Line(pointS, null);
		testCases.test8(line2, "8A");
		
		
		
	/*===================================================================
	 * Test 8B: Line.java isValid()
	 * testing the returned boolean value  from isValid() 
	 * 		with valid line[4 pts]
	 *===================================================================
	 */
		
		Line line3 = new Line(pointS, p2);
		testCases.test8(line3, "8B");
		
		
		
		
		
		//Print total score of 60
		System.out.println("--------------------------");
		testCases.printScore();

		
	

	}

}
