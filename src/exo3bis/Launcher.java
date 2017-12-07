package exo3bis;


import javax.swing.SwingUtilities;

public class Launcher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				BoutonsActions boutonsActions = new BoutonsActions();
				boutonsActions.setVisible(true);
			}
		});
	}
}
