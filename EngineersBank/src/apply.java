import java.awt.*;
import javax.swing.*;

public class apply extends JFrame {

	JLabel apply1 = new JLabel("MANDATORY DOCUMENTS");
	JLabel apply2 = new JLabel("AADHAR CARD");
	JLabel apply3 = new JLabel("PAN CARD");
	JLabel apply4 = new JLabel("4 PASSPORT SIZED PHOTOGRAPH");
	JLabel apply5 = new JLabel("TEMPORARY RESIDENTIAL PROOF");
	JLabel apply6 = new JLabel("PERMANENT ADDRESS PROOF");
	JLabel apply7 = new JLabel("COPY OF CRIMINAL RECORDS ( if any )");
	JLabel apply8 = new JLabel("VOTER IDENTITY CARD");
	JLabel apply9 = new JLabel("RASHAN CARD");
	JLabel apply10 = new JLabel("WHEN YOU HAVE ALL THESE DOCUMENTS PLEASE VISIT OUR MAIN BRANCH");
	JLabel apply11 = new JLabel("YOU  CAN  ALSO  CALL  1800-8400175851 (Toll Free)  FOR  MORE  INFO");
	apply()
	
	{
		super("HOW TO APPLY");  
		
		setSize(850,600);
		setLocationRelativeTo(null);
		setResizable(false);
		
		Font apply = new Font("Narkisim",0,33);
		apply1.setFont(apply);
		apply1.setBounds(50,15,600,30);
		apply1.setForeground(new Color(200,169,26));
		
		Font applly = new Font("Gungsuh",0,20);
		apply2.setFont(applly);apply3.setFont(applly);
		apply4.setFont(applly);apply5.setFont(applly);apply6.setFont(applly);
		apply7.setFont(applly);apply8.setFont(applly);apply9.setFont(applly);apply10.setFont(applly);
		apply10.setFont(applly);
		////////////////////////////////////////////////////////////////////
		apply2.setBounds(60,70,500,20);
		apply3.setBounds(60,110,500,20);
		apply4.setBounds(60,150,500,20);
		apply5.setBounds(60,190,500,20);
		apply6.setBounds(60,230,500,20);
		apply7.setBounds(60,270,500,20);
		apply8.setBounds(60,310,500,20);
		apply9.setBounds(60,350,500,20);
		apply10.setBounds(60,390,800,20);
		apply11.setBounds(60,450,900,20);
		////////////////////////////////////////////////////////////////////
		apply2.setForeground(new Color(21,161,142));
		apply3.setForeground(new Color(21,161,142));
		apply4.setForeground(new Color(21,161,142));
		apply5.setForeground(new Color(21,161,142));
		apply6.setForeground(new Color(21,161,142));
		apply7.setForeground(new Color(21,161,142));
		apply8.setForeground(new Color(21,161,142));
		apply9.setForeground(new Color(21,161,142));
		apply10.setForeground(new Color(21,161,142));
		apply11.setForeground(new Color(87,187,15));
		
		////////////////////////////////////////////////////////////////////
		add(apply1);add(apply2);add(apply3);add(apply4);
		add(apply5);add(apply6);add(apply7);add(apply8);add(apply9);
		add(apply10);add(apply11);
		
		setLayout(new BorderLayout());
		JLabel backapply=new JLabel(new ImageIcon("C://Users//SAM//Desktop//Eclipse Work//EngineersBank//images//apply.jpg"));
		add(backapply);
		backapply.setLayout(new FlowLayout());
		
		
		
		setVisible(true);
		
	}
	

}
