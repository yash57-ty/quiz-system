package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class score extends JFrame implements ActionListener
{
	score(String name,int score)
	{
		getContentPane().setBackground(Color.WHITE);
		setBounds(400,150,750,550);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Screenshot 2024-10-17 001107.png"));
		Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,200,300,250);
		add(image);
		
		JLabel heading=new JLabel("Thank you " +name +" for playing");
		heading.setBounds(45,30,700,30);
		heading.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(heading);
		setVisible(true);
		
		JLabel lscore=new JLabel("your score is " +score);
		lscore.setBounds(350,200,300,30);
		lscore.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(lscore);
		
		JButton submit=new JButton("play again");
		submit.setBounds(380,270,120,30);
		submit.setBackground(Color.BLUE);
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		add(submit);
		
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		setVisible(false);
		new login1();
	}
	public static void main(String args[])
	{
		new score("user",0);
	}
}