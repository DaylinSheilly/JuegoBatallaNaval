package myProject;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageIconToImage {

    public ImageIconToImage(){

    }

    public Image scaledImage(Image img, int w, int h){
        BufferedImage resizedImage = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);

        Graphics2D g2 = resizedImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0,0,w,h,null);
        g2.dispose();
        return resizedImage;
    }
}