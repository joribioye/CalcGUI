package GUIPackage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

	public class InterestCalculator extends JFrame {
		
		public InterestCalculator(){
			initUI();
		}
	

		public final void initUI(){
		
			JFrame page = new JFrame();
			page.setTitle("PS4 Interest Calcuator");
			page.setLocationRelativeTo(null);
			page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			page.pack();
			page.setVisible(true);
			
			JButton total = new JButton("Calculate");

			JLabel InvestmentAmount = new JLabel("Investment Amount");
			JLabel Years = new JLabel("Years");
			JLabel Rate = new JLabel("Annual Interest Rate");
			JLabel FValue= new JLabel("Future Value");
			JLabel Blank = new JLabel("");

			JTextField txtInvest = new JTextField(30);
			JTextField txtYear = new JTextField(30);
			JTextField txtRate = new JTextField(30);
			JTextField txtRes = new JTextField(30);

			JPanel jp;

			jp = new JPanel();
			// assigning grid layout to the panel
			jp.setLayout(new GridLayout(5, 2));
			// setting the preferred size to paneljp.setPreferredSize(new Dimension(400, 250));
			// components of the panel
			jp.add(InvestmentAmount);
			jp.add(txtInvest);
			jp.add(Years);
			jp.add(txtYear);
			jp.add(Rate);
			jp.add(txtRate);
			jp.add(FValue);
			jp.add(txtRes);
			jp.add(Blank);
			jp.add(total);
			add(jp);
			// adding button listener
			//total.addActionListener(this);
			
		}
// Action handler
 
 
    /*public void actionPerformed(ActionEvent e){
    	double invest = Double.parseDouble(txtInvest.getText());
    	int year = Integer.parseInt(txtYear.getText());
    	double interestrt = Double.parseDouble(txtRate.getText());
    		if(e.getSource() == total){
    			double res = invest * Math.pow((1 + interestrt), (year * 12));
    			System.out.println((10000 * Math.pow((3.25 + 1),36)));
    			txtRes.setText(String.valueOf(res));
    		}
    }*/

}