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
		JLabel bgLbl = new JLabel();
		bgLbl.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(Board.class.getResource("/media/background.jpg"))));
		panel.add(bgLbl);
		frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}

}
