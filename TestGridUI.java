package edu.cofc.csci221.ui;

import javax.swing.JOptionPane;
/**
 * 
 * @author Henrique Lunkes
 *@since October 7, 2014.
 *NOTE: This class contains the main method and tests the input that creates the Line object
 */
public class TestGridUI {
	public static void main(String[] args) {
		GridUI gridUi = new GridUI();

		Point point1;
		Point point2;
		Line line;

		
		for (int i = 0; i <= 400; i += 200) {
			for (int j = 400; j >= 0; j -= 200) {
				point1 = new Point();
				point2 = new Point();

				line = new Line(point1, point2);
				line.setStart(null);
				line.setEnd(null);
				
				if (line.isValid())
				{
				gridUi.addLine(new Line(new Point(0, i), new Point(400, i)));
				gridUi.addLine(new Line(new Point(i, 0), new Point(i, 400)));
				gridUi.addLine(new Line(new Point(i, 400), new Point(j, 400)));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Input. Ending the program...");
					System.exit(0);
				}
				}
				

			}

		

		int answer = JOptionPane.showConfirmDialog(null,
				"Would you like to see a grid with more lines?", "Yes or No?",
				JOptionPane.YES_NO_OPTION);

		if (answer == JOptionPane.YES_OPTION) {

			for (int i = 0; i <= 400; i += 100) {
				for (int j = 400; j >= 0; j -= 100) {
					point1 = new Point();
					point2 = new Point();

					line = new Line(point1, point2);
					line.setStart(point1);
					line.setEnd(point2);
					if (line.isValid())
					{
					gridUi.addLine(line);

					gridUi.addLine(new Line(new Point(0, i), new Point(400, i)));
					gridUi.addLine(new Line(new Point(i, 0), new Point(i, 400)));
					gridUi.addLine(new Line(new Point(i, 400),new Point(j, 400)));
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Invalid Input. Ending the program...");
						System.exit(0);
					}
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "Ending the program...");
			System.exit(0);
		}
		answer = JOptionPane.showConfirmDialog(null,
				"Would you like to see a grid with more lines?", "Yes or No?",
				JOptionPane.YES_NO_OPTION);

		if (answer == JOptionPane.YES_OPTION) {
			for (int i = 0; i <= 400; i += 50) {
				for (int j = 400; j >= 0; j -= 50) {
					
					point1 = new Point();
					point2 = new Point();

					line = new Line(point1, point2);
					line.setStart(point1);
					line.setEnd(point2);
					
					if (line.isValid())
					{
					gridUi.addLine(line);

					gridUi.addLine(new Line(new Point(0, i), new Point(400, i)));
					gridUi.addLine(new Line(new Point(i, 0), new Point(i, 400)));
					gridUi.addLine(new Line(new Point(i, 400),new Point(j, 400)));
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Invalid Input. Ending the program...");
						System.exit(0);
					}
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "Ending the program...");
			System.exit(0);
		}
		answer = JOptionPane.showConfirmDialog(null,
				"Impossible to create more lines. Would you like to exit the program?", "Yes or No?",
				JOptionPane.YES_NO_OPTION);

		if (answer == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Ending the program...");
			System.exit(0);
		} else {

		}

	}
}
