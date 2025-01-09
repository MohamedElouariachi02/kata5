package ulpgc.software.Control.Adapters;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ImageAdapter {
    public static ImageIcon adapt(byte[] picture) {
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(picture);
            BufferedImage read = ImageIO.read(bais);
            return new ImageIcon(read.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
