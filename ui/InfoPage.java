package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class InfoPage {

	private JFrame frame;
	private final JPanel contentPanel = new JPanel();
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public InfoPage() {
		setBounds(100, 100, 450, 300);		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblInstructions = new JLabel("INFORMATION");
			lblInstructions.setFont(new Font("Lucida Grande", Font.BOLD, 40));
			lblInstructions.setHorizontalAlignment(SwingConstants.CENTER);
			lblInstructions.setBounds(70, 6, 325, 48);
			contentPanel.add(lblInstructions);
		}
		
		JTextArea txtrTest = new JTextArea();
		txtrTest.setText("Rule 1:\n\nRule 2:\n\nRule 3:\n\nRule 4:\n\nRule 5:\n\nRule 6:\n\nRule 7:\n……..");
		txtrTest.setBounds(17, 52, 415, 181);
		txtrTest.setEditable(false);
		txtrTest.setAutoscrolls(true);
		
		
		contentPanel.add(txtrTest);
	}

	private JFrame getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setBounds(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
