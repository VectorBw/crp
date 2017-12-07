package exo5;


import javax.swing.SwingUtilities;

public class Launcher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				FactorielleGUI fact = new FactorielleGUI();
				fact.setVisible(true);
			}
		});
	}
}