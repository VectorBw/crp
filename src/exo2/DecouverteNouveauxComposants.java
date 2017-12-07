package exo2;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

import static java.awt.Color.CYAN;
import static java.awt.Color.YELLOW;
import static java.awt.Color.PINK;
import static java.awt.Color.GREEN;

import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.SOUTH;


public class DecouverteNouveauxComposants extends JFrame {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3928008548751894521L;


	public DecouverteNouveauxComposants() {
		super();
		build();
	}

	void build()
	{
		setTitle("Decouverte de nouveaux composants");
		setPreferredSize(new Dimension(300, 300));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
	}

	Container buildContentPane()
	{
		JButton button = new JButton("bouton");
		button.setSize(10, 10);
		this.add(button, NORTH);
		// OU getContentPane().add(button, NORTH);
		button.setToolTipText("Ce bouton est inactif!");
		button.setEnabled(false);
		button.setBackground(CYAN);

		JTextField text = new JTextField();
		this.add(text, SOUTH);
		// OU getContentPane().add(text, SOUTH);
		this.setFont(new Font(" TimesRoman ",Font.BOLD,30));
		text.setText("Langage Java");
		text.setEditable(false);
		text.setBackground(YELLOW);
		Border border = BorderFactory.createLineBorder(GREEN, 3);
		text.setBorder(border);

		JTextArea textArea = new JTextArea(20, 14);
		textArea.setBackground(PINK);
		this.add(textArea, CENTER);
		// OU getContentPane().add(textArea, CENTER);
		textArea.setText("public class Launcher {\n"
				+ "public static void main(String[] args) {\n"
				+ "SwingUtilities.invokeLater(new Runnable() {\n"
				+ "@Override \n"
				+ "public void run() {\n"
				+ "DecouverteNouveauxComposants dnc = new DecouverteNouveauxComposants();\n"
				+ "dnc.setVisible(true);\n"
				+ "}\n"
				+ "});\n"
				+ "}\n"
				+ "}\n"
				+ ");\n");
		pack();
		return getContentPane();
	}
}
