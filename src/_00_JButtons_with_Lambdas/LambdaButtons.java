package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	Random r = new Random();
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		addNumbers.addActionListener(e -> {
			String n1 = JOptionPane.showInputDialog("What is the first number you want to add.");
			String n2 = JOptionPane.showInputDialog("What is the other number");
			int num1 = Integer.parseInt(n1);
			int num2 = Integer.parseInt(n2);
			JOptionPane.showMessageDialog(null, "The sum is " + (num1+num2));
		});
		
		randNumber.addActionListener(e -> JOptionPane.showMessageDialog(null, "A random number is " + r.nextInt(100)));
		
		tellAJoke.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Whats red and bad for your teeth");
			JOptionPane.showMessageDialog(null, "A brick.");
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
