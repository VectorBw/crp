package exo4;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextField;

public class RemoveAction extends AbstractAction {
	private static final long serialVersionUID = 1L;
	private BoutonsAdd boutonsAdd;
	
	public RemoveAction(BoutonsAdd boutonsAdd, String texte ){
		super(texte);
		this.boutonsAdd = boutonsAdd;
	}
	
	public void actionPerformed(ActionEvent e) { 
		JButton button = (JButton)e.getSource();
		button.setVisible(false);
		boutonsAdd.getContentPane().remove(button);
		boutonsAdd.getContentPane().validate();
	} 
}