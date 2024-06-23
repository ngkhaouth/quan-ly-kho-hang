package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;


import java.util.Map;

import javax.swing.BorderFactory;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.border.EmptyBorder;

//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.category.DefaultCategoryDataset;
//
//import controller.baoCaoChiTietController;
//import controller.thongKeTongQuatController;


import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BaoCaoView {

    private JFrame frame;
	private JTable tableTKTQ;
	private JTable tableBCCT;
	private JComboBox<String> comboBoxTKTQ;
	private JComboBox<String> comboBoxBCCT;
	private DefaultTableModel tableModelTKTQ;
	private DefaultTableModel tableModelBCCT;
	private Map<String, Object[][]> dataMap;
//	private Map< String,Object[][]> dataMapBCCT;
	private Button buttonDT; 
	private Button buttonTK;
	public JPanel cardBaoCao;
//	private ChartPanel chartPanelBCCT;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BaoCaoView window = new BaoCaoView();
//                    thongKeTongQuatController controller = new thongKeTongQuatController(window);
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

   
	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}


	/**
     * Create the application.
     */
    public BaoCaoView() {
        initialize();

    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
    	
    	

        frame = new JFrame();
        frame.setBounds(100, 100, 701, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));
//        frame.setVisible(true);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tabbedPane.setBackground(new Color(255, 255, 255));
//        frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
        
        JPanel thongKeTongQuatPanel = new JPanel();
        thongKeTongQuatPanel.setBackground(new Color(245, 255, 255));
        thongKeTongQuatPanel.setLayout(null);

        JPanel labelPanel = new JPanel();
        labelPanel.setBounds(0, 0, 560, 205);
        labelPanel.setLayout(new GridLayout(2, 2, 50, 50));
        labelPanel.setBackground(new Color(255, 255, 255));
        
   
        
        Button buttonKH = new Button("Khách hàng: "+135);
        buttonKH.setSize(40, 30);
        buttonKH.setForeground(new Color(255, 255, 255));
        buttonKH.setBackground(new Color(0, 128, 192));
        buttonKH.setFont(new Font("Tahoma", Font.PLAIN, 20));
        labelPanel.add(buttonKH);
       
        Button buttonNV = new Button("Nhân viên: "+43);
        buttonNV.setSize(40, 30);
        buttonNV.setForeground(new Color(255, 255, 255));
        buttonNV.setBackground(new Color(0, 128, 192));
        buttonNV.setFont(new Font("Tahoma", Font.PLAIN, 20));
        labelPanel.add( buttonNV);
        
        
        buttonDT = new Button("Doanh thu:");
        buttonDT.setSize(40, 30);
        buttonDT.setForeground(new Color(255, 255, 255));
        buttonDT.setBackground(new Color(0, 128, 192));
        buttonDT.setFont(new Font("Tahoma", Font.PLAIN, 20));
        buttonDT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                thongKeTongQuatController controller = new thongKeTongQuatController(BaoCaoView.this);
//                controller.updateTotalRevenue();
            }
        });
        labelPanel.add(buttonDT);

        
        buttonTK = new Button("Tồn Kho:");
        buttonTK.setSize(40, 30);
        buttonTK.setForeground(new Color(255, 255, 255));
        buttonTK.setBackground(new Color(0, 128, 192));
        buttonTK.setFont(new Font("Tahoma", Font.PLAIN, 20));
        buttonTK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                thongKeTongQuatController controller = new thongKeTongQuatController(BaoCaoView.this);
//                controller.updateTonKho();
            }
        });
        labelPanel.add(buttonTK);

        thongKeTongQuatPanel.add(labelPanel);
       
        //combobox NAM cho Thong Ke Tong Quat
        comboBoxTKTQ = new JComboBox<>();
        comboBoxTKTQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
        comboBoxTKTQ.setModel(new DefaultComboBoxModel<>(new String[] {"2022", "2023", "2024"}));
        comboBoxTKTQ.setSelectedIndex(0); 
        comboBoxTKTQ.setToolTipText("");
        comboBoxTKTQ.setBounds(205, 208, 160, 30);
        thongKeTongQuatPanel.add(comboBoxTKTQ);
        
        String[] columnNamesTKTQ = {"Quý", "Quý 1", "Quý 2", "Quý 3", "Quý 4",};
      
        tableModelTKTQ = new DefaultTableModel(new Object[][]{}, columnNamesTKTQ);
        tableTKTQ = new JTable(tableModelTKTQ);
        tableTKTQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tableTKTQ.setBackground(new Color(255, 255, 255));
        tableTKTQ.setForeground(new Color(0, 0, 0));
        JScrollPane scrollPaneTKTQ = new JScrollPane(tableTKTQ);
        scrollPaneTKTQ.setBounds(0, 239, 560, 427);

        thongKeTongQuatPanel.add(scrollPaneTKTQ);

     

        comboBoxTKTQ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedYear = (String) comboBoxTKTQ.getSelectedItem();
