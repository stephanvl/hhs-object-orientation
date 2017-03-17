package cutthetree;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Lumberaxe extends Field {
    private static Image image;
    private Color color;

    //public Lumberaxe(int code) {
    //    this.code = code;
    //}

    public Lumberaxe(int x, int y, Color color) {
        super(x, y);
        this.color = color;

        if (image == null) loadImage();
    }

    private void loadImage() {
        try {
            image = ImageIO.read(getClass().getResource("/img/axes.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int idx = color.ordinal();
        g.drawImage(image, xPos, yPos, xPos + 75, yPos + 75, idx * 75, 0, (idx + 1) * 75, 75, null);


    }

    public Color getColor() {
        return color;
    }
}