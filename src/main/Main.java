package main;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {
	
	static File orgImageFile;
	static BufferedImage orgImage;
	
	static File procImageFile;
	static BufferedImage procImage;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
