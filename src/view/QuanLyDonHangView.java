package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import controller.DonHangController;
import controller.TrangThaiDonHangController;
//import controller.TrangThaiDonHangController;
//import model.DonHang;
import model.TrangThaiDonHang;

public class QuanLyDonHangView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel cardPanel;
	public JTable ordersTable;
	private JTable tableTrangThai;
	DonHangController dhCon = new DonHangController();
	TrangThaiDonHangController ttdhCon = new TrangThaiDonHangController();
	private DefaultTableModel modelHoaDon;
	public DefaultTableModel modelTinhTrang;
	public JButton btnTaoDon;
	private NhapXuatView nxv;
	private ViTriKhoView vtv;
	private QuanTriView qtv;
	private TonKhoView tkv;
	private BaoCaoView bcv;
	
	private static JLabel currentLabel = null;

	/**
	 * Create the frame.
	 */
	public QuanLyDonHangView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 700);

		CardLayout cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);

//		setContentPane(cardPanel);
//		cardPanel.setLayout(new BorderLayout(0, 0));

		
//		RoundedPanel jPanelMenu = new RoundedPanel(50);
//		jPanelMenu.setBackground(Color.white);
//		JPanel jPanelMenu = new JPanel();
//		jPanelMenu.setLayout(new BorderLayout());
//		jPanelMenu.setPreferredSize(new Dimension(150, 0));
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
//		RoundedPanel panel = new RoundedPanel(50, Color.WHITE);
//		panel.setBackground(Color.WHITE);


		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.add(Box.createVerticalGlue());
		
		JLabel labelHouse = new JLabel();
		ImageIcon imageIcon = new ImageIcon(QuanLyDonHangView.class.getResource("/House.png"));
		labelHouse.setIcon(imageIcon);
//		labelHouse.setHorizontalAlignment(SwingConstants.CENTER);
		labelHouse.setAlignmentX(Component.CENTER_ALIGNMENT);
		
////		panel.add(Box.createVerticalStrut(20));
////		panel.add(Box.createVerticalStrut(̀10));
//		
////		JLabel labelDH = new JLabel("Đơn Hàng");
//		JLabel labelDH = createClickableLabel("Đơn Hàng", cardPanel, "cardDonHang");
//		labelDH.setHorizontalAlignment(SwingConstants.CENTER);
//		labelDH.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		Image imgDH = new ImageIcon(this.getClass().getResource("/icon_DonHang.png")).getImage();
//		Image sacledImgDH = imgDH.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
//		labelDH.setIcon(new ImageIcon(sacledImgDH));
////		labelDH.setBounds(29, 88, 140, 50);
//		labelDH.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//
////		panel.add(Box.createVerticalStrut(10));
//
////		JLabel labelTK = new JLabel("Tồn Kho");
//		JLabel labelTK = createClickableLabel("Tồn Kho", cardPanel, "cardTonKho");
//		labelTK.setHorizontalAlignment(SwingConstants.CENTER);
//		labelTK.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		Image imgTK = new ImageIcon(this.getClass().getResource("/icon_TonKho.png")).getImage();
//		Image sacledImgTK = imgTK.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
//		labelTK.setIcon(new ImageIcon(sacledImgTK));
//		labelTK.setBounds(29, 149, 140, 50);
//
////		panel.add(Box.createVerticalStrut(10));
//		
////		JLabel labelNX = new JLabel("Nhập/Xuất");
//		JLabel labelNX = createClickableLabel("Nhập/Xuất", cardPanel, "cardNhapXuat");
//		labelNX.setHorizontalAlignment(SwingConstants.CENTER);
//		labelNX.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		Image imgNX = new ImageIcon(this.getClass().getResource("/icon_NhapXuat.png")).getImage();
//		Image sacledImgNX = imgNX.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
//		labelNX.setIcon(new ImageIcon(sacledImgNX));
//		labelNX.setBounds(29, 197, 140, 50);
//
////		panel.add(Box.createVerticalStrut(10));
//
////		JLabel labelVT = new JLabel("Vị Trí Kho");
//		JLabel labelVT = createClickableLabel("Vị Trí Kho", cardPanel, "cardViTri");
//		labelVT.setHorizontalAlignment(SwingConstants.CENTER);
//		labelVT.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		Image imgVT = new ImageIcon(this.getClass().getResource("/icon_ViTri.png")).getImage();
//		Image sacledImgVT = imgVT.getScaledInstance(40, 36, Image.SCALE_SMOOTH);
//		labelVT.setIcon(new ImageIcon(sacledImgVT));
//		labelVT.setBounds(29, 258, 140, 50);
//
////		panel.add(Box.createVerticalStrut(10));
//
////		JLabel labelQT = new JLabel("Quản Trị");
//		JLabel labelQT = createClickableLabel("Quản Trị", cardPanel, "cardQuanTri");
//		labelQT.setHorizontalAlignment(SwingConstants.CENTER);
//		labelQT.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		Image imgQT = new ImageIcon(this.getClass().getResource("/icon_QuanTri.png")).getImage();
//		Image sacledImgQT = imgQT.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
//		labelQT.setIcon(new ImageIcon(sacledImgQT));
//		labelQT.setBounds(29, 319, 140, 50);
//
////		panel.add(Box.createVerticalStrut(10));
//
////		JLabel labelTKe = new JLabel("Thống kê");
//		JLabel labelTKe = createClickableLabel("Thống kê", cardPanel, "cardBaoCao");
//		labelTKe.setHorizontalAlignment(SwingConstants.CENTER);
//		labelTKe.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		Image imgTKe = new ImageIcon(this.getClass().getResource("/icon_ThongKe.png")).getImage();
//		Image sacledImgTKe = imgTKe.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
//		labelTKe.setIcon(new ImageIcon(sacledImgTKe));
//		labelTKe.setBounds(29, 376, 140, 50);
//		
////		panel.add(Box.createVerticalStrut(10));
//		
//		labelDH.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//		labelTK.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//		labelNX.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//		labelVT.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//		labelQT.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//		labelTKe.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//
//		// Thiết lập kích thước tối đa để chúng có cùng chiều rộng
//		Dimension labelSize = new Dimension(250, 30);
//		labelDH.setMaximumSize(labelSize);
//		labelTK.setMaximumSize(labelSize);
//		labelNX.setMaximumSize(labelSize);
//		labelVT.setMaximumSize(labelSize);
//		labelQT.setMaximumSize(labelSize);
//		labelTKe.setMaximumSize(labelSize);

		
        // Function labels with icons and text
        JLabel labelDH = createFunctionLabel("Đơn Hàng", "K:\\CloneFastFood\\QuanLyKhoHang\\img\\icon_DonHang.png");
        JLabel labelTK = createFunctionLabel("Tồn Kho", "K:\\CloneFastFood\\QuanLyKhoHang\\img\\icon_NhapXuat.png");
        JLabel labelNX = createFunctionLabel("Nhập/Xuất", "K:\\CloneFastFood\\QuanLyKhoHang\\img\\icon_QuanTri.png");
        JLabel labelVT = createFunctionLabel("Vị Trí Kho", "K:\\CloneFastFood\\QuanLyKhoHang\\img\\icon_DonHang.png");
        JLabel labelQT = createFunctionLabel("Quản Trị", "K:\\CloneFastFood\\QuanLyKhoHang\\img\\icon_NhapXuat.png");
        JLabel labelTKe = createFunctionLabel("Thống kê", "K:\\CloneFastFood\\QuanLyKhoHang\\img\\icon_QuanTri.png");
		
