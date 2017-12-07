package exo1;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import static javax.swing.SwingConstants.CENTER;

import static java.awt.BorderLayout.AFTER_LAST_LINE;
import static java.awt.BorderLayout.NORTH;

public class ExampleJFrame extends JFrame {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3928008548751894521L;


	public ExampleJFrame() {
		super();
		build();
	}
	
	void build()
	{
		setTitle("JFrame Example");
		setPreferredSize(new Dimension(500, 400));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
	}
	
	Container buildContentPane()
	{
		JLabel label = new JLabel("Mon label est au centre!");
		getContentPane().add(label);
		label.setHorizontalAlignment(CENTER);
		
		JButton button1 = new JButton("OK1");
		getContentPane().add(button1, NORTH);
		
		JButton button2 = new JButton("OK2");
		getContentPane().add(button2, AFTER_LAST_LINE);
		
		pack();
		return getContentPane();
	}
}
