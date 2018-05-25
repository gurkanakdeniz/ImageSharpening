package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class Processing {

	public static BufferedImage sharpen1(double radius, BufferedImage orgImage) {
		BufferedImage result = new BufferedImage(orgImage.getWidth(), orgImage.getHeight(), orgImage.getType());
		for (int y = 0; y < orgImage.getHeight(); y++) {
			for (int x = 0; x < orgImage.getWidth(); x++) {
				int sumR = 0, sumG = 0, sumB = 0;
				int n = 0;
				for (double ny = Math.max(0, y - radius); ny < Math.min(orgImage.getHeight(), y + 1 + radius); ny++) {
					for (double nx = Math.max(0, x - radius); nx < Math.min(orgImage.getWidth(),
							x + 1 + radius); nx++) {
						if (nx != x || ny != y) {
							Color c = new Color(orgImage.getRGB((int) nx, (int) ny));
							sumR += c.getRed();
							sumG += c.getGreen();
							sumB += c.getBlue();
							n++;
						}
					}
				}
				Color c = new Color(orgImage.getRGB(x, y));
				int red = (int) constrain(c.getRed() * (n + 1) - sumR, 0, 255);
				int green = (int) constrain(c.getGreen() * (n + 1) - sumG, 0, 255);
				int blue = (int) constrain(c.getBlue() * (n + 1) - sumB, 0, 255);
				Color newColor = new Color(red, green, blue);
				result.setRGB(x, y, newColor.getRGB());
			}
		}
		return result;
	}

	public static BufferedImage sharpen2(double radius, BufferedImage orgImage) {

		BufferedImage result = new BufferedImage(orgImage.getWidth(), orgImage.getHeight(), orgImage.getType());
		Graphics g = result.getGraphics();
		g.drawImage(orgImage, 0, 0, null);
		g.dispose();

		for (int i = 0; i < radius; i++) {

			Kernel kernel = new Kernel(3, 3, new float[] { -1, -1, -1, -1, 9, -1, -1, -1, -1 });

			BufferedImageOp op = new ConvolveOp(kernel);
			result = op.filter(result, null);
		}

		return result;
	}
	
	public static BufferedImage sharpen3(double radius, BufferedImage orgImage, int cK[] ) {

		BufferedImage result = new BufferedImage(orgImage.getWidth(), orgImage.getHeight(), orgImage.getType());
		Graphics g = result.getGraphics();
		g.drawImage(orgImage, 0, 0, null);
		g.dispose();

		Kernel kernel = new Kernel(3, 3, new float[] { cK[0]*(float)radius ,cK[1]*(float)radius, cK[2]*(float)radius,
													   cK[3]*(float)radius, cK[4]*(float)radius + 1, cK[5]*(float)radius, 
													   cK[6]*(float)radius, cK[7]*(float)radius, cK[8]*(float)radius });

		BufferedImageOp op = new ConvolveOp(kernel);
		result = op.filter(result, null);

		return result;
	}
	
	private static double constrain(double val, double min, double max) {
		if (val < min) {
			return min;
		} else if (val > max) {
			return max;
		}
		return val;
	}
}
