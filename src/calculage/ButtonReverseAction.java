package calculage;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextField;



/**
 * pour les 10 boutons
 * 
buttons[i] = new JButton(new ButtonsAction(this, String.valueOf(i + 1)));
JButton buttonZero = new JButton(new ButtonsAction(this,"0"));
*/
public class ButtonReverseAction extends AbstractAction {
	
	private CalculAge calculAge;
	
	public ButtonReverseAction(CalculAge calculAge, String texte){
		super(texte);
		this.calculAge = calculAge;
	}
	
	public void actionPerformed(ActionEvent e) { 
		// les champs texte du calculAge sont récupérés
		JTextField lastName = calculAge.getLastName();
		StringBuilder s1 = new StringBuilder(lastName.getText());
		lastName.setText(s1.reverse().toString());
		
		JTextField firstName = calculAge.getFirstName();
		StringBuilder s2 = new StringBuilder(firstName.getText());
		firstName.setText(s2.reverse().toString());
	
		JTextField anneeNaissance = calculAge.getAnneeNaissance();
		StringBuilder s3 = new StringBuilder(anneeNaissance.getText());
		anneeNaissance.setText(s3.reverse().toString());
		
		calculAge.calcul();
	} 
}