package tetris;

import java.awt.EventQueue;

import javax.swing.JFrame;


public class Tetris extends JFrame {
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() throws NullPointerException, NumberFormatException {
					try {
						Tetris frame = new Tetris();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
}
		public Tetris() {
			
		}
}