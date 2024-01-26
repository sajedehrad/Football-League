
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.io.IOException;

	import javax.imageio.ImageIO;
	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
public class FootballLeague extends JFrame {
	
		JButton Iran , Brazilian , Germany , Italy , France , Russia;
		
		JLabel okhtapos;
		
		public FootballLeague() {
			
			super("Football games of world leagues");
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			setSize(850,700);
			
			setLocationRelativeTo(null);
			
			setLayout(null);
	        
	        addGuiComponents();
	        
	        showDialog();
	     
		}
		private void addGuiComponents() {
			
			Iran = new JButton(loadImage("src/iran.png"));
			Iran.setBounds(40, 70, 250, 150);
			add(Iran);
			
			Brazilian = new JButton(loadImage("src/brzil.jpg"));
			Brazilian.setBounds(550, 70, 250, 150);
			add(Brazilian);
			
			Germany = new JButton(loadImage("src/germny.jpg"));
			Germany.setBounds(40, 260, 250, 150);
			add(Germany);
			
			Italy = new JButton(loadImage("src/italy.png"));
			Italy.setBounds(40, 450, 250, 150);
			
			add(Italy);
			
			France = new JButton(loadImage("src/frnce.jpg"));
			France.setBounds(550, 260, 250, 150);
			add(France);
			
			Russia = new JButton(loadImage("src/rusia.jpg"));
			Russia.setBounds(550, 450, 250, 150);
			add(Russia);
			
			okhtapos = new JLabel(loadImage("src/okhtapos.jpg"));
			okhtapos.setBounds(185, 0, 450, 700);
			add(okhtapos);
			
		}
		
