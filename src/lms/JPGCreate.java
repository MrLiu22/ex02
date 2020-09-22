package lms;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;



public class JPGCreate {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		int height=27;
		int width=72;
		
		BufferedImage img=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		
		//»­±Ê
		Graphics g=img.getGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 15, 15);
		File f=new File("e:/1.jpg");
		OutputStream os=new FileOutputStream(f);
		ImageIO.write(img, "jpeg", os);
		os.close();
	}

}
