package com.it306.test.UI;

/* 
 * The is the Board of the game.
 * Created by Akshay U Prabhu on 15-03-2017
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Board {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=291,217
	 */
	private JLabel Roll = new JLabel();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board window = new Board();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 * @throws UnsupportedLookAndFeelException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public Board() throws IOException  {
		  try {         
	          	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());     
	     	}catch (ClassNotFoundException e) {
	     	        e.printStackTrace();     
	        }catch (InstantiationException e) {   
	                e.printStackTrace();     
	        }catch (IllegalAccessException e) {         
	        		e.printStackTrace();
	        } catch (UnsupportedLookAndFeelException e) {
	                e.printStackTrace();
	        }
		initialize();
	}	

	
	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.print(dm.getHeight());
		System.out.print(dm.getWidth());

		frame.setSize(964,966);
		frame.setLocationRelativeTo(null);
		//frame.setBounds(1920, 1080, 715, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
//		JPanel mainPanel=new JPanel();
//		mainPanel.setSize(dm);
//		frame.add(mainPanel);
		URL urlToBG = this.getClass().getResource("./../../../../../media/background.jpg");
		System.out.println("The output is: "+urlToBG);
        BufferedImage img = ImageIO.read(urlToBG);
        frame.setContentPane(new JLabel(new ImageIcon(img)));
		JLabel lblPlr1 = new JLabel("");
		lblPlr1.setBounds(519, 217, 56, 16);
		frame.getContentPane().add(lblPlr1);
		
		JLabel lblPlr2 = new JLabel("");
		lblPlr2.setBounds(519, 278, 56, 16);
		frame.getContentPane().add(lblPlr2);
	}
}
