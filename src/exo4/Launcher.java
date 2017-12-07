package exo4;


import javax.swing.SwingUtilities;

public class Launcher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				BoutonsAdd boutonsAdd = new BoutonsAdd();
				boutonsAdd.setVisible(true);
			}
		});
	}
}
