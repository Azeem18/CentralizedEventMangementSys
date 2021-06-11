import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Azeem {

	public static JPasswordField passwordfield;
	public static JTextField text,text0,text1,text2,temp_text,temp_text2,temp_text3,temp_text4,t1,t2,t3,t4,t5,t6,t7,t8;
	public static String temp_firstName,temp_lastName,temp_password,temp_password2,temp_date,str1,str2,str3,tempid;
	public static JFrame tempframe,tempframe1,tempframe2,tempframe3,tempframe4,tempframe5,tempframe6,tempframe7,tempframe8,tempframe9,tempframe10,tempframe11,tempframe12;
	public static int counter=0,hold=1;
public static void main(String [] args)
{
login();
}
public static void login()
{
	
	MyListner m1 = new MyListner();
	   
	tempframe2= new JFrame("Role");
    JLabel label = new JLabel("Chose Option According to Your Preference", JLabel.CENTER);
    JButton button = new JButton("User");
    
    button.setBounds(580, 100, 300, 50);
    button.setFont(new Font("Verdana", Font.ITALIC, 20));
    button.setFont(new Font("Verdana",Font.BOLD, 20));
    button.setFocusable(false);
    button.setBackground(Color.BLACK);
    button.setForeground(Color.WHITE);
    button.addActionListener(m1);
    
    label.setVerticalAlignment(JLabel.TOP);
    label.setFont(new Font("Verdana", Font.ITALIC, 55));
    label.setFont(new Font("Verdana",Font.BOLD, 55));
    label.setForeground(new Color(120, 90, 40));
    label.setBackground(new Color(100, 20, 70));
    Border border;
    border = BorderFactory.createLineBorder(Color.ORANGE);
    label.setPreferredSize(new Dimension(250, 100));
    label.setBorder(border);
    
    
    tempframe2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    tempframe2.add(button);
    tempframe2.add(label);
    tempframe2.getContentPane().setBackground(Color.GRAY);
    tempframe2.setSize(1370, 730);
    label.setVisible(true);
    tempframe2.setVisible(true);
    
}
public static void actionOnLogin(int num)
{
	counter=5;
	MyListner m1 = new MyListner();
	 
    tempframe6=new JFrame("Credentials");
    JLabel label=new JLabel("Enter Your Credentials");
    JLabel label0=new JLabel("Enter User Id");
    JLabel label1=new JLabel("Enter First Name");
    JLabel label2=new JLabel("Enter Last Name");
    JLabel label3=new JLabel("Enter Password");
    text=new JTextField(10);
    text0=new JTextField(10);
    text1=new JTextField(10);
    passwordfield=new JPasswordField(10);
    JButton button=new JButton("Done");
    JButton button1=new JButton("Show Password");
    JPanel panel=new JPanel();
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    
    panel.setLayout(new FlowLayout());
    panel1.setLayout(new GridLayout(4,2));
    panel2.setLayout(new FlowLayout());
    panel.add(label);
    panel1.add(label0); panel1.add(text0);panel1.add(label1); panel1.add(text); panel1.add(label2); panel1.add(text1); panel1.add(label3); panel1.add(passwordfield);
    panel2.add(button); panel2.add(button1);
    panel.setBackground(Color.LIGHT_GRAY);
    panel1.setBackground(Color.LIGHT_GRAY);
    panel2.setBackground(Color.LIGHT_GRAY);
  
    
    label0.setFont(new Font("Verdana", Font.ITALIC,20));
    label0.setForeground(new Color(120, 90, 40));
    label0.setBackground(new Color(100, 20, 70));
    label.setFont(new Font("Verdana", Font.ITALIC,40));
    label.setForeground(new Color(120, 90, 40));
    label.setBackground(new Color(100, 20, 70));
    label1.setFont(new Font("Verdana", Font.ITALIC,20));
    label1.setForeground(new Color(120, 90, 40));
    label1.setBackground(new Color(100, 20, 70));
    label2.setFont(new Font("Verdana", Font.ITALIC,20));
    label2.setForeground(new Color(120, 90, 40));
    label2.setBackground(new Color(100, 20, 70));
    label3.setFont(new Font("Verdana", Font.ITALIC,20));
    label3.setForeground(new Color(120, 90, 40));
    label3.setBackground(new Color(100, 20, 70));
   
    button.setFont(new Font("Verdana", Font.ITALIC, 20));
    button.setFont(new Font("Verdana",Font.BOLD, 20));
    button.setFocusable(false);
    button.setBackground(Color.BLACK);
    button.setForeground(Color.WHITE);
    button.addActionListener(m1);
    button1.setFont(new Font("Verdana", Font.ITALIC, 20));
    button1.setFont(new Font("Verdana",Font.BOLD, 20));
    button1.setFocusable(false);
    button1.setBackground(Color.BLACK);
    button1.setForeground(Color.WHITE);
    button1.addActionListener(m1);
    
    text.setFont(new Font("Verdana", Font.ITALIC, 20));
    text0.setFont(new Font("Verdana", Font.ITALIC, 20));
    text1.setFont(new Font("Verdana", Font.ITALIC, 20));
    passwordfield.setFont(new Font("Verdana", Font.ITALIC, 20));
    
    tempframe6.setSize(900,500);
    tempframe6.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    tempframe6.setLayout(new BorderLayout());
    tempframe6.add(panel,BorderLayout.NORTH);
    tempframe6.add(panel1,BorderLayout.CENTER);
    tempframe6.add(panel2,BorderLayout.SOUTH);
    tempframe6.setVisible(true);
    
    
}
public static void actionOnUser()
    {
    	 MyListner m1 = new MyListner();
   	   
  	    tempframe8= new JFrame("Function");
         JLabel label = new JLabel("Chose Option According to Your Preference", JLabel.CENTER);
         JButton button = new JButton("Join Event Online");
         JButton button1 = new JButton("Join Event Offline");
         
         button.setBounds(580, 100, 300, 50);
         button.setFont(new Font("Verdana", Font.ITALIC, 20));
         button.setFont(new Font("Verdana",Font.BOLD, 20));
         button.setFocusable(false);
         button.setBackground(Color.BLACK);
         button.setForeground(Color.WHITE);
         button.addActionListener(m1);
         
         
         button1.setBounds(580, 160, 300, 50);
         button1.setFont(new Font("Verdana", Font.ITALIC, 20));
         button1.setFont(new Font("Verdana",Font.BOLD, 20));
         button1.setFocusable(false);
         button1.setBackground(Color.BLACK);
         button1.setForeground(Color.WHITE);
         button1.addActionListener(m1);
              
         label.setVerticalAlignment(JLabel.TOP);
         label.setFont(new Font("Verdana", Font.ITALIC, 55));
         label.setFont(new Font("Verdana",Font.BOLD, 55));
         label.setForeground(new Color(120, 90, 40));
         label.setBackground(new Color(100, 20, 70));
         Border border;
         border = BorderFactory.createLineBorder(Color.ORANGE);
         label.setPreferredSize(new Dimension(250, 100));
         label.setBorder(border);
         
         
         tempframe8.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         tempframe8.add(button);
         tempframe8.add(button1);
         tempframe8.add(label);
         tempframe8.getContentPane().setBackground(Color.GRAY);
         tempframe8.setSize(1370, 730);
         label.setVisible(true);
         tempframe8.setVisible(true);
    }
 public static void joinOnline(int num)
    {
    	counter=10;
    	MyListner m1 = new MyListner();
	    tempframe10=new JFrame("Credentials");
	    JLabel label=new JLabel("Enter Required Information");
	    JLabel label0=new JLabel("Enter Your ID");
	    JLabel label1=new JLabel("Enter Your Address");
	    JLabel label2=new JLabel("Enter Event Type");
	    JLabel label3=new JLabel("Payment");
	    
	    
	    text=new JTextField(10);
	    text0=new JTextField(10);
	    text1=new JTextField(10);
	    text2=new JTextField(10);
	   
	    JButton button=new JButton("Next");
	    
	    JPanel panel=new JPanel();
	    JPanel panel1=new JPanel();
	    JPanel panel2=new JPanel();
	    if(num==2)
	    {
	    	panel1.setLayout(new GridLayout(4,2));
	    }
	    else
	    {
	    	panel1.setLayout(new GridLayout(3,2));
	    }
	    panel.setLayout(new FlowLayout());
	    panel2.setLayout(new FlowLayout());
	    panel.add(label);
	    panel1.add(label0); panel1.add(text0);panel1.add(label1); panel1.add(text); panel1.add(label2); panel1.add(text1);
	    if(num==2)
	    {
	    	panel1.add(label3);panel1.add(text2);
	    }
	    panel2.add(button); 
	    panel.setBackground(Color.LIGHT_GRAY);
	    panel1.setBackground(Color.LIGHT_GRAY);
	    panel2.setBackground(Color.LIGHT_GRAY);
	  
	    
	    label0.setFont(new Font("Verdana", Font.ITALIC,20));
        label0.setForeground(new Color(120, 90, 40));
        label0.setBackground(new Color(100, 20, 70));
	    label.setFont(new Font("Verdana", Font.ITALIC,40));
        label.setForeground(new Color(120, 90, 40));
        label.setBackground(new Color(100, 20, 70));
        label1.setFont(new Font("Verdana", Font.ITALIC,20));
        label1.setForeground(new Color(120, 90, 40));
        label1.setBackground(new Color(100, 20, 70));
        label2.setFont(new Font("Verdana", Font.ITALIC,20));
        label2.setForeground(new Color(120, 90, 40));
        label2.setBackground(new Color(100, 20, 70));
        label3.setFont(new Font("Verdana", Font.ITALIC,20));
        label3.setForeground(new Color(120, 90, 40));
        label3.setBackground(new Color(100, 20, 70));
       
        button.setFont(new Font("Verdana", Font.ITALIC, 20));
        button.setFont(new Font("Verdana",Font.BOLD, 20));
        button.setFocusable(false);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(m1);
        
        text.setFont(new Font("Verdana", Font.ITALIC, 20));
        text0.setFont(new Font("Verdana", Font.ITALIC, 20));
        text1.setFont(new Font("Verdana", Font.ITALIC, 20));
        text2.setFont(new Font("Verdana", Font.ITALIC, 20));
        
	    tempframe10.setSize(900,500);
	    tempframe10.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    tempframe10.setLayout(new BorderLayout());
	    tempframe10.add(panel,BorderLayout.NORTH);
	    tempframe10.add(panel1,BorderLayout.CENTER);
	    tempframe10.add(panel2,BorderLayout.SOUTH);
	    tempframe10.setVisible(true);
    }
    
    public static void eventsList(int num)
    {
    	MyListner m1 = new MyListner();
    	if((text0.getText().equals("2020") && num==1) || (text0.getText().equals("2021") && num==2) )
    	{
    	    tempframe11= new JFrame("EventsList");
    	    JPanel p1=new JPanel();
    		JRadioButton b1=new JRadioButton("Concert");
    		JRadioButton b2=new JRadioButton("Business Meeting");
    		JRadioButton b3=new JRadioButton("Party");
    		JRadioButton b4=new JRadioButton("Marriage");
    		JRadioButton b5=new JRadioButton("Relegious Meeting");
    		JButton b6= new JButton("Confirm");
    		
    		b1.setFocusable(false);
    		b2.setFocusable(false);
    		b3.setFocusable(false);
    		b4.setFocusable(false);
    		b5.setFocusable(false);
    		b6.setFocusable(false);
    		
    		p1.setLayout(new GridLayout(6,1));
    		ButtonGroup group=new ButtonGroup();
    		group.add(b1);
    		group.add(b2);
    		group.add(b3);
    		group.add(b4);
    		group.add(b5);
    		p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b4);p1.add(b5);
    		p1.add(b6);
    		
    		 b6.setFont(new Font("Verdana", Font.ITALIC, 20));
    	     b6.setFont(new Font("Verdana",Font.BOLD, 20));
    	     b6.setFocusable(false);
    	     b6.setBackground(Color.BLACK);
    	     b6.setForeground(Color.WHITE);
    	     
    	     b1.addActionListener(m1);
    	     b2.addActionListener(m1);
    	     b3.addActionListener(m1);
    	     b4.addActionListener(m1);
    	     b5.addActionListener(m1);
    	     b6.addActionListener(m1);
    	     
    		
    		tempframe11.setSize(500,300);
    		tempframe11.setLayout(new BorderLayout());
    		tempframe11.add(p1,BorderLayout.CENTER);
    		tempframe11.setVisible(true);
    	}
    	else
    		JOptionPane.showMessageDialog(null,"Your id is incorrect");
    }
    public static void actionOnLog(int num)
    {
    	counter=5;
    	MyListner m1 = new MyListner();
    	 
	    tempframe6=new JFrame("Credentials");
	    JLabel label=new JLabel("Enter Your Credentials");
	    JLabel label0=new JLabel();
        if(num==1)
        {
        	hold=1;
        	label0=new JLabel("Enter User Id");
        }
        else if(num==2)
        {
        	hold=2;
        	label0=new JLabel("Enter Organizer Id");
        }
	    JLabel label1=new JLabel("Enter First Name");
	    JLabel label2=new JLabel("Enter Last Name");
	    JLabel label3=new JLabel("Enter Password");
	    text=new JTextField(10);
	    text0=new JTextField(10);
	    text1=new JTextField(10);
	    passwordfield=new JPasswordField(10);
	    JButton button=new JButton("Done");
	    JButton button1=new JButton("Show Password");
	    JPanel panel=new JPanel();
	    JPanel panel1=new JPanel();
	    JPanel panel2=new JPanel();
	    
	    panel.setLayout(new FlowLayout());
	    panel1.setLayout(new GridLayout(4,2));
	    panel2.setLayout(new FlowLayout());
	    panel.add(label);
	    panel1.add(label0); panel1.add(text0);panel1.add(label1); panel1.add(text); panel1.add(label2); panel1.add(text1); panel1.add(label3); panel1.add(passwordfield);
	    panel2.add(button); panel2.add(button1);
	    panel.setBackground(Color.LIGHT_GRAY);
	    panel1.setBackground(Color.LIGHT_GRAY);
	    panel2.setBackground(Color.LIGHT_GRAY);
	  
	    
	    label0.setFont(new Font("Verdana", Font.ITALIC,20));
        label0.setForeground(new Color(120, 90, 40));
        label0.setBackground(new Color(100, 20, 70));
	    label.setFont(new Font("Verdana", Font.ITALIC,40));
        label.setForeground(new Color(120, 90, 40));
        label.setBackground(new Color(100, 20, 70));
        label1.setFont(new Font("Verdana", Font.ITALIC,20));
        label1.setForeground(new Color(120, 90, 40));
        label1.setBackground(new Color(100, 20, 70));
        label2.setFont(new Font("Verdana", Font.ITALIC,20));
        label2.setForeground(new Color(120, 90, 40));
        label2.setBackground(new Color(100, 20, 70));
        label3.setFont(new Font("Verdana", Font.ITALIC,20));
        label3.setForeground(new Color(120, 90, 40));
        label3.setBackground(new Color(100, 20, 70));
       
        button.setFont(new Font("Verdana", Font.ITALIC, 20));
        button.setFont(new Font("Verdana",Font.BOLD, 20));
        button.setFocusable(false);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(m1);
        button1.setFont(new Font("Verdana", Font.ITALIC, 20));
        button1.setFont(new Font("Verdana",Font.BOLD, 20));
        button1.setFocusable(false);
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.addActionListener(m1);
        
        text.setFont(new Font("Verdana", Font.ITALIC, 20));
        text0.setFont(new Font("Verdana", Font.ITALIC, 20));
        text1.setFont(new Font("Verdana", Font.ITALIC, 20));
        passwordfield.setFont(new Font("Verdana", Font.ITALIC, 20));
        
	    tempframe6.setSize(900,500);
	    tempframe6.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    tempframe6.setLayout(new BorderLayout());
	    tempframe6.add(panel,BorderLayout.NORTH);
	    tempframe6.add(panel1,BorderLayout.CENTER);
	    tempframe6.add(panel2,BorderLayout.SOUTH);
	    tempframe6.setVisible(true);
	    
	    
    }
    
    public static void Verification(String id,String fn,String ln,String pw )
    {
 	   int check=0;
 		   if("2020".equals(id))
 		   {
 			   check=1;
 			  if("Azeem".equalsIgnoreCase(fn) )
 	 		   {
 	 			   check=2;
 	 			   if("Ahmad".equalsIgnoreCase(ln))
 	 			   {
 	 				   check=3;
 	 				   if("1234".equalsIgnoreCase(pw))
 	 				   {
 	 					   check=4;
 	 				   }
 	 			   }
 	 		   }
 		   }
 	   if(check==0)
 	   {
 		   JOptionPane.showMessageDialog(null,"Your id is incorrect");
 	   }
 	   else if(check==1)
 	   {
 		   JOptionPane.showMessageDialog(null,"Your first name is incorrect");
 	   }
 	   else if(check==2)
 	   {
 		   JOptionPane.showMessageDialog(null,"Your last name is incorrect");
 	   }
 	   else if(check==3)
 	   {
 		  JOptionPane.showMessageDialog(null,"Your password is incorrect");
 	   }
 	   else
 	   {
 		   actionOnUser();
 		   tempframe6.dispose();
 	   }
    }
    public static class MyListner implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        	try
        	{
            if(e.getActionCommand().equalsIgnoreCase("next"))
            {
            	if(counter==10)
            	{
            		
            		eventsList(1);
            	}
            	else if(counter==11)
            	{
            		
            		eventsList(2);
            	}	
            }
            if(e.getActionCommand().equalsIgnoreCase("exit"))
                tempframe4.dispose();
            if(e.getActionCommand().equalsIgnoreCase("Show Password"))
                JOptionPane.showMessageDialog(null,"Password is:\n"+passwordfield.getText());
            if(e.getActionCommand().equalsIgnoreCase("Done"))
            {
            	    tempid=text0.getText();
            		temp_firstName=text.getText();
        	        temp_lastName=text1.getText();
        	        temp_password=passwordfield.getText();
                    Verification(tempid,temp_firstName,temp_lastName,passwordfield.getText());
            	
            }
            if(e.getActionCommand().equalsIgnoreCase("Close"))
            	tempframe7.dispose();
            if(e.getActionCommand().equalsIgnoreCase("User"))
            {
            	tempframe2.dispose();
            	actionOnLog(1);
            }
            if(e.getActionCommand().equalsIgnoreCase("Join Event Online"))
            {
            	tempframe8.dispose();
            	joinOnline(1);
            }
            if(e.getActionCommand().equalsIgnoreCase("Join Event Offline"))
            {
            	tempframe8.dispose();
            	joinOnline(2);
            }
            if(e.getActionCommand().equalsIgnoreCase("Confirm"))
            {
            	if(counter==10 && hold==15)
            	{
            		tempframe11.dispose();
            		tempframe10.dispose();
            		JOptionPane.showMessageDialog(null,"Your event id is 1500 ");
            	}
            	else 
            	{
            		if(counter==10 && hold==15)
                	{
                		tempframe10.dispose();
                	}
            		if(counter==11 && hold==15)
                	{
                		tempframe12.dispose();
                	}
            		JOptionPane.showMessageDialog(null,"Please choose Your option ");
            	}
            		
            }
            if(e.getActionCommand().equalsIgnoreCase("Concert") || e.getActionCommand().equalsIgnoreCase("Business Meeting") || e.getActionCommand().equalsIgnoreCase("Party"))
            	hold=15;
            if(e.getActionCommand().equalsIgnoreCase("Religious Meeting") || e.getActionCommand().equalsIgnoreCase("Marriage"))
            	hold=15;
}catch(NumberFormatException i)
        	{
        	JOptionPane.showMessageDialog(null,"Please fill in all fields ");
        	}
}
    }
}