package calculage;

import javax.swing.SwingUtilities;

public class Utilisation{
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				CalculAge calculAge = new CalculAge();
				calculAge.setVisible(true);
			}
		});
	}
}