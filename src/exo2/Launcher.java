package exo2;


import java.awt.Color;

import javax.swing.SwingUtilities;


public class Launcher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				DecouverteNouveauxComposants dnc = new DecouverteNouveauxComposants();
				dnc.setVisible(true);
			}
		});
	}
}
