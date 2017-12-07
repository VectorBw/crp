package exo4;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextField;


public class ClicAction extends AbstractAction {
	private static final long serialVersionUID = 1L;
	private BoutonsAdd boutonsAdd;
	private static int numero;
	
	public ClicAction(BoutonsAdd boutonsAdd, String texte){
		super(texte);
		this.boutonsAdd = boutonsAdd;
	}
	
	public void actionPerformed(ActionEvent e) { 
		JButton button = new JButton(new RemoveAction(boutonsAdd, String.valueOf(numero++)));
		boutonsAdd.getContentPane().add(button);
		boutonsAdd.pack();
	} 
}