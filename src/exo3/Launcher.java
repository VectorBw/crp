package exo3;

import javax.swing.SwingUtilities;

public class Launcher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				BoutonsListeners boutonsListeners = new BoutonsListeners();
				boutonsListeners.setVisible(true);
			}
		});
	}
}
