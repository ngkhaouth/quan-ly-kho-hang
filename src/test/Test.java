package test;

import java.awt.EventQueue;

import view.QuanLyDonHangView;

public class Test {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyDonHangView frame = new QuanLyDonHangView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
