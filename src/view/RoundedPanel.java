package view;

//import javax.swing.JPanel;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.LayoutManager;
//import java.awt.RenderingHints;
//import java.awt.Color;
//import java.awt.Dimension;
//
//public class RoundedPanel extends JPanel {
//
//    private static final long serialVersionUID = 1L;
//    private Color backgroundColor;
//    private int cornerRadius = 15;
//
//    public RoundedPanel(LayoutManager layout, int radius) {
//        super(layout);
//        cornerRadius = radius;
//    }
//
//    public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
//        super(layout);
//        cornerRadius = radius;
//        backgroundColor = bgColor;
//    }
//
//    public RoundedPanel(int radius) {
//        super();
//        cornerRadius = radius;
//    }
//
//    public RoundedPanel(int radius, Color bgColor) {
//        super();
//        cornerRadius = radius;
//        backgroundColor = bgColor;
//        setOpaque(false);
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
//        int width = getWidth();
//        int height = getHeight();
//        Graphics2D graphics = (Graphics2D) g;
//        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//
//        // Vẽ panel bo tròn với màu nền.
//        if (backgroundColor != null) {
//            graphics.setColor(backgroundColor);
//        } else {
//            graphics.setColor(getBackground());
//        }
//        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
//        graphics.setColor(getForeground());
//        graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
//    }
//}
import javax.swing.*;
import java.awt.*;

public class RoundedPanel extends JPanel {
    private int radius;

    public RoundedPanel(int radius) {
        super();
        this.radius = radius;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        // Antialiasing để làm mịn các cạnh
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Thiết lập màu nền
        g2d.setColor(getBackground());
        // Vẽ hình chữ nhật bo tròn
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2d.dispose();
    }

    @Override
    public Insets getInsets() {
        // Đặt insets để đảm bảo nội dung không tràn ra ngoài phần bo cong
        return new Insets(radius, radius, radius, radius);
    }
}