//		panel.add(labelDH);
//		panel.add(labelTK);
//		panel.add(labelNX);
//		panel.add(labelVT);
//		panel.add(labelQT);
//		panel.add(labelTKe);
		panel.add(Box.createVerticalStrut(10)); // Add some spacing
		panel.add(labelHouse);
		panel.add(Box.createVerticalStrut(20)); // Add some spacing
		panel.add(labelDH);
		panel.add(Box.createVerticalStrut(10)); // Add some spacing
		panel.add(labelTK);
		panel.add(Box.createVerticalStrut(10)); // Add some spacing
		panel.add(labelNX);
		panel.add(Box.createVerticalStrut(10)); // Add some spacing
		panel.add(labelVT);
		panel.add(Box.createVerticalStrut(10)); // Add some spacing
		panel.add(labelQT);
		panel.add(Box.createVerticalStrut(10)); // Add some spacing
		panel.add(labelTKe);

//		panel.add(Box.createVerticalStrut(10));
//		panel.add(Box.createVerticalGlue());

//		jPanelMenu.add(labelHouse, BorderLayout.NORTH);
//		jPanelMenu.add(panel, BorderLayout.CENTER);

		JTabbedPane tabbedPane = new JTabbedPane();
//		contentPane.add(tabbedPane, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Thông báo đơn hàng", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.SOUTH);

		btnTaoDon = new JButton("Tạo đơn");
		btnTaoDon.setBackground(new Color(255, 185, 55));
		panel_3.add(btnTaoDon);
		DonHangController donhangCon = new DonHangController(this);
		btnTaoDon.addActionListener(donhangCon);

		modelHoaDon = new DefaultTableModel();
		modelHoaDon.addColumn("Mã HD");
		modelHoaDon.addColumn("Tên HD");
		modelHoaDon.addColumn("Khách Hàng");
		modelHoaDon.addColumn("Ngày Đặt");
		modelHoaDon.addColumn("Ngày Giao");

		ordersTable = new JTable(modelHoaDon);

