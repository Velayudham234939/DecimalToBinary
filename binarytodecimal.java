import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;

public class binarytodecimal {

	private JFrame frmMenu;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					binarytodecimal window = new binarytodecimal();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public binarytodecimal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setBounds(100, 100, 450, 300);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		JLabel lblBinary = new JLabel("Binary");
		lblBinary.setBounds(72, 48, 70, 15);
		frmMenu.getContentPane().add(lblBinary);
		
		textField = new JTextField();
		textField.setBounds(197, 35, 160, 42);
		frmMenu.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(197, 89, 160, 42);
		frmMenu.getContentPane().add(textField_1);
		
		JLabel lblDecimal = new JLabel("Decimal");
		lblDecimal.setBounds(72, 102, 70, 15);
		frmMenu.getContentPane().add(lblDecimal);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=textField.getText();
				int n=Integer.parseInt(s);
				String s1=Integer.toBinaryString(n);
				textField_1.setText(s1);
			}
		});
		btnConvert.setBounds(158, 172, 117, 25);
		frmMenu.getContentPane().add(btnConvert);
	}
}

