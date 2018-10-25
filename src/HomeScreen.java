import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class HomeScreen extends JFrame{

	//Variables
	
	static GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
	
	JPanel mainPanel = new JPanel();
	JPanel topPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	
	JLabel title;
	JLabel page;
	
	
	JTextArea text;
	
	public static Font titleFont = new Font("Calibri", Font.BOLD, 42);
	public static Font titleSmall = new Font("Calibri", Font.BOLD, 28);
	public static Font mainFont = new Font("Calibri", Font.PLAIN, 23);
	
	Border border = BorderFactory.createLineBorder(Color.BLACK, 5);
	Border buttonBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
	
	String pageName = "Homepage";
	
	//Constructor
		
	public HomeScreen() {
	
//		this.setTitle("Asset Search - Home Page");
//		this.setBounds(100,100,1000,600);
//		JFrame frame = new JFrame("Display Mode");
//	    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//	    frame.setUndecorated(true);
//		device.setFullScreenWindow(frame);
//		this.add(mainPanel);
		IniComp();
//		frame.pack();
//		frame.setVisible(true);
	
	}
	
	//Methods
	
	public void IniComp() {
		
		JFrame frame = new JFrame("Display Mode");
	    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    frame.setUndecorated(true);
		device.setFullScreenWindow(frame);
		int x = frame.getWidth();
		int y = frame.getHeight();
		int xTitle = 900;
		int yMain = y - 150;
		
		//Design Tool. yOne etc represents blocks of height. xOne represents blocks of width
		int yOne = yMain / 10;
		int yTwo = yOne * 2;
		int yThree = yOne * 3;
		int yFour = yOne * 4;
		int yFive = yOne * 5;
		int ySix = yOne * 6;
		int ySeven = yOne * 7;
		int yEight = yOne * 8;
		int yNine = yOne * 9;
		int yTen = yOne * 10;
		
		int xOne = x / 10;
		int xTwo = xOne * 2;
		int xThree = xOne * 3;
		int xFour = xOne * 4;
		int xFive = xOne * 5;
		int xSix = xOne * 6;
		int xSeven = xOne * 7;
		int xEight = xOne * 8;
		int xNine = xOne * 9;
		int xTen = xOne * 10;

		mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBounds(0,100,x,yMain);
		mainPanel.setLayout(null);
		frame.add(mainPanel);
		
		topPanel = new JPanel();
		Color color = new Color(48, 72, 124);
		topPanel.setBackground(color);
		topPanel.setBounds(0,0,x,100);
		topPanel.setLayout(null);
		frame.add(topPanel);
		title = new JLabel();
		title.setFont(titleFont);
		title.setForeground(Color.WHITE);
		title.setBounds(((x-xTitle)/2) - 100,0,xTitle,100);
		String titleText = "electoralize | library photograph id tool";
		title.setText(titleText.toUpperCase());
		title.setHorizontalAlignment(SwingConstants.CENTER);
		topPanel.add(title);
		page = new JLabel();
		page.setText(pageName.toUpperCase());
		page.setBounds((((x-xTitle)/2) - 100) + xTitle, 0, 300, 100);
		page.setForeground(new Color(255,255,0));
		page.setFont(titleSmall);
		page.setHorizontalAlignment(SwingConstants.CENTER);
		topPanel.add(page);
		
		bottomPanel = new JPanel();
		Color cheeky = new Color(68, 114, 196);
		bottomPanel.setBackground(cheeky);
		bottomPanel.setBounds(0,y-50,x,50);
		frame.add(bottomPanel);
		
		JButton button1 = new JButton();
		button1.setBounds(xFour, ySix + (yOne/2), xTwo, yOne + (yOne/2));
		button1.setBackground(new Color(68, 114, 196));
		button1.setBorder(buttonBorder);
		String signIn = "sign in";
		button1.setText(signIn.toUpperCase());
		button1.setFont(titleFont);
		button1.setForeground(new Color(197,224,180));
		mainPanel.add(button1);
		
		text = new JTextArea();
		text.setBorder(border);
		text.setBounds(xOne, yOne, xEight, yEight);
//		text.setVerticalAlignment(SwingConstants.TOP);
		text.setEditable(false);  
	    text.setCursor(null);  
	    text.setOpaque(false);  
	    text.setFocusable(false);
	    text.setLineWrap(true);
	    text.setWrapStyleWord(true);
		text.setText("\r\nWelcome to the Electoralize Library Photograph ID Tool.\r\n" + "\r\n" + 
				"The tool will allow you to easily search and find the correct ID for a photograph that a customer has requested. After using either the quick search or detailed search facility, the application will yield any photograph IDs that match the specifications entered by the user.\r\n" + "\r\n" + 
				"Once the programme has found the corresponding photograph IDs, you will be able to navigate through them and co-operate with the customer and allow them to preview the phots before printing them out using the built-in printing facility.\r\n" + "\r\n" + 
				"©Electoralize");
		text.setFont(mainFont);
		mainPanel.add(text);
		
		frame.setVisible(true);
	}

}
