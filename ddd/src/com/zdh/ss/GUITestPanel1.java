package com.zdh.ss;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GUITestPanel1 extends JPanel{
	public JLabel prompt;
	public JLabel Test;
	public JButton enterButton,cancelButton;
	public JTextField inputField;
	public Listener listener;
	public int a,b;
	 
	
	public GUITestPanel1() {
		
		prompt=new JLabel("请输入您的答案:");
		
		
		a=new Random().nextInt(10);
	    b=new Random().nextInt(10);
	    Test=new JLabel(String.format("%d*%d=",a,b));
	    
		enterButton=new JButton("确定");
		cancelButton=new JButton("取消");
		inputField=new JTextField(10);
		listener=new Listener(inputField,enterButton,cancelButton,a,b);
		add(prompt);
		add(Test);
		add(inputField);
		add(enterButton);
		add(cancelButton);
		
		inputField.addActionListener(listener);
		enterButton.addActionListener(listener);
		cancelButton.addActionListener(listener);
		System.out.println("aaaaaa");
	}
}
class Listener implements ActionListener{
	public JTextField inputField;
	public JButton enterButton;
	public JButton cancelButton;
	public int number;
	public int a,b;
	
	
	
	public Listener(JTextField field,JButton button1,JButton button2,int a,int b) {
		inputField=field;
		enterButton=button1;
		cancelButton=button2;
		this.a=a;
		this.b=b;
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("bbbbbbbb");
		if(e.getSource()==inputField) {
			number=Integer.parseInt(inputField.getText());
			if(number== a*b) {
				JOptionPane.showMessageDialog(null,"非常好！");
				inputField.setText("");
			}
			else {
				JOptionPane.showMessageDialog(null, "不对。再试试！");
			}
		}
		else if(e.getSource()==enterButton) {
			number=Integer.parseInt(inputField.getText());
			if(number== a*b) {
				JOptionPane.showMessageDialog(null, "非常好！");
				inputField.setText("");
				new GUITestPanel1();
				
			}
			else {
				JOptionPane.showMessageDialog(null, "不对。再试试！");
				inputField.setText("");
			}
		}
		else
			inputField.setText("");
	}
}

