import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.swing.*;


public class closeAccountLogin extends JFrame implements ActionListener {
	
	JTextField usrbox=new JTextField();
	JPasswordField pasbox=new JPasswordField();
	
	JLabel usrtxt= new JLabel("MOBILE NO");
	JLabel usrpas= new JLabel("PASSWORD");
																			   //
	JButton login = new JButton("LOGIN");									  ///
																			/////
	////////    CONSTRUCTOR STARTS HERE /////////////////////////////////////////
	closeAccountLogin()														/////
	{																		  ///
		super("CLOSE IT");										               //	
		
		setSize(400,200);setLocationRelativeTo(null);setResizable(false);
		
		Font txtfont = new Font("Calibri Light (Headings)",0,15);
		
		////////////////////////////////////////////////////////////////////////
		////////  USERNAME FIELD  //////////////////////////////////////////////
			usrtxt.setFont(txtfont);									   /////
			usrtxt.setForeground(new Color(149,149,225));				   /////
			usrtxt.setBounds(20,20,300,15); add(usrtxt);				   /////
			usrbox.setBounds(20,40,350,30); add(usrbox);				   /////
																		   /////
		////////////////////////////////////////////////////////////////////////	
		//////  PASSWORD FIELD   ///////////////////////////////////////////////
			usrpas.setFont(txtfont);									   /////
			usrpas.setForeground(new Color(149,149,225));				   /////
			usrpas.setBounds(20,85,110,15); add(usrpas);			       /////
			pasbox.setBounds(20,110,240,30); add(pasbox);				   /////
																		   /////
		////////////////////////////////////////////////////////////////////////
		///// LOGIN BUTTON   ///////////////////////////////////////////////////	
			login.setFont(new Font("Eras Bold ITC",0,17));				   /////
			login.setBackground(new Color(126,126,126));				   /////
			login.setForeground(new Color(255,255,255));				   /////
			login.setBounds(270, 100, 100, 40); add(login);				   /////
			login.addMouseListener(new checkpassword());				   /////
																		   /////
		////////////////////////////////////////////////////////////////////////
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//////   BACKGROUND IMAGE  ///////////////////////////////////////////////////////////////////////////////////////////////////
		setLayout(new BorderLayout());																							 /////
		JLabel backapply=new JLabel(new ImageIcon("C://Users//SAM//Desktop//Eclipse Work//EngineersBank//images//login.jpg"));	 /////
		add(backapply);																					                         /////
		backapply.setLayout(new FlowLayout());																					 /////
		setVisible(true);																										 /////
																																 /////
	}																															 /////
	 ////////  CONSTRUCTOR ENDS HERE  ////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	/////////  EVENT LISTENER FOR LOGIN BUTTON  //////////////////////////////////////////////////////////////////////////////////////
	 class checkpassword implements MouseListener																				 /////
	  {																														     /////
		 	public void mouseEntered(MouseEvent evt){login.setBackground(new Color(0,127,92));}									 /////
		 	public void mouseExited(MouseEvent evt){login.setBackground(new Color(126,126,126));}								 /////
		 	public void mouseReleased(MouseEvent evt){}																			 /////
		 	public void mousePressed(MouseEvent evt){}																		     /////
		 	public void mouseClicked(MouseEvent evt)																			 /////
		 		{	
					String contact = usrbox.getText();
				     String password= pasbox.getText();

				 	try
				 	{
				 			Class.forName("com.mysql.jdbc.Driver");
				 			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","1234");
				 			Statement st= cn.createStatement();
				 			ResultSet rs=st.executeQuery("select * from customers where contact='"+contact+"' and password='"+password+"'");
				 	
				 			if(rs.next()==true)
				 			    { JOptionPane.showMessageDialog(getContentPane(), "login successfull");
				 			   
				 			  
					 			st.executeUpdate("delete from customers where contact='"+contact+"' and password='"+password+"'");
				 			   JOptionPane.showMessageDialog(getContentPane(),"Your account has been deleted");
				 			    }
				 			else
				 			    {JOptionPane.showMessageDialog(getContentPane(), "incorrect username or password");}
				 	}
					
				 	catch(Exception ex)
				 		{  System.out.println(ex);  }
				 	
				 	
								 /////
		 		}																												 /////
	  }																															 /////
     /////////   EVENT LISTENER ENDS  ////////////////////////////////////////////////////////////////////////////////////////////////
}