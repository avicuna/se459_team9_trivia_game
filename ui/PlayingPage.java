package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import card.Card;
import card.CardPile;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;

import teams.Team;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.Color;

public class PlayingPage extends JFrame {

	private JPanel contentPane;
	private ArrayList<Team> teamList;
	private JTextField words;	
	Card card = new Card();
	CardPile cardPile = new CardPile();
	ArrayList<Team> temp;
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayingPage frame = new PlayingPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public void addTeams(ArrayList<Team> teams) {
		this.teamList = teams;
	}

	public static <V> boolean isEmpty(ArrayList<V> sourceList) {  
        return (sourceList == null || sourceList.size() == 0);  
    }  
	
	public PlayingPage(ArrayList<Team> teamList) {
		
		cardPile.cardLoad();
		card = cardPile.DrawCard();
				
		ArrayList<Team> teams = teamList;
/*		ArrayList<Team> randomList = null;
		if(!isEmpty(teams)) {
			do {
				int randomIndex = Math.abs(new Random().nextInt(teams.size()));
				randomList.add(teams.remove(randomIndex));
			}while(teams.size() > 0);
		}
		
		for(int i = 0; i< randomList.size(); i++) {
			teams.add(randomList.remove(i));
		}
*/	    
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextArea description = new JTextArea();
		description.setBorder(null);
		description.setBounds(69, 103, 299, 153);
		description.setText(card.getCardDescription());
		contentPane.add(description);
		
		JButton btnSkip = new JButton("SKIP");
		btnSkip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				cardPile.cardPileForCount.add(card);
				card = cardPile.DrawCard();	
				words.setText(card.getCardName());
				description.setText(card.getCardDescription());
			}
		});
		btnSkip.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		btnSkip.setBounds(147, 301, 146, 60);
		contentPane.add(btnSkip);
		
		
		JLabel lblPurple = new JLabel("Purple");
		lblPurple.setForeground(new Color(128, 0, 128));
		lblPurple.setHorizontalAlignment(SwingConstants.CENTER);
		lblPurple.setBounds(192, 6, 51, 38);
		contentPane.add(lblPurple);
		
		JLabel lblGreen = new JLabel("Green");
		lblGreen.setForeground(new Color(0, 128, 0));
		lblGreen.setHorizontalAlignment(SwingConstants.CENTER);
		lblGreen.setBounds(242, 6, 51, 38);
		contentPane.add(lblGreen);
		
		JLabel lblBlue = new JLabel("Blue");
		lblBlue.setForeground(new Color(0, 0, 255));
		lblBlue.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlue.setBounds(294, 6, 51, 38);
		contentPane.add(lblBlue);
		
		JLabel lblYellow = new JLabel("Yellow");
		lblYellow.setForeground(new Color(255, 215, 0));
		lblYellow.setHorizontalAlignment(SwingConstants.CENTER);
		lblYellow.setBounds(345, 6, 51, 38);
		contentPane.add(lblYellow);
		
		JButton btnCorrect = new JButton("Correct");
		btnCorrect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				cardPile.cardPileForCount.add(card);
				card = cardPile.DrawCard();	
				words.setText(card.getCardName());
				description.setText(card.getCardDescription());
			}
		});
		btnCorrect.setBounds(69, 301, 66, 60);
		contentPane.add(btnCorrect);
		
		JButton btnWrong = new JButton("Wrong");
		btnWrong.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				cardPile.cardPileForCount.add(card);
				card = cardPile.DrawCard();
				words.setText(card.getCardName());
				description.setText(card.getCardDescription());
				System.out.println(teams);
			}
		});
		btnWrong.setBounds(302, 301, 66, 60);
		contentPane.add(btnWrong);
		
		words = new JTextField();
		words.setBackground(Color.LIGHT_GRAY);
		words.setHorizontalAlignment(SwingConstants.CENTER);
		words.setFont(new Font("Times New Roman", Font.BOLD, 24));
		words.setAlignmentX(Component.RIGHT_ALIGNMENT);
		words.setBounds(69, 56, 299, 43);
		contentPane.add(words);
		words.setColumns(10);
		words.setText(card.getCardName());
		words.setBackground(contentPane.getBackground());
		words.setBorder(null);
	
		
		
	}
}