package com.it306.test.UI;

/**
 * The main board layout of the game. The box is not resizable to
 * avoid distortion.
 * 
 * @author Amith Kini
 */

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class Board {

	private JFrame frame;

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
	 */
	public Board() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 910, 930);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = (JPanel)frame.getContentPane();
		frame.getContentPane().setLayout(null);
		
		JLabel p0p0 = new JLabel("");
		p0p0.setOpaque(true);
		p0p0.setBackground(new Color(255, 0, 0));
		p0p0.setBounds(817, 829, 20, 20);
		frame.getContentPane().add(p0p0);
		
		JLabel p0p1 = new JLabel("");
		p0p1.setBackground(Color.BLUE);
		p0p1.setOpaque(true);
		p0p1.setBounds(817, 862, 20, 20);
		frame.getContentPane().add(p0p1);
		
		JLabel p0p2 = new JLabel("");
		p0p2.setOpaque(true);
		p0p2.setBackground(Color.GREEN);
		p0p2.setBounds(849, 829, 20, 20);
		frame.getContentPane().add(p0p2);
		
		JLabel p0p3 = new JLabel("");
		p0p3.setBackground(Color.YELLOW);
		p0p3.setOpaque(true);
		p0p3.setBounds(849, 862, 20, 20);
		frame.getContentPane().add(p0p3);
		JLabel bgLbl = new JLabel();
		bgLbl.setBounds(0, 0, 904, 895);
		bgLbl.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(Board.class.getResource("/media/background.jpg"))));
		panel.add(bgLbl);
		frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}

}
