import java.awt.*;
import javax.swing.*;

public class offers extends JFrame {
	JLabel offers1 = new JLabel("DEALS YOU CANNOT TURN DOWN");
	JLabel offers2 = new JLabel("ZERO COST EMI ON MOBILE PURCHASE FROM FLIPCART");
	JLabel offers3 = new JLabel("LOWEST INTEREST RATES ON HOUSE LOANS");
	JLabel offers4 = new JLabel("EASY STUDENTS LOAN");
	JLabel offers5 = new JLabel("ADDITIONAL DISCOUNT FOR ENGINEERS");
	JLabel offers6 = new JLabel("EXTRA 10% DISCOUNT ON ONINE SHOPPING");
	JLabel offers7 = new JLabel("ADITIONAL BENEFITS FOR SENIOR CITIZENS");
	JLabel offers8 = new JLabel("FLEXIBLE CAR LOAN");
	JLabel offers9 = new JLabel("and many more....");
	JLabel offers10 = new JLabel("WHEN YOU HAVE ALL THESE DOCUMENTS PLEASE VISIT OUR MAIN BRANCH");
	JLabel offers11 = new JLabel("YOU  CAN  ALSO  CALL  1800-8400175851 (Toll Free)  FOR  MORE  INFO");
	offers()
	{
		super("OUR OFFERS FOR YOU");
		
		setSize(800,550);
		setLocationRelativeTo(null);
		setResizable(false);
		//////////////////////////////////////////////////////////////////////////
		Font apply = new Font("Forte",0,45);
		offers1.setFont(apply);
		offers1.setBounds(50,15,900,30);
		offers1.setForeground(new Color(16,161,0));
		
		Font applly = new Font("Hobo Std",0,20);
		offers2.setFont(applly);offers3.setFont(applly);
		offers4.setFont(applly);offers5.setFont(applly);offers6.setFont(applly);
		offers7.setFont(applly);offers8.setFont(applly);offers9.setFont(applly);offers10.setFont(applly);
		offers10.setFont(applly);
		////////////////////////////////////////////////////////////////////
		offers2.setBounds(60,90,900,20);
		offers3.setBounds(60,140,500,20);
		offers4.setBounds(60,190,500,20);
		offers5.setBounds(60,240,500,20);
		offers6.setBounds(60,290,500,20);
		offers7.setBounds(60,340,500,20);
		offers8.setBounds(60,390,500,20);
		offers9.setBounds(60,440,500,20);
		offers10.setBounds(60,480,800,20);
		offers11.setBounds(60,520,900,20);
		////////////////////////////////////////////////////////////////////
		offers2.setForeground(new Color(25,4,200));
		offers3.setForeground(new Color(25,4,200));
		offers4.setForeground(new Color(25,4,200));
		offers5.setForeground(new Color(25,4,200));
		offers6.setForeground(new Color(25,4,200));
		offers7.setForeground(new Color(25,4,200));
		offers8.setForeground(new Color(25,4,200));
		offers9.setForeground(new Color(25,4,200));
		offers10.setForeground(new Color(25,4,200));
		offers11.setForeground(new Color(25,4,200));
		
		////////////////////////////////////////////////////////////////////
		add(offers1);add(offers2);add(offers3);add(offers4);
		add(offers5);add(offers6);add(offers7);add(offers8);add(offers9);
		//add(offers10);add(offers11);
		
	///////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
		
		setLayout(new BorderLayout());
		JLabel backapply=new JLabel(new ImageIcon("C://Users//SAM//Desktop//Eclipse Work//EngineersBank//images//apply.jpg"));
		add(backapply);
		backapply.setLayout(new FlowLayout());
		
		
		setVisible(true);
		
	}
	

}
