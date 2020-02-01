package com.avaruus.utils;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ImageResizer {

	/**
	 * The method resizes an image that it covers at maximum the input area
	 * 
	 * 
	 * @param input The Input Image
	 * @param sizeX The width the Image has available
	 * @param sizeY The height the Image has available
	 * 
	 * @return BufferedImage
	 */
	public static BufferedImage resizeInBorder(BufferedImage input, int sizeX, int sizeY) {
		BufferedImage resized;
		resized = resizeX(input, sizeX);
		if (resized.getHeight() > sizeY) {
			resized = resizeY(input, sizeY);
		}
		return resized;
	}
	
	/**
	 * The method resizes an image that it covers at least the input area
	 * 
	 * 
	 * @param input The Input Image
	 * @param sizeX The width the Image has to cover
	 * @param sizeY The height the Image has to cover
	 * 
	 * @return BufferedImage
	 */
	public static BufferedImage resizeOutBorder(BufferedImage input, int sizeX, int sizeY) {
		BufferedImage resized;
		resized = resizeX(input, sizeX);
		if (resized.getHeight() < sizeY) {
			resized = resizeY(input, sizeY);
		}
		return resized;
	}
	
	/**
	 * The Method resizes an Image equally based on the new XSize.
	 * 
	 * @param input The Input Image
	 * @param sizeX The new XSize
	 * 
	 * @return BufferedImage
	 */
	public static BufferedImage resizeX(BufferedImage input, int sizeX) {
    	int sizeY = input.getHeight() * sizeX / input.getWidth();
    	BufferedImage output = new BufferedImage(sizeX, sizeY, input.getType());
    	
    	Graphics2D g2d = output.createGraphics();
        g2d.drawImage(input, 0, 0, sizeX, sizeY, null);
        g2d.dispose();
        
        return output;    	
    }
    
	/**
	 * The Method resizes an Image equally based on the new YSize.
	 * 
	 * @param input The input Image
	 * @param sizeY The new YSize
	 * 
	 * @return BufferedImage
	 */
    public static BufferedImage resizeY(BufferedImage input, int sizeY) {
    	int sizeX = input.getWidth() * sizeY / input.getHeight();
    	BufferedImage output = new BufferedImage(sizeX, sizeY, input.getType());
    	
    	Graphics2D g2d = output.createGraphics();
        g2d.drawImage(input, 0, 0, sizeX, sizeY, null);
        g2d.dispose();
        
        return output;
    }
    
    /**
     * The Method resizes an Image based on it´s new X and Y Sizes
     * 
     * @param input The Input Image
     * @param sizeX The new XSize
     * @param sizeY THe new YSize
     * 
     * @return BufferedImage
     */
    public static BufferedImage resize(BufferedImage input, int sizeX, int sizeY) {
    	BufferedImage output = new BufferedImage(sizeX, sizeY, input.getType());
    	
    	Graphics2D g2d = output.createGraphics();
        g2d.drawImage(input, 0, 0, sizeX, sizeY, null);
        g2d.dispose();
        
        return output;
    }
}
