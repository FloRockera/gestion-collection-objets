package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {

	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Bouton 1");

	public Fenetre() {
		this.setTitle("Animation");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		pan.add(bouton);
		this.setContentPane(pan);
		this.setVisible(true);
	}
}
