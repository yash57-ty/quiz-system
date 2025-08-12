package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class rulers extends JFrame implements ActionListener
{
	String name;
	JButton back,start;
	rulers(String name)
	{
		this.name=name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading =new JLabel("welcome "+name);
		heading.setBounds(50,20,700,30);
		heading.setFont(new Font("Times New Roman",Font.BOLD,30));
		heading.setForeground(Color.BLUE);
		add(heading);
		
		JLabel rules=new JLabel();
		rules.setBounds(20,90,700,350);
		rules.setFont(new Font("Tahoma",Font.PLAIN,16));
		rules.setText("<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point." + "<br><br>" +
                "2. Each student will ask 10 question." + "<br><br>" +
                "3. Each question only display 15 seconds can not back to the previous question." + "<br><br>" +
                "4. if you give correct answer than you will give 10 marks otherwise 0." + "<br><br>" +
                "5. only multiple choice question in exam." + "<br><br>" +
                "6. you can chose only one option at time." + "<br><br>" +
            "<html>");
		add(rules);
		
		back=new JButton("Back");
		back.setBounds(250,500,100,30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		start=new JButton("start");
		start.setBounds(400,500,100,30);
		start.setBackground(new Color(30,144,254));
		start.setForeground(Color.WHITE);
		start.addActionListener(this);
		add(start);
		
		setLocation (350,100);
		setSize(800,650);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==start)
		{
			setVisible(false);
			new quiz1(name);
		}
		else
		{
			setVisible(false);
			new login1();
		}
	}
	public static void main(String args[])
	{
		
		
	}
}