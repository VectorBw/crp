package exo4;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoutonsAdd extends JFrame {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3928008548751894521L;


	public BoutonsAdd() {
		super();
		build();
	}
	
	void build()
	{
		setTitle("Boutons Add");
		setPreferredSize(new Dimension(300, 100));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
	}
	
	Container buildContentPane()
	{	
		getContentPane().setLayout(new FlowLayout());
		JButton add = new JButton(new ClicAction(this, "Add"));
		getContentPane().add(add);
		pack();	
		return getContentPane();
	}	
}
