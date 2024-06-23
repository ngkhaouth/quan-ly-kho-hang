package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class vidu extends JFrame {

    private JPanel cardPanel;

    public vidu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 701, 500);

        CardLayout cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // RoundedPanel for menu
        RoundedPanel jPanelMenu = new RoundedPanel(50);
        jPanelMenu.setBackground(Color.white);
        jPanelMenu.setLayout(new GridBagLayout());
        jPanelMenu.setPreferredSize(new Dimension(150, 0));

        // Panel for menu items
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add image label
        JLabel labelHouse = new JLabel();
        labelHouse.setHorizontalAlignment(SwingConstants.CENTER);
        labelHouse.setAlignmentX(Component.CENTER_ALIGNMENT);
        ImageIcon imageIcon = new ImageIcon(QuanLyDonHangView.class.getResource("/House.png"));
        labelHouse.setIcon(imageIcon);
        panel.add(labelHouse);
        panel.add(Box.createVerticalStrut(20));

        // Add clickable labels
        panel.add(createClickableLabel("Đơn Hàng", cardPanel, "cardDonHang", "/icon_DonHang.png"));
        panel.add(createClickableLabel("Tồn Kho", cardPanel, "cardTonKho", "/icon_TonKho.png"));
        panel.add(createClickableLabel("Nhập/Xuất", cardPanel, "cardNhapXuat", "/icon_NhapXuat.png"));
        panel.add(createClickableLabel("Vị Trí Kho", cardPanel, "cardViTri", "/icon_ViTri.png"));
        panel.add(createClickableLabel("Quản Trị", cardPanel, "cardQuanTri", "/icon_QuanTri.png"));
        panel.add(createClickableLabel("Thống kê", cardPanel, "cardBaoCao", "/icon_ThongKe.png"));

        // Set empty border for labels
        for (Component comp : panel.getComponents()) {
            if (comp instanceof JLabel) {
                ((JLabel) comp).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            }
        }

        // Add panel to jPanelMenu using GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);
        jPanelMenu.add(panel, gbc);

        // Add jPanelMenu to the frame
        getContentPane().add(jPanelMenu, BorderLayout.WEST);
        getContentPane().add(cardPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    // Helper method to create clickable labels
    private JLabel createClickableLabel(String text, JPanel cardPanel, String cardName, String iconPath) {
        JLabel label = new JLabel(text);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ImageIcon imageIcon = new ImageIcon(QuanLyDonHangView.class.getResource(iconPath));
        Image scaledImg = imageIcon.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(scaledImg));
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                cardLayout.show(cardPanel, cardName);
            }
        });
        return label;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new vidu());
    }
}

//// RoundedPanel class for rounded corners
//class RoundedPanel extends JPanel {
//    private int cornerRadius;
//
//    public RoundedPanel(int radius) {
//        super();
//        this.cornerRadius = radius;
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
//        graphics.setColor(getBackground());
//        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
//    }
//}
