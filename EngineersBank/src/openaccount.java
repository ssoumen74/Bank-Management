import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.imageio.ImageIO;
import javax.swing.*;



public class openaccount extends JFrame 
{
	JLabel oa1 = new JLabel("MOBILE NO");
	JLabel oa2 = new JLabel("NAME");
	JLabel oa3 = new JLabel("AGE");
	JLabel oa4 = new JLabel("CITY");
	JLabel oa5 = new JLabel("PASSWORD");
	JLabel oa6 = new JLabel("AADHAR NUMBER");
	JLabel oa7 = new JLabel("ADDRESS");
	JButton proceed = new JButton("PROCEED");
	JTextField ot11=new JTextField("+91");
	JTextField ot1=new JTextField();
	JTextField ot2=new JTextField();
	JTextField ot3=new JTextField();
	JTextField ot4=new JTextField();
	JTextField ot5=new JPasswordField();
	JTextField ot6=new JTextField();
	JTextField ot7=new JTextField();
	
	openaccount()  //  CONSTRUCTOR FOR THE CLASS STARTS HERE
	{ 
		super("OPEN  YOUR  ACCOUNT");
		setSize(400,500);setLocationRelativeTo(null);setResizable(false);
		////////////////////////////////////////////////////////////////////////////////////////
		Color vio = new Color(69,156,13); Font oa =new Font("Typo Round Regular Demo",0,15);  //
		oa1.setForeground(vio); oa1.setFont(oa);											  //
		oa2.setForeground(vio); oa2.setFont(oa);											  //
		oa3.setForeground(vio); oa3.setFont(oa);											  //
		oa4.setForeground(vio); oa4.setFont(oa);    										  //
		oa5.setForeground(vio); oa5.setFont(oa);											  //
		oa6.setForeground(vio); oa6.setFont(oa);											  //
		oa7.setForeground(vio); oa7.setFont(oa);											  //
		////////////////////////////////////////////////////////////////////////////////////////
		
		////////////////////////////////////////////////////////////////////////////////////////
		oa1.setBounds(30,20,90,12);   ot1.setBounds(62,38,85,24); ot11.setBounds(30,38,30,24);// 
		oa2.setBounds(30,83,90,12);   ot2.setBounds(30,100,200,24);ot11.setEditable(false);   //
		oa3.setBounds(30,146,90,12);  ot3.setBounds(30,162,40,24);							  //	
		oa4.setBounds(90,146,90,12);  ot4.setBounds(90,162,150,24);							  //	
		oa5.setBounds(30,210,90,12);  ot5.setBounds(30,224,150,24); 						  //
		oa6.setBounds(30,273,120,12); ot6.setBounds(30,288,190,24);      					  //
		oa7.setBounds(30,336,89,12);  ot7.setBounds(30,352,250,24);							  //
		////////////////////////////////////////////////////////////////////////////////////////
		
		/////////  ACTON BUTTON   //////////////////////////////////////////////////////////////
		proceed.setFont(new Font("Typo Round Regular Demo",0,25));							  //
		proceed.setForeground(new Color(255,255,255));										  //
		proceed.setBackground(new Color(255,154,53));										  //
		proceed.setBounds(110,400,150,40);													  //
																							  //
		proceed.addMouseListener(new proceedEffect());										  //
																							  //
		////////////////////////////////////////////////////////////////////////////////////////
		
		add(oa1);add(oa2);add(oa3);add(oa4);add(oa5);add(oa6);add(oa7);add(ot11);
		add(ot1); add(ot2); add(ot3); add(ot4);add(ot5); add(ot6);add(ot7);add(proceed);	
		
		
		////////  BACKGROUND IMAGE       //////////////////////////////////////////////////////
		setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("C://Users//SAM//Desktop//Eclipse Work//EngineersBank//images//openaccount.jpg"));
		add(background);
		background.setLayout(new FlowLayout());
		/////////////////////////////////////////////////////
		setVisible(true);							/////////
		/////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}
	/////////////////////////////////////////////////////////////////////////////////////////////
	////////    CONSTRUCTOR ENDS HERE       /////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	
	class proceedEffect implements MouseListener
	{
	      public void mouseEntered(MouseEvent evt)
	        {
	    	  proceed.setText("CLICK HERE");proceed.setBounds(0, 400, 400,70);
	    	  proceed.setBackground(new Color(95,201,148));
	    	  proceed.setFont(new Font("Bauhaus 93",0,40));
	    	  proceed.setForeground(new Color(255,255,255));
	        }
	      public void mouseExited(MouseEvent evt)
	      	{
	    	  proceed.setText("PROCEED");
	    	  proceed.setBounds(110,400,150,40);proceed.setBackground(new Color(255,154,53));
	    	  proceed.setFont(new Font("Typo Round Regular Demo",0,25));
	    	  proceed.setForeground(new Color(255,255,255));
	      	}
	      public void mouseReleased(MouseEvent evt){}
	      public void mousePressed(MouseEvent evt){}
	      public void mouseClicked(MouseEvent evt)
	      	{
	    	  try{Class.forName("com.mysql.jdbc.Driver");
	    	  Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","1234");
	         String qr="insert into customers values(?,?,?,?,?,?,?,?)";
	         PreparedStatement ps= cn.prepareStatement(qr);
	       
	         ps.setString(1, ot1.getText());  //name
	         ps.setString(2, ot2.getText());  //mobile number
	         ps.setString(3, ot3.getText());  //age
	         ps.setString(4, ot4.getText());  //city
	         ps.setString(5, ot5.getText());  //password
	         ps.setString(6, ot6.getText());  //aadhar number
	         ps.setString(7, ot7.getText());  //address
	         ps.setString(8, "5000");
	        
	          ps.executeUpdate();}
	    	  catch (Exception ex) {
	    		  System.out.println(ex);
	    	  }
	    	  JOptionPane.showMessageDialog(getContentPane(), "Congratulations... your account has been created");
	      	}
	}

}
