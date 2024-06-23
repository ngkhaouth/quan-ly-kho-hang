package view;
import javax.swing.*;
import java.awt.*;

public class vidu2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sidebar Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 600);

        // Main panel with BoxLayout
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.Y_AXIS));

        // Image label for the brand
        ImageIcon brandIcon = new ImageIcon("K:\\CloneFastFood\\QuanLyKhoHang\\img\\House.png"); // Path to your brand image
        JLabel brandLabel = new JLabel(brandIcon);
        brandLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Function labels with icons and text
        JLabel functionLabel1 = createFunctionLabel("Function 1", "K:\\CloneFastFood\\QuanLyKhoHang\\img\\icon_DonHang.png");
        JLabel functionLabel2 = createFunctionLabel("Function 2", "K:\\CloneFastFood\\QuanLyKhoHang\\img\\icon_NhapXuat.png");
        JLabel functionLabel3 = createFunctionLabel("Function 3", "K:\\CloneFastFood\\QuanLyKhoHang\\img\\icon_QuanTri.png");

        // Add components to the panel
        sidebarPanel.add(Box.createVerticalStrut(10)); // Add some spacing
        sidebarPanel.add(brandLabel);
        sidebarPanel.add(Box.createVerticalStrut(20)); // Add some spacing
        sidebarPanel.add(functionLabel1);
        sidebarPanel.add(Box.createVerticalStrut(10)); // Add some spacing
        sidebarPanel.add(functionLabel2);
        sidebarPanel.add(Box.createVerticalStrut(10)); // Add some spacing
        sidebarPanel.add(functionLabel3);

        // Add the sidebar panel to the frame
        frame.getContentPane().add(sidebarPanel, BorderLayout.WEST);

        frame.setVisible(true);
    }

    // Method to create a JLabel with icon and text
    private static JLabel createFunctionLabel(String text, String iconPath) {
        ImageIcon icon = new ImageIcon(iconPath); // Path to your icon image
        JLabel label = new JLabel(text, icon, JLabel.CENTER);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setIconTextGap(10); // Gap between icon and text
        label.setHorizontalTextPosition(SwingConstants.RIGHT); // Text to the right of icon
        return label;
    }
}
