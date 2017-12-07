package exo3bis;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoutonsActions extends JFrame {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3928008548751894521L;


	public BoutonsActions() {
		super();
		build();
	}
	
	void build()
	{
		setTitle("Boutons Actions");
		setPreferredSize(new Dimension(300, 100));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
	}
	
	Container buildContentPane()
	{	
		getContentPane().setLayout(new FlowLayout());
		JButton test = new JButton(new TestAction(this, "Test"));
		getContentPane().add(test);
		
		JButton buttons [] = { new JButton(new ClicAction(this,"One")),  
								new JButton(new ClicAction(this,"Two")),
								new JButton(new ClicAction(this,"Three")) };
		for (JButton button : buttons) 
		{
			getContentPane().add(button);
		}
		
		pack();
		return getContentPane();
	}	
}
