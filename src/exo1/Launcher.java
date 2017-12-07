package exo1;


import javax.swing.SwingUtilities;


public class Launcher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				ExampleJFrame exampleJFrame = new ExampleJFrame();
				exampleJFrame.setVisible(true);
			}
		});
	}
}