//                thongKeTongQuatController controllerTKTQ = new thongKeTongQuatController(BaoCaoView.this);
//                controllerTKTQ.updateTableDataTKTQ(selectedYear);
               
            }
        });

        JPanel baoCaoChiTietPanel = new JPanel();
        baoCaoChiTietPanel.setLayout(null);

        String[] columnNamesBCCT = {"Tháng", "Chi Phí", "Doanh Thu", "Lợi Nhuận"};
        tableModelBCCT = new DefaultTableModel(new Object[][]{}, columnNamesBCCT);
        tableBCCT = new JTable(tableModelBCCT);
        tableBCCT.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tableBCCT.setBackground(new Color(255, 255, 255));
        tableBCCT.setForeground(new Color(0, 0, 0));
        JScrollPane scrollPaneBCCT = new JScrollPane(tableBCCT);
        scrollPaneBCCT.setBounds(0, 344, 546, 87);
        baoCaoChiTietPanel.add(scrollPaneBCCT);

        // tao chart
//        chartPanelBCCT = new ChartPanel(null);
//        chartPanelBCCT.setBounds(0, 0, 546, 322);
//        chartPanelBCCT.setPreferredSize(new Dimension(560, 367));
//        baoCaoChiTietPanel.add(chartPanelBCCT);
        

        tabbedPane.addTab("Thống kê tổng quát", thongKeTongQuatPanel);
        tabbedPane.addTab("Báo cáo chi tiết", baoCaoChiTietPanel);
        
       //combobox BCCT 
        
        comboBoxBCCT = new JComboBox<>();
        comboBoxBCCT.setBounds(226, 322, 87, 23);
        baoCaoChiTietPanel.add(comboBoxBCCT);
        comboBoxBCCT.setFont(new Font("Tahoma", Font.PLAIN, 16));
        comboBoxBCCT.setModel(new DefaultComboBoxModel<>(new String[] {"2022", "2023", "2024"}));
        comboBoxBCCT.setSelectedIndex(0); 
        comboBoxBCCT.setToolTipText("");  
        comboBoxBCCT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedYear = (String) comboBoxBCCT.getSelectedItem();
//                baoCaoChiTietController controllerBCCT = new baoCaoChiTietController(BaoCaoView.this);
//                controllerBCCT.updateTableDataBCCT(selectedYear);
//                controllerBCCT.updateChart(selectedYear);
            }
        });
        
        cardBaoCao = new JPanel(new BorderLayout());
        cardBaoCao.add(tabbedPane, BorderLayout.CENTER);
    }

    public Map<String, Object[][]> getDataMap() {
        return dataMap;
    }
    

    
    public void addComboBoxListenerTKTQ(ActionListener listener) {
        comboBoxTKTQ.addActionListener(listener);
    }
    public void updateTableTKTQ(Object[][] newData) {
        String[] columnNames = {"Quý", "Quý 1", "Quý 2", "Quý 3", "Quý 4"};
        tableModelTKTQ.setDataVector(newData, columnNames);
    }
    
    public void addComboBoxListenerBCCT(ActionListener listener) {
        comboBoxBCCT.addActionListener(listener);
    }
   
    public void updateTableBCCT(Object[][] newData) {
        String[] columnNames = {"Tháng", "Chi Phí", "Doanh Thu", "Lợi Nhuận"};
        tableModelBCCT.setDataVector(newData, columnNames);
    }
    
    public void updateTotalRevenue(String formattedTotalRevenue) {
        buttonDT.setLabel("Doanh thu: " + formattedTotalRevenue);
    }
    public void updateTonKho(int tongTonKho) {
        buttonTK.setLabel("Tồn Kho: " + tongTonKho);
    }
    
//    public void updateChartBCCT(DefaultCategoryDataset dataset) {
//        JFreeChart barChart = ChartFactory.createBarChart(
//            "Báo cáo chi tiết",
//            "Tháng",
//            "Giá trị",
//            dataset,
//            PlotOrientation.VERTICAL,
//            true, true, false
//        );
//        chartPanelBCCT.setChart(barChart);
//    }
//   
  
}
   