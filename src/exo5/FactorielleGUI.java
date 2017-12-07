package exo5;
import javax.swing.*;

import exo4.ClicAction;

import java.awt.*;
import java.awt.event.*;

public class FactorielleGUI extends JFrame {

	public FactorielleGUI()
	{
		super();
		build();
	}

	void build()
	{
		setTitle("Factorielle");
		setPreferredSize(new Dimension(300, 100));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
	}


	Container buildContentPane()
	{
		// pour la saisie del�entier n
		final JTextField textField;

		// pour l�affichage du r�sultat n!
		final JButton resultat;
		final JLabel label;

		// pour la saisie del�entier n
		textField = new JTextField(4);

		// pour l�affichage du r�sultat n!
		resultat = new JButton("R�sultat : ");
		label = new JLabel();

		this.setLayout(new FlowLayout());
		this.add(textField );
		this.add(resultat);
		this.add(label);

		resultat.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String name;
				int n;

				// on r�cup�re la chaine contenue dans le champ texte
				name = textField .getText();
				// on convertit la chaine en entier;
				n = Integer.parseInt(name);

				if (n >= 17)
					JOptionPane.showMessageDialog(null, "nombre < 17", "Erreur", JOptionPane.ERROR_MESSAGE);

				else
				{
					// on calcule la factorielle de l'entier
					int res = Factorielle.factorielle(n);
					// on convertit le r�sultat trouv� de type entier en type String
					String result = String.valueOf(res);
					// on met � jour le label
					label.setText(result);

					resultat.setText(name + "!");
				}
				
			}
		});

		pack();
		return getContentPane();
	}	
}

