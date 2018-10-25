import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class HomeScreen extends JFrame{

	//Variables
	
	JPanel mainPanel = new JPanel();
	JPanel topPanel = new JPanel();
	
	JLabel title;
	
	public static Font titleFont = new Font("Arial", Font.BOLD, 24);
	public static Font myFontSmall = new Font("Arial", Font.PLAIN, 16);
	
	//Constructor
		
	public HomeScreen() {
	
		this.setTitle("Asset Search - Home Page");
		this.setBounds(100,100,1000,600);
		IniComp();
		this.setVisible(true);
	
	}
	
	//Methods
	
	public void IniComp() {
		
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.setBounds(0,40,this.getWidth(),this.getHeight()-40);
		mainPanel.setLayout(null);
		this.getContentPane().add(mainPanel);
		
		topPanel = new JPanel();
		topPanel.setBackground(Color.ORANGE);
		topPanel.setBounds(0,0,this.getWidth(),40);
		topPanel.setLayout(null);
		this.getContentPane().add(topPanel);
		title = new JLabel();
		title.setFont(titleFont);
		title.setBounds(200,0,600,40);
		title.setText("Electoralize Library Image Search Tool ");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		topPanel.add(title);
		
	}

}
