import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;

public class Exercises5 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercises5 window = new Exercises5();
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
	public Exercises5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 440, 314);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(29, 35, 159, 34);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(226, 35, 154, 34);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans = num1+num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton.setBounds(29, 94, 159, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans = num1-num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch (Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton_1.setBounds(226, 94, 154, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(226, 190, 154, 34);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("THE ANSWER IS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(53, 193, 107, 29);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton_2 = new JButton("DIVIDE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans = num1/num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
				
			}
		});
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setBackground(UIManager.getColor("ProgressBar.selectionForeground"));
		btnNewButton_2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_2.setBounds(29, 145, 159, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("MULTIPLY");
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans = num1*num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch (Exception e3) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
			
		});
		btnNewButton_3.setBounds(226, 145, 154, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}

