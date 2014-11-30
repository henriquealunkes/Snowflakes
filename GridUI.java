package edu.cofc.csci221.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author Programming Assignment 4 - GridUI class
 * @since 30 Sept. 2014
 * 
 * Class that inherits from JFrame. This frames 
 * the panel class and supplies wrapper methods
 * 
 * DO NOT MODIFY THIS CLASS
 *
 */
@SuppressWarnings("serial")
public class GridUI extends JFrame {
	
	// private instance variables
	private GridPanel gridPanel;
	
	/**
	 * 
	 */
	public GridUI() {
		
		gridPanel = new GridPanel();
		
		JPanel contentPane = (JPanel)this.getContentPane();
		
		contentPane.setLayout( new BorderLayout() );
		
		contentPane.setBorder( BorderFactory.createEmptyBorder( GridConstants.PAD, 
															GridConstants.PAD,
															GridConstants.PAD, 
															GridConstants.PAD ) );
		
		contentPane.add( gridPanel, BorderLayout.CENTER );
		
		setSize( new Dimension( GridConstants.MAX_PANEL_WIDTH + GridConstants.FRAME_X_OFFSET, 
				                GridConstants.MAX_PANEL_HEIGHT + GridConstants.FRAME_Y_OFFSET ) );
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		setResizable( false );
		
		setTitle( "CSCI 221: Programming Assignment 4" );
		
		setVisible( true );
		
	} // end constructor
	
	/**
	 * 
	 * @param line
	 */
	public void addLine( Line line ) {
		
		gridPanel.addLine( line );
		
		gridPanel.draw();
		
		
	} // end addLine() method
	
	/**
	 * 
	 */
	public void clear() {
		
		gridPanel.clear();
		
	} // end clear() method

} // end GridUI class definition
