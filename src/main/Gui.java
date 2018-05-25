package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSplitPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFileChooser;
import javax.swing.JSlider;
import javax.swing.JSpinner;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JPanel contentRight;
	private JPanel contentLeft;
	private JPanel contentImage;
	private JLabel contentOrjImage;
	private JLabel contentProcImage;

	private JButton imageOpen;
	
	private JButton method3Button;

	private JButton method2Button;

	private JButton method1Button;

	private JTextPane textPane;

	private JSlider slider;
	
	private Font font;
	
	private JSpinner s0;
	
	private JSpinner s1;
			
	private JSpinner s2;
			
	private JSpinner s3;
			
	private JSpinner s4;
			
	private JSpinner s5;
			
	private JSpinner s6;
			
	private JSpinner s7;
			
	private JSpinner s8;

	/**
	 * Create the frame.
	 */
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1141, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JSplitPane splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(splitPane,
				GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addComponent(splitPane,
				Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE));

		font = new Font("SansSerif", Font.BOLD, 13);
		contentRight = new JPanel();
		splitPane.setRightComponent(contentRight);
		contentRight.setLayout(null);

		contentImage = new JPanel();
		contentImage.setBounds(23, 41, 897, 480);
		contentRight.add(contentImage);
		contentImage.setLayout(null);

		contentOrjImage = new JLabel();
		contentOrjImage.setBounds(12, 12, 429, 439);
		contentImage.add(contentOrjImage);

		contentProcImage = new JLabel();
		contentProcImage.setBounds(453, 12, 432, 439);
		contentImage.add(contentProcImage);

		contentLeft = new JPanel();
		splitPane.setLeftComponent(contentLeft);

		imageOpen = new JButton("Image Open");
		imageOpen.setFont(font);
		imageOpen.setBackground(Color.GREEN);

		method1Button = new JButton("Method 1");
		method1Button.setFont(font);
		method1Button.setBackground(Color.ORANGE);
		method2Button = new JButton("Method 2");
		method2Button.setFont(font);
		method2Button.setBackground(Color.MAGENTA);
		method3Button = new JButton("Method 3");
		method3Button.setFont(font);
		method3Button.setBackground(Color.GRAY);
		

		font = new Font("SansSerif", Font.BOLD + Font.ITALIC, 13);
		textPane = new JTextPane();
		textPane.setFont(font);
		textPane.setText("\nGürkan AKDENiZ\nHüseyin Emre ÖZHAN\nHüsnü Mert POLAT\nAdem Derviş YILMAZ");
		textPane.setEditable(false);
		textPane.setBackground(getBackground());
		

		slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 10); 
		
		
		
		
		s0 = new JSpinner(new SpinnerNumberModel(0, -99, 99, 1));
		
		s1 = new JSpinner(new SpinnerNumberModel(0, -99, 99, 1));
				
		s2 = new JSpinner(new SpinnerNumberModel(0, -99, 99, 1));
				
		s3 = new JSpinner(new SpinnerNumberModel(0, -99, 99, 1));
				
		s4 = new JSpinner(new SpinnerNumberModel(0, -99, 99, 1));
				
		s5 = new JSpinner(new SpinnerNumberModel(0, -99, 99, 1));
				
		s6 = new JSpinner(new SpinnerNumberModel(0, -99, 99, 1));
				
		s7 = new JSpinner(new SpinnerNumberModel(0, -99, 99, 1));
				
		s8 = new JSpinner(new SpinnerNumberModel(0, -99, 99, 1));
		

		Actions();

		GroupLayout gl_panel_1 = new GroupLayout(contentLeft);
		gl_panel_1.setHorizontalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_1.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addComponent(imageOpen, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
							.addComponent(slider, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
							.addComponent(method1Button, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
							.addComponent(method2Button, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
							.addComponent(method3Button, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addComponent(s0, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
									.addComponent(s3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
									.addComponent(s6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addComponent(s4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
									.addComponent(s1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
									.addComponent(s7, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
								.addGap(26)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(s8, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
										.addComponent(s5, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
									.addComponent(s2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
							.addComponent(textPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
						.addContainerGap())
			);
			gl_panel_1.setVerticalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_1.createSequentialGroup()
						.addGap(27)
						.addComponent(imageOpen, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(method1Button, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(12)
						.addComponent(method2Button, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(method3Button, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
							.addComponent(s5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_1.createSequentialGroup()
										.addComponent(s0, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
									.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
										.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
											.addComponent(s2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
											.addComponent(s1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
									.addComponent(s3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
									.addComponent(s4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(s8, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addComponent(s6, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addComponent(s7, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGap(23)
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
			);
		contentLeft.setLayout(gl_panel_1);	
		contentPane.setLayout(gl_contentPane);
	}

	private void Actions() {

		imageOpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser openFile = new JFileChooser();
				openFile.setCurrentDirectory(new File(System.getProperty("user.dir")));
				openFile.setPreferredSize(new Dimension(540, 400));
				openFile.setFileFilter(new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes()));
				openFile.showOpenDialog(null);

				Main.orgImageFile = openFile.getSelectedFile();
				if (Main.orgImageFile != null) {
					
					try {
						Main.orgImage = ImageIO.read(Main.orgImageFile);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
					contentOrjImage.setIcon(new PreferredIcon(Main.orgImage));
					contentProcImage.setIcon(new PreferredIcon());
				}
			}
		});
		
		
		method1Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double radius = slider.getValue() / 10.0;
				
				if(Main.orgImage != null) {
					BufferedImage procImage = Processing.sharpen1(radius, Main.orgImage);
					
					contentProcImage.setIcon(new PreferredIcon(procImage));
				}
				
			}
		});
		
		method2Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double radius = slider.getValue() / 10.0;
				
				if(Main.orgImage != null) {
					
					BufferedImage procImage = Processing.sharpen2(radius, Main.orgImage);
					
					contentProcImage.setIcon(new PreferredIcon(procImage));
				}
				
			}
		});
		
		method3Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double radius = slider.getValue() / 30.0;				

				if(Main.orgImage != null) {
					
					BufferedImage procImage = Processing.sharpen3(radius, Main.orgImage, loadKernel(new int[9]));
					
					contentProcImage.setIcon(new PreferredIcon(procImage));
				}
				
			}
		});
	}
	
	private int[] loadKernel(int kernel[]) {
		
		if(kernel == null)
			kernel = new int[9];
	
		kernel[0] = (int) s0.getValue();
		kernel[1] = (int) s1.getValue();
		kernel[2] = (int) s2.getValue();
		kernel[3] = (int) s3.getValue();
		kernel[4] = (int) s4.getValue();
		kernel[5] = (int) s5.getValue();
		kernel[6] = (int) s6.getValue();
		kernel[7] = (int) s7.getValue();
		kernel[8] = (int) s8.getValue();
		
		return kernel;
	}
	
}
