package GUI;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class alldeals extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					alldeals frame = new alldeals();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public alldeals() {
		setBounds(100, 100, 450, 300);

	}

}
