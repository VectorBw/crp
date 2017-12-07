package calculage;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextField;

import java.util.Calendar;

public class ButtonAgeAction extends AbstractAction {

	private CalculAge calculAge;

	public ButtonAgeAction(CalculAge calculAge, String texte){
		super(texte);
		this.calculAge = calculAge;
	}

	public void actionPerformed(ActionEvent e) { 
		// le champ texte du calculAge est récupéré
		calculAge.calcul();                      
	}
}