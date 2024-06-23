package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Font;
//import model.Khohang;
//import model.QLKmodel;
//import model.vitrikho;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//import controller.QLKController;

import javax.swing.JScrollPane;
import java.awt.Component;



public class TonKhoView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JLabel labelTK;
//    public QLKmodel Model;
//    QLKController dhCon = new QLKController();
    public JTextField textField_Masp;
	private JComboBox comboBox_vitrikho;
	
	private DefaultTableModel modelKhohang;
	private JTable table;
	public JPanel cardTonKho;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TonKhoView frame = new TonKhoView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public TonKhoView() {
//		this.Model = new QLKmodel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
//		ActionListener action = new QLKController(this);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(Box.createVerticalGlue());
		
		
		modelKhohang = new DefaultTableModel();
		modelKhohang.addColumn("Mã sản phẩm");
        modelKhohang.addColumn("Tên sản phẩm");
        modelKhohang.addColumn("Số lượng");
        modelKhohang.addColumn("Vị trí kho");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(150, 11, 620, 450);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mã sản phẩm");
		lblNewLabel_1.setBounds(239, 11, 104, 53);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JButton btnSearch = new JButton("Tìm");
		btnSearch.setBounds(520, 21, 90, 33);
		panel_1.add(btnSearch);
//		btnSearch.addActionListener(action);
		btnSearch.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		textField_Masp = new JTextField();
		textField_Masp.setBounds(353, 19, 146, 40);
		panel_1.add(textField_Masp);
		textField_Masp.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Vị trí kho");
		lblNewLabel.setBounds(10, 11, 75, 47);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		comboBox_vitrikho = new JComboBox();
//		ArrayList<vitrikho> listtenKho = vitrikho.getDSKho();
//		for (vitrikho tenKho : listtenKho) {
//		    comboBox_vitrikho.addItem(tenKho.getVitrikho());
//		}
		comboBox_vitrikho.setBounds(95, 19, 118, 40);
		panel_1.add(comboBox_vitrikho);
		
		
		JLabel lblNewLabel_2 = new JLabel("Danh sách sản phẩm");
		lblNewLabel_2.setBounds(10, 89, 166, 33);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(10, 133, 610, 306);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Vị trí kho"
			}
		));
		scrollPane.setViewportView(table);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(0, 69, 610, 1);
		panel_1.add(horizontalStrut);
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		cardTonKho = new JPanel(new BorderLayout());
		cardTonKho.add(panel_1, BorderLayout.CENTER);

}
		
	public void xoaForm() {
		comboBox_vitrikho.setSelectedIndex(-1);
		textField_Masp.setText("");
        }
//	public void loadDataToTableKhoHang() {
//		ArrayList<Khohang> arr = new ArrayList<>();
//		arr = dhCon.getListKhohangConTroller();
//		modelKhohang.setRowCount(0);
//		if(arr != null) {
//			for(Khohang x : arr) {
//				Vector<String> vec = new Vector<String>();
//				vec.add(x.getMaSanpham()+"");
//				vec.add(x.getTenSanpham());
//				vec.add(x.getSoluong()+"");
//				vec.add(x.getKho());
//				modelKhohang.addRow(vec);
//				System.out.print("yes");
//			}
//		}
//			
//    }
}