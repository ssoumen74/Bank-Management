import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.ImageIcon;


public class admin extends JFrame implements ActionListener {
	
	JTextField usrbox=new JTextField();
	JPasswordField pasbox=new JPasswordField();
	
	JLabel usrtxt= new JLabel("USERNAME");
	JLabel usrpas= new JLabel("PASSWORD");
	
	JButton login = new JButton("LOGIN");
	admin()
	{
		super("ADMINISTRATOR ACCOUNT");
		
		setSize(500,600);
		setLocationRelativeTo(null);
		setResizable(false);
		
		Font txtfont = new Font("Calibri Light (Headings)",0,15);
		usrtxt.setFont(txtfont);;
		usrtxt.setForeground(new Color(149,149,225));
		usrtxt.setBounds(90,57,110,110); add(usrtxt);
		usrbox.setBounds(90,130,300,30); add(usrbox);
		
		
		usrpas.setFont(txtfont);;
		usrpas.setForeground(new Color(149,149,225));
		usrpas.setBounds(90,155,110,110); add(usrpas);
		pasbox.setBounds(90,230,300,30); add(pasbox);
		

		
		
		
		login.setFont(new Font("Eras Bold ITC",0,27));
		login.setBackground(new Color(62,164,87));
		login.setForeground(new Color(57,32,202));
		login.setBounds(170, 500, 150, 40); add(login);		
		login.addMouseListener(new checkpassword());
		
		///////////////////////////////////////////////////////////////////////////////
		setLayout(new BorderLayout());
		JLabel backapply=new JLabel(new ImageIcon("C://Users//SAM//Desktop//Eclipse Work//EngineersBank//images//apply.jpg"));
		add(backapply);
		backapply.setLayout(new FlowLayout());
		setVisible(true);
		
	}
	
	class checkpassword implements MouseListener
	{
		public void mouseEntered(MouseEvent evt){login.setBounds(170, 500, 160, 50);login.setBackground(new Color(62,164,87));}
		public void mouseExited(MouseEvent evt){login.setBounds(170, 500, 150, 40);login.setBackground(new Color(62,164,87));}
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

}