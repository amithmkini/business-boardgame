package com.it306.test.UI;

import com.it306.test.Property;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TradeUI {

	public JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private ListSelectionModel listSelectionModel;
	public ArrayList<Integer> output = new ArrayList<Integer>();
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TradeUI window = new TradeUI();
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
	public TradeUI() {
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
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 666, 637);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPlayer = new JLabel("Player:");
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblPlayer.setBounds(12, 53, 66, 26);
		frame.getContentPane().add(lblPlayer);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label.setBounds(100, 53, 196, 26);
		frame.getContentPane().add(label);
		
		JLabel lblSelectPlayer = new JLabel("Select Player:");
		lblSelectPlayer.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblSelectPlayer.setBounds(319, 53, 123, 26);
		frame.getContentPane().add(lblSelectPlayer);
		
		JComboBox<Property> comboBox = new JComboBox<Property>();
		comboBox.setBounds(454, 58, 149, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblCashOffered = new JLabel("Cash offered:");
		lblCashOffered.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblCashOffered.setBounds(12, 119, 123, 26);
		frame.getContentPane().add(lblCashOffered);
		
		textField = new JTextField();
		textField.setBounds(147, 122, 149, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(33, 208, 274, 301);
		table.setRowSelectionAllowed(true);
		listSelectionModel = table.getSelectionModel();
        listSelectionModel.addListSelectionListener(new SharedListSelectionHandler());
        table.setSelectionModel(listSelectionModel);
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setDefaultEditor(Object.class, null);
		
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(342, 208, 274, 301);
		frame.getContentPane().add(table_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for (int x : output) {
					System.out.println(x);
				}
			}
		});
		btnOk.setBounds(131, 540, 97, 25);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(435, 540, 97, 25);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblYou = new JLabel("You");
		lblYou.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblYou.setBounds(131, 179, 56, 16);
		frame.getContentPane().add(lblYou);
		
		JLabel lblOther = new JLabel("");
		lblOther.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOther.setHorizontalAlignment(SwingConstants.CENTER);
		lblOther.setBounds(406, 179, 149, 16);
		frame.getContentPane().add(lblOther);
		
		developTable();
		
	}

	void developTable(){
		String[] columnName = new String[1];
		columnName[0] = "Files";

		String[] list = {"A", "B", "C"};

		String[][] files = new String[list.length][1];
		for (int i = 0; i < list.length; i++) {
			files[i][0] = list[i];
		}
		
		DefaultTableModel tableModel = new DefaultTableModel(files, columnName);
		table.setModel(tableModel);
		table_1.setModel(tableModel);
		
		int[] selection = table.getSelectedRows();
		for (int x : selection) {
			System.out.println(x);
		}
		
	}
	
	 class SharedListSelectionHandler implements ListSelectionListener {
	        public void valueChanged(ListSelectionEvent e) { 
	            ListSelectionModel lsm = (ListSelectionModel)e.getSource();
	 
	            if (lsm.isSelectionEmpty()) {
	                ;
	            } else {
	                // Find out which indexes are selected.
	                int minIndex = lsm.getMinSelectionIndex();
	                int maxIndex = lsm.getMaxSelectionIndex();
	                for (int i = minIndex; i <= maxIndex; i++) {
	                    if (lsm.isSelectedIndex(i)) {
	                        output.add(i);
	                    }
	                }
	            }
	        }
	    }
	
}