		public void showDialog() {
			
			 Iran.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                JFrame Window = new JFrame("Iran league football games");
		    
		                String[][] data = {
			    	            {"perspolis"+"time"+"esteglal", "2", "2-0", "3", "3","3","3"},
			    	            {"perspolis"+"time"+"esteglal", "2", "3-0","3","3","3","3"},
			    	            {"perspolis"+"time"+"esteglal", "2", "2-1" ,"3","3","3","3"}
			    	        };

			    	        String[] columnNames = {"Games program","Score", "Goal", "lost" , "equal" , "win" , "Play"};

			    	        JTable table = new JTable(data, columnNames);
			    	        JScrollPane scrollPane = new JScrollPane(table);

			    	        Window.add(scrollPane);
			    	        Window.setSize(1300, 700);
			    	        scrollPane.setSize(1300, 700);
			    	        Window.setLayout(new FlowLayout());
			    	        Window.setLocationRelativeTo(null);
			    	        Window.setLayout(null);
			    	        Window.setVisible(true);
			    	    }});
		
		     
		     Brazilian.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                JFrame Window = new JFrame("Brazilian league football games");
		               
		                String[][] data = {
			    	            {"perspolis"+"time"+"esteglal", "2", "2-0", "3", "3","3","3"},
			    	            {"perspolis"+"time"+"esteglal", "2", "3-0","3","3","3","3"},
			    	            {"perspolis"+"time"+"esteglal", "2", "2-1" ,"3","3","3","3"}
			    	        };

			    	        String[] columnNames = {"Games program","Score", "Goal", "lost" , "equal" , "win" , "Play"};

			    	        JTable table = new JTable(data, columnNames);
			    	        JScrollPane scrollPane = new JScrollPane(table);

			    	        Window.add(scrollPane);
			    	        Window.setSize(1300, 700);
			    	        scrollPane.setSize(1300, 700);
			    	        Window.setLayout(new FlowLayout());
			    	        Window.setLocationRelativeTo(null);
			    	        Window.setLayout(null);
			    	        Window.setVisible(true);
			    	    }});
		     
		     Germany.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                JFrame Window = new JFrame("Germany league football games");
		                String[][] data = {
			    	            {"perspolis"+"time"+"esteglal", "2", "2-0", "3", "3","3","3"},
			    	            {"perspolis"+"time"+"esteglal", "2", "3-0","3","3","3","3"},
			    	            {"perspolis"+"time"+"esteglal", "2", "2-1" ,"3","3","3","3"}
			    	        };

			    	        String[] columnNames = {"Games program","Score", "Goal", "lost" , "equal" , "win" , "Play"};

			    	        JTable table = new JTable(data, columnNames);
			    	        JScrollPane scrollPane = new JScrollPane(table);

			    	        Window.add(scrollPane);
			    	        Window.setSize(1300, 700);
			    	        scrollPane.setSize(1300, 700);
			    	        Window.setLayout(new FlowLayout());
			    	        Window.setLocationRelativeTo(null);
			    	        Window.setLayout(null);
			    	        Window.setVisible(true);
			    	    }});
		     Italy.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                JFrame Window = new JFrame("Italy league football games");
		                String[][] data = {
			    	            {"perspolis"+"time"+"esteglal", "2", "2-0", "3", "3","3","3"},
			    	            {"perspolis"+"time"+"esteglal", "2", "3-0","3","3","3","3"},
			    	            {"perspolis"+"time"+"esteglal", "2", "2-1" ,"3","3","3","3"}
			    	        };

			    	        String[] columnNames = {"Games program","Score", "Goal", "lost" , "equal" , "win" , "Play"};

			    	        JTable table = new JTable(data, columnNames);
			    	        JScrollPane scrollPane = new JScrollPane(table);

			    	        Window.add(scrollPane);
			    	        Window.setSize(1300, 700);
			    	        scrollPane.setSize(1300, 700);
			    	        Window.setLayout(new FlowLayout());
			    	        Window.setLocationRelativeTo(null);
			    	        Window.setLayout(null);
			    	        Window.setVisible(true);
			    	    }});
		     
		     France.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                JFrame Window = new JFrame("France league football games");
		                String[][] data = {
			    	            {"perspolis"+"time"+"esteglal", "2", "2-0", "3", "3","3","3"},
			    	            {"perspolis"+"time"+"esteglal", "2", "3-0","3","3","3","3"},
			    	            {"perspolis"+"time"+"esteglal", "2", "2-1" ,"3","3","3","3"}
			    	        };

			    	        String[] columnNames = {"Games program","Score", "Goal", "lost" , "equal" , "win" , "Play"};

			    	        JTable table = new JTable(data, columnNames);
			    	        JScrollPane scrollPane = new JScrollPane(table);

			    	        Window.add(scrollPane);
			    	        Window.setSize(1300, 700);
			    	        scrollPane.setSize(1300, 700);
			    	        Window.setLayout(new FlowLayout());
			    	        Window.setLocationRelativeTo(null);
			    	        Window.setLayout(null);
			    	        Window.setVisible(true);
			    	    }});
		     
		     Russia.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                JFrame Window = new JFrame("Russia league football games");
		                String[][] data = {
			    	            {"perspolis"+"time"+"esteglal", "2", "2-0", "3", "3","3","3"},
			    	            {"perspolis"+"time"+"esteglal", "2", "3-0","3","3","3","3"},
			    	            {"perspolis"+"time"+"esteglal", "2", "2-1" ,"3","3","3","3"}
			    	        };

			    	        String[] columnNames = {"Games program","Score", "Goal", "lost" , "equal" , "win" , "Play"};

			    	        JTable table = new JTable(data, columnNames);
			    	        JScrollPane scrollPane = new JScrollPane(table);

			    	        Window.add(scrollPane);
			    	        Window.setSize(1300, 700);
			    	        scrollPane.setSize(1300, 700);
			    	        Window.setLayout(new FlowLayout());
			    	        Window.setLocationRelativeTo(null);
			    	        Window.setLayout(null);
			    	        Window.setVisible(true);
			    	    }});
		
		}

		
		private Icon loadImage(String string) {
			// TODO Auto-generated method stub
			try {

				BufferedImage image = ImageIO.read(new File(string));
				return new ImageIcon(image);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("Could not find resource file");
			return null;
		}

	
	}
