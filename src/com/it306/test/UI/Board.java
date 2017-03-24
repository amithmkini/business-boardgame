package com.it306.test.UI;

/**
 * The main board layout of the game. The box is not resizable to
 * avoid distortion.
 * 
 * @author Amith Kini
 */

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class Board {

	public JFrame frame;
//	private ArrayList<JLabel> cells = new ArrayList<JLabel>();

	/**
	 * Create the application.
	 */
	public Board(ArrayList<String> plrs) {
		initialize(plrs);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ArrayList<String> plrs) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 910, 930);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = (JPanel)frame.getContentPane();
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(785, 779, 119, 116);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(709, 779, 74, 116);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(636, 779, 74, 116);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(562, 779, 74, 116);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(487, 779, 74, 116);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(414, 779, 74, 116);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(340, 779, 74, 116);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(265, 779, 74, 116);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(192, 779, 74, 116);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setBounds(118, 779, 74, 116);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setBounds(0, 779, 119, 116);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setBounds(0, 707, 119, 71);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setBounds(0, 634, 119, 71);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setBounds(0, 560, 119, 71);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setBounds(0, 486, 119, 71);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setBounds(0, 412, 119, 71);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setBounds(0, 339, 119, 71);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setBounds(0, 265, 119, 71);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("");
		label_18.setBounds(0, 191, 119, 71);
		frame.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setBounds(0, 117, 119, 71);
		frame.getContentPane().add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setBounds(0, 0, 119, 116);
		frame.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setBounds(118, 0, 74, 116);
		frame.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("");
		label_22.setBounds(192, 0, 74, 116);
		frame.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel("");
		label_23.setBounds(265, 0, 74, 116);
		frame.getContentPane().add(label_23);
		
		JLabel label_24 = new JLabel("");
		label_24.setBounds(340, 0, 74, 116);
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("");
		label_25.setBounds(414, 0, 74, 116);
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("");
		label_26.setBounds(487, 0, 74, 116);
		frame.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("");
		label_27.setBounds(562, 0, 74, 116);
		frame.getContentPane().add(label_27);
		
		JLabel label_28 = new JLabel("");
		label_28.setBounds(636, 0, 74, 116);
		frame.getContentPane().add(label_28);
		
		JLabel label_29 = new JLabel("");
		label_29.setBounds(709, 0, 74, 116);
		frame.getContentPane().add(label_29);
		
		JLabel label_30 = new JLabel("");
		label_30.setBounds(785, 0, 119, 116);
		frame.getContentPane().add(label_30);
		
		JLabel label_31 = new JLabel("");
		label_31.setBounds(785, 117, 119, 71);
		frame.getContentPane().add(label_31);
		
		JLabel label_32 = new JLabel("");
		label_32.setBounds(785, 191, 119, 71);
		frame.getContentPane().add(label_32);
		
		JLabel label_33 = new JLabel("");
		label_33.setBounds(785, 265, 119, 71);
		frame.getContentPane().add(label_33);
		
		JLabel label_34 = new JLabel("");
		label_34.setBounds(785, 339, 119, 71);
		frame.getContentPane().add(label_34);
		
		JLabel label_35 = new JLabel("");
		label_35.setBounds(785, 412, 119, 71);
		frame.getContentPane().add(label_35);
		
		JLabel label_36 = new JLabel("");
		label_36.setBounds(785, 486, 119, 71);
		frame.getContentPane().add(label_36);
		
		JLabel label_37 = new JLabel("");
		label_37.setBounds(785, 560, 119, 71);
		frame.getContentPane().add(label_37);
		
		JLabel label_38 = new JLabel("");
		label_38.setBounds(785, 634, 119, 71);
		frame.getContentPane().add(label_38);
		
		JLabel label_39 = new JLabel("");
		label_39.setBounds(785, 707, 119, 71);
		frame.getContentPane().add(label_39);
		
		JLabel p0 = new JLabel("");
		p0.setOpaque(true);
		p0.setBackground(Color.RED);
		p0.setBounds(817, 829, 20, 20);
		frame.getContentPane().add(p0);
		
		JLabel p1 = new JLabel("");
		p1.setBackground(Color.BLUE);
		p1.setOpaque(true);
		p1.setBounds(817, 862, 20, 20);
		frame.getContentPane().add(p1);
		
		JLabel p2 = new JLabel("");
		p2.setOpaque(true);
		p2.setBackground(Color.GREEN);
		p2.setBounds(849, 829, 20, 20);
		frame.getContentPane().add(p2);
		if (plrs.size() < 3) {
			p2.setVisible(false);
		}
		
		JLabel p3 = new JLabel("");
		p3.setBackground(Color.YELLOW);
		p3.setOpaque(true);
		p3.setBounds(849, 862, 20, 20);
		frame.getContentPane().add(p3);
		if (plrs.size() < 4) {
			p3.setVisible(false);
		}
		
		JLabel bgLbl = new JLabel();
		bgLbl.setBounds(0, 0, 904, 895);
		bgLbl.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(Board.class.getResource("/media/background.jpg"))));
		panel.add(bgLbl);
		frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
}
