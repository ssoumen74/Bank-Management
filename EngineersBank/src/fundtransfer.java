import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;


public class records extends JFrame 
{
	JLabel accnolabel = new JLabel("MOBILE NUMBER OF RECIPIENT");
	JLabel amountlabel = new JLabel("AMOUNT");
	
	JButton proceed = new JButton("TRANSFER");
	
	
	JTextField accnotextfield=new JTextField();
	JTextField amounttextfield=new JTextField();

	records()  //  CONSTRUCTOR FOR THE CLASS STARTS HERE
	{ 
		super(" TRANSFER  FUNDS  EASILY");
		setSize(700,300);setLocationRelativeTo(null);setResizable(false);
		//////////////////////////////////////////////////////////////////////////////////////
		Color vio = new Color(255,113,0); Font oa =new Font("Typo Round Regular Demo",0,27);//
		accnolabel.setForeground(vio); accnolabel.setFont(oa);											//
		amountlabel.setForeground(vio); amountlabel.setFont(oa);											//
													//
		//////////////////////////////////////////////////////////////////////////////////////
		
		////////////////////////////////////////////////////////////////////////////////////////
		accnolabel.setBounds(34,30,400,20);      //
		amountlabel.setBounds(30,146,200,20); 
		//	
		accnotextfield.setBounds(34,70,350,40);  						  //	
		amounttextfield.setBounds(30,180,100,40); 						  //
		////////////////////////////////////////////////////////////////////////////////////////
		proceed.setFont(new Font("Typo Round Regular Demo",0,25));
		proceed.setForeground(new Color(255,255,255));
		proceed.setBackground(new Color(255,154,53));
		proceed.setBounds(200,160,170,65);
		
	    add(proceed);	add(accnolabel);add(amountlabel);add(accnotextfield);add(amounttextfield);
		
		proceed.addMouseListener(new proceedEffect());
		///////////////////////////////////////////////////////////////////////
		setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("C://Users//SAM//Desktop//Eclipse Work//EngineersBank//images//fundtransfer.jpg"));
		add(background);
		background.setLayout(new FlowLayout());
		setVisible(true);
		
	}
	
	class proceedEffect implements MouseListener
	{
	      public void mouseEntered(MouseEvent evt)
	        {
	    	  
	    	  proceed.setBackground(new Color(95,201,148));
	    	
	    	  proceed.setForeground(new Color(255,255,255));
	        }
	      public void mouseExited(MouseEvent evt)
	      	{
	
	    	proceed.setBackground(new Color(255,154,53));
	    	 
	    	  proceed.setForeground(new Color(255,255,255));
	      	}
	      public void mouseReleased(MouseEvent evt){}
	      public void mousePressed(MouseEvent evt){}
	      public void mouseClicked(MouseEvent evt)
	      	{
	    	  //THE CODE TO CREATE A NEW ROW IN DATABASE WILL GO HERE
	    	  //AT THE CLICK OF THE BUTTON
	    	  //
	      	}
	}
	

}
