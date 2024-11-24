package calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator implements ActionListener {
	
	static final String zeroSymbol = "0";
	static final String oneSymbol = "1";
	static final String twoSymbol = "2";
	static final String threeSymbol = "3";
	static final String fourSymbol = "4";
	static final String fiveSymbol = "5";
	static final String sixSymbol = "6";
	static final String sevenSymbol = "7";
	static final String eightSymbol = "8";
	static final String nineSymbol = "9";
	static final String decimalSymbol = ".";
	static final String divisionSymbol = "/";
	static final String multiplicationSymbol = "*";
	static final String additionSymbol = "+";
	static final String subractionSymbol = "-";
	static final String equalSymbol = "=";
	static final String clearSymbol = "c";

	JFrame jf = new JFrame();
	JLabel topLabel = new JLabel();
	JLabel operationLabel = new JLabel();
	JLabel mainLabel = new JLabel();
	JButton zeroButton = new JButton(zeroSymbol);
	JButton oneButton = new JButton(oneSymbol);
	JButton twoButton = new JButton(twoSymbol);
	JButton threeButton = new JButton(threeSymbol);
	JButton fourButton = new JButton(fourSymbol);
	JButton fiveButton = new JButton(fiveSymbol);
	JButton sixButton = new JButton(sixSymbol);
	JButton sevenButton = new JButton(sevenSymbol);
	JButton eightButton = new JButton(eightSymbol);
	JButton nineButton = new JButton(nineSymbol);
	JButton decimalButton = new JButton(decimalSymbol);
	JButton divisionButton = new JButton(divisionSymbol);
	JButton multipicationButton = new JButton(multiplicationSymbol);
	JButton additionButton = new JButton(additionSymbol);
	JButton subtracrionButton = new JButton(subractionSymbol);
	JButton clearButton = new JButton(clearSymbol);
	JButton equalButton = new JButton(equalSymbol);

	Calculator() {
		buildLayout();
	}

	public static void main(String[] args) {
		new Calculator();
	}

	public void buildLayout() {
		jf.setLayout(null);
		jf.setSize(310, 600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Styling Top Label
		// -------------
		topLabel.setBackground(Color.gray);
		topLabel.setOpaque(true);
		topLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		topLabel.setForeground(Color.white);

		// Styling operation Label
		// -----------------------
		operationLabel.setBackground(Color.gray);
		operationLabel.setOpaque(true);
		operationLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		operationLabel.setForeground(Color.white);

		// Styling Main Label
		// -------------
		mainLabel.setBackground(Color.gray);
		mainLabel.setOpaque(true);
		mainLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		mainLabel.setForeground(Color.white);

		// Positioning Buttons
		// -------------------
		topLabel.setBounds(10, 10, 270, 20);
		operationLabel.setBounds(10, 40, 270, 20);
		mainLabel.setBounds(10, 70, 270, 50);
		sevenButton.setBounds(10, 130, 60, 60);
		eightButton.setBounds(80, 130, 60, 60);
		nineButton.setBounds(150, 130, 60, 60);
		divisionButton.setBounds(220, 130, 60, 60);
		fourButton.setBounds(10, 200, 60, 60);
		fiveButton.setBounds(80, 200, 60, 60);
		sixButton.setBounds(150, 200, 60, 60);
		multipicationButton.setBounds(220, 200, 60, 60);
		oneButton.setBounds(10, 270, 60, 60);
		twoButton.setBounds(80, 270, 60, 60);
		threeButton.setBounds(150, 270, 60, 60);
		subtracrionButton.setBounds(220, 270, 60, 60);
		clearButton.setBounds(10, 340, 60, 60);
		zeroButton.setBounds(80, 340, 60, 60);
		decimalButton.setBounds(150, 340, 60, 60);
		additionButton.setBounds(220, 340, 60, 60);
		equalButton.setBounds(10, 410, 270, 60);

		// Adding Buttons to Window
		// ------------------------
		jf.add(topLabel);
		jf.add(operationLabel);
		jf.add(mainLabel);
		jf.add(zeroButton);
		jf.add(oneButton);
		jf.add(twoButton);
		jf.add(threeButton);
		jf.add(fourButton);
		jf.add(fiveButton);
		jf.add(sixButton);
		jf.add(sevenButton);
		jf.add(eightButton);
		jf.add(nineButton);
		jf.add(decimalButton);
		jf.add(clearButton);
		jf.add(equalButton);
		jf.add(divisionButton);
		jf.add(multipicationButton);
		jf.add(additionButton);
		jf.add(subtracrionButton);

		// Adding Event Listeners
		// ----------------------
		zeroButton.addActionListener(this);
		oneButton.addActionListener(this);
		twoButton.addActionListener(this);
		threeButton.addActionListener(this);
		fourButton.addActionListener(this);
		fiveButton.addActionListener(this);
		sixButton.addActionListener(this);
		sevenButton.addActionListener(this);
		eightButton.addActionListener(this);
		nineButton.addActionListener(this);
		decimalButton.addActionListener(this);
		clearButton.addActionListener(this);
		equalButton.addActionListener(this);
		additionButton.addActionListener(this);
		subtracrionButton.addActionListener(this);
		multipicationButton.addActionListener(this);
		divisionButton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
