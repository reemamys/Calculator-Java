package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_GUI extends JFrame implements ActionListener{
	
	JPanel panel;
	
	JButton zero, one, two, three, four, five, six, seven, eight, nine;
	
	JButton addButton, subtractButton, multiplyButton, divideButton, equalButton, decimalButton;
	
	JTextField inputField, resultField;
	
	double firstNum, secondNum;
	String operator;
	Calculator calc;
	
	//********************** Main **********************
	public static void main(String[] args) {
	    new Calculator_GUI();
	}//end main
	
	
	
	//********************** Constructor **********************
	public Calculator_GUI() {
		
		calc = new Calculator();
		
		//********** Frame **********
		this.setTitle("Calculator");
		this.setLocation(200, 150);
		this.setResizable(false);
		this.setSize(420, 600);
		this.setBackground(Color.PINK);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		
		
		//********** Panel **********
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.PINK);
		this.add(panel);
		
		
		
		//********** Number Buttons **********
		zero = new JButton("0");
		zero.setBounds(110, 420, 80, 80);
		panel.add(zero);
		zero.addActionListener(this);
		
		one = new JButton("1");
		one.setBounds(20, 330, 80, 80);
		panel.add(one);
		one.addActionListener(this);
		
		two = new JButton("2");
		two.setBounds(110, 330, 80, 80);
		panel.add(two);
		two.addActionListener(this);
		
		three = new JButton("3");
		three.setBounds(200, 330, 80, 80);
		panel.add(three);
		three.addActionListener(this);
		
		four = new JButton("4");
		four.setBounds(20, 240, 80, 80);
		panel.add(four);
		four.addActionListener(this);
		
		five = new JButton("5");
		five.setBounds(110, 240, 80, 80);
		panel.add(five);
		five.addActionListener(this);
		
		six = new JButton("6");
		six.setBounds(200, 240, 80, 80);
		panel.add(six);
		six.addActionListener(this);
		
		seven = new JButton("7");
		seven.setBounds(20, 150, 80, 80);
		panel.add(seven);
		seven.addActionListener(this);
		
		eight = new JButton("8");
		eight.setBounds(110, 150, 80, 80);
		panel.add(eight);
		eight.addActionListener(this);
		
		nine = new JButton("9");
		nine.setBounds(200, 150, 80, 80);
		panel.add(nine);
		nine.addActionListener(this);
		
		
		
		//********** Operation Buttons *****a*****
		addButton = new JButton("+");
		addButton.setBounds(290, 420, 80, 80);
		panel.add(addButton);
		addButton.addActionListener(this);
		
		subtractButton = new JButton("-");
		subtractButton.setBounds(290, 330, 80, 80);
		panel.add(subtractButton);
		subtractButton.addActionListener(this);
		
		multiplyButton = new JButton("*");
		multiplyButton.setBounds(290, 240, 80, 80);
		panel.add(multiplyButton);
		multiplyButton.addActionListener(this);

		divideButton = new JButton("/");
		divideButton.setBounds(290, 150, 80, 80);
		panel.add(divideButton);
		divideButton.addActionListener(this);
		
		equalButton = new JButton("=");
		equalButton.setBounds(200, 420, 80, 80);
		panel.add(equalButton);
		equalButton.addActionListener(this);
		
		decimalButton = new JButton(".");
		decimalButton.setBounds(20, 420, 80, 80);
		panel.add(decimalButton);
		decimalButton.addActionListener(this);
		
		
		
		//********** Text Fields **********
		inputField = new JTextField();
		inputField.setBounds(20, 20, 360, 50);
		panel.add(inputField);
		inputField.addActionListener(this);
		
		resultField = new JTextField();
		resultField.setBounds(20, 500, 360, 50);
		panel.add(resultField);
		resultField.addActionListener(this);
		
		this.setVisible(true);
		
	}//end Calculator_GUI Constructor
	
	
	
	//********************** Action Listener **********************
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == zero) {inputField.setText(inputField.getText() + "0");}
		else if(event.getSource() == one) { inputField.setText(inputField.getText() + "1");}
		else if(event.getSource() == two) {inputField.setText(inputField.getText() + "2");}
		else if(event.getSource() == three) {inputField.setText(inputField.getText() + "3");}
		else if(event.getSource() == four) {inputField.setText(inputField.getText() + "4");}
        else if(event.getSource() == five) {inputField.setText(inputField.getText() + "5");}
		else if(event.getSource() == six) {inputField.setText(inputField.getText() + "6");}
		else if(event.getSource() == seven) {inputField.setText(inputField.getText() + "7");}
		else if(event.getSource() == eight) {inputField.setText(inputField.getText() + "8");}
		else if(event.getSource() == nine) {inputField.setText(inputField.getText() + "9");}
		else if(event.getSource() == addButton) {
			firstNum = Double.parseDouble(inputField.getText());
			operator = "+";
			inputField.setText("");
		}
		else if(event.getSource() == subtractButton) {
			firstNum = Double.parseDouble(inputField.getText());
			operator = "-";
			inputField.setText("");
		}
		else if(event.getSource() == multiplyButton) { 
			firstNum = Double.parseDouble(inputField.getText());
			operator = "*";
			inputField.setText("");
		}
		else if(event.getSource() == divideButton) {
			firstNum = Double.parseDouble(inputField.getText());
			operator = "/";
			inputField.setText("");
		}
		else if(event.getSource() == equalButton) {
			secondNum = Double.parseDouble(inputField.getText());
			double result = 0;
			switch(operator) {
			case "+": result = calc.add(firstNum, secondNum); break;
			case "-": result = calc.subtract(firstNum, secondNum); break;
			case "*": result = calc.multiply(firstNum, secondNum); break;
			case "/": result = calc.divide(firstNum, secondNum); break;
			}
			resultField.setText(String.valueOf(result));
			inputField.setText("");
		}
		else if(event.getSource() == decimalButton) {
			if(!inputField.getText().contains(".")) {
				inputField.setText(inputField.getText() + ".");
			}
		}
																		
		
	}//end actionPerfomed

}//end class Calculator_GUI