//		loadDataToTableDonHang();

		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		headerRenderer.setBackground(new Color(208, 215, 208)); // Màu sắc được chỉ định bằng mã màu RGB
		// Duyệt qua từng cột trong bảng và thiết lập renderer cho tiêu đề cột
		for (int i = 0; i < ordersTable.getColumnCount(); i++) {
			ordersTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
		}

		JScrollPane scrollPane = new JScrollPane(ordersTable);
		panel_1.add(scrollPane, BorderLayout.CENTER);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Trạng thái đơn hàng", null, panel_2, null);
		panel_2.setLayout(new BorderLayout(0, 0));

		modelTinhTrang = new DefaultTableModel();
		modelTinhTrang.addColumn("Mã đơn hàng");
		modelTinhTrang.addColumn("Tình trạng đơn hàng");

		tableTrangThai = new JTable(modelTinhTrang);
//		loadDataToTableTrangThaiDH();

		for (int i = 0; i < tableTrangThai.getColumnCount(); i++) {
			tableTrangThai.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
		}

		JScrollPane scrollPane_1 = new JScrollPane(tableTrangThai);
		panel_2.add(scrollPane_1, BorderLayout.CENTER);

		JPanel cardDonHang = new JPanel(new BorderLayout());
		cardDonHang.add(tabbedPane, BorderLayout.CENTER);
		cardPanel.add(cardDonHang, "cardDonHang");
		nxv = new NhapXuatView();
		cardPanel.add(nxv.cardNhapXuat, "cardNhapXuat");
		vtv = new ViTriKhoView();
		cardPanel.add(vtv.cardVitri, "cardViTri");
		qtv = new QuanTriView();
		cardPanel.add(qtv.cardQuanTri, "cardQuanTri");
		tkv = new TonKhoView();
		cardPanel.add(tkv.cardTonKho, "cardTonKho");
		bcv = new BaoCaoView();
		cardPanel.add(bcv.cardBaoCao, "cardBaoCao");

		getContentPane().add(panel, BorderLayout.WEST);
		getContentPane().add(cardPanel, BorderLayout.CENTER);

		// Thêm sự kiện click cho các JLabel
		labelDH.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(cardPanel, "cardDonHang");
			}
		});

		labelNX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(cardPanel, "cardNhapXuat");
				System.out.println("cardNhapXuat");
			}
		});

		labelVT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(cardPanel, "cardViTri");
				System.out.println("cardViTri");
			}
		});

		labelQT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(cardPanel, "cardQuanTri");
				System.out.println("cardQuanTri");
			}
		});

		labelTK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(cardPanel, "cardTonKho");
				System.out.println("cardTonKho");
			}
		});

		labelTKe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(cardPanel, "cardBaoCao");
				System.out.println("cardBaoCao");
			}
		});
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
    
    private static JLabel createClickableLabel(String text, JPanel cardPanel, String cardName) {
        JLabel label = new JLabel(text);
        
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (label != currentLabel) {
                    label.setBackground(Color.LIGHT_GRAY);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (label != currentLabel) {
                    label.setBackground(Color.WHITE);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (currentLabel != null) {
                    currentLabel.setBackground(Color.WHITE); // Đặt lại màu cho JLabel trước đó
                }
                currentLabel = label; // Cập nhật JLabel hiện tại
                label.setBackground(Color.GRAY); // Đổi màu JLabel hiện tại
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // Chuyển đổi card
                CardLayout cl = (CardLayout) (cardPanel.getLayout());
                cl.show(cardPanel, cardName);
            }
        });

        return label;
    }
    


//	public void loadDataToTableDonHang() {
//		ArrayList<DonHang> arr = new ArrayList<>();
//		arr = dhCon.getListDonHangConTroller();
//		if(arr != null) {
//			for(DonHang x : arr) {
//				Vector<String> vec = new Vector<String>();
//				vec.add(x.getMaDH()+"");
//				vec.add(x.getTenDH());
//				vec.add(x.getKhachHang());
//				vec.add(x.getNgayDat() + "");
//				vec.add(x.getNgayGiao()+"");
//				modelHoaDon.addRow(vec);
//			}
//		}
//	}
//
//	public void loadDataToTableTrangThaiDH() {
//		modelTinhTrang.setRowCount(0);
//		ArrayList<TrangThaiDonHang> list = new ArrayList<TrangThaiDonHang>();
//		list = ttdhCon.getListTrangThaiDonHang();
//		if(list != null) {
//			for(TrangThaiDonHang x : list) {
//				Vector<String> vec = new Vector<String>();
//				vec.add(x.getMaDH() + "");
//				vec.add(x.getTinhTrang());
//				modelTinhTrang.addRow(vec);
//				
//			}
//		}
//	}

}
