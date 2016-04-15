package jijio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dm extends JFrame{
	JSpinner s1 = new JSpinner(new SpinnerNumberModel(0.1,0.0,1000000000,0.1));
	JButton b1;
	JLabel l1, l2;
	JTextField t1;
	double i,c;
	String a;
	int flg=1;
	eHandler handler = new eHandler();
	
	public Dm(String s){
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("Ïונוגוסעט");
		l1 = new JLabel("Âגוהטעו סאםעטלוענû:");
		l2 = new JLabel();
		add(l1);
		add(s1);
		add(b1);
		add(l2);
		b1.addActionListener(handler);
	}
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){			
				if(e.getSource()==b1){	
					c=(double)s1.getValue();
					i=c/(2.54);
					a="Ä‏יל = "+ String.format("%.2f", i);
					l2.setText(a);			
				}
			}
		}	
}
