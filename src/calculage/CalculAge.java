package calculage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculAge extends JFrame {   

	private JLabel labelLastName;
	private JTextField lastName;
	private JLabel labelFirstName;
	private JTextField firstName;
	private JTextField age;
	private JLabel labelAge;
	private JTextField anneeNaissance;
	
	
	public CalculAge() {
		super();
		build();//On initialise notre fenêtre
	}

	private void build() {
		setTitle("Calcul de mon age"); //On donne un titre à l'application
		setSize(300,150); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
	}

	private JPanel buildContentPane() {
		JPanel panelHaut = new JPanel();
		panelHaut.setLayout(new GridLayout(2,1));
		panelHaut.setBackground(Color.green);

		labelLastName = new JLabel("Votre nom : ");
		lastName = new JTextField("", 20);
		lastName.setEditable(true);
		panelHaut.add(labelLastName);
		panelHaut.add(lastName);

		labelFirstName = new JLabel("Votre prénom : ");
		firstName = new JTextField("", 20);
		firstName.setEditable(true);
		panelHaut.add(labelFirstName);
		panelHaut.add(firstName);
		
		JPanel panelCentre = new JPanel();
		panelCentre.setLayout(new FlowLayout());
		panelCentre.setBackground(Color.green);
		labelAge = new JLabel("Votre année de naissance : ");
		anneeNaissance = new JTextField("", 3);
		anneeNaissance.setEditable(true);
		age = new JTextField(" ", 27);
		age.setEditable(false);
		age.setBackground(Color.cyan);
		panelCentre.add(labelAge);
		panelCentre.add(anneeNaissance);
		panelCentre.add(age);
		
		JPanel panelBas = new JPanel();
		panelBas.setLayout(new FlowLayout());
		panelBas.setBackground(Color.yellow);

		JButton buttonAge = new JButton(new ButtonAgeAction(this,"Age?"));
		JButton buttonReverse = new JButton(new ButtonReverseAction(this,"Reverse"));

		panelBas.add(buttonAge);
		panelBas.add(buttonReverse);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add("North", panelHaut);
		panel.add("Center", panelCentre);
		panel.add("South", panelBas);

		return panel;
	}		

	public JTextField getLastName() {
		return lastName;
	}

	public JTextField getFirstName() {
		return firstName;
	}
	
	public JTextField getAnneeNaissance() {
		return anneeNaissance;
	}
	
	public JTextField getAge() {
		return age;
	}
	
	
	void calcul()
	{
		JTextField anneeNaissance = getAnneeNaissance();
		if (anneeNaissance.getText().equals("") == false)
		{
			Calendar cal = Calendar.getInstance();
			int annee = cal.get(Calendar.YEAR); 
			int valeur = annee - Integer.parseInt(anneeNaissance.getText());
		
			String chaine = new String();
			chaine = "En " + annee + " vous avez " + valeur + " ans.";
			getAge().setText(chaine);
		}
	}
}






