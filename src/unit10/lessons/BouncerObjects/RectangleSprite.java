package unit10.lessons.BouncerObjects;

import javax.swing.*;
import java.awt.*;

public class RectangleSprite extends Sprite {
    protected int width;
    protected int height;
    protected Color color;
    public RectangleSprite (JPanel panel, int dx, int dy, int width, int height, Color color) {

        super (panel, dx, dy);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x - width / 2, y - height / 2, width, height);
    }

    @Override
    public int getRight() {
        return x + width / 2;
    }

    @Override
    public int getLeft() {
        return x - width / 2;
    }

    @Override
    public int getTop() {
        return y - height / 2;
    }

    @Override
    public int getBottom() {
        return y + height / 2;
    }
}
