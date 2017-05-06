import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.ImageIcon;

public class welcomeWindow extends JFrame
{
	Color bigbuttoncolor =new Color(104,14,160);
	Color menubarcolor =new Color(40,128,215);
	
	JButton b1 = new JButton("APPLY");
	JButton b2 = new JButton("OFFERS");
	JButton b3 = new JButton("LOAN RATES");
	JButton b4 = new JButton("ABOUT US");
	JButton b5 = new JButton("REACH US");
	
	JButton a1 =new JButton("OPEN   ACCOUNT");
	JButton a2 =new JButton("FUND  TRANSFER");
	JButton a3 =new JButton("ENQUIRY");
	JButton a4 =new JButton("CLOSE   ACCOUNT");
	
	JButton admin = new JButton("ADMIN");
	
	JLabel mssg = new JLabel("WELCOME TO ENGINEER'S BANK");
	JLabel mssg1 = new JLabel("DELIVERING  BEYOND");
	JLabel copyrite =new JLabel("© Soumen Sarkar   I.E.R.T.  2017");
	JLabel terms=new JLabel("Terms of use | Privacy Policy | Registeration | Home Branch | Net Banking | Mobile Banking | Instant ATM | Complaint Help 24*7 | Home Assistance");
	
	public welcomeWindow()  //  CONSTRUCTOR CODE BEGINS HERE
	{
		super("ENGINEER'S  BANK LTD.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // TO CLOSE THE JVM AT ONCE
		

			setSize(1300,700);
			setResizable(false);
			setLocationRelativeTo(null);
		
		////////    MENU BAR      ////////////////////////////////////////////////	
			b1.setBounds(15,9,258,65);			                             /////
			b2.setBounds(273,9,258,65);			                             /////
			b3.setBounds(531,9,258,65);			                             /////
			b4.setBounds(789,9,258,65);		                                 /////	
			b5.setBounds(1047,9,230,65);		                             /////
																			 /////			     		                                         
			b1.setBackground(menubarcolor);						 			 /////
			b2.setBackground(menubarcolor);									 /////
			b3.setBackground(menubarcolor);									 /////
			b4.setBackground(menubarcolor);									 /////
			b5.setBackground(menubarcolor);             					 /////
																			 /////
			Color menubarcolorfront =new Color(255,255,255);			   	 /////
			Font fo = new Font("Copperplate Gothic Bold",0,30);				 /////
			b1.setFont(fo);b2.setFont(fo);b3.setFont(fo);					 /////
			b4.setFont(fo);b5.setFont(fo);									 /////
			b1.setForeground(menubarcolorfront);							 /////
			b2.setForeground(menubarcolorfront);							 /////
			b3.setForeground(menubarcolorfront);							 /////
			b4.setForeground(menubarcolorfront);							 /////
			b5.setForeground(menubarcolorfront);							 /////
																			 /////
			b1.addMouseListener(new button1());								 /////
			b2.addMouseListener(new button2());								 /////
			b3.addMouseListener(new button3());								 /////
			b4.addMouseListener(new button4());								 /////
			b5.addMouseListener(new button5());				 				 /////
																			 /////
			add(b1);add(b2);add(b3);add(b4);add(b5);						 /////
		//////////////////////////////////////////////////////////////////////////	
			
		
		///////      BIG BUTTONS      ////////////////////////////////////////////	
			a1.setBounds(100,212,390,180);									 /////
		    a2.setBounds(550,212,390,180); 			   						 /////
		    a3.setBounds(100,410,390,180);								 	 /////
		    a4.setBounds(550,410,390,180);									 /////
		    admin.setBounds(1000,290,190,190);								 /////
		    																 /////
		    a1.setBackground(bigbuttoncolor);								 /////
			a2.setBackground(bigbuttoncolor);								 /////
			a3.setBackground(bigbuttoncolor);								 /////
			a4.setBackground(bigbuttoncolor);								 /////
			admin.setBackground(bigbuttoncolor);							 /////
																			 /////
		    Font ao = new Font("Copperplate Gothic Bold",0,30);				 /////
			a1.setFont(ao);a2.setFont(ao);a3.setFont(ao);					 /////
			admin.setFont(ao);a4.setFont(ao);								 /////
			a1.setForeground(menubarcolorfront);							 /////
			a2.setForeground(menubarcolorfront);							 /////
			a3.setForeground(menubarcolorfront);							 /////
			a4.setForeground(menubarcolorfront);							 /////
			admin.setForeground(menubarcolorfront);							 /////
																			 /////
			a1.addMouseListener(new A1());									 /////
			a2.addMouseListener(new A2());									 /////
			a3.addMouseListener(new A3());									 /////
			a4.addMouseListener(new A4());									 /////
			admin.addMouseListener(new adminwindow());						 /////
																			 /////
			add(a1);add(a2);add(a3);add(a4);add(admin);						 /////
																			 /////
		//////////////////////////////////////////////////////////////////////////
			
	
			
		////////    TERMS AND COPYRIGHT AT THE BOTTOM        /////////////////////////
			Font copyright = new Font("Copperplate Gothic Bold",0,10);				//
			terms.setFont(copyright);												//
			terms.setBounds(210,620,1000,15);										//
			copyrite.setFont(copyright);											//
			copyrite.setBounds(480,640,800,15);										//
			copyrite.setForeground(menubarcolorfront);							    //
			terms.setForeground(menubarcolorfront);							        //
			add(copyrite);add(terms);												//
		//////////////////////////////////////////////////////////////////////////////			
			
		//////////////////////////////////////////////////////	
			Font fo1 = new Font("Narkisim",0,65);		    //
			mssg.setFont(fo1);						   	    //
			mssg.setBounds(170,0,1200,290);                 //
			mssg.setForeground(new Color(200,169,26));      //
			add(mssg);									    //
		//..................................................//
			Font fo2 = new Font("Bradley Hand ITC",10,30);  //
			mssg1.setFont(fo2);								//
			mssg1.setBounds(960,160,1200,70);				//
			mssg1.setForeground(new Color(42,123,13));		//
			add(mssg1);										//
															//
		//////////////////////////////////////////////////////
		
			
		
			
			
			
		////////     BACKGROUND IMAGE SETTINGS         ///////////////////////////////////////////////////////////////////////////
		setLayout(new BorderLayout());																							//
		JLabel background=new JLabel(new ImageIcon("C://Users//SAM//Desktop//Eclipse Work//EngineersBank//images//welcomewindow.jpg")); //
		add(background);																										//
		background.setLayout(new FlowLayout());																					//
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		setVisible(true);  // PROBABLY THE MOST IMPORTANT COMMAND LOL.....
	}
	
	///////////////////////////////////////////////////////////////////////////
	////////      CONSTRUCTOR AND WINDOW ENDS HERE       //////////////////////   
	///////////////////////////////////////////////////////////////////////////
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////  ACTION LISTENER FOR MENU-BAR        ////////////////////////////////////////////////////////////////////////////////// 
	    class button1 implements MouseListener																					  //////
          {																														  //////
	         public void mouseEntered(MouseEvent evt){b1.setBounds(15, 9, 258, 73);b1.setBackground(new Color(101,0,202));}       //////
	         public void mouseExited(MouseEvent evt){b1.setBounds(15, 9, 258, 65);b1.setBackground(menubarcolor);}                //////
		     public void mouseReleased(MouseEvent evt){}																		  //////
		     public void mousePressed(MouseEvent evt){}																			  //////
		     public void mouseClicked(MouseEvent evt)  {new apply();}															  //////
	      }																														  //////
	//----------------------------------------------------------------------------------------------------------------------------//////
	//----------------------------------------------------------------------------------------------------------------------------//////
	    class button2 implements MouseListener																					  //////
	     {																														  //////
		     public void mouseEntered(MouseEvent evt){b2.setBounds(273, 9, 258, 73);b2.setBackground(new Color(101,0,202));} 	  //////
		     public void mouseExited(MouseEvent evt){b2.setBounds(273, 9, 258, 65);b2.setBackground(menubarcolor);}				  //////
		     public void mouseReleased(MouseEvent evt){}																	 	  //////
		     public void mousePressed(MouseEvent evt){}																			  //////
		     public void mouseClicked(MouseEvent evt)  {new offers();}															  //////
	     }																														  //////
	//----------------------------------------------------------------------------------------------------------------------------//////
	//----------------------------------------------------------------------------------------------------------------------------//////
	    class button3 implements MouseListener																				      //////
	     {																														  //////
		     public void mouseEntered(MouseEvent evt){b3.setBounds(531, 9, 258, 73);b3.setBackground(new Color(101,0,202));}	  //////
		     public void mouseExited(MouseEvent evt){b3.setBounds(531, 9, 258, 65);b3.setBackground(menubarcolor);}				  //////
		     public void mouseReleased(MouseEvent evt){}																		  //////
		     public void mousePressed(MouseEvent evt){}																			  //////
		     public void mouseClicked(MouseEvent evt){new loanrates();}															  //////
	     }																														  //////
	//----------------------------------------------------------------------------------------------------------------------------//////
    //----------------------------------------------------------------------------------------------------------------------------//////
	    class button4 implements MouseListener																					  //////
   	      {																														  //////
		     public void mouseEntered(MouseEvent evt){b4.setBounds(789, 9, 258, 73);b4.setBackground(new Color(101,0,202));}	  //////
		     public void mouseExited(MouseEvent evt){b4.setBounds(789, 9, 258, 65);b4.setBackground(menubarcolor);}			      //////
		     public void mouseReleased(MouseEvent evt){}																		  //////
		     public void mousePressed(MouseEvent evt){}																	          //////
		     public void mouseClicked(MouseEvent evt){new aboutus();}															  //////
	      }																														  //////
	//----------------------------------------------------------------------------------------------------------------------------//////
    //----------------------------------------------------------------------------------------------------------------------------//////
	    class button5 implements MouseListener																					  //////
	    {																														  //////
	  	     public void mouseEntered(MouseEvent evt){b5.setBounds(1047, 9, 230, 73);b5.setBackground(new Color(101,0,202));}     //////
		     public void mouseExited(MouseEvent evt){b5.setBounds(1047, 9, 230, 65);b5.setBackground(menubarcolor);}	          //////
		     public void mouseReleased(MouseEvent evt){}																		  //////
		     public void mousePressed(MouseEvent evt){}																			  //////
	         public void mouseClicked(MouseEvent evt){new reachus();}															  //////
	    }																														  //////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	    
   ///////////////////////////    THE BIG BUTTONS   ////////////////////////////////////////////////////////////////////////////////////
	class A1 implements MouseListener																							  //////
		  {																														  //////
			public void mouseEntered(MouseEvent evt){a1.setBounds(100,212,440,199);a1.setBackground(new Color(10,19,91));}		  //////
				public void mouseExited(MouseEvent evt){a1.setBounds(100,212,390,180);a1.setBackground(bigbuttoncolor);}		  //////
				public void mouseReleased(MouseEvent evt){}																		  //////
				public void mousePressed(MouseEvent evt){}																		  //////
				public void mouseClicked(MouseEvent evt){new openaccount();}													  //////
		   }																													  //////
    //----------------------------------------------------------------------------------------------------------------------------//////	
    //----------------------------------------------------------------------------------------------------------------------------//////	
	    class A2 implements MouseListener												     									  //////
	       {																													  //////
	    		public void mouseEntered(MouseEvent evt){a2.setBounds(500,212,440,199);a2.setBackground(new Color(10,19,91));}	  //////
	    		public void mouseExited(MouseEvent evt){a2.setBounds(550,212,390,180);a2.setBackground(bigbuttoncolor);}          //////
	    		public void mouseReleased(MouseEvent evt){}																		  //////
	    		public void mousePressed(MouseEvent evt){}																		  //////
	    		public void mouseClicked(MouseEvent evt){new fundTransferLogin();}												  //////
	       }																												      //////
    //----------------------------------------------------------------------------------------------------------------------------//////	
    //----------------------------------------------------------------------------------------------------------------------------//////	
	    class A3 implements MouseListener																						  //////
	       {																													  //////
	    		public void mouseEntered(MouseEvent evt){a3.setBounds(100,393,440,199);a3.setBackground(new Color(10,19,91));}	  //////
	    		public void mouseExited(MouseEvent evt){a3.setBounds(100,410,390,180);a3.setBackground(bigbuttoncolor);}		  //////
	    		public void mouseReleased(MouseEvent evt){}																		  //////
	    		public void mousePressed(MouseEvent evt){}																		  //////
	    		public void mouseClicked(MouseEvent evt){new enquiryLogin();}													  //////
	       }																													  //////
	//----------------------------------------------------------------------------------------------------------------------------//////	
    //----------------------------------------------------------------------------------------------------------------------------//////
	    class A4 implements MouseListener																						  //////
	       {																													  //////
	    		public void mouseEntered(MouseEvent evt){a4.setBounds(501,393,440,199);a4.setBackground(new Color(10,19,91));}	  //////
	    		public void mouseExited(MouseEvent evt){a4.setBounds(550,410,390,180);a4.setBackground(bigbuttoncolor);}		  //////
	    		public void mouseReleased(MouseEvent evt){}																		  //////
	    		public void mousePressed(MouseEvent evt){}																		  //////
	    		public void mouseClicked(MouseEvent evt){new closeAccountLogin();}												  //////
	       }																													  //////
	//----------------------------------------------------------------------------------------------------------------------------//////	
	//----------------------------------------------------------------------------------------------------------------------------//////
	class adminwindow implements MouseListener																					  //////
		   {																													  //////
				public void mouseEntered(MouseEvent evt){}																		  //////
				public void mouseExited(MouseEvent evt){}																		  //////
				public void mouseReleased(MouseEvent evt){}																		  //////
				public void mousePressed(MouseEvent evt){}															              //////
				public void mouseClicked(MouseEvent evt){new admin();}															  //////
	       }																													  //////
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
			
	

///////  THE MAIN() FUNCTION   ///////////////////
public static void main(String args[])		//////
{											//////
	setDefaultLookAndFeelDecorated(false);	//////
	new welcomeWindow();					//////
}}                                          //////
//////////////////////////////////////////////////

