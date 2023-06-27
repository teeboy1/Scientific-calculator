package mesh;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class scietific {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scietific window = new scietific();
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
	public scietific() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 323, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 65, 287, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnr = new JButton("\u221A");
		btnr.setEnabled(false);
		btnr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnr.setBounds(1, 148, 64, 34);
		frame.getContentPane().add(btnr);
		
		JButton btn1x = new JButton("1/x");
		btn1x.setEnabled(false);
		btn1x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn1x.setBounds(1, 181, 64, 34);
		frame.getContentPane().add(btn1x);
		
		JButton btnxy = new JButton("x^y");
		btnxy.setEnabled(false);
		btnxy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^y";
			}
		});
		btnxy.setBounds(1, 214, 64, 34);
		frame.getContentPane().add(btnxy);
		
		JButton btnx3 = new JButton("x^3");
		btnx3.setEnabled(false);
		btnx3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx3.setBounds(1, 247, 64, 34);
		frame.getContentPane().add(btnx3);
		
		JButton btnx2 = new JButton("x^2");
		btnx2.setEnabled(false);
		btnx2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx2.setBounds(1, 278, 64, 34);
		frame.getContentPane().add(btnx2);
		
		JButton btnfact = new JButton("n!");
		btnfact.setEnabled(false);
		btnfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!= 0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
				}
			
		});
		btnfact.setBounds(1, 310, 64, 34);
		frame.getContentPane().add(btnfact);
		
		JButton btnplusminus = new JButton("+/-");
		btnplusminus.setEnabled(false);
		btnplusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnplusminus.setBounds(1, 341, 64, 34);
		frame.getContentPane().add(btnplusminus);
		
		JButton btnex = new JButton("e^x");
		btnex.setEnabled(false);
		btnex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnex.setBounds(63, 148, 64, 34);
		frame.getContentPane().add(btnex);
		
		JButton btnlog = new JButton("Log");
		btnlog.setEnabled(false);
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnlog.setBounds(63, 181, 64, 34);
		frame.getContentPane().add(btnlog);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.setEnabled(false);
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPercentage.setBounds(63, 214, 64, 34);
		frame.getContentPane().add(btnPercentage);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn7.setBounds(63, 247, 64, 34);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn4.setBounds(63, 278, 64, 34);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn1.setBounds(63, 310, 64, 34);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn0.setBounds(63, 341, 125, 34);
		frame.getContentPane().add(btn0);
		
		JButton btnsin = new JButton("Sin");
		btnsin.setEnabled(false);
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsin.setBounds(124, 148, 64, 34);
		frame.getContentPane().add(btnsin);
		
		JButton btnsinh = new JButton("Sinh");
		btnsinh.setEnabled(false);
		btnsinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsinh.setBounds(124, 181, 64, 34);
		frame.getContentPane().add(btnsinh);
		
		JButton btnclear = new JButton("C");
		btnclear.setEnabled(false);
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnclear.setBounds(124, 214, 64, 34);
		frame.getContentPane().add(btnclear);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn8.setBounds(124, 247, 64, 34);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn5.setBounds(124, 278, 64, 34);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn2.setBounds(124, 310, 64, 34);
		frame.getContentPane().add(btn2);
		
		JButton btncos = new JButton("Cos");
		btncos.setEnabled(false);
		btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncos.setBounds(186, 148, 64, 34);
		frame.getContentPane().add(btncos);
		
		JButton btncosh = new JButton("Cosh");
		btncosh.setEnabled(false);
		btncosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncosh.setBounds(186, 181, 64, 34);
		frame.getContentPane().add(btncosh);
		
		JButton btnbackspace = new JButton("\uF0E7");
		btnbackspace.setEnabled(false);
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=(null);
				{
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
					textField.setText(backspace);
				}
				}}
		});
		btnbackspace.setFont(new Font("Wingdings", Font.BOLD, 12));
		btnbackspace.setBounds(186, 214, 64, 34);
		frame.getContentPane().add(btnbackspace);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn9.setBounds(186, 247, 64, 34);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn6.setBounds(186, 278, 64, 34);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn3.setBounds(186, 310, 64, 34);
		frame.getContentPane().add(btn3);
		
		JButton btndot = new JButton(".");
		btndot.setEnabled(false);
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setBounds(186, 341, 64, 34);
		frame.getContentPane().add(btndot);
		
		JButton btntan = new JButton("Tan");
		btntan.setEnabled(false);
		btntan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btntan.setBounds(240, 148, 64, 34);
		frame.getContentPane().add(btntan);
		
		JButton btntanh = new JButton("Tanh");
		btntanh.setEnabled(false);
		btntanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btntanh.setBounds(240, 181, 64, 34);
		frame.getContentPane().add(btntanh);
		
		JButton btnplus = new JButton("+");
		btnplus.setEnabled(false);
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnplus.setBounds(240, 214, 64, 34);
		frame.getContentPane().add(btnplus);
		
		JButton btnminus = new JButton("-");
		btnminus.setEnabled(false);
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnminus.setBounds(240, 247, 64, 34);
		frame.getContentPane().add(btnminus);
		
		JButton btnmul = new JButton("*");
		btnmul.setEnabled(false);
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmul.setBounds(240, 278, 64, 34);
		frame.getContentPane().add(btnmul);
		
		JButton btndivide = new JButton("/");
		btndivide.setEnabled(false);
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndivide.setBounds(240, 310, 64, 34);
		frame.getContentPane().add(btndivide);
		
		JButton btnequal = new JButton("=");
		btnequal.setEnabled(false);
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if (operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
		
				}
				else if  (operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
		
			}
				else if (operation=="*")
				{
				
				result=first*second;
				answer=String.format("%.2f",result);
				textField.setText(answer);
				}
				
				else if (operation=="/")
				{
				
				result=first/second;
				answer=String.format("%.2f",result);
				textField.setText(answer);
				}
				
				else if (operation=="x^y")
				{
					double result=1;
				for(int i=0;i<second;i++);
				
				{
				
				result=first*result;
				answer=String.format("%.2f",result);
				textField.setText(answer);
				}
				}
			}});
		btnequal.setBounds(240, 341, 64, 34);
		frame.getContentPane().add(btnequal);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(50, 23, 199, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(56, 89, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);
				
				
				btndot.setEnabled(true);
				btnplus.setEnabled(true);
				btnmul.setEnabled(true);
				btnminus.setEnabled(true);
				btndivide.setEnabled(true);
				btnsin.setEnabled(true);
				
				btncos.setEnabled(true);
				btntan.setEnabled(true);
				btnsinh.setEnabled(true);
				btncosh.setEnabled(true);
				btntanh.setEnabled(true);
				btnPercentage.setEnabled(true);
				btnlog.setEnabled(true);
				btnclear.setEnabled(true);
				btnbackspace.setEnabled(true);
				btnplusminus.setEnabled(true);
				btnfact.setEnabled(true);
				btnx2.setEnabled(true);
				btnx3.setEnabled(true);
				btnxy.setEnabled(true);
				btn1x.setEnabled(true);
				btnex.setEnabled(true);
				btnr.setEnabled(true);
				btnequal.setEnabled(true);
				
			}
		});
		buttonGroup_6.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton.setBounds(10, 118, 42, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn0.setEnabled(false);
				
				
				btndot.setEnabled(false);
				btnplus.setEnabled(false);
				btnmul.setEnabled(false);
				btnminus.setEnabled(false);
				btndivide.setEnabled(false);
				btnsin.setEnabled(false);
				
				btncos.setEnabled(false);
				btntan.setEnabled(false);
				btnsinh.setEnabled(false);
				btncosh.setEnabled(false);
				btntanh.setEnabled(false);
				btnPercentage.setEnabled(false);
				btnlog.setEnabled(false);
				btnclear.setEnabled(false);
				btnbackspace.setEnabled(false);
				btnplusminus.setEnabled(false);
				btnfact.setEnabled(false);
				btnx2.setEnabled(false);
				btnx3.setEnabled(false);
				btnxy.setEnabled(false);
				btn1x.setEnabled(false);
				btnex.setEnabled(false);
				btnr.setEnabled(false);
				btnequal.setEnabled(false);
				
				
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnOff.setBounds(52, 118, 50, 23);
		frame.getContentPane().add(rdbtnOff);
	}
}
