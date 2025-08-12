package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class login1 extends JFrame implements ActionListener
{
	JButton rulers,back;
	JTextField tfname;
	login1()
	{
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login1.png"));
		JLabel image=new JLabel(i1);
		image.setBounds(0,0,500,500);
		add(image);
		
		JLabel heading =new JLabel("simple minds");
		heading.setBounds(750,60,300,45);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		heading.setForeground(Color.BLUE);
		add(heading);
		
		JLabel name =new JLabel("enter you name")  ;
		name.setBounds(810,150,300,20); 
		name.setFont(new Font("Mongolian Baiti" ,Font.BOLD,20));
		name.setForeground(Color.BLUE);
		add(name);
		
		tfname =new JTextField();
		tfname.setBounds(735,200,300,25);
		tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
		add(tfname);
		
		rulers=new JButton("Rules");
		rulers.setBounds(735,270,120,25);
		rulers.setForeground(Color.BLUE);
		add(rulers);
		rulers.addActionListener(this);
		
		back=new JButton("Back");
		back.setBounds(915,270,120,25);
		back.setForeground(Color.BLUE);
		add(back);
		back.addActionListener(this);
		
		setVisible(true);
		setSize(1200,500);
		setLocation(200,150);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==rulers)
		{
			String name=tfname.getText();
			setVisible(false);
			new rulers(name);
		}
		if(e.getSource()==back)
		{
				setVisible(false);
		}
	}
	public static void main(String args[])
	{
		new login1();
	}
}