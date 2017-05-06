import java.awt.*;
import javax.swing.*;

public class aboutus extends JFrame {
	
	JLabel about1 = new JLabel("SOUMEN SARKAR");
	JLabel about2 = new JLabel("Managing Director and CEO");
	aboutus()
	{
		super("ABOUT US");
		
		setSize(600,600);
		setLocationRelativeTo(null);
		////////////////////////////////////////////////////////////////////
		ImageIcon s = new ImageIcon("C://Users//SAM//Desktop//Eclipse Work//EngineersBank//images//soumen.jpg");
		JLabel sl=new JLabel(s);
		sl.setBounds(10,10,150,150);
		add(sl);
		Font ceoname = new Font("Narkisim",0,15);
		about1.setFont(ceoname);
		about1.setBounds(180,100,600,30);
		about1.setForeground(new Color(37,0,255));
		add(about1);
		///////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////
		setLayout(new BorderLayout());
		JLabel backaboutus=new JLabel(new ImageIcon("C://Users//SAM//Desktop//Eclipse Work//EngineersBank//images//aboutus.png"));
		add(backaboutus);
		backaboutus.setLayout(new FlowLayout());
		///////////////////////////////////////////////////////////////////////
		setVisible(true);
		
	}
	

}
