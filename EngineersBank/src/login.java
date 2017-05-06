import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.ImageIcon;


public class login extends JFrame implements ActionListener {
	
	JTextField usrbox=new JTextField();
	JPasswordField pasbox=new JPasswordField();
	
	JLabel usrtxt= new JLabel("ACCOUNT NO"
			+ "");
	JLabel usrpas= new JLabel("PASSWORD");
	
	JButton login = new JButton("LOGIN");
	login()
	{
		super("            LOGIN");
		
		setSize(400,200);
		setLocationRelativeTo(null);
		setResizable(false);
		
		Font txtfont = new Font("Calibri Light (Headings)",0,15);
		usrtxt.setFont(txtfont);;
		usrtxt.setForeground(new Color(149,149,225));
		usrtxt.setBounds(20,20,300,15); add(usrtxt);
		usrbox.setBounds(20,40,350,30); add(usrbox);
		
		
		usrpas.setFont(txtfont);;
		usrpas.setForeground(new Color(149,149,225));
		usrpas.setBounds(20,85,110,15); add(usrpas);
		pasbox.setBounds(20,110,240,30); add(pasbox);
		

		
		
		
		login.setFont(new Font("Eras Bold ITC",0,17));
		login.setBackground(new Color(126,126,126));
		login.setForeground(new Color(255,255,255));
		login.setBounds(270, 100, 100, 40); add(login);		
		login.addMouseListener(new checkpassword());
		
		///////////////////////////////////////////////////////////////////////////////
		setLayout(new BorderLayout());
		JLabel backapply=new JLabel(new ImageIcon("C://Users//SAM//Desktop//Eclipse Work//EngineersBank//images//login.jpg"));
		add(backapply);
		backapply.setLayout(new FlowLayout());
		setVisible(true);
		
	}
	
	class checkpassword implements MouseListener
	{
		public void mouseEntered(MouseEvent evt){login.setBackground(new Color(0,127,92));}
		public void mouseExited(MouseEvent evt){login.setBackground(new Color(126,126,126));}
		public void mouseReleased(MouseEvent evt){}
		public void mousePressed(MouseEvent evt){}
		public void mouseClicked(MouseEvent evt)
		{
			String username = usrbox.getText();
		     String password= pasbox.getText();
			
		     if(username.equals("soumen") && password.equals("1234"))
		     {
		    	 login.setBackground(new Color(255,255,255));
		     }
		     else
		     {
		    	 JOptionPane.showMessageDialog(getContentPane(),"Invalid Username or Password");
		     }
		}
	}

//public static void main(String args[])
////{
//	new login();
//}
}