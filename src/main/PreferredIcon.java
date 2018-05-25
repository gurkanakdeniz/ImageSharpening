package main;


import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;

public class PreferredIcon extends ImageIcon {
	
	public PreferredIcon() {
	}

	public PreferredIcon(Image image) {
		super(image);
	}

	@Override
	public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
		Image image = getImage();
		if (image == null) {
			return;
		}
		Insets insets = ((Container) c).getInsets();
		x = insets.left;
		y = insets.top;

		int w = c.getWidth() - x - insets.right;
		int h = c.getHeight() - y - insets.bottom;

		int iw = image.getWidth(c);
		int ih = image.getHeight(c);

		if (iw * h < ih * w) {
			iw = (h * iw) / ih;
			x += (w - iw) / 2;
			w = iw;
		} else {
			ih = (w * ih) / iw;
			y += (h - ih) / 2;
			h = ih;
		}

		ImageObserver io = getImageObserver();
		g.drawImage(image, x, y, w, h, io == null ? c : io);
	}

}
